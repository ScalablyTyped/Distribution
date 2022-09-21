package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "ElementDragging")
@js.native
abstract class ElementDragging protected () extends StObject {
  def this(el: HTMLElement) = this()
  def this(el: HTMLElement, selector: String) = this()
  
  def destroy(): Unit = js.native
  
  var emitter: Emitter[Any] = js.native
  
  def setAutoScrollEnabled(bool: Boolean): Unit = js.native
  
  def setIgnoreMove(bool: Boolean): Unit = js.native
  
  def setMirrorIsVisible(bool: Boolean): Unit = js.native
  
  def setMirrorNeedsRevert(bool: Boolean): Unit = js.native
}
