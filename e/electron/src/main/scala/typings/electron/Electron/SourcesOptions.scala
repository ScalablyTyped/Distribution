package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourcesOptions extends js.Object {
  /**
    * Set to true to enable fetching window icons. The default value is false. When
    * false the appIcon property of the sources return null. Same if a source has the
    * type screen.
    */
  var fetchWindowIcons: js.UndefOr[Boolean] = js.undefined
  /**
    * The size that the media source thumbnail should be scaled to. Default is `150` x
    * `150`. Set width or height to 0 when you do not need the thumbnails. This will
    * save the processing time required for capturing the content of each window and
    * screen.
    */
  var thumbnailSize: js.UndefOr[Size] = js.undefined
  /**
    * An array of Strings that lists the types of desktop sources to be captured,
    * available types are `screen` and `window`.
    */
  var types: js.Array[String]
}

object SourcesOptions {
  @scala.inline
  def apply(
    types: js.Array[String],
    fetchWindowIcons: js.UndefOr[Boolean] = js.undefined,
    thumbnailSize: Size = null
  ): SourcesOptions = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchWindowIcons)) __obj.updateDynamic("fetchWindowIcons")(fetchWindowIcons.get.asInstanceOf[js.Any])
    if (thumbnailSize != null) __obj.updateDynamic("thumbnailSize")(thumbnailSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcesOptions]
  }
}

