package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlObjectList[T /* <: KmlObject */] extends StObject {
  
  /**
    * Number of objects in collection.
    */
  def getLength(): Double
  
  /**
    * Gets an item from the object list. For example, list.item(0) returns the first object in the list.
    */
  def item(index: Double): T
}
object KmlObjectList {
  
  inline def apply[T /* <: KmlObject */](getLength: () => Double, item: Double => T): KmlObjectList[T] = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), item = js.Any.fromFunction1(item))
    __obj.asInstanceOf[KmlObjectList[T]]
  }
  
  extension [Self <: KmlObjectList[?], T /* <: KmlObject */](x: Self & KmlObjectList[T]) {
    
    inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    inline def setItem(value: Double => T): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
  }
}
