package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleScrollGridProps extends StObject {
  
  var collapsibleWidth: Boolean
  
  var cols: js.Array[ColProps]
  
  var height: js.UndefOr[CssDimValue] = js.undefined
  
  var liquid: Boolean
  
  var sections: js.Array[SimpleScrollGridSection]
}
object SimpleScrollGridProps {
  
  inline def apply(
    collapsibleWidth: Boolean,
    cols: js.Array[ColProps],
    liquid: Boolean,
    sections: js.Array[SimpleScrollGridSection]
  ): SimpleScrollGridProps = {
    val __obj = js.Dynamic.literal(collapsibleWidth = collapsibleWidth.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], liquid = liquid.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleScrollGridProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleScrollGridProps] (val x: Self) extends AnyVal {
    
    inline def setCollapsibleWidth(value: Boolean): Self = StObject.set(x, "collapsibleWidth", value.asInstanceOf[js.Any])
    
    inline def setCols(value: js.Array[ColProps]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsVarargs(value: ColProps*): Self = StObject.set(x, "cols", js.Array(value*))
    
    inline def setHeight(value: CssDimValue): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLiquid(value: Boolean): Self = StObject.set(x, "liquid", value.asInstanceOf[js.Any])
    
    inline def setSections(value: js.Array[SimpleScrollGridSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsVarargs(value: SimpleScrollGridSection*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}
