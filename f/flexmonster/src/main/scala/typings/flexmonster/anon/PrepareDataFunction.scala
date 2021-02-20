package typings.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrepareDataFunction extends StObject {
  
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.native
  
  var slice: js.UndefOr[typings.flexmonster.mod.Slice] = js.native
  
  var `type`: String = js.native
}
object PrepareDataFunction {
  
  @scala.inline
  def apply(`type`: String): PrepareDataFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareDataFunction]
  }
  
  @scala.inline
  implicit class PrepareDataFunctionMutableBuilder[Self <: PrepareDataFunction] (val x: Self) extends AnyVal {
    
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
  }
}
