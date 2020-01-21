package typings.expressJwt.mod

import typings.expressJwt.AnonMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jwt", "UnauthorizedError")
@js.native
class UnauthorizedError protected () extends Error {
  def this(code: ErrorCode, error: AnonMessage) = this()
  var code: ErrorCode = js.native
  var inner: AnonMessage = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  var name_UnauthorizedError: typings.expressJwt.expressJwtStrings.UnauthorizedError = js.native
  var status: Double = js.native
}

