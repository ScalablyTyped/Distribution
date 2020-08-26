package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourcesOptions extends js.Object {
  /**
    * Set to true to enable fetching window icons. The default value is false. When
    * false the appIcon property of the sources return null. Same if a source has the
    * type screen.
    */
  var fetchWindowIcons: js.UndefOr[Boolean] = js.native
  /**
    * The size that the media source thumbnail should be scaled to. Default is `150` x
    * `150`. Set width or height to 0 when you do not need the thumbnails. This will
    * save the processing time required for capturing the content of each window and
    * screen.
    */
  var thumbnailSize: js.UndefOr[Size] = js.native
  /**
    * An array of Strings that lists the types of desktop sources to be captured,
    * available types are `screen` and `window`.
    */
  var types: js.Array[String] = js.native
}

object SourcesOptions {
  @scala.inline
  def apply(types: js.Array[String]): SourcesOptions = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcesOptions]
  }
  @scala.inline
  implicit class SourcesOptionsOps[Self <: SourcesOptions] (val x: Self) extends AnyVal {
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
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchWindowIcons(value: Boolean): Self = this.set("fetchWindowIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchWindowIcons: Self = this.set("fetchWindowIcons", js.undefined)
    @scala.inline
    def setThumbnailSize(value: Size): Self = this.set("thumbnailSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailSize: Self = this.set("thumbnailSize", js.undefined)
  }
  
}

