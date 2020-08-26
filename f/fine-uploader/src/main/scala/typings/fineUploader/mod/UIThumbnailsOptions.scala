package typings.fineUploader.mod

import typings.fineUploader.coreMod.CustomResizerCallBack
import typings.fineUploader.coreMod.PromiseOptions
import typings.fineUploader.coreMod.ResizeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIThumbnailsOptions extends js.Object {
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a Promise.
    * Once the resize is complete, your promise must be fulfilled.
    *
    * You may, of course, reject your returned Promise is the resize fails in some way
    *
    * @default `undefined`
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.native
  /**
    * Maximum number of previews to render per Fine Uploader instance.
    *
    * A call to the reset method resets this value as well
    *
    * @default `0`
    */
  var maxCount: js.UndefOr[Double] = js.native
  /**
    *
    */
  var placeholders: js.UndefOr[UIThumbnailsPlaceholderOptions] = js.native
  /**
    * The amount of time, in milliseconds, to pause between each preview generation process.
    *
    * This is in place to prevent the UI thread from locking up for a continuously long period of time, as preview generation can be a resource-intensive process
    *
    * @default `750`
    */
  var timeBetweenThumbs: js.UndefOr[Double] = js.native
}

object UIThumbnailsOptions {
  @scala.inline
  def apply(): UIThumbnailsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIThumbnailsOptions]
  }
  @scala.inline
  implicit class UIThumbnailsOptionsOps[Self <: UIThumbnailsOptions] (val x: Self) extends AnyVal {
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
    def setCustomResizer(value: /* resizeInfo */ ResizeInfo => PromiseOptions): Self = this.set("customResizer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomResizer: Self = this.set("customResizer", js.undefined)
    @scala.inline
    def setMaxCount(value: Double): Self = this.set("maxCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCount: Self = this.set("maxCount", js.undefined)
    @scala.inline
    def setPlaceholders(value: UIThumbnailsPlaceholderOptions): Self = this.set("placeholders", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholders: Self = this.set("placeholders", js.undefined)
    @scala.inline
    def setTimeBetweenThumbs(value: Double): Self = this.set("timeBetweenThumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeBetweenThumbs: Self = this.set("timeBetweenThumbs", js.undefined)
  }
  
}

