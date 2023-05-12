package typings.fullcalendarCore.internalCommonMod

import typings.std.ClientRect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionCache extends StObject {
  
  var bottoms: Any
  
  def buildElHorizontals(originClientLeft: Double): Unit
  
  def buildElVerticals(originClientTop: Double): Unit
  
  var els: js.Array[HTMLElement]
  
  def getHeight(topIndex: Double): Double
  
  def getWidth(leftIndex: Double): Double
  
  def leftToIndex(leftPosition: Double): Any
  
  var lefts: Any
  
  var originClientRect: ClientRect
  
  var rights: Any
  
  def similarTo(otherCache: PositionCache): Boolean
  
  def topToIndex(topPosition: Double): Any
  
  var tops: Any
}
object PositionCache {
  
  inline def apply(
    bottoms: Any,
    buildElHorizontals: Double => Unit,
    buildElVerticals: Double => Unit,
    els: js.Array[HTMLElement],
    getHeight: Double => Double,
    getWidth: Double => Double,
    leftToIndex: Double => Any,
    lefts: Any,
    originClientRect: ClientRect,
    rights: Any,
    similarTo: PositionCache => Boolean,
    topToIndex: Double => Any,
    tops: Any
  ): PositionCache = {
    val __obj = js.Dynamic.literal(bottoms = bottoms.asInstanceOf[js.Any], buildElHorizontals = js.Any.fromFunction1(buildElHorizontals), buildElVerticals = js.Any.fromFunction1(buildElVerticals), els = els.asInstanceOf[js.Any], getHeight = js.Any.fromFunction1(getHeight), getWidth = js.Any.fromFunction1(getWidth), leftToIndex = js.Any.fromFunction1(leftToIndex), lefts = lefts.asInstanceOf[js.Any], originClientRect = originClientRect.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], similarTo = js.Any.fromFunction1(similarTo), topToIndex = js.Any.fromFunction1(topToIndex), tops = tops.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionCache] (val x: Self) extends AnyVal {
    
    inline def setBottoms(value: Any): Self = StObject.set(x, "bottoms", value.asInstanceOf[js.Any])
    
    inline def setBuildElHorizontals(value: Double => Unit): Self = StObject.set(x, "buildElHorizontals", js.Any.fromFunction1(value))
    
    inline def setBuildElVerticals(value: Double => Unit): Self = StObject.set(x, "buildElVerticals", js.Any.fromFunction1(value))
    
    inline def setEls(value: js.Array[HTMLElement]): Self = StObject.set(x, "els", value.asInstanceOf[js.Any])
    
    inline def setElsVarargs(value: HTMLElement*): Self = StObject.set(x, "els", js.Array(value*))
    
    inline def setGetHeight(value: Double => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction1(value))
    
    inline def setGetWidth(value: Double => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction1(value))
    
    inline def setLeftToIndex(value: Double => Any): Self = StObject.set(x, "leftToIndex", js.Any.fromFunction1(value))
    
    inline def setLefts(value: Any): Self = StObject.set(x, "lefts", value.asInstanceOf[js.Any])
    
    inline def setOriginClientRect(value: ClientRect): Self = StObject.set(x, "originClientRect", value.asInstanceOf[js.Any])
    
    inline def setRights(value: Any): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
    
    inline def setSimilarTo(value: PositionCache => Boolean): Self = StObject.set(x, "similarTo", js.Any.fromFunction1(value))
    
    inline def setTopToIndex(value: Double => Any): Self = StObject.set(x, "topToIndex", js.Any.fromFunction1(value))
    
    inline def setTops(value: Any): Self = StObject.set(x, "tops", value.asInstanceOf[js.Any])
  }
}
