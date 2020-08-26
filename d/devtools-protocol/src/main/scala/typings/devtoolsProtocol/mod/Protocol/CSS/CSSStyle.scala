package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSStyle extends js.Object {
  /**
    * CSS properties in the style.
    */
  var cssProperties: js.Array[CSSProperty] = js.native
  /**
    * Style declaration text (if available).
    */
  var cssText: js.UndefOr[String] = js.native
  /**
    * Style declaration range in the enclosing stylesheet (if available).
    */
  var range: js.UndefOr[SourceRange] = js.native
  /**
    * Computed values for all shorthands found in the style.
    */
  var shorthandEntries: js.Array[ShorthandEntry] = js.native
  /**
    * The css style sheet identifier (absent for user agent stylesheet and user-specified
    * stylesheet rules) this rule came from.
    */
  var styleSheetId: js.UndefOr[StyleSheetId] = js.native
}

object CSSStyle {
  @scala.inline
  def apply(cssProperties: js.Array[CSSProperty], shorthandEntries: js.Array[ShorthandEntry]): CSSStyle = {
    val __obj = js.Dynamic.literal(cssProperties = cssProperties.asInstanceOf[js.Any], shorthandEntries = shorthandEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSStyle]
  }
  @scala.inline
  implicit class CSSStyleOps[Self <: CSSStyle] (val x: Self) extends AnyVal {
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
    def setCssPropertiesVarargs(value: CSSProperty*): Self = this.set("cssProperties", js.Array(value :_*))
    @scala.inline
    def setCssProperties(value: js.Array[CSSProperty]): Self = this.set("cssProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setShorthandEntriesVarargs(value: ShorthandEntry*): Self = this.set("shorthandEntries", js.Array(value :_*))
    @scala.inline
    def setShorthandEntries(value: js.Array[ShorthandEntry]): Self = this.set("shorthandEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setCssText(value: String): Self = this.set("cssText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssText: Self = this.set("cssText", js.undefined)
    @scala.inline
    def setRange(value: SourceRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = this.set("styleSheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleSheetId: Self = this.set("styleSheetId", js.undefined)
  }
  
}

