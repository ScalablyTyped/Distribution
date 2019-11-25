package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeExpunged extends js.Object {
  var includeExpunged: js.UndefOr[Boolean] = js.undefined
  var includeLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
  var includeNoteApplicationDataFullMap: js.UndefOr[Boolean] = js.undefined
  var includeNoteAttributes: js.UndefOr[Boolean] = js.undefined
  var includeNoteResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.undefined
  var includeNoteResources: js.UndefOr[Boolean] = js.undefined
  var includeNotebooks: js.UndefOr[Boolean] = js.undefined
  var includeNotes: js.UndefOr[Boolean] = js.undefined
  var includeResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.undefined
  var includeResources: js.UndefOr[Boolean] = js.undefined
  var includeSearches: js.UndefOr[Boolean] = js.undefined
  var includeTags: js.UndefOr[Boolean] = js.undefined
  var requireNoteContentClass: js.UndefOr[String] = js.undefined
}

object Anon_IncludeExpunged {
  @scala.inline
  def apply(
    includeExpunged: js.UndefOr[Boolean] = js.undefined,
    includeLinkedNotebooks: js.UndefOr[Boolean] = js.undefined,
    includeNoteApplicationDataFullMap: js.UndefOr[Boolean] = js.undefined,
    includeNoteAttributes: js.UndefOr[Boolean] = js.undefined,
    includeNoteResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.undefined,
    includeNoteResources: js.UndefOr[Boolean] = js.undefined,
    includeNotebooks: js.UndefOr[Boolean] = js.undefined,
    includeNotes: js.UndefOr[Boolean] = js.undefined,
    includeResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.undefined,
    includeResources: js.UndefOr[Boolean] = js.undefined,
    includeSearches: js.UndefOr[Boolean] = js.undefined,
    includeTags: js.UndefOr[Boolean] = js.undefined,
    requireNoteContentClass: String = null
  ): Anon_IncludeExpunged = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeExpunged)) __obj.updateDynamic("includeExpunged")(includeExpunged.asInstanceOf[js.Any])
    if (!js.isUndefined(includeLinkedNotebooks)) __obj.updateDynamic("includeLinkedNotebooks")(includeLinkedNotebooks.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNoteApplicationDataFullMap)) __obj.updateDynamic("includeNoteApplicationDataFullMap")(includeNoteApplicationDataFullMap.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNoteAttributes)) __obj.updateDynamic("includeNoteAttributes")(includeNoteAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNoteResourceApplicationDataFullMap)) __obj.updateDynamic("includeNoteResourceApplicationDataFullMap")(includeNoteResourceApplicationDataFullMap.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNoteResources)) __obj.updateDynamic("includeNoteResources")(includeNoteResources.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNotebooks)) __obj.updateDynamic("includeNotebooks")(includeNotebooks.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNotes)) __obj.updateDynamic("includeNotes")(includeNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResourceApplicationDataFullMap)) __obj.updateDynamic("includeResourceApplicationDataFullMap")(includeResourceApplicationDataFullMap.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResources)) __obj.updateDynamic("includeResources")(includeResources.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSearches)) __obj.updateDynamic("includeSearches")(includeSearches.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTags)) __obj.updateDynamic("includeTags")(includeTags.asInstanceOf[js.Any])
    if (requireNoteContentClass != null) __obj.updateDynamic("requireNoteContentClass")(requireNoteContentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IncludeExpunged]
  }
}

