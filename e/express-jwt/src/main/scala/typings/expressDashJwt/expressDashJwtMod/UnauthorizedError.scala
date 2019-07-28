package typings.expressDashJwt.expressDashJwtMod

import typings.expressDashJwt.Anon_Message
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jwt", "UnauthorizedError")
@js.native
class UnauthorizedError protected () extends Error {
  def this(code: ErrorCode, error: Anon_Message) = this()
  var code: ErrorCode = js.native
  var inner: Anon_Message = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  var name_UnauthorizedError: typings.expressDashJwt.expressDashJwtStrings.UnauthorizedError = js.native
  var status: Double = js.native
}

