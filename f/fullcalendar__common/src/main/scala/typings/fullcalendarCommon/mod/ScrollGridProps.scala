package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollGridProps extends StObject {
  
  var colGroups: js.UndefOr[js.Array[ColGroupConfig]] = js.undefined
  
  var collapsibleWidth: Boolean
  
  var elRef: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any
  ] = js.undefined
  
  var liquid: Boolean
  
  var sections: js.Array[ScrollGridSectionConfig]
}
object ScrollGridProps {
  
  inline def apply(collapsibleWidth: Boolean, liquid: Boolean, sections: js.Array[ScrollGridSectionConfig]): ScrollGridProps = {
    val __obj = js.Dynamic.literal(collapsibleWidth = collapsibleWidth.asInstanceOf[js.Any], liquid = liquid.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollGridProps]
  }
  
  extension [Self <: ScrollGridProps](x: Self) {
    
    inline def setColGroups(value: js.Array[ColGroupConfig]): Self = StObject.set(x, "colGroups", value.asInstanceOf[js.Any])
    
    inline def setColGroupsUndefined: Self = StObject.set(x, "colGroups", js.undefined)
    
    inline def setColGroupsVarargs(value: ColGroupConfig*): Self = StObject.set(x, "colGroups", js.Array(value*))
    
    inline def setCollapsibleWidth(value: Boolean): Self = StObject.set(x, "collapsibleWidth", value.asInstanceOf[js.Any])
    
    inline def setElRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any
    ): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
    inline def setElRefUndefined: Self = StObject.set(x, "elRef", js.undefined)
    
    inline def setLiquid(value: Boolean): Self = StObject.set(x, "liquid", value.asInstanceOf[js.Any])
    
    inline def setSections(value: js.Array[ScrollGridSectionConfig]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsVarargs(value: ScrollGridSectionConfig*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}
