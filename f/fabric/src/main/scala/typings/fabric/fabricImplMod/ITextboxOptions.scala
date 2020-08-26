package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextboxOptions extends ITextOptions {
  /**
    * Minimum calculated width of a textbox, in pixels.
    * fixed to 2 so that an empty textbox cannot go to 0
    * and is still selectable without text.
    * @type Number
    */
  var dynamicMinWidth: js.UndefOr[Double] = js.native
  /**
    * Is the text wrapping
    * @type Boolean
    */
  var isWrapping: js.UndefOr[Boolean] = js.native
  /**
    * Minimum width of textbox, in pixels.
    * @type Number
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * Use this boolean property in order to split strings that have no white space concept.
    * this is a cheap way to help with chinese/japaense
    * @type Boolean
    * @since 2.6.0
    */
  var splitByGrapheme: js.UndefOr[Boolean] = js.native
}

object ITextboxOptions {
  @scala.inline
  def apply(): ITextboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextboxOptions]
  }
  @scala.inline
  implicit class ITextboxOptionsOps[Self <: ITextboxOptions] (val x: Self) extends AnyVal {
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
    def setDynamicMinWidth(value: Double): Self = this.set("dynamicMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicMinWidth: Self = this.set("dynamicMinWidth", js.undefined)
    @scala.inline
    def setIsWrapping(value: Boolean): Self = this.set("isWrapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWrapping: Self = this.set("isWrapping", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setSplitByGrapheme(value: Boolean): Self = this.set("splitByGrapheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitByGrapheme: Self = this.set("splitByGrapheme", js.undefined)
  }
  
}

