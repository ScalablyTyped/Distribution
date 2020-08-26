package typings.electron.Electron

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddRepresentationOptions extends js.Object {
  /**
    * The buffer containing the raw image data.
    */
  var buffer: js.UndefOr[Buffer] = js.native
  /**
    * The data URL containing either a base 64 encoded PNG or JPEG image.
    */
  var dataURL: js.UndefOr[String] = js.native
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as `buffer`.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The scale factor to add the image representation for.
    */
  var scaleFactor: Double = js.native
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as `buffer`.
    */
  var width: js.UndefOr[Double] = js.native
}

object AddRepresentationOptions {
  @scala.inline
  def apply(scaleFactor: Double): AddRepresentationOptions = {
    val __obj = js.Dynamic.literal(scaleFactor = scaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRepresentationOptions]
  }
  @scala.inline
  implicit class AddRepresentationOptionsOps[Self <: AddRepresentationOptions] (val x: Self) extends AnyVal {
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
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuffer(value: Buffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setDataURL(value: String): Self = this.set("dataURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataURL: Self = this.set("dataURL", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

