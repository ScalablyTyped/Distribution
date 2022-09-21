package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
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
    * A chain of inherited pseudo element styles (from the immediate node parent up to the DOM tree root).
    */
  var inheritedPseudoElements: js.UndefOr[js.Array[InheritedPseudoElementMatches]] = js.undefined
  
  /**
    * Inline style for the specified DOM node.
    */
  var inlineStyle: js.UndefOr[CSSStyle] = js.undefined
  
  /**
    * CSS rules matching this node, from all applicable stylesheets.
    */
  var matchedCSSRules: js.UndefOr[js.Array[RuleMatch]] = js.undefined
  
  /**
    * Id of the first parent element that does not have display: contents.
    */
  var parentLayoutNodeId: js.UndefOr[NodeId] = js.undefined
  
  /**
    * Pseudo style matches for this node.
    */
  var pseudoElements: js.UndefOr[js.Array[PseudoElementMatches]] = js.undefined
}
object GetMatchedStylesForNodeResponse {
  
  inline def apply(): GetMatchedStylesForNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMatchedStylesForNodeResponse]
  }
  
  extension [Self <: GetMatchedStylesForNodeResponse](x: Self) {
    
    inline def setAttributesStyle(value: CSSStyle): Self = StObject.set(x, "attributesStyle", value.asInstanceOf[js.Any])
    
    inline def setAttributesStyleUndefined: Self = StObject.set(x, "attributesStyle", js.undefined)
    
    inline def setCssKeyframesRules(value: js.Array[CSSKeyframesRule]): Self = StObject.set(x, "cssKeyframesRules", value.asInstanceOf[js.Any])
    
    inline def setCssKeyframesRulesUndefined: Self = StObject.set(x, "cssKeyframesRules", js.undefined)
    
    inline def setCssKeyframesRulesVarargs(value: CSSKeyframesRule*): Self = StObject.set(x, "cssKeyframesRules", js.Array(value*))
    
    inline def setInherited(value: js.Array[InheritedStyleEntry]): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    inline def setInheritedPseudoElements(value: js.Array[InheritedPseudoElementMatches]): Self = StObject.set(x, "inheritedPseudoElements", value.asInstanceOf[js.Any])
    
    inline def setInheritedPseudoElementsUndefined: Self = StObject.set(x, "inheritedPseudoElements", js.undefined)
    
    inline def setInheritedPseudoElementsVarargs(value: InheritedPseudoElementMatches*): Self = StObject.set(x, "inheritedPseudoElements", js.Array(value*))
    
    inline def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
    
    inline def setInheritedVarargs(value: InheritedStyleEntry*): Self = StObject.set(x, "inherited", js.Array(value*))
    
    inline def setInlineStyle(value: CSSStyle): Self = StObject.set(x, "inlineStyle", value.asInstanceOf[js.Any])
    
    inline def setInlineStyleUndefined: Self = StObject.set(x, "inlineStyle", js.undefined)
    
    inline def setMatchedCSSRules(value: js.Array[RuleMatch]): Self = StObject.set(x, "matchedCSSRules", value.asInstanceOf[js.Any])
    
    inline def setMatchedCSSRulesUndefined: Self = StObject.set(x, "matchedCSSRules", js.undefined)
    
    inline def setMatchedCSSRulesVarargs(value: RuleMatch*): Self = StObject.set(x, "matchedCSSRules", js.Array(value*))
    
    inline def setParentLayoutNodeId(value: NodeId): Self = StObject.set(x, "parentLayoutNodeId", value.asInstanceOf[js.Any])
    
    inline def setParentLayoutNodeIdUndefined: Self = StObject.set(x, "parentLayoutNodeId", js.undefined)
    
    inline def setPseudoElements(value: js.Array[PseudoElementMatches]): Self = StObject.set(x, "pseudoElements", value.asInstanceOf[js.Any])
    
    inline def setPseudoElementsUndefined: Self = StObject.set(x, "pseudoElements", js.undefined)
    
    inline def setPseudoElementsVarargs(value: PseudoElementMatches*): Self = StObject.set(x, "pseudoElements", js.Array(value*))
  }
}
