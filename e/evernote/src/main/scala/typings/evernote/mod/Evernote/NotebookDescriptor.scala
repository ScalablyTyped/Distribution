package typings.evernote.mod.Evernote

import typings.evernote.AnonContactName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure that describes a notebook or a user's relationship with
  * a notebook. NotebookDescriptor is expected to remain a lighter-weight
  * structure when compared to Notebook.
  * <dl>
  * <dt>guid</dt>
  *     <dd>The unique identifier of the notebook.
  *     </dd>
  *
  * <dt>notebookDisplayName</dt>
  *     <dd>A sequence of characters representing the name of the
  *     notebook.
  *     </dd>
  *
  * <dt>contactName</dt>
  *     <dd>The User.name value of the notebook's "contact".
  *     </dd>
  *
  * <dt>hasSharedNotebook</dt>
  *     <dd>Whether a SharedNotebook record exists between the calling user and this
  *     notebook.
  *     </dd>
  *
  * <dt>joinedUserCount</dt>
  *     <dd>The number of users who have joined this notebook.
  *     </dd>
  *
  * </dl>
  */
@JSImport("evernote", "Evernote.NotebookDescriptor")
@js.native
class NotebookDescriptor () extends js.Object {
  def this(args: AnonContactName) = this()
  var contactName: String = js.native
  var guid: String = js.native
  var hasSharedNotebook: Boolean = js.native
  var joinedUserCount: Double = js.native
  var notebookDisplayName: String = js.native
}

