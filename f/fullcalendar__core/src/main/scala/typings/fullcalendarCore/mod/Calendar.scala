package typings.fullcalendarCore.mod

import typings.fullcalendarCommon.mod.Action
import typings.fullcalendarCommon.mod.CalendarData
import typings.fullcalendarCommon.mod.CalendarOptions
import typings.fullcalendarCommon.mod.CssDimValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/core", "Calendar")
@js.native
open class Calendar protected ()
  extends typings.fullcalendarCommon.mod.CalendarApi {
  def this(el: HTMLElement) = this()
  def this(el: HTMLElement, optionOverrides: CalendarOptions) = this()
  
  def batchRendering(func: Any): Unit = js.native
  
  var currentClassNames: js.Array[String] = js.native
  
  var currentData: CalendarData = js.native
  
  var customContentRenderId: Double = js.native
  
  def destroy(): Unit = js.native
  
  var el: HTMLElement = js.native
  
  def handleAction(action: Action): Unit = js.native
  
  def handleData(data: CalendarData): Unit = js.native
  
  def handleRenderRequest(): Unit = js.native
  
  var isRendered: Boolean = js.native
  
  var isRendering: Boolean = js.native
  
  def pauseRendering(): Unit = js.native
  
  def render(): Unit = js.native
  
  var renderRunner: typings.fullcalendarCommon.mod.DelayedRunner = js.native
  
  def resetOptions(optionOverrides: Any): Unit = js.native
  def resetOptions(optionOverrides: Any, append: Any): Unit = js.native
  
  def resumeRendering(): Unit = js.native
  
  def setClassNames(classNames: js.Array[String]): Unit = js.native
  
  def setHeight(height: CssDimValue): Unit = js.native
}
