package typings
package ejDotWebDotAllLib.ejNs.RTENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileBrowser extends js.Object {
  /** This API is used to receive the server-side handler for file related operations.
               */
  var ajaxAction: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the file type extension shown in the file browser window.
               */
  var extensionAllow: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the directory to perform operations like create, delete and rename folder and files, and upload the selected files to the current directory.
               */
  var filePath: js.UndefOr[java.lang.String] = js.undefined
}

