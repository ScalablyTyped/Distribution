package typings.googlePicker.google.picker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocsView extends js.Object {
  // Allows the user to select folders from Team Drives.
  def setEnableTeamDrives(enabled: Boolean): DocsView = js.native
  // Show folders in the view items.
  def setIncludeFolders(included: Boolean): DocsView = js.native
  // Set the MIME types which will be included in the view. Use commas to separate MIME types if more than one is required.
  def setMimeTypes(mimeTypes: String): DocsView = js.native
  // Selects which mode the view will use to display the documents.
  def setMode(mode: String): DocsView = js.native
  // Filters the documents based on whether they are owned by the user, or shared with the user.
  def setOwnedByMe(): DocsView = js.native
  def setOwnedByMe(me: Boolean): DocsView = js.native
  // Sets the initial parent folder to display.
  def setParent(parentId: String): DocsView = js.native
  // Allows the user to select a folder in Google Drive.
  def setSelectFolderEnabled(enabled: Boolean): DocsView = js.native
  // Filters the documents based on whether they are starred by the user.
  def setStarred(starred: Boolean): DocsView = js.native
}

