package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFile extends js.Object {
  /** The bytes that constitute the file. */
  var fileContents: js.UndefOr[String] = js.undefined
  /** The file name of the configuration file (full or relative path). */
  var filePath: js.UndefOr[String] = js.undefined
  /** The type of configuration file this represents. */
  var fileType: js.UndefOr[String] = js.undefined
}

object ConfigFile {
  @scala.inline
  def apply(fileContents: String = null, filePath: String = null, fileType: String = null): ConfigFile = {
    val __obj = js.Dynamic.literal()
    if (fileContents != null) __obj.updateDynamic("fileContents")(fileContents.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFile]
  }
}

