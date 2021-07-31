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
  var key: js.Any
}
object DiagramItem {
  
  @scala.inline
  def apply(id: String, key: js.Any): DiagramItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramItem]
  }
  
  @scala.inline
  implicit class DiagramItemMutableBuilder[Self <: DiagramItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
