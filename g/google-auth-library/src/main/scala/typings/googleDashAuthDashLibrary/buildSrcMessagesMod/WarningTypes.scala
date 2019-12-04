package typings.googleDashAuthDashLibrary.buildSrcMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WarningTypes extends js.Object

@JSImport("google-auth-library/build/src/messages", "WarningTypes")
@js.native
object WarningTypes extends js.Object {
  @js.native
  sealed trait DEPRECATION extends WarningTypes
  
  @js.native
  sealed trait WARNING extends WarningTypes
  
  /* "DeprecationWarning" */ val DEPRECATION: typings.googleDashAuthDashLibrary.buildSrcMessagesMod.WarningTypes.DEPRECATION with String = js.native
  /* "Warning" */ val WARNING: typings.googleDashAuthDashLibrary.buildSrcMessagesMod.WarningTypes.WARNING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WarningTypes with String] = js.native
}

