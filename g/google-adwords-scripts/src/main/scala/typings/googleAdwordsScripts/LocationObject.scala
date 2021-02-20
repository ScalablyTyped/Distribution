package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationObject extends StObject {
  
  var bidModifier: js.UndefOr[Double] = js.native
  
  var id: Double = js.native
}
object LocationObject {
  
  @scala.inline
  def apply(id: Double): LocationObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationObject]
  }
  
  @scala.inline
  implicit class LocationObjectMutableBuilder[Self <: LocationObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidModifier(value: Double): Self = StObject.set(x, "bidModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidModifierUndefined: Self = StObject.set(x, "bidModifier", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
