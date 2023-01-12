package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsJSONOptions extends StObject {
  
  var allow_primitives: js.UndefOr[Boolean] = js.undefined
}
object IsJSONOptions {
  
  inline def apply(): IsJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsJSONOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsJSONOptions] (val x: Self) extends AnyVal {
    
    inline def setAllow_primitives(value: Boolean): Self = StObject.set(x, "allow_primitives", value.asInstanceOf[js.Any])
    
    inline def setAllow_primitivesUndefined: Self = StObject.set(x, "allow_primitives", js.undefined)
  }
}
