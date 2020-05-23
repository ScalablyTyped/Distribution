package typings.evernote.mod.Types

import typings.evernote.anon.NoEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.NoteRestrictions")
@js.native
class NoteRestrictions () extends js.Object {
  def this(args: NoEmail) = this()
  var noEmail: js.UndefOr[Boolean] = js.native
  var noShare: js.UndefOr[Boolean] = js.native
  var noSharePublicly: js.UndefOr[Boolean] = js.native
  var noUpdateContent: js.UndefOr[Boolean] = js.native
  var noUpdateTitle: js.UndefOr[Boolean] = js.native
}

