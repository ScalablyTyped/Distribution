package typings.fullcalendarCore.internalCommonMod

import typings.std.ClientRect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/core/internal-common", "c0")
@js.native
open class c0 protected ()
  extends StObject
     with PositionCache {
  def this(originEl: HTMLElement, els: js.Array[HTMLElement], isHorizontal: Boolean, isVertical: Boolean) = this()
  
  /* CompleteClass */
  var bottoms: Any = js.native
  
  /* CompleteClass */
  override def buildElHorizontals(originClientLeft: Double): Unit = js.native
  
  /* CompleteClass */
  override def buildElVerticals(originClientTop: Double): Unit = js.native
  
  /* CompleteClass */
  var els: js.Array[HTMLElement] = js.native
  
  /* CompleteClass */
  override def getHeight(topIndex: Double): Double = js.native
  
  /* CompleteClass */
  override def getWidth(leftIndex: Double): Double = js.native
  
  /* CompleteClass */
  override def leftToIndex(leftPosition: Double): Any = js.native
  
  /* CompleteClass */
  var lefts: Any = js.native
  
  /* CompleteClass */
  var originClientRect: ClientRect = js.native
  
  /* CompleteClass */
  var rights: Any = js.native
  
  /* CompleteClass */
  override def similarTo(otherCache: PositionCache): Boolean = js.native
  
  /* CompleteClass */
  override def topToIndex(topPosition: Double): Any = js.native
  
  /* CompleteClass */
  var tops: Any = js.native
}
