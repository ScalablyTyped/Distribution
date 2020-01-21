package typings.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBrowser extends js.Object {
  /** This API is used to receive the server-side handler for the file related operations.
    */
  var ajaxAction: js.UndefOr[String] = js.undefined
  /** Specifies the file type extension shown in the image browser window.
    */
  var extensionAllow: js.UndefOr[String] = js.undefined
  /** Specifies the directory to perform operations like create, delete and rename folder and files, and upload the selected images to the current directory.
    */
  var filePath: js.UndefOr[String] = js.undefined
}

object ImageBrowser {
  @scala.inline
  def apply(ajaxAction: String = null, extensionAllow: String = null, filePath: String = null): ImageBrowser = {
    val __obj = js.Dynamic.literal()
    if (ajaxAction != null) __obj.updateDynamic("ajaxAction")(ajaxAction.asInstanceOf[js.Any])
    if (extensionAllow != null) __obj.updateDynamic("extensionAllow")(extensionAllow.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBrowser]
  }
}

