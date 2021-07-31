package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserIdentityType extends StObject
@JSImport("evernote", "Types.UserIdentityType")
@js.native
object UserIdentityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserIdentityType & Double] = js.native
  
  @js.native
  sealed trait EMAIL
    extends StObject
       with UserIdentityType
  /* 2 */ val EMAIL: typings.evernote.mod.Types.UserIdentityType.EMAIL & Double = js.native
  
  @js.native
  sealed trait EVERNOTE_USERID
    extends StObject
       with UserIdentityType
  /* 1 */ val EVERNOTE_USERID: typings.evernote.mod.Types.UserIdentityType.EVERNOTE_USERID & Double = js.native
  
  @js.native
  sealed trait IDENTITYID
    extends StObject
       with UserIdentityType
  /* 3 */ val IDENTITYID: typings.evernote.mod.Types.UserIdentityType.IDENTITYID & Double = js.native
}
