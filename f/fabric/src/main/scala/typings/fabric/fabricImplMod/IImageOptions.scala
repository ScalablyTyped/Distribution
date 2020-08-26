package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageOptions extends IObjectOptions {
  /**
    * key used to retrieve the texture representing this image
    * @since 2.0.0
    * @type String
    */
  var cacheKey: js.UndefOr[String] = js.native
  /**
    * Image crop in pixels from original image size.
    * @since 2.0.0
    * @type Number
    */
  var cropX: js.UndefOr[Double] = js.native
  /**
    * Image crop in pixels from original image size.
    * @since 2.0.0
    * @type Number
    */
  var cropY: js.UndefOr[Double] = js.native
  /**
    * crossOrigin value (one of "", "anonymous", "allow-credentials")
    */
  var crossOrigin: js.UndefOr[String] = js.native
  /**
    * Image filter array
    */
  var filters: js.UndefOr[js.Array[IBaseFilter]] = js.native
  /**
    * minimum scale factor under which any resizeFilter is triggered to resize the image
    * 0 will disable the automatic resize. 1 will trigger automatically always.
    * number bigger than 1 are not implemented yet.
    * @type Number
    */
  var minimumScaleTrigger: js.UndefOr[Double] = js.native
  /**
    * When calling {@link fabric.Image.getSrc}, return value from element src with `element.getAttribute('src')`.
    * This allows for relative urls as image src.
    * @since 2.7.0
    * @type Boolean
    */
  var srcFromAttribute: js.UndefOr[Boolean] = js.native
}

object IImageOptions {
  @scala.inline
  def apply(): IImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImageOptions]
  }
  @scala.inline
  implicit class IImageOptionsOps[Self <: IImageOptions] (val x: Self) extends AnyVal {
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
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheKey: Self = this.set("cacheKey", js.undefined)
    @scala.inline
    def setCropX(value: Double): Self = this.set("cropX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropX: Self = this.set("cropX", js.undefined)
    @scala.inline
    def setCropY(value: Double): Self = this.set("cropY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropY: Self = this.set("cropY", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: IBaseFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[IBaseFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMinimumScaleTrigger(value: Double): Self = this.set("minimumScaleTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumScaleTrigger: Self = this.set("minimumScaleTrigger", js.undefined)
    @scala.inline
    def setSrcFromAttribute(value: Boolean): Self = this.set("srcFromAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcFromAttribute: Self = this.set("srcFromAttribute", js.undefined)
  }
  
}

