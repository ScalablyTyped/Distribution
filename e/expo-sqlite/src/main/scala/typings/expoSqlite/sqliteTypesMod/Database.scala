package typings.expoSqlite.sqliteTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  var version: String = js.native
  def readTransaction(callback: SQLTransactionCallback): Unit = js.native
  def readTransaction(
    callback: SQLTransactionCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    successCallback: SQLVoidCallback
  ): Unit = js.native
  def readTransaction(callback: SQLTransactionCallback, errorCallback: SQLTransactionErrorCallback): Unit = js.native
  def readTransaction(
    callback: SQLTransactionCallback,
    errorCallback: SQLTransactionErrorCallback,
    successCallback: SQLVoidCallback
  ): Unit = js.native
  def transaction(callback: SQLTransactionCallback): Unit = js.native
  def transaction(
    callback: SQLTransactionCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    successCallback: SQLVoidCallback
  ): Unit = js.native
  def transaction(callback: SQLTransactionCallback, errorCallback: SQLTransactionErrorCallback): Unit = js.native
  def transaction(
    callback: SQLTransactionCallback,
    errorCallback: SQLTransactionErrorCallback,
    successCallback: SQLVoidCallback
  ): Unit = js.native
}

