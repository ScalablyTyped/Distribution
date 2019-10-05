package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_IncludeAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure defining the scope of a SavedSearch.
  *
  * <dl>
  *     <dt>includeAccount</dt>
  *     <dd>The search should include notes from the account that contains the SavedSearch.</dd>
  *
  *     <dt>includePersonalLinkedNotebooks</dt>
  *     <dd>The search should include notes within those shared notebooks
  *     that the user has joined that are NOT business notebooks.</dd>
  *
  *     <dt>includeBusinessLinkedNotebooks</dt>
  *     <dd>The search should include notes within those shared notebooks
  *     that the user has joined that are business notebooks in the business that
  *     the user is currently a member of.</dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.SavedSearchScope")
@js.native
class SavedSearchScope () extends js.Object {
  def this(args: Anon_IncludeAccount) = this()
  var includeAccount: Boolean = js.native
  var includeBusinessLinkedNotebooks: Boolean = js.native
  var includePersonalLinkedNotebooks: Boolean = js.native
}

