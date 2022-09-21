package typings.fullcalendarCommon.mod

import typings.std.ClientRect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "PositionCache")
@js.native
open class PositionCache protected () extends StObject {
  def this(originEl: HTMLElement, els: js.Array[HTMLElement], isHorizontal: Boolean, isVertical: Boolean) = this()
  
  var bottoms: Any = js.native
  
  def buildElHorizontals(originClientLeft: Double): Unit = js.native
  
  def buildElVerticals(originClientTop: Double): Unit = js.native
  
  var els: js.Array[HTMLElement] = js.native
  
  def getHeight(topIndex: Double): Double = js.native
  
  def getWidth(leftIndex: Double): Double = js.native
  
  def leftToIndex(leftPosition: Double): Any = js.native
  
  var lefts: Any = js.native
  
  var originClientRect: ClientRect = js.native
  
  var rights: Any = js.native
  
  def topToIndex(topPosition: Double): Any = js.native
  
  var tops: Any = js.native
}
