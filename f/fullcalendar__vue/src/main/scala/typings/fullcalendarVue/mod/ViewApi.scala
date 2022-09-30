package typings.fullcalendarVue.mod

import typings.fullcalendarCommon.mod.CalendarData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/vue", "ViewApi")
@js.native
open class ViewApi protected ()
  extends typings.fullcalendarCore.mod.ViewApi {
  def this(
    `type`: String,
    getCurrentData: js.Function0[CalendarData],
    dateEnv: typings.fullcalendarCommon.mod.DateEnv
  ) = this()
}
