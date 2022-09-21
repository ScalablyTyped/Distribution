package typings.fullcalendarCore.vdomMod.global.FullCalendarVDom.createElement.JSX

import typings.fullcalendarCore.fullcalendarCoreStrings.alternate
import typings.fullcalendarCore.fullcalendarCoreStrings.down
import typings.fullcalendarCore.fullcalendarCoreStrings.left
import typings.fullcalendarCore.fullcalendarCoreStrings.right
import typings.fullcalendarCore.fullcalendarCoreStrings.scroll
import typings.fullcalendarCore.fullcalendarCoreStrings.slide
import typings.fullcalendarCore.fullcalendarCoreStrings.up
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLMarqueeElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  var behavior: js.UndefOr[scroll | slide | alternate] = js.native
  
  var bgColor: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[left | right | up | down] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var hspace: js.UndefOr[Double | String] = js.native
  
  var loop: js.UndefOr[Double | String] = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  var scrollAmount: js.UndefOr[Double | String] = js.native
  
  var scrollDelay: js.UndefOr[Double | String] = js.native
  
  var trueSpeed: js.UndefOr[Boolean] = js.native
  
  var vspace: js.UndefOr[Double | String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
