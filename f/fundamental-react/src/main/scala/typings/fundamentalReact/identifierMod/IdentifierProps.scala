package typings.fundamentalReact.identifierMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.fundamentalReactNumbers.`1`
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import typings.fundamentalReact.fundamentalReactNumbers.`7`
import typings.fundamentalReact.fundamentalReactNumbers.`8`
import typings.fundamentalReact.fundamentalReactNumbers.`9`
import typings.fundamentalReact.iconMod.IconGlyph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifierProps
  extends /* x */ StringDictionary[js.Any] {
  var backgroundImageUrl: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var glyph: js.UndefOr[IconGlyph] = js.native
  var label: js.UndefOr[String] = js.native
  var modifier: js.UndefOr[IdentifierModifiers] = js.native
  var role: js.UndefOr[String] = js.native
  var size: IdentifierSizes = js.native
}

object IdentifierProps {
  @scala.inline
  def apply(size: IdentifierSizes): IdentifierProps = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierProps]
  }
  @scala.inline
  implicit class IdentifierPropsOps[Self <: IdentifierProps] (val x: Self) extends AnyVal {
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
    def setSize(value: IdentifierSizes): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundImageUrl(value: String): Self = this.set("backgroundImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageUrl: Self = this.set("backgroundImageUrl", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    @scala.inline
    def setGlyph(value: IconGlyph): Self = this.set("glyph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyph: Self = this.set("glyph", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setModifier(value: IdentifierModifiers): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

