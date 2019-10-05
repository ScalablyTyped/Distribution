package typings.dropboxDashChooser.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooserFile extends js.Object {
  // Size of the file in bytes.
  var bytes: Double
  // URL to a 64x64px icon for the file based on the file's extension.
  var icon: String
  // Unique ID for the file, compatible with Dropbox API v2.
  var id: String
  // whether or not the file is actually a directory
  var isDir: Boolean
  // URL to access the file, which varies depending on the linkType specified when the
  // Chooser was triggered.
  var link: String
  // Name of the file.
  var name: String
  // A thumbnail URL generated when the user selects images and videos.
  // If the user didn't select an image or video, no thumbnail will be included.
  var thumbnailLink: js.UndefOr[String] = js.undefined
}

object ChooserFile {
  @scala.inline
  def apply(
    bytes: Double,
    icon: String,
    id: String,
    isDir: Boolean,
    link: String,
    name: String,
    thumbnailLink: String = null
  ): ChooserFile = {
    val __obj = js.Dynamic.literal(bytes = bytes, icon = icon, id = id, isDir = isDir, link = link, name = name)
    if (thumbnailLink != null) __obj.updateDynamic("thumbnailLink")(thumbnailLink)
    __obj.asInstanceOf[ChooserFile]
  }
}

