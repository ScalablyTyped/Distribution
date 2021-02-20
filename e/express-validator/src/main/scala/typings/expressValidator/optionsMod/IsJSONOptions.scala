package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsJSONOptions extends StObject {
  
  var allow_primitives: js.UndefOr[Boolean] = js.native
}
object IsJSONOptions {
  
  @scala.inline
  def apply(): IsJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsJSONOptions]
  }
  
  @scala.inline
  implicit class IsJSONOptionsMutableBuilder[Self <: IsJSONOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_primitives(value: Boolean): Self = StObject.set(x, "allow_primitives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_primitivesUndefined: Self = StObject.set(x, "allow_primitives", js.undefined)
  }
}
