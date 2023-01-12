package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsBooleanOptions extends StObject {
  
  var loose: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object IsBooleanOptions {
  
  inline def apply(): IsBooleanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsBooleanOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsBooleanOptions] (val x: Self) extends AnyVal {
    
    inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
    
    inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
