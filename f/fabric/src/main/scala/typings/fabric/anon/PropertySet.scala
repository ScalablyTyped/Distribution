package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertySet extends StObject {
  
  var propertySet: js.UndefOr[String] = js.native
  
  var stateProperties: js.UndefOr[js.Array[_]] = js.native
}
object PropertySet {
  
  @scala.inline
  def apply(): PropertySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertySet]
  }
  
  @scala.inline
  implicit class PropertySetMutableBuilder[Self <: PropertySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertySet(value: String): Self = StObject.set(x, "propertySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertySetUndefined: Self = StObject.set(x, "propertySet", js.undefined)
    
    @scala.inline
    def setStateProperties(value: js.Array[_]): Self = StObject.set(x, "stateProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatePropertiesUndefined: Self = StObject.set(x, "stateProperties", js.undefined)
    
    @scala.inline
    def setStatePropertiesVarargs(value: js.Any*): Self = StObject.set(x, "stateProperties", js.Array(value :_*))
  }
}
