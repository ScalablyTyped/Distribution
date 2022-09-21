package typings.dxf

import typings.dxf.dxfMod.ColorNumber
import typings.dxf.dxfMod.UnitTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("dxf/handlers/entity/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`type`: Double, value: Any): CommonEntityData = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[CommonEntityData]
  
  trait CommonEntityData extends StObject {
    
    @JSName("$INSUNITS")
    var $INSUNITS: js.UndefOr[UnitTypes] = js.undefined
    
    var TYPE: String
    
    var colorNumber: js.UndefOr[ColorNumber] = js.undefined
    
    var extrusionX: Any
    
    var extrusionY: Any
    
    var extrusionZ: Any
    
    var layer: String
    
    var lineTypeName: String
    
    var lineTypeScale: Any
    
    var visible: Boolean
  }
  object CommonEntityData {
    
    inline def apply(
      TYPE: String,
      extrusionX: Any,
      extrusionY: Any,
      extrusionZ: Any,
      layer: String,
      lineTypeName: String,
      lineTypeScale: Any,
      visible: Boolean
    ): CommonEntityData = {
      val __obj = js.Dynamic.literal(TYPE = TYPE.asInstanceOf[js.Any], extrusionX = extrusionX.asInstanceOf[js.Any], extrusionY = extrusionY.asInstanceOf[js.Any], extrusionZ = extrusionZ.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], lineTypeName = lineTypeName.asInstanceOf[js.Any], lineTypeScale = lineTypeScale.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonEntityData]
    }
    
    extension [Self <: CommonEntityData](x: Self) {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def set$INSUNITSUndefined: Self = StObject.set(x, "$INSUNITS", js.undefined)
      
      inline def setColorNumber(value: ColorNumber): Self = StObject.set(x, "colorNumber", value.asInstanceOf[js.Any])
      
      inline def setColorNumberUndefined: Self = StObject.set(x, "colorNumber", js.undefined)
      
      inline def setExtrusionX(value: Any): Self = StObject.set(x, "extrusionX", value.asInstanceOf[js.Any])
      
      inline def setExtrusionY(value: Any): Self = StObject.set(x, "extrusionY", value.asInstanceOf[js.Any])
      
      inline def setExtrusionZ(value: Any): Self = StObject.set(x, "extrusionZ", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLineTypeName(value: String): Self = StObject.set(x, "lineTypeName", value.asInstanceOf[js.Any])
      
      inline def setLineTypeScale(value: Any): Self = StObject.set(x, "lineTypeScale", value.asInstanceOf[js.Any])
      
      inline def setTYPE(value: String): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
