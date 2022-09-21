package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  /**
    * The list of promoted items in the order that they will display across different playbacks to the same viewer.
    */
  var items: js.Array[Type]
  
  /**
    * The position object encapsulates information about the spatial position within the video where the promoted item will be displayed.
    */
  var position: CornerPosition
  
  /**
    * The timing object encapsulates information about the temporal position within the video when the promoted item will be displayed.
    */
  var timing: OffsetMs
}
object Items {
  
  inline def apply(items: js.Array[Type], position: CornerPosition, timing: OffsetMs): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  extension [Self <: Items](x: Self) {
    
    inline def setItems(value: js.Array[Type]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Type*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPosition(value: CornerPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTiming(value: OffsetMs): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
  }
}
