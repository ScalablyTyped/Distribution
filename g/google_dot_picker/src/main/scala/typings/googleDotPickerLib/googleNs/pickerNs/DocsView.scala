package typings
package googleDotPickerLib.googleNs.pickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.picker.DocsView")
@js.native
class DocsView () extends js.Object {
  // Constructor. The ViewId must be one of the Google Drive views. Default is ViewId.DOCS.
  def this(viewId: java.lang.String) = this()
  // Allows the user to select folders from Team Drives.
  def setEnableTeamDrives(enabled: scala.Boolean): DocsView = js.native
  // Show folders in the view items.
  def setIncludeFolders(included: scala.Boolean): DocsView = js.native
  // Selects which mode the view will use to display the documents.
  def setMode(mode: java.lang.String): DocsView = js.native
  // Filters the documents based on whether they are owned by the user, or shared with the user.
  def setOwnedByMe(): DocsView = js.native
  // Filters the documents based on whether they are owned by the user, or shared with the user.
  def setOwnedByMe(me: scala.Boolean): DocsView = js.native
  // Sets the initial parent folder to display.
  def setParent(parentId: java.lang.String): DocsView = js.native
  // Allows the user to select a folder in Google Drive.
  def setSelectFolderEnabled(enabled: scala.Boolean): DocsView = js.native
  // Filters the documents based on whether they are starred by the user.
  def setStarred(starred: scala.Boolean): DocsView = js.native
}

