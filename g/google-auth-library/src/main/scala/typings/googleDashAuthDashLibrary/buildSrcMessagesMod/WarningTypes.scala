package typings.googleDashAuthDashLibrary.buildSrcMessagesMod

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcMessagesMod.WarningTypes.DEPRECATION
import typings.googleDashAuthDashLibrary.buildSrcMessagesMod.WarningTypes.WARNING
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WarningTypes with String] = js.native
  /* "DeprecationWarning" */ @js.native
  object DEPRECATION extends TopLevel[DEPRECATION with String]
  
  /* "Warning" */ @js.native
  object WARNING extends TopLevel[WARNING with String]
  
}

