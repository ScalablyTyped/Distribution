package typings
package expressDashJwtLib.expressDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jwt", "UnauthorizedError")
@js.native
class UnauthorizedError protected ()
  extends stdLib.Error {
  def this(code: ErrorCode, error: expressDashJwtLib.Anon_Message) = this()
  var code: ErrorCode = js.native
  var inner: expressDashJwtLib.Anon_Message = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("name")
  var name_UnauthorizedError: expressDashJwtLib.expressDashJwtLibStrings.UnauthorizedError = js.native
  var status: scala.Double = js.native
}

