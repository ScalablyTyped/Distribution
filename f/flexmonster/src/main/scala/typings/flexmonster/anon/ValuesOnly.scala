package typings.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValuesOnly extends StObject {
  
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.native
  
  var slice: js.UndefOr[typings.flexmonster.mod.Slice] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var valuesOnly: js.UndefOr[Boolean] = js.native
  
  var withDrilldown: js.UndefOr[Boolean] = js.native
  
  var xAxisType: js.UndefOr[String] = js.native
}
object ValuesOnly {
  
  @scala.inline
  def apply(): ValuesOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValuesOnly]
  }
  
  @scala.inline
  implicit class ValuesOnlyMutableBuilder[Self <: ValuesOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrepareDataFunction(value: /* rawData */ js.Any => _): Self = StObject.set(x, "prepareDataFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrepareDataFunctionUndefined: Self = StObject.set(x, "prepareDataFunction", js.undefined)
    
    @scala.inline
    def setSlice(value: typings.flexmonster.mod.Slice): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValuesOnly(value: Boolean): Self = StObject.set(x, "valuesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesOnlyUndefined: Self = StObject.set(x, "valuesOnly", js.undefined)
    
    @scala.inline
    def setWithDrilldown(value: Boolean): Self = StObject.set(x, "withDrilldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithDrilldownUndefined: Self = StObject.set(x, "withDrilldown", js.undefined)
    
    @scala.inline
    def setXAxisType(value: String): Self = StObject.set(x, "xAxisType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTypeUndefined: Self = StObject.set(x, "xAxisType", js.undefined)
  }
}
