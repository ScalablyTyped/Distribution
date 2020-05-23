package typings.firebaseFirestore

import typings.firebaseFirestore.errorMod.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/remote/rpc_error", JSImport.Namespace)
@js.native
object rpcErrorMod extends js.Object {
  def isPermanentError(code: Code): Boolean = js.native
  def isPermanentWriteError(code: Code): Boolean = js.native
  def mapCodeFromHttpResponseErrorStatus(status: String): Code = js.native
  def mapCodeFromHttpStatus(status: Double): Code = js.native
  def mapCodeFromRpcCode(): Code = js.native
  def mapCodeFromRpcCode(code: Double): Code = js.native
  def mapCodeFromRpcStatus(status: String): js.UndefOr[Code] = js.native
  def mapRpcCodeFromCode(): Double = js.native
  def mapRpcCodeFromCode(code: Code): Double = js.native
}

