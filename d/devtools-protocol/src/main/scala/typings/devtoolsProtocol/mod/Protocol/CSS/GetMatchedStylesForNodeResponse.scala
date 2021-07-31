package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMatchedStylesForNodeResponse extends StObject {
  
  /**
    * Attribute-defined element style (e.g. resulting from "width=20 height=100%").
    */
  var attributesStyle: js.UndefOr[CSSStyle] = js.undefined
  
  /**
    * A list of CSS keyframed animations matching this node.
    */
  var cssKeyframesRules: js.UndefOr[js.Array[CSSKeyframesRule]] = js.undefined
  
  /**
    * A chain of inherited styles (from the immediate node parent up to the DOM tree root).
    */
  var inherited: js.UndefOr[js.Array[InheritedStyleEntry]] = js.undefined
  
  /**
    * Inline style for the specified DOM node.
    */
  var inlineStyle: js.UndefOr[CSSStyle] = js.undefined
  
  /**
    * CSS rules matching this node, from all applicable stylesheets.
    */
  var matchedCSSRules: js.UndefOr[js.Array[RuleMatch]] = js.undefined
  
  /**
    * Pseudo style matches for this node.
    */
  var pseudoElements: js.UndefOr[js.Array[PseudoElementMatches]] = js.undefined
}
object GetMatchedStylesForNodeResponse {
  
  @scala.inline
  def apply(): GetMatchedStylesForNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMatchedStylesForNodeResponse]
  }
  
  @scala.inline
  implicit class GetMatchedStylesForNodeResponseMutableBuilder[Self <: GetMatchedStylesForNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributesStyle(value: CSSStyle): Self = StObject.set(x, "attributesStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesStyleUndefined: Self = StObject.set(x, "attributesStyle", js.undefined)
    
    @scala.inline
    def setCssKeyframesRules(value: js.Array[CSSKeyframesRule]): Self = StObject.set(x, "cssKeyframesRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssKeyframesRulesUndefined: Self = StObject.set(x, "cssKeyframesRules", js.undefined)
    
    @scala.inline
    def setCssKeyframesRulesVarargs(value: CSSKeyframesRule*): Self = StObject.set(x, "cssKeyframesRules", js.Array(value :_*))
    
    @scala.inline
    def setInherited(value: js.Array[InheritedStyleEntry]): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
    
    @scala.inline
    def setInheritedVarargs(value: InheritedStyleEntry*): Self = StObject.set(x, "inherited", js.Array(value :_*))
    
    @scala.inline
    def setInlineStyle(value: CSSStyle): Self = StObject.set(x, "inlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineStyleUndefined: Self = StObject.set(x, "inlineStyle", js.undefined)
    
    @scala.inline
    def setMatchedCSSRules(value: js.Array[RuleMatch]): Self = StObject.set(x, "matchedCSSRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedCSSRulesUndefined: Self = StObject.set(x, "matchedCSSRules", js.undefined)
    
    @scala.inline
    def setMatchedCSSRulesVarargs(value: RuleMatch*): Self = StObject.set(x, "matchedCSSRules", js.Array(value :_*))
    
    @scala.inline
    def setPseudoElements(value: js.Array[PseudoElementMatches]): Self = StObject.set(x, "pseudoElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoElementsUndefined: Self = StObject.set(x, "pseudoElements", js.undefined)
    
    @scala.inline
    def setPseudoElementsVarargs(value: PseudoElementMatches*): Self = StObject.set(x, "pseudoElements", js.Array(value :_*))
  }
}
