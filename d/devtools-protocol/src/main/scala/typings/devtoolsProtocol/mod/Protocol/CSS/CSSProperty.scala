package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSProperty extends js.Object {
  /**
    * Whether the property is disabled by the user (present for source-based properties only).
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the property is implicit (implies `false` if absent).
    */
  var `implicit`: js.UndefOr[Boolean] = js.native
  /**
    * Whether the property has "!important" annotation (implies `false` if absent).
    */
  var important: js.UndefOr[Boolean] = js.native
  /**
    * The property name.
    */
  var name: String = js.native
  /**
    * Whether the property is understood by the browser (implies `true` if absent).
    */
  var parsedOk: js.UndefOr[Boolean] = js.native
  /**
    * The entire property range in the enclosing style declaration (if available).
    */
  var range: js.UndefOr[SourceRange] = js.native
  /**
    * The full property text as specified in the style.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * The property value.
    */
  var value: String = js.native
}

object CSSProperty {
  @scala.inline
  def apply(name: String, value: String): CSSProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSProperty]
  }
  @scala.inline
  implicit class CSSPropertyOps[Self <: CSSProperty] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setImplicit(value: Boolean): Self = this.set("implicit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplicit: Self = this.set("implicit", js.undefined)
    @scala.inline
    def setImportant(value: Boolean): Self = this.set("important", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportant: Self = this.set("important", js.undefined)
    @scala.inline
    def setParsedOk(value: Boolean): Self = this.set("parsedOk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParsedOk: Self = this.set("parsedOk", js.undefined)
    @scala.inline
    def setRange(value: SourceRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

