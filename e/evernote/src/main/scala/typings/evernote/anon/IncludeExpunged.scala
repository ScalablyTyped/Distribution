package typings.evernote.anon

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeExpunged extends js.Object {
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
  var includeSharedNotes: js.UndefOr[Boolean] = js.undefined
  var includeTags: js.UndefOr[Boolean] = js.undefined
  var notebookGuids: js.UndefOr[Set[String]] = js.undefined
  var omitSharedNotebooks: js.UndefOr[Boolean] = js.undefined
  var requireNoteContentClass: js.UndefOr[String] = js.undefined
}

object IncludeExpunged {
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
    includeSharedNotes: js.UndefOr[Boolean] = js.undefined,
    includeTags: js.UndefOr[Boolean] = js.undefined,
    notebookGuids: Set[String] = null,
    omitSharedNotebooks: js.UndefOr[Boolean] = js.undefined,
    requireNoteContentClass: String = null
  ): IncludeExpunged = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeExpunged)) __obj.updateDynamic("includeExpunged")(includeExpunged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeLinkedNotebooks)) __obj.updateDynamic("includeLinkedNotebooks")(includeLinkedNotebooks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNoteApplicationDataFullMap)) __obj.updateDynamic("includeNoteApplicationDataFullMap")(includeNoteApplicationDataFullMap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNoteAttributes)) __obj.updateDynamic("includeNoteAttributes")(includeNoteAttributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNoteResourceApplicationDataFullMap)) __obj.updateDynamic("includeNoteResourceApplicationDataFullMap")(includeNoteResourceApplicationDataFullMap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNoteResources)) __obj.updateDynamic("includeNoteResources")(includeNoteResources.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNotebooks)) __obj.updateDynamic("includeNotebooks")(includeNotebooks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNotes)) __obj.updateDynamic("includeNotes")(includeNotes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResourceApplicationDataFullMap)) __obj.updateDynamic("includeResourceApplicationDataFullMap")(includeResourceApplicationDataFullMap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResources)) __obj.updateDynamic("includeResources")(includeResources.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSearches)) __obj.updateDynamic("includeSearches")(includeSearches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSharedNotes)) __obj.updateDynamic("includeSharedNotes")(includeSharedNotes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTags)) __obj.updateDynamic("includeTags")(includeTags.get.asInstanceOf[js.Any])
    if (notebookGuids != null) __obj.updateDynamic("notebookGuids")(notebookGuids.asInstanceOf[js.Any])
    if (!js.isUndefined(omitSharedNotebooks)) __obj.updateDynamic("omitSharedNotebooks")(omitSharedNotebooks.get.asInstanceOf[js.Any])
    if (requireNoteContentClass != null) __obj.updateDynamic("requireNoteContentClass")(requireNoteContentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeExpunged]
  }
}

