package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxIframeSettings extends js.Object {
  /**
    * Iframe tag attributes
    */
  var attr: js.UndefOr[FancyBoxPlainObject] = js.native
  /**
    * Custom CSS styling for iframe wrapping element
    * You can use this to set custom iframe dimensions
    */
  var css: js.UndefOr[FancyBoxPlainObject] = js.native
  /**
    * Preload iframe before displaying it
    * This allows to calculate iframe content width and height
    * (note: Due to "Same Origin Policy", you can't get cross domain data).
    */
  var preload: js.UndefOr[Boolean] = js.native
  /**
    * Iframe template
    */
  var tpl: js.UndefOr[String] = js.native
}

object FancyBoxIframeSettings {
  @scala.inline
  def apply(): FancyBoxIframeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxIframeSettings]
  }
  @scala.inline
  implicit class FancyBoxIframeSettingsOps[Self <: FancyBoxIframeSettings] (val x: Self) extends AnyVal {
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
    def setAttr(value: FancyBoxPlainObject): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttr: Self = this.set("attr", js.undefined)
    @scala.inline
    def setCss(value: FancyBoxPlainObject): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setTpl(value: String): Self = this.set("tpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
  }
  
}

