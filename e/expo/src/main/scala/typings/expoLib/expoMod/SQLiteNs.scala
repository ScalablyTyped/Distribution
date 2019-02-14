package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "SQLite")
@js.native
object SQLiteNs extends js.Object {
  @js.native
  trait Database extends js.Object {
    def transaction(callback: js.Function1[/* transaction */ Transaction, _]): scala.Unit = js.native
    def transaction(
      callback: js.Function1[/* transaction */ Transaction, _],
           // TODO def of error
    error: js.Function1[/* error */ Error, _]
    ): scala.Unit = js.native
    def transaction(
      callback: js.Function1[/* transaction */ Transaction, _],
           // TODO def of error
    error: js.Function1[/* error */ Error, _],
      success: js.Function0[_]
    ): scala.Unit = js.native
  }
  
  trait ResultSet extends js.Object {
    var insertId: scala.Double
    var rows: expoLib.Anon_Array
    var rowsAffected: scala.Double
  }
  
  @js.native
  trait Transaction extends js.Object {
    def executeSql(sqlStatement: java.lang.String): scala.Unit = js.native
    def executeSql(sqlStatement: java.lang.String, arguments: js.Array[scala.Double | java.lang.String]): scala.Unit = js.native
    def executeSql(
      sqlStatement: java.lang.String,
      arguments: js.Array[scala.Double | java.lang.String],
      success: js.Function2[/* transaction */ this.type, /* resultSet */ ResultSet, _]
    ): scala.Unit = js.native
    def executeSql(
      sqlStatement: java.lang.String,
      arguments: js.Array[scala.Double | java.lang.String],
      success: js.Function2[/* transaction */ this.type, /* resultSet */ ResultSet, _],
      error: js.Function2[/* transaction */ this.type, /* error */ Error, _]
    ): scala.Unit = js.native
  }
  
  def openDatabase(name: expoLib.Anon_Callback): js.Any = js.native
  def openDatabase(name: expoLib.Anon_Callback, version: java.lang.String): js.Any = js.native
  def openDatabase(name: expoLib.Anon_Callback, version: java.lang.String, description: java.lang.String): js.Any = js.native
  def openDatabase(
    name: expoLib.Anon_Callback,
    version: java.lang.String,
    description: java.lang.String,
    size: scala.Double
  ): js.Any = js.native
  def openDatabase(
    name: expoLib.Anon_Callback,
    version: java.lang.String,
    description: java.lang.String,
    size: scala.Double,
    callback: js.Function0[_]
  ): js.Any = js.native
  def openDatabase(name: java.lang.String): js.Any = js.native
  def openDatabase(name: java.lang.String, version: java.lang.String): js.Any = js.native
  def openDatabase(name: java.lang.String, version: java.lang.String, description: java.lang.String): js.Any = js.native
  def openDatabase(
    name: java.lang.String,
    version: java.lang.String,
    description: java.lang.String,
    size: scala.Double
  ): js.Any = js.native
  def openDatabase(
    name: java.lang.String,
    version: java.lang.String,
    description: java.lang.String,
    size: scala.Double,
    callback: js.Function0[_]
  ): js.Any = js.native
  type Error = js.Any
}

