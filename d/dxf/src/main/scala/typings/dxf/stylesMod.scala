package typings.dxf

import typings.dxf.dxfStrings.STYLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  trait Style extends StObject {
    
    var bigFontFileName: js.UndefOr[String] = js.undefined
    
    var fixedTextHeight: js.UndefOr[Double] = js.undefined
    
    var flags: js.UndefOr[Any] = js.undefined
    
    var lastHeightUsed: js.UndefOr[Double] = js.undefined
    
    var lineTypeName: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var obliqueAngle: js.UndefOr[Double] = js.undefined
    
    var primaryFontFileName: js.UndefOr[String] = js.undefined
    
    var `type`: STYLE
    
    var widthFactor: js.UndefOr[Double] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("STYLE")
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setBigFontFileName(value: String): Self = StObject.set(x, "bigFontFileName", value.asInstanceOf[js.Any])
      
      inline def setBigFontFileNameUndefined: Self = StObject.set(x, "bigFontFileName", js.undefined)
      
      inline def setFixedTextHeight(value: Double): Self = StObject.set(x, "fixedTextHeight", value.asInstanceOf[js.Any])
      
      inline def setFixedTextHeightUndefined: Self = StObject.set(x, "fixedTextHeight", js.undefined)
      
      inline def setFlags(value: Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setLastHeightUsed(value: Double): Self = StObject.set(x, "lastHeightUsed", value.asInstanceOf[js.Any])
      
      inline def setLastHeightUsedUndefined: Self = StObject.set(x, "lastHeightUsed", js.undefined)
      
      inline def setLineTypeName(value: String): Self = StObject.set(x, "lineTypeName", value.asInstanceOf[js.Any])
      
      inline def setLineTypeNameUndefined: Self = StObject.set(x, "lineTypeName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setObliqueAngle(value: Double): Self = StObject.set(x, "obliqueAngle", value.asInstanceOf[js.Any])
      
      inline def setObliqueAngleUndefined: Self = StObject.set(x, "obliqueAngle", js.undefined)
      
      inline def setPrimaryFontFileName(value: String): Self = StObject.set(x, "primaryFontFileName", value.asInstanceOf[js.Any])
      
      inline def setPrimaryFontFileNameUndefined: Self = StObject.set(x, "primaryFontFileName", js.undefined)
      
      inline def setType(value: STYLE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidthFactor(value: Double): Self = StObject.set(x, "widthFactor", value.asInstanceOf[js.Any])
      
      inline def setWidthFactorUndefined: Self = StObject.set(x, "widthFactor", js.undefined)
    }
  }
}
