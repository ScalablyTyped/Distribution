package typings.googleDashDriveDashRealtimeDashApi.gapiNs.driveNs.realtimeNs

import typings.googleDashDriveDashRealtimeDashApi.googleDashDriveDashRealtimeDashApiStrings.EditableString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime.CollaborativeString")
@js.native
class CollaborativeString () extends CollaborativeObject {
  // The length of the string. Read only.
  var length: Double = js.native
  // The text of this collaborative string. Reading from this property is equivalent to calling getText(). Writing to this property is equivalent to calling setText().
  var text: String = js.native
  // Appends a string to the end of this one.
  def append(text: String): Unit = js.native
  // Gets a string representation of the collaborative string.
  def getText(): String = js.native
  // Inserts a string into the collaborative string at a specific index.
  def insertString(index: Double, text: String): Unit = js.native
  // Creates an IndexReference at the given {@code index}. If {@code canBeDeleted} is set, then a delete
  // over the index will delete the reference. Otherwise the reference will shift to the beginning of the deleted range.
  def registerReference(index: Double, canBeDeleted: Boolean): IndexReference[CollaborativeString] = js.native
  // Deletes the text between startIndex (inclusive) and endIndex (exclusive).
  def removeRange(startIndex: Double, endIndex: Double): Unit = js.native
  // Sets the contents of this collaborative string. Note that this method performs a text diff between the
  // current string contents and the new contents so that the string will be modified using the minimum number
  // of text inserts and deletes possible to change the current contents to the newly-specified contents.
  def setText(text: String): Unit = js.native
}

/* static members */
@JSGlobal("gapi.drive.realtime.CollaborativeString")
@js.native
object CollaborativeString extends js.Object {
  var `type`: EditableString = js.native
}

