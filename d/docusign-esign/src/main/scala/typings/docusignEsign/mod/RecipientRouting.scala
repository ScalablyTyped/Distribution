package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientRouting extends StObject {
  
  /**
    * The recipient routing rules.
    */
  var rules: js.UndefOr[RecipientRules] = js.undefined
}
object RecipientRouting {
  
  inline def apply(): RecipientRouting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientRouting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientRouting] (val x: Self) extends AnyVal {
    
    inline def setRules(value: RecipientRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
  }
}
