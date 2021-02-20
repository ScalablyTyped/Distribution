package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentPropsOptionsSelector extends StObject {
  
  var key: String = js.native
  
  var value: String = js.native
}
object ComponentPropsOptionsSelector {
  
  @scala.inline
  def apply(key: String, value: String): ComponentPropsOptionsSelector = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsOptionsSelector]
  }
  
  @scala.inline
  implicit class ComponentPropsOptionsSelectorMutableBuilder[Self <: ComponentPropsOptionsSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
