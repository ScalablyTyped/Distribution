package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about an item (shape or connector).
  */
trait DiagramItem extends StObject {
  
  /**
    * Gets the item's internal identifier.
    */
  var id: String
  
  /**
    * Gets the item's key from a data source.
    */
  var key: Any
}
object DiagramItem {
  
  inline def apply(id: String, key: Any): DiagramItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramItem]
  }
  
  extension [Self <: DiagramItem](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
