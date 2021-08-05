package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterProperties extends StObject {
  
  var measure: js.UndefOr[MeasureObject] = js.undefined
  
  var members: js.UndefOr[js.Array[FilterItem]] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var `type`: String
}
object FilterProperties {
  
  inline def apply(`type`: String): FilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterProperties]
  }
  
  extension [Self <: FilterProperties](x: Self) {
    
    inline def setMeasure(value: MeasureObject): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    inline def setMembers(value: js.Array[FilterItem]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: FilterItem*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
