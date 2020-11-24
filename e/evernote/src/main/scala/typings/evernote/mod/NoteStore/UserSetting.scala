package typings.evernote.mod.NoteStore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserSetting extends js.Object
@JSImport("evernote", "NoteStore.UserSetting")
@js.native
object UserSetting extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserSetting with Double] = js.native
  
  @js.native
  sealed trait RECEIVE_REMINDER_EMAIL extends UserSetting
  /* 1 */ @js.native
  object RECEIVE_REMINDER_EMAIL extends TopLevel[RECEIVE_REMINDER_EMAIL with Double]
  
  @js.native
  sealed trait TIMEZONE extends UserSetting
  /* 2 */ @js.native
  object TIMEZONE extends TopLevel[TIMEZONE with Double]
}
