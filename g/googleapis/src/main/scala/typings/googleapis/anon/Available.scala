package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Available extends StObject {
  
  var available: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object Available {
  
  @scala.inline
  def apply(): Available = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Available]
  }
  
  @scala.inline
  implicit class AvailableMutableBuilder[Self <: Available] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
