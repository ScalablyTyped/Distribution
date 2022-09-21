package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleMatch extends StObject {
  
  /**
    * Matching selector indices in the rule's selectorList selectors (0-based).
    */
  var matchingSelectors: js.Array[integer]
  
  /**
    * CSS rule in the match.
    */
  var rule: CSSRule
}
object RuleMatch {
  
  inline def apply(matchingSelectors: js.Array[integer], rule: CSSRule): RuleMatch = {
    val __obj = js.Dynamic.literal(matchingSelectors = matchingSelectors.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleMatch]
  }
  
  extension [Self <: RuleMatch](x: Self) {
    
    inline def setMatchingSelectors(value: js.Array[integer]): Self = StObject.set(x, "matchingSelectors", value.asInstanceOf[js.Any])
    
    inline def setMatchingSelectorsVarargs(value: integer*): Self = StObject.set(x, "matchingSelectors", js.Array(value*))
    
    inline def setRule(value: CSSRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
