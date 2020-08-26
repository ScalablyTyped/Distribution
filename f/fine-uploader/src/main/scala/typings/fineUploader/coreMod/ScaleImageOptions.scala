package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleImageOptions extends js.Object {
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a `Promise`.
    *
    * Once the resize is complete, your promise must be fulfilled.
    * You may, of course, reject your returned `Promise` is the resize fails in some way.
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.native
  /**
    * @default `false`
    */
  var includeExif: js.UndefOr[Boolean] = js.native
  /**
    * required
    */
  var maxSize: Double = js.native
  /**
    * @default `true`
    */
  var orient: js.UndefOr[Boolean] = js.native
  /**
    * number between `0` and `100`
    *
    * @default `80`
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * defaults to the type of the reference image
    */
  var `type`: js.UndefOr[String] = js.native
}

object ScaleImageOptions {
  @scala.inline
  def apply(maxSize: Double): ScaleImageOptions = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleImageOptions]
  }
  @scala.inline
  implicit class ScaleImageOptionsOps[Self <: ScaleImageOptions] (val x: Self) extends AnyVal {
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
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomResizer(value: /* resizeInfo */ ResizeInfo => PromiseOptions): Self = this.set("customResizer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomResizer: Self = this.set("customResizer", js.undefined)
    @scala.inline
    def setIncludeExif(value: Boolean): Self = this.set("includeExif", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeExif: Self = this.set("includeExif", js.undefined)
    @scala.inline
    def setOrient(value: Boolean): Self = this.set("orient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

