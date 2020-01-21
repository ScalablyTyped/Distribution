package typings.firebird.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents prepared SQL query (returned by @see Connection.prepare() and @see Connection.prepareSync()).
  *
  * @see FBStatement is derived form @see FBResult class.
  * So it can fetch rows just like @see FBresult object after call to @see execSync, exec methods.
  */
@JSImport("firebird", "FBStatement")
@js.native
class FBStatement () extends FBResult {
  /**
    * Asynchronously executes prepared statement with given parameters.
    *
    * @desc
    * @see FBStatement emits 'result' or 'error' event.
    * You may fetch rows with methods inherited from @see FBResult after 'result' event emitted.
    * Statement is executed in context of default connection transaction.
    *
    * @param params parameters of prepared statement in the same order as in SQL and with appropriate types.
    */
  def exec(params: DataType*): Unit = js.native
  /**
    * Same as @see exec but executes statement in context of given @see Transaction obejct.
    */
  def execInTrans(transaction: Transaction, params: DataType*): Unit = js.native
  /**
    * Same as @see execSync but executes statement in context of given @see Transaction obejct.
    */
  def execInTransSync(transaction: Transaction, params: DataType*): Unit = js.native
  /**
    * Synchronously executes prepared statement with given parameters.
    *
    * @desc
    * You may fetch rows with methods inherited from @see FBResult.
    * @see Statement is executed in context of default connection transaction.
    *
    * @param params parameters of prepared statement in the same order as in SQL and with appropriate types.
    */
  def execSync(params: DataType*): Unit = js.native
}

