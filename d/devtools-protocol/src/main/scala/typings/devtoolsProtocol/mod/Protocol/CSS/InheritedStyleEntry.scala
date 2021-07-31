package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InheritedStyleEntry extends StObject {
  
  /**
    * The ancestor node's inline style, if any, in the style inheritance chain.
    */
  var inlineStyle: js.UndefOr[CSSStyle] = js.undefined
  
  /**
    * Matches of CSS rules matching the ancestor node in the style inheritance chain.
    */
  var matchedCSSRules: js.Array[RuleMatch]
}
object InheritedStyleEntry {
  
  @scala.inline
  def apply(matchedCSSRules: js.Array[RuleMatch]): InheritedStyleEntry = {
    val __obj = js.Dynamic.literal(matchedCSSRules = matchedCSSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritedStyleEntry]
  }
  
  @scala.inline
  implicit class InheritedStyleEntryMutableBuilder[Self <: InheritedStyleEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInlineStyle(value: CSSStyle): Self = StObject.set(x, "inlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineStyleUndefined: Self = StObject.set(x, "inlineStyle", js.undefined)
    
    @scala.inline
    def setMatchedCSSRules(value: js.Array[RuleMatch]): Self = StObject.set(x, "matchedCSSRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedCSSRulesVarargs(value: RuleMatch*): Self = StObject.set(x, "matchedCSSRules", js.Array(value :_*))
  }
}
