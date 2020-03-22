package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactType extends js.Object

@JSImport("evernote", "Types.ContactType")
@js.native
object ContactType extends js.Object {
  @js.native
  sealed trait EMAIL extends ContactType
  
  @js.native
  sealed trait EVERNOTE extends ContactType
  
  @js.native
  sealed trait FACEBOOK extends ContactType
  
  @js.native
  sealed trait LINKEDIN extends ContactType
  
  @js.native
  sealed trait SMS extends ContactType
  
  @js.native
  sealed trait TWITTER extends ContactType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactType with Double] = js.native
  /* 4 */ @js.native
  object EMAIL extends TopLevel[EMAIL with Double]
  
  /* 1 */ @js.native
  object EVERNOTE extends TopLevel[EVERNOTE with Double]
  
  /* 3 */ @js.native
  object FACEBOOK extends TopLevel[FACEBOOK with Double]
  
  /* 6 */ @js.native
  object LINKEDIN extends TopLevel[LINKEDIN with Double]
  
  /* 2 */ @js.native
  object SMS extends TopLevel[SMS with Double]
  
  /* 5 */ @js.native
  object TWITTER extends TopLevel[TWITTER with Double]
  
}

