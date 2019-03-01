package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFile extends js.Object {
  /** The bytes that constitute the file. */
  var fileContents: js.UndefOr[java.lang.String] = js.undefined
  /** The file name of the configuration file (full or relative path). */
  var filePath: js.UndefOr[java.lang.String] = js.undefined
  /** The type of configuration file this represents. */
  var fileType: js.UndefOr[java.lang.String] = js.undefined
}

object ConfigFile {
  @scala.inline
  def apply(
    fileContents: java.lang.String = null,
    filePath: java.lang.String = null,
    fileType: java.lang.String = null
  ): ConfigFile = {
    val __obj = js.Dynamic.literal()
    if (fileContents != null) __obj.updateDynamic("fileContents")(fileContents)
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    __obj.asInstanceOf[ConfigFile]
  }
}

