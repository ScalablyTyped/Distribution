package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic specification of a source configuration file
  */
@js.native
trait Schema$ConfigFile extends js.Object {
  /**
    * The bytes that constitute the file.
    */
  var fileContents: js.UndefOr[String] = js.native
  /**
    * The file name of the configuration file (full or relative path).
    */
  var filePath: js.UndefOr[String] = js.native
  /**
    * The type of configuration file this represents.
    */
  var fileType: js.UndefOr[String] = js.native
}

object Schema$ConfigFile {
  @scala.inline
  def apply(fileContents: String = null, filePath: String = null, fileType: String = null): Schema$ConfigFile = {
    val __obj = js.Dynamic.literal()
    if (fileContents != null) __obj.updateDynamic("fileContents")(fileContents.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConfigFile]
  }
}

