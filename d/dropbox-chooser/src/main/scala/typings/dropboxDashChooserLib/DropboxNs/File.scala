package typings
package dropboxDashChooserLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait File extends js.Object {
  // Size of the file in bytes.
  var bytes: scala.Double
  // URL to a 64x64px icon for the file based on the file's extension.
  var icon: java.lang.String
  // Unique ID for the file, compatible with Dropbox API v2.
  var id: java.lang.String
  // whether or not the file is actually a directory
  var isDir: scala.Boolean
  // URL to access the file, which varies depending on the linkType specified when the
  // Chooser was triggered.
  var link: java.lang.String
  // Name of the file.
  var name: java.lang.String
  // A thumbnail URL generated when the user selects images and videos.
  // If the user didn't select an image or video, no thumbnail will be included.
  var thumbnailLink: js.UndefOr[java.lang.String] = js.undefined
}

