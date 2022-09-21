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
    * Gets an array of attached connector identifiers.
    */
  var attachedConnectorIds: js.Array[String]
  
  /**
    * Specifies the shape position (x- and y-coordinates) in units.
    */
  var position: Any
  
  /**
    * Specifies the shape size in units.
    */
  var size: Any
  
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
  
  inline def apply(
    attachedConnectorIds: js.Array[String],
    id: String,
    key: Any,
    position: Any,
    size: Any,
    text: String,
    `type`: String
  ): DiagramShape = {
    val __obj = js.Dynamic.literal(attachedConnectorIds = attachedConnectorIds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShape]
  }
  
  extension [Self <: DiagramShape](x: Self) {
    
    inline def setAttachedConnectorIds(value: js.Array[String]): Self = StObject.set(x, "attachedConnectorIds", value.asInstanceOf[js.Any])
    
    inline def setAttachedConnectorIdsVarargs(value: String*): Self = StObject.set(x, "attachedConnectorIds", js.Array(value*))
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
