package typings.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuesOnly extends StObject {
  
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ Any, Any]] = js.undefined
  
  var slice: js.UndefOr[typings.flexmonster.mod.Slice] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var valuesOnly: js.UndefOr[Boolean] = js.undefined
  
  var withDrilldown: js.UndefOr[Boolean] = js.undefined
  
  var xAxisType: js.UndefOr[String] = js.undefined
}
object ValuesOnly {
  
  inline def apply(): ValuesOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValuesOnly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuesOnly] (val x: Self) extends AnyVal {
    
    inline def setPrepareDataFunction(value: /* rawData */ Any => Any): Self = StObject.set(x, "prepareDataFunction", js.Any.fromFunction1(value))
    
    inline def setPrepareDataFunctionUndefined: Self = StObject.set(x, "prepareDataFunction", js.undefined)
    
    inline def setSlice(value: typings.flexmonster.mod.Slice): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValuesOnly(value: Boolean): Self = StObject.set(x, "valuesOnly", value.asInstanceOf[js.Any])
    
    inline def setValuesOnlyUndefined: Self = StObject.set(x, "valuesOnly", js.undefined)
    
    inline def setWithDrilldown(value: Boolean): Self = StObject.set(x, "withDrilldown", value.asInstanceOf[js.Any])
    
    inline def setWithDrilldownUndefined: Self = StObject.set(x, "withDrilldown", js.undefined)
    
    inline def setXAxisType(value: String): Self = StObject.set(x, "xAxisType", value.asInstanceOf[js.Any])
    
    inline def setXAxisTypeUndefined: Self = StObject.set(x, "xAxisType", js.undefined)
  }
}
