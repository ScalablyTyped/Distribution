package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollerLike extends StObject {
  
  def needsXScrolling(): Boolean
  
  def needsYScrolling(): Boolean
}
object ScrollerLike {
  
  inline def apply(needsXScrolling: () => Boolean, needsYScrolling: () => Boolean): ScrollerLike = {
    val __obj = js.Dynamic.literal(needsXScrolling = js.Any.fromFunction0(needsXScrolling), needsYScrolling = js.Any.fromFunction0(needsYScrolling))
    __obj.asInstanceOf[ScrollerLike]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollerLike] (val x: Self) extends AnyVal {
    
    inline def setNeedsXScrolling(value: () => Boolean): Self = StObject.set(x, "needsXScrolling", js.Any.fromFunction0(value))
    
    inline def setNeedsYScrolling(value: () => Boolean): Self = StObject.set(x, "needsYScrolling", js.Any.fromFunction0(value))
  }
}
