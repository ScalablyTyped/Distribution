package typings.evernote.mod.Types

import typings.evernote.AnonContactName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.NotebookDescriptor")
@js.native
class NotebookDescriptor () extends js.Object {
  def this(args: AnonContactName) = this()
  var contactName: js.UndefOr[String] = js.native
  var guid: js.UndefOr[Guid] = js.native
  var hasSharedNotebook: js.UndefOr[Boolean] = js.native
  var joinedUserCount: js.UndefOr[Double] = js.native
  var notebookDisplayName: js.UndefOr[String] = js.native
}

