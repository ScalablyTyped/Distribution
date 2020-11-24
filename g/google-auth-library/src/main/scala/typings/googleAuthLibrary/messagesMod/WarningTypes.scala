package typings.googleAuthLibrary.messagesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WarningTypes extends js.Object
@JSImport("google-auth-library/build/src/messages", "WarningTypes")
@js.native
object WarningTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WarningTypes with String] = js.native
  
  @js.native
  sealed trait DEPRECATION extends WarningTypes
  /* "DeprecationWarning" */ @js.native
  object DEPRECATION extends TopLevel[DEPRECATION with String]
  
  @js.native
  sealed trait WARNING extends WarningTypes
  /* "Warning" */ @js.native
  object WARNING extends TopLevel[WARNING with String]
}
