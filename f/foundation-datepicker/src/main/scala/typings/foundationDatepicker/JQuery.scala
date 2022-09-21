package typings.foundationDatepicker

import typings.foundationDatepicker.FoundationDatepicker.Event
import typings.foundationDatepicker.FoundationDatepicker.OutOfRangeEvent
import typings.foundationDatepicker.FoundationDatepicker.Settings
import typings.foundationDatepicker.foundationDatepickerStrings.changeDate
import typings.foundationDatepicker.foundationDatepickerStrings.hide
import typings.foundationDatepicker.foundationDatepickerStrings.outOfRange
import typings.foundationDatepicker.foundationDatepickerStrings.place
import typings.foundationDatepicker.foundationDatepickerStrings.show
import typings.foundationDatepicker.foundationDatepickerStrings.update
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery[TElement] extends StObject {
  
  def fdatepicker(): JQuery[HTMLElement] = js.native
  def fdatepicker(option: show | hide | place): JQuery[HTMLElement] = js.native
  def fdatepicker(option: Settings): JQuery[HTMLElement] = js.native
  @JSName("fdatepicker")
  def fdatepicker_update(option: update, value: String): JQuery[HTMLElement] = js.native
  @JSName("fdatepicker")
  def fdatepicker_update(option: update, value: js.Date): JQuery[HTMLElement] = js.native
  
  def on(events: show | hide | changeDate, handler: js.Function1[/* eventObject */ Event, Unit]): JQuery[HTMLElement] = js.native
  @JSName("on")
  def on_outOfRange(events: outOfRange, handler: js.Function1[/* eventObject */ OutOfRangeEvent, Unit]): JQuery[HTMLElement] = js.native
}
