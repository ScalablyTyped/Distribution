package typings.expo.expoMod

import typings.expo.Anon_Array
import typings.expo.Anon_Callback
import typings.expo.expoMod.SQLiteNs.Error
import typings.expo.expoMod.SQLiteNs.ResultSet
import typings.expo.expoMod.SQLiteNs.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "SQLite")
@js.native
object SQLiteNs extends js.Object {
  @js.native
  trait Database extends js.Object {
    def transaction(callback: js.Function1[/* transaction */ Transaction, _]): Unit = js.native
    def transaction(
      callback: js.Function1[/* transaction */ Transaction, _],
           // TODO def of error
    error: js.Function1[/* error */ Error, _]
    ): Unit = js.native
    def transaction(
      callback: js.Function1[/* transaction */ Transaction, _],
           // TODO def of error
    error: js.Function1[/* error */ Error, _],
      success: js.Function0[_]
    ): Unit = js.native
  }
  
  trait ResultSet extends js.Object {
    var insertId: Double
    var rows: Anon_Array
    var rowsAffected: Double
  }
  
  @js.native
  trait Transaction extends js.Object {
    def executeSql(sqlStatement: String): Unit = js.native
    def executeSql(sqlStatement: String, arguments: js.Array[Double | String]): Unit = js.native
    def executeSql(
      sqlStatement: String,
      arguments: js.Array[Double | String],
      success: js.Function2[/* transaction */ this.type, /* resultSet */ ResultSet, _]
    ): Unit = js.native
    def executeSql(
      sqlStatement: String,
      arguments: js.Array[Double | String],
      success: js.Function2[/* transaction */ this.type, /* resultSet */ ResultSet, _],
      error: js.Function2[/* transaction */ this.type, /* error */ Error, _]
    ): Unit = js.native
  }
  
  def openDatabase(name: String): js.Any = js.native
  def openDatabase(name: String, version: String): js.Any = js.native
  def openDatabase(name: String, version: String, description: String): js.Any = js.native
  def openDatabase(name: String, version: String, description: String, size: Double): js.Any = js.native
  def openDatabase(name: String, version: String, description: String, size: Double, callback: js.Function0[_]): js.Any = js.native
  def openDatabase(name: Anon_Callback): js.Any = js.native
  def openDatabase(name: Anon_Callback, version: String): js.Any = js.native
  def openDatabase(name: Anon_Callback, version: String, description: String): js.Any = js.native
  def openDatabase(name: Anon_Callback, version: String, description: String, size: Double): js.Any = js.native
  def openDatabase(name: Anon_Callback, version: String, description: String, size: Double, callback: js.Function0[_]): js.Any = js.native
  type Error = js.Any
}

