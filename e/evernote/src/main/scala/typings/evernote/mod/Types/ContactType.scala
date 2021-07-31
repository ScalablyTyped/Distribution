package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactType extends StObject
@JSImport("evernote", "Types.ContactType")
@js.native
object ContactType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactType & Double] = js.native
  
  @js.native
  sealed trait EMAIL
    extends StObject
       with ContactType
  /* 4 */ val EMAIL: typings.evernote.mod.Types.ContactType.EMAIL & Double = js.native
  
  @js.native
  sealed trait EVERNOTE
    extends StObject
       with ContactType
  /* 1 */ val EVERNOTE: typings.evernote.mod.Types.ContactType.EVERNOTE & Double = js.native
  
  @js.native
  sealed trait FACEBOOK
    extends StObject
       with ContactType
  /* 3 */ val FACEBOOK: typings.evernote.mod.Types.ContactType.FACEBOOK & Double = js.native
  
  @js.native
  sealed trait LINKEDIN
    extends StObject
       with ContactType
  /* 6 */ val LINKEDIN: typings.evernote.mod.Types.ContactType.LINKEDIN & Double = js.native
  
  @js.native
  sealed trait SMS
    extends StObject
       with ContactType
  /* 2 */ val SMS: typings.evernote.mod.Types.ContactType.SMS & Double = js.native
  
  @js.native
  sealed trait TWITTER
    extends StObject
       with ContactType
  /* 5 */ val TWITTER: typings.evernote.mod.Types.ContactType.TWITTER & Double = js.native
}
