package typings.geometryDom

import typings.geometryDom.GeometryDom.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMRectList extends StObject {
  
  /**
    * the DOMRect object at index must be returned.
    * @param index
    */
  def item(index: Double): DOMRect
  
  /**
    * total number of DOMRect objects associated with the object.
    * readonly unsigned long length
    */
  var length: Double
}
object DOMRectList {
  
  inline def apply(item: Double => DOMRect, length: Double): DOMRectList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMRectList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMRectList] (val x: Self) extends AnyVal {
    
    inline def setItem(value: Double => DOMRect): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
