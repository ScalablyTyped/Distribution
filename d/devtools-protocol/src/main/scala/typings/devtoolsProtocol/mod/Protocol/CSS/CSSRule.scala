package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSRule extends js.Object {
  /**
    * Media list array (for rules involving media queries). The array enumerates media queries
    * starting with the innermost one, going outwards.
    */
  var media: js.UndefOr[js.Array[CSSMedia]] = js.native
  /**
    * Parent stylesheet's origin.
    */
  var origin: StyleSheetOrigin = js.native
  /**
    * Rule selector data.
    */
  var selectorList: SelectorList = js.native
  /**
    * Associated style declaration.
    */
  var style: CSSStyle = js.native
  /**
    * The css style sheet identifier (absent for user agent stylesheet and user-specified
    * stylesheet rules) this rule came from.
    */
  var styleSheetId: js.UndefOr[StyleSheetId] = js.native
}

object CSSRule {
  @scala.inline
  def apply(origin: StyleSheetOrigin, selectorList: SelectorList, style: CSSStyle): CSSRule = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], selectorList = selectorList.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSRule]
  }
  @scala.inline
  implicit class CSSRuleOps[Self <: CSSRule] (val x: Self) extends AnyVal {
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
    def setOrigin(value: StyleSheetOrigin): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorList(value: SelectorList): Self = this.set("selectorList", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaVarargs(value: CSSMedia*): Self = this.set("media", js.Array(value :_*))
    @scala.inline
    def setMedia(value: js.Array[CSSMedia]): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = this.set("styleSheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleSheetId: Self = this.set("styleSheetId", js.undefined)
  }
  
}

