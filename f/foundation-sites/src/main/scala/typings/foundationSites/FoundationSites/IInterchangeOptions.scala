package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInterchangeOptions extends StObject {
  
  var rules: js.UndefOr[js.Array[Any]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object IInterchangeOptions {
  
  inline def apply(): IInterchangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInterchangeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInterchangeOptions] (val x: Self) extends AnyVal {
    
    inline def setRules(value: js.Array[Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Any*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
