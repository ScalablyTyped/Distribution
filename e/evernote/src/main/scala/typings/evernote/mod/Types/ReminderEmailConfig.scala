package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReminderEmailConfig extends js.Object
@JSImport("evernote", "Types.ReminderEmailConfig")
@js.native
object ReminderEmailConfig extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReminderEmailConfig with Double] = js.native
  
  @js.native
  sealed trait DO_NOT_SEND extends ReminderEmailConfig
  /* 1 */ @js.native
  object DO_NOT_SEND extends TopLevel[DO_NOT_SEND with Double]
  
  @js.native
  sealed trait SEND_DAILY_EMAIL extends ReminderEmailConfig
  /* 2 */ @js.native
  object SEND_DAILY_EMAIL extends TopLevel[SEND_DAILY_EMAIL with Double]
}
