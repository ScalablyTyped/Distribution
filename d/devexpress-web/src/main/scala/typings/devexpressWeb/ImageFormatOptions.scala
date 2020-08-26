package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the dashboard or dashboard item is exported in Image format.
  */
@js.native
trait ImageFormatOptions extends js.Object {
  /** @deprecated The ImageFormatOptions.Format property is obsolete now. Use the DashboardImageExportOptions.Format property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets an image format in which the dashboard (dashboard item) is exported.
    */
  var Format: String = js.native
  /** @deprecated The ImageFormatOptions.Resolution property is obsolete now. Use the DashboardImageExportOptions.Resolution property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the resolution (in dpi) used to export a dashboard (dashboard item) in Image format.
    */
  var Resolution: Double = js.native
}

object ImageFormatOptions {
  @scala.inline
  def apply(Format: String, Resolution: Double): ImageFormatOptions = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Resolution = Resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFormatOptions]
  }
  @scala.inline
  implicit class ImageFormatOptionsOps[Self <: ImageFormatOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolution(value: Double): Self = this.set("Resolution", value.asInstanceOf[js.Any])
  }
  
}

