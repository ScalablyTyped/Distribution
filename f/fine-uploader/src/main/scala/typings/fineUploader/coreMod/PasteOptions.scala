package typings.fineUploader.coreMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasteOptions extends js.Object {
  /**
    * The default name given to pasted images
    *
    * @default `'pasted_image'`
    */
  var defaultName: js.UndefOr[String] = js.native
  /**
    * Enable this feature by providing any HTMLElement here
    *
    * @default `null`
    */
  var targetElement: js.UndefOr[HTMLElement] = js.native
}

object PasteOptions {
  @scala.inline
  def apply(): PasteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteOptions]
  }
  @scala.inline
  implicit class PasteOptionsOps[Self <: PasteOptions] (val x: Self) extends AnyVal {
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
    def setDefaultName(value: String): Self = this.set("defaultName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultName: Self = this.set("defaultName", js.undefined)
    @scala.inline
    def setTargetElement(value: HTMLElement): Self = this.set("targetElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetElement: Self = this.set("targetElement", js.undefined)
  }
  
}

