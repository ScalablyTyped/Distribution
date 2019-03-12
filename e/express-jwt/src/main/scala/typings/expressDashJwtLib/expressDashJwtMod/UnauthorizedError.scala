package typings
package expressDashJwtLib.expressDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jwt", "UnauthorizedError")
@js.native
class UnauthorizedError protected ()
  extends expressDashJwtLib.expressDashJwtMod.jwtNs.UnauthorizedError {
  def this(code: expressDashJwtLib.expressDashJwtMod.jwtNs.ErrorCode, error: expressDashJwtLib.Anon_Message) = this()
  /* CompleteClass */
  override var code: expressDashJwtLib.expressDashJwtMod.jwtNs.ErrorCode = js.native
  /* CompleteClass */
  override var inner: expressDashJwtLib.Anon_Message = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_UnauthorizedError: expressDashJwtLib.expressDashJwtLibStrings.UnauthorizedError = js.native
  /* CompleteClass */
  override var status: scala.Double = js.native
}

