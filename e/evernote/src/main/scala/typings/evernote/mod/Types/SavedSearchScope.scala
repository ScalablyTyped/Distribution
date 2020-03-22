package typings.evernote.mod.Types

import typings.evernote.AnonIncludeAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.SavedSearchScope")
@js.native
class SavedSearchScope () extends js.Object {
  def this(args: AnonIncludeAccount) = this()
  var includeAccount: js.UndefOr[Boolean] = js.native
  var includeBusinessLinkedNotebooks: js.UndefOr[Boolean] = js.native
  var includePersonalLinkedNotebooks: js.UndefOr[Boolean] = js.native
}

