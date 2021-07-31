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
  
  @scala.inline
  def apply(`type`: String): FilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterProperties]
  }
  
  @scala.inline
  implicit class FilterPropertiesMutableBuilder[Self <: FilterProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeasure(value: MeasureObject): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    @scala.inline
    def setMembers(value: js.Array[FilterItem]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: FilterItem*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
