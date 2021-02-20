package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInterchangeOptions extends StObject {
  
  var rules: js.UndefOr[js.Array[_]] = js.native
}
object IInterchangeOptions {
  
  @scala.inline
  def apply(): IInterchangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInterchangeOptions]
  }
  
  @scala.inline
  implicit class IInterchangeOptionsMutableBuilder[Self <: IInterchangeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[_]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: js.Any*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
