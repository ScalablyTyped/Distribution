package typings.firebase.mod.default.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Promotion extends StObject {
  
  var creative_name: js.UndefOr[String] = js.native
  
  var creative_slot: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object Promotion {
  
  @scala.inline
  def apply(): Promotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Promotion]
  }
  
  @scala.inline
  implicit class PromotionMutableBuilder[Self <: Promotion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreative_name(value: String): Self = StObject.set(x, "creative_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreative_nameUndefined: Self = StObject.set(x, "creative_name", js.undefined)
    
    @scala.inline
    def setCreative_slot(value: String): Self = StObject.set(x, "creative_slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreative_slotUndefined: Self = StObject.set(x, "creative_slot", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
