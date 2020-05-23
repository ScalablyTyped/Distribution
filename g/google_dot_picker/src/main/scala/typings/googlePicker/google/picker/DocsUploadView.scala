package typings.googlePicker.google.picker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocsUploadView extends js.Object {
  // Allows the user to select a folder in Google Drive to upload to.
  def setIncludeFolders(included: Boolean): DocsUploadView
  // Sets the upload destination to the specified folder. This overrides ".setIncludeFolders" to false.
  def setParent(parentId: String): DocsUploadView
}

object DocsUploadView {
  @scala.inline
  def apply(setIncludeFolders: Boolean => DocsUploadView, setParent: String => DocsUploadView): DocsUploadView = {
    val __obj = js.Dynamic.literal(setIncludeFolders = js.Any.fromFunction1(setIncludeFolders), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[DocsUploadView]
  }
}

