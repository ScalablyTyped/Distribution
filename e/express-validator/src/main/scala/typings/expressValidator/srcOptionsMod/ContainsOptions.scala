package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainsOptions extends StObject {
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var minOccurrences: js.UndefOr[Double] = js.undefined
}
object ContainsOptions {
  
  inline def apply(): ContainsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainsOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setMinOccurrences(value: Double): Self = StObject.set(x, "minOccurrences", value.asInstanceOf[js.Any])
    
    inline def setMinOccurrencesUndefined: Self = StObject.set(x, "minOccurrences", js.undefined)
  }
}
