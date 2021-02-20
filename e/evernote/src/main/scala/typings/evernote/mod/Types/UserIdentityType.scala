package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserIdentityType extends StObject
@JSImport("evernote", "Types.UserIdentityType")
@js.native
object UserIdentityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserIdentityType with Double] = js.native
  
  @js.native
  sealed trait EMAIL extends UserIdentityType
  /* 2 */ val EMAIL: typings.evernote.mod.Types.UserIdentityType.EMAIL with Double = js.native
  
  @js.native
  sealed trait EVERNOTE_USERID extends UserIdentityType
  /* 1 */ val EVERNOTE_USERID: typings.evernote.mod.Types.UserIdentityType.EVERNOTE_USERID with Double = js.native
  
  @js.native
  sealed trait IDENTITYID extends UserIdentityType
  /* 3 */ val IDENTITYID: typings.evernote.mod.Types.UserIdentityType.IDENTITYID with Double = js.native
}
