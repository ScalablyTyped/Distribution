package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInterchangeOptions extends StObject {
  
  var rules: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object IInterchangeOptions {
  
  inline def apply(): IInterchangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInterchangeOptions]
  }
  
  extension [Self <: IInterchangeOptions](x: Self) {
    
    inline def setRules(value: js.Array[js.Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: js.Any*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
