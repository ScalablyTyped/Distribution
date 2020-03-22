package typings.devcert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devcert", "certificateFor")
@js.native
object certificateFor extends js.Object {
  def apply[O /* <: Options */](domain: String): js.Promise[IReturnData[O]] = js.native
  def apply[O /* <: Options */](domain: String, options: O): js.Promise[IReturnData[O]] = js.native
}

