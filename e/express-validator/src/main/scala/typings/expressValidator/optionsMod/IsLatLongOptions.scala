package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsLatLongOptions extends StObject {
  
  var checkDMS: js.UndefOr[Boolean] = js.native
}
object IsLatLongOptions {
  
  @scala.inline
  def apply(): IsLatLongOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsLatLongOptions]
  }
  
  @scala.inline
  implicit class IsLatLongOptionsMutableBuilder[Self <: IsLatLongOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckDMS(value: Boolean): Self = StObject.set(x, "checkDMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckDMSUndefined: Self = StObject.set(x, "checkDMS", js.undefined)
  }
}
