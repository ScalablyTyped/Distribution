package typings
package googleDotPickerLib.googleNs.pickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.picker.DocsUploadView")
@js.native
class DocsUploadView () extends js.Object {
  // Allows the user to select a folder in Google Drive to upload to.
  def setIncludeFolders(included: scala.Boolean): DocsUploadView = js.native
  // Sets the upload destination to the specified folder. This overrides ".setIncludeFolders" to false.
  def setParent(parentId: java.lang.String): DocsUploadView = js.native
}

