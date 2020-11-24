package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserIdentityType extends js.Object
@JSImport("evernote", "Types.UserIdentityType")
@js.native
object UserIdentityType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserIdentityType with Double] = js.native
  
  @js.native
  sealed trait EMAIL extends UserIdentityType
  /* 2 */ @js.native
  object EMAIL extends TopLevel[EMAIL with Double]
  
  @js.native
  sealed trait EVERNOTE_USERID extends UserIdentityType
  /* 1 */ @js.native
  object EVERNOTE_USERID extends TopLevel[EVERNOTE_USERID with Double]
  
  @js.native
  sealed trait IDENTITYID extends UserIdentityType
  /* 3 */ @js.native
  object IDENTITYID extends TopLevel[IDENTITYID with Double]
}
