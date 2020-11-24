package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactType extends js.Object
@JSImport("evernote", "Types.ContactType")
@js.native
object ContactType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactType with Double] = js.native
  
  @js.native
  sealed trait EMAIL extends ContactType
  /* 4 */ @js.native
  object EMAIL extends TopLevel[EMAIL with Double]
  
  @js.native
  sealed trait EVERNOTE extends ContactType
  /* 1 */ @js.native
  object EVERNOTE extends TopLevel[EVERNOTE with Double]
  
  @js.native
  sealed trait FACEBOOK extends ContactType
  /* 3 */ @js.native
  object FACEBOOK extends TopLevel[FACEBOOK with Double]
  
  @js.native
  sealed trait LINKEDIN extends ContactType
  /* 6 */ @js.native
  object LINKEDIN extends TopLevel[LINKEDIN with Double]
  
  @js.native
  sealed trait SMS extends ContactType
  /* 2 */ @js.native
  object SMS extends TopLevel[SMS with Double]
  
  @js.native
  sealed trait TWITTER extends ContactType
  /* 5 */ @js.native
  object TWITTER extends TopLevel[TWITTER with Double]
}
