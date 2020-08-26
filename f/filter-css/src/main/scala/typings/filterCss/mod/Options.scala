package typings.filterCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Whether to match CSS properties like `background-image`.
    * @default true
    */
  var matchDeclarationProperties: js.UndefOr[Boolean] = js.native
  /**
    * Whether to match CSS values like `url(...)`.
    * @default true
    */
  var matchDeclarationValues: js.UndefOr[Boolean] = js.native
  /**
    * Whether to match media queries like `min-device-pixel-ratio: 2`.
    * @default true
    */
  var matchMedia: js.UndefOr[Boolean] = js.native
  /**
    * Whether to match CSS selectors.
    * @default true
    */
  var matchSelectors: js.UndefOr[Boolean] = js.native
  /**
    * Whether to match [AST Node types]{@link https://github.com/reworkcss/css#types} like `font-face`.
    * @default true
    */
  var matchTypes: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setMatchDeclarationProperties(value: Boolean): Self = this.set("matchDeclarationProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchDeclarationProperties: Self = this.set("matchDeclarationProperties", js.undefined)
    @scala.inline
    def setMatchDeclarationValues(value: Boolean): Self = this.set("matchDeclarationValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchDeclarationValues: Self = this.set("matchDeclarationValues", js.undefined)
    @scala.inline
    def setMatchMedia(value: Boolean): Self = this.set("matchMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchMedia: Self = this.set("matchMedia", js.undefined)
    @scala.inline
    def setMatchSelectors(value: Boolean): Self = this.set("matchSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchSelectors: Self = this.set("matchSelectors", js.undefined)
    @scala.inline
    def setMatchTypes(value: Boolean): Self = this.set("matchTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchTypes: Self = this.set("matchTypes", js.undefined)
  }
  
}

