package typings.fullcalendarVue.mod

import typings.fullcalendarCommon.mod.CalendarListeners
import typings.fullcalendarCommon.mod.Duration
import typings.fullcalendarCommon.mod.ScrollRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/vue", "ScrollResponder")
@js.native
open class ScrollResponder protected ()
  extends typings.fullcalendarCore.mod.ScrollResponder {
  def this(
    execFunc: ScrollRequestHandler,
    emitter: typings.fullcalendarCommon.mod.Emitter[CalendarListeners],
    scrollTime: Duration,
    scrollTimeReset: Boolean
  ) = this()
}
