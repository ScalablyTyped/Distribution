package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameValue extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object NameValue {
  
  @scala.inline
  def apply(): NameValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameValue]
  }
  
  @scala.inline
  implicit class NameValueMutableBuilder[Self <: NameValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
