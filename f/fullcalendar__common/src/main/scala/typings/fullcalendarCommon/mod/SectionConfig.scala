package typings.fullcalendarCommon.mod

import typings.fullcalendarCommon.fullcalendarCommonStrings.body
import typings.fullcalendarCommon.fullcalendarCommonStrings.footer
import typings.fullcalendarCommon.fullcalendarCommonStrings.header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionConfig extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var expandRows: js.UndefOr[Boolean] = js.undefined
  
  var isSticky: js.UndefOr[Boolean] = js.undefined
  
  var liquid: js.UndefOr[Boolean] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var outerContent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
  ] = js.undefined
  
  var syncRowHeights: js.UndefOr[Boolean] = js.undefined
  
  var `type`: body | header | footer
}
object SectionConfig {
  
  inline def apply(`type`: body | header | footer): SectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionConfig]
  }
  
  extension [Self <: SectionConfig](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setExpandRows(value: Boolean): Self = StObject.set(x, "expandRows", value.asInstanceOf[js.Any])
    
    inline def setExpandRowsUndefined: Self = StObject.set(x, "expandRows", js.undefined)
    
    inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
    
    inline def setIsStickyUndefined: Self = StObject.set(x, "isSticky", js.undefined)
    
    inline def setLiquid(value: Boolean): Self = StObject.set(x, "liquid", value.asInstanceOf[js.Any])
    
    inline def setLiquidUndefined: Self = StObject.set(x, "liquid", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setOuterContent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
    ): Self = StObject.set(x, "outerContent", value.asInstanceOf[js.Any])
    
    inline def setOuterContentUndefined: Self = StObject.set(x, "outerContent", js.undefined)
    
    inline def setSyncRowHeights(value: Boolean): Self = StObject.set(x, "syncRowHeights", value.asInstanceOf[js.Any])
    
    inline def setSyncRowHeightsUndefined: Self = StObject.set(x, "syncRowHeights", js.undefined)
    
    inline def setType(value: body | header | footer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
