package typings.dxf

import typings.dxf.dxfMod.Point2D
import typings.dxf.dxfMod.UnitTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  type ArrowSize = Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.dxf.dxfNumbers.`10`
    - typings.dxf.dxfNumbers.`20`
    - typings.dxf.dxfNumbers.`30`
    - typings.dxf.dxfNumbers.`40`
    - typings.dxf.dxfNumbers.`70`
  */
  trait DXFHeaderPropertyType extends StObject
  object DXFHeaderPropertyType {
    
    inline def `10`: typings.dxf.dxfNumbers.`10` = 10.asInstanceOf[typings.dxf.dxfNumbers.`10`]
    
    inline def `20`: typings.dxf.dxfNumbers.`20` = 20.asInstanceOf[typings.dxf.dxfNumbers.`20`]
    
    inline def `30`: typings.dxf.dxfNumbers.`30` = 30.asInstanceOf[typings.dxf.dxfNumbers.`30`]
    
    inline def `40`: typings.dxf.dxfNumbers.`40` = 40.asInstanceOf[typings.dxf.dxfNumbers.`40`]
    
    inline def `70`: typings.dxf.dxfNumbers.`70` = 70.asInstanceOf[typings.dxf.dxfNumbers.`70`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dxf.dxfStrings.$MEASUREMENT
    - typings.dxf.dxfStrings.$INSUNITS
    - typings.dxf.dxfStrings.$EXTMIN
    - typings.dxf.dxfStrings.$EXTMAX
    - typings.dxf.dxfStrings.$DIMASZ
  */
  trait DXFHeaderPropertyValue extends StObject
  object DXFHeaderPropertyValue {
    
    inline def $DIMASZ: typings.dxf.dxfStrings.$DIMASZ = "$DIMASZ".asInstanceOf[typings.dxf.dxfStrings.$DIMASZ]
    
    inline def $EXTMAX: typings.dxf.dxfStrings.$EXTMAX = "$EXTMAX".asInstanceOf[typings.dxf.dxfStrings.$EXTMAX]
    
    inline def $EXTMIN: typings.dxf.dxfStrings.$EXTMIN = "$EXTMIN".asInstanceOf[typings.dxf.dxfStrings.$EXTMIN]
    
    inline def $INSUNITS: typings.dxf.dxfStrings.$INSUNITS = "$INSUNITS".asInstanceOf[typings.dxf.dxfStrings.$INSUNITS]
    
    inline def $MEASUREMENT: typings.dxf.dxfStrings.$MEASUREMENT = "$MEASUREMENT".asInstanceOf[typings.dxf.dxfStrings.$MEASUREMENT]
  }
  
  trait Header extends StObject {
    
    @JSName("$INSUNITS")
    var $INSUNITS: UnitTypes
    
    var dimArrowSize: ArrowSize
    
    var extMax: Point2D
    
    var extMin: Point2D
  }
  object Header {
    
    inline def apply($INSUNITS: UnitTypes, dimArrowSize: ArrowSize, extMax: Point2D, extMin: Point2D): Header = {
      val __obj = js.Dynamic.literal($INSUNITS = $INSUNITS.asInstanceOf[js.Any], dimArrowSize = dimArrowSize.asInstanceOf[js.Any], extMax = extMax.asInstanceOf[js.Any], extMin = extMin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def setDimArrowSize(value: ArrowSize): Self = StObject.set(x, "dimArrowSize", value.asInstanceOf[js.Any])
      
      inline def setExtMax(value: Point2D): Self = StObject.set(x, "extMax", value.asInstanceOf[js.Any])
      
      inline def setExtMin(value: Point2D): Self = StObject.set(x, "extMin", value.asInstanceOf[js.Any])
    }
  }
}
