package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a shape.
  */
trait DiagramShape
  extends StObject
     with DiagramItem {
  
  /**
    * Gets the shape's text.
    */
  var text: String
  
  /**
    * Gets the shape type.
    */
  var `type`: String
}
object DiagramShape {
  
  inline def apply(id: String, key: js.Any, text: String, `type`: String): DiagramShape = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShape]
  }
  
  extension [Self <: DiagramShape](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
