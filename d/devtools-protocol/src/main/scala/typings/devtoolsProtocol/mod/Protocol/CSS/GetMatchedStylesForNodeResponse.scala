package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMatchedStylesForNodeResponse extends js.Object {
  /**
    * Attribute-defined element style (e.g. resulting from "width=20 height=100%").
    */
  var attributesStyle: js.UndefOr[CSSStyle] = js.native
  /**
    * A list of CSS keyframed animations matching this node.
    */
  var cssKeyframesRules: js.UndefOr[js.Array[CSSKeyframesRule]] = js.native
  /**
    * A chain of inherited styles (from the immediate node parent up to the DOM tree root).
    */
  var inherited: js.UndefOr[js.Array[InheritedStyleEntry]] = js.native
  /**
    * Inline style for the specified DOM node.
    */
  var inlineStyle: js.UndefOr[CSSStyle] = js.native
  /**
    * CSS rules matching this node, from all applicable stylesheets.
    */
  var matchedCSSRules: js.UndefOr[js.Array[RuleMatch]] = js.native
  /**
    * Pseudo style matches for this node.
    */
  var pseudoElements: js.UndefOr[js.Array[PseudoElementMatches]] = js.native
}

object GetMatchedStylesForNodeResponse {
  @scala.inline
  def apply(): GetMatchedStylesForNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMatchedStylesForNodeResponse]
  }
  @scala.inline
  implicit class GetMatchedStylesForNodeResponseOps[Self <: GetMatchedStylesForNodeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributesStyle(value: CSSStyle): Self = this.set("attributesStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributesStyle: Self = this.set("attributesStyle", js.undefined)
    @scala.inline
    def setCssKeyframesRulesVarargs(value: CSSKeyframesRule*): Self = this.set("cssKeyframesRules", js.Array(value :_*))
    @scala.inline
    def setCssKeyframesRules(value: js.Array[CSSKeyframesRule]): Self = this.set("cssKeyframesRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssKeyframesRules: Self = this.set("cssKeyframesRules", js.undefined)
    @scala.inline
    def setInheritedVarargs(value: InheritedStyleEntry*): Self = this.set("inherited", js.Array(value :_*))
    @scala.inline
    def setInherited(value: js.Array[InheritedStyleEntry]): Self = this.set("inherited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherited: Self = this.set("inherited", js.undefined)
    @scala.inline
    def setInlineStyle(value: CSSStyle): Self = this.set("inlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineStyle: Self = this.set("inlineStyle", js.undefined)
    @scala.inline
    def setMatchedCSSRulesVarargs(value: RuleMatch*): Self = this.set("matchedCSSRules", js.Array(value :_*))
    @scala.inline
    def setMatchedCSSRules(value: js.Array[RuleMatch]): Self = this.set("matchedCSSRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchedCSSRules: Self = this.set("matchedCSSRules", js.undefined)
    @scala.inline
    def setPseudoElementsVarargs(value: PseudoElementMatches*): Self = this.set("pseudoElements", js.Array(value :_*))
    @scala.inline
    def setPseudoElements(value: js.Array[PseudoElementMatches]): Self = this.set("pseudoElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePseudoElements: Self = this.set("pseudoElements", js.undefined)
  }
  
}

