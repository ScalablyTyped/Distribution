package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlObjectList[T /* <: KmlObject */] extends StObject {
  
  /**
    * Number of objects in collection.
    */
  def getLength(): Double = js.native
  
  /**
    * Gets an item from the object list. For example, list.item(0) returns the first object in the list.
    */
  def item(index: Double): T = js.native
}
object KmlObjectList {
  
  @scala.inline
  def apply[T /* <: KmlObject */](getLength: () => Double, item: Double => T): KmlObjectList[T] = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), item = js.Any.fromFunction1(item))
    __obj.asInstanceOf[KmlObjectList[T]]
  }
  
  @scala.inline
  implicit class KmlObjectListMutableBuilder[Self <: KmlObjectList[_], T /* <: KmlObject */] (val x: Self with KmlObjectList[T]) extends AnyVal {
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItem(value: Double => T): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
  }
}
