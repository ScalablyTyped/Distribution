package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerToolboxItem extends StObject {
  
  var defaultVal: js.Any = js.native
  
  var info: js.Array[ASPxDesignerElementSerializationInfo] = js.native
  
  var isToolboxItem: Boolean = js.native
  
  var popularProperties: js.Array[String] = js.native
  
  var surfaceType: js.Any = js.native
  
  var toolboxIndex: Double = js.native
  
  var `type`: js.Any = js.native
}
object ASPxDesignerToolboxItem {
  
  @scala.inline
  def apply(
    defaultVal: js.Any,
    info: js.Array[ASPxDesignerElementSerializationInfo],
    isToolboxItem: Boolean,
    popularProperties: js.Array[String],
    surfaceType: js.Any,
    toolboxIndex: Double,
    `type`: js.Any
  ): ASPxDesignerToolboxItem = {
    val __obj = js.Dynamic.literal(defaultVal = defaultVal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isToolboxItem = isToolboxItem.asInstanceOf[js.Any], popularProperties = popularProperties.asInstanceOf[js.Any], surfaceType = surfaceType.asInstanceOf[js.Any], toolboxIndex = toolboxIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerToolboxItem]
  }
  
  @scala.inline
  implicit class ASPxDesignerToolboxItemMutableBuilder[Self <: ASPxDesignerToolboxItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultVal(value: js.Any): Self = StObject.set(x, "defaultVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: js.Array[ASPxDesignerElementSerializationInfo]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoVarargs(value: ASPxDesignerElementSerializationInfo*): Self = StObject.set(x, "info", js.Array(value :_*))
    
    @scala.inline
    def setIsToolboxItem(value: Boolean): Self = StObject.set(x, "isToolboxItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopularProperties(value: js.Array[String]): Self = StObject.set(x, "popularProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopularPropertiesVarargs(value: String*): Self = StObject.set(x, "popularProperties", js.Array(value :_*))
    
    @scala.inline
    def setSurfaceType(value: js.Any): Self = StObject.set(x, "surfaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolboxIndex(value: Double): Self = StObject.set(x, "toolboxIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
