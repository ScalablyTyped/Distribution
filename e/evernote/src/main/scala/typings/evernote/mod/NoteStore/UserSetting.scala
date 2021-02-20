package typings.evernote.mod.NoteStore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserSetting extends StObject
@JSImport("evernote", "NoteStore.UserSetting")
@js.native
object UserSetting extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserSetting with Double] = js.native
  
  @js.native
  sealed trait RECEIVE_REMINDER_EMAIL extends UserSetting
  /* 1 */ val RECEIVE_REMINDER_EMAIL: typings.evernote.mod.NoteStore.UserSetting.RECEIVE_REMINDER_EMAIL with Double = js.native
  
  @js.native
  sealed trait TIMEZONE extends UserSetting
  /* 2 */ val TIMEZONE: typings.evernote.mod.NoteStore.UserSetting.TIMEZONE with Double = js.native
}
