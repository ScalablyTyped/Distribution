package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerToolboxItem extends StObject {
  
  var defaultVal: Any
  
  var info: js.Array[ASPxDesignerElementSerializationInfo]
  
  var isToolboxItem: Boolean
  
  var popularProperties: js.Array[String]
  
  var surfaceType: Any
  
  var toolboxIndex: Double
  
  var `type`: Any
}
object ASPxDesignerToolboxItem {
  
  inline def apply(
    defaultVal: Any,
    info: js.Array[ASPxDesignerElementSerializationInfo],
    isToolboxItem: Boolean,
    popularProperties: js.Array[String],
    surfaceType: Any,
    toolboxIndex: Double,
    `type`: Any
  ): ASPxDesignerToolboxItem = {
    val __obj = js.Dynamic.literal(defaultVal = defaultVal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isToolboxItem = isToolboxItem.asInstanceOf[js.Any], popularProperties = popularProperties.asInstanceOf[js.Any], surfaceType = surfaceType.asInstanceOf[js.Any], toolboxIndex = toolboxIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerToolboxItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxDesignerToolboxItem] (val x: Self) extends AnyVal {
    
    inline def setDefaultVal(value: Any): Self = StObject.set(x, "defaultVal", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: js.Array[ASPxDesignerElementSerializationInfo]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoVarargs(value: ASPxDesignerElementSerializationInfo*): Self = StObject.set(x, "info", js.Array(value*))
    
    inline def setIsToolboxItem(value: Boolean): Self = StObject.set(x, "isToolboxItem", value.asInstanceOf[js.Any])
    
    inline def setPopularProperties(value: js.Array[String]): Self = StObject.set(x, "popularProperties", value.asInstanceOf[js.Any])
    
    inline def setPopularPropertiesVarargs(value: String*): Self = StObject.set(x, "popularProperties", js.Array(value*))
    
    inline def setSurfaceType(value: Any): Self = StObject.set(x, "surfaceType", value.asInstanceOf[js.Any])
    
    inline def setToolboxIndex(value: Double): Self = StObject.set(x, "toolboxIndex", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
