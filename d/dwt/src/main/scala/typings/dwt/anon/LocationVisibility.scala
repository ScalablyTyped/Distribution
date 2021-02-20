package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationVisibility extends StObject {
  
  var location: js.UndefOr[String] = js.native
  
  var visibility: js.UndefOr[Boolean] = js.native
}
object LocationVisibility {
  
  @scala.inline
  def apply(): LocationVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationVisibility]
  }
  
  @scala.inline
  implicit class LocationVisibilityMutableBuilder[Self <: LocationVisibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
