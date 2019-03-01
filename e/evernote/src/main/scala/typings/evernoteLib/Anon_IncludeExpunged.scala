package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeExpunged extends js.Object {
  var includeExpunged: js.UndefOr[scala.Boolean] = js.undefined
  var includeLinkedNotebooks: js.UndefOr[scala.Boolean] = js.undefined
  var includeNoteApplicationDataFullMap: js.UndefOr[scala.Boolean] = js.undefined
  var includeNoteAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var includeNoteResourceApplicationDataFullMap: js.UndefOr[scala.Boolean] = js.undefined
  var includeNoteResources: js.UndefOr[scala.Boolean] = js.undefined
  var includeNotebooks: js.UndefOr[scala.Boolean] = js.undefined
  var includeNotes: js.UndefOr[scala.Boolean] = js.undefined
  var includeResourceApplicationDataFullMap: js.UndefOr[scala.Boolean] = js.undefined
  var includeResources: js.UndefOr[scala.Boolean] = js.undefined
  var includeSearches: js.UndefOr[scala.Boolean] = js.undefined
  var includeTags: js.UndefOr[scala.Boolean] = js.undefined
  var requireNoteContentClass: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_IncludeExpunged {
  @scala.inline
  def apply(
    includeExpunged: js.UndefOr[scala.Boolean] = js.undefined,
    includeLinkedNotebooks: js.UndefOr[scala.Boolean] = js.undefined,
    includeNoteApplicationDataFullMap: js.UndefOr[scala.Boolean] = js.undefined,
    includeNoteAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    includeNoteResourceApplicationDataFullMap: js.UndefOr[scala.Boolean] = js.undefined,
    includeNoteResources: js.UndefOr[scala.Boolean] = js.undefined,
    includeNotebooks: js.UndefOr[scala.Boolean] = js.undefined,
    includeNotes: js.UndefOr[scala.Boolean] = js.undefined,
    includeResourceApplicationDataFullMap: js.UndefOr[scala.Boolean] = js.undefined,
    includeResources: js.UndefOr[scala.Boolean] = js.undefined,
    includeSearches: js.UndefOr[scala.Boolean] = js.undefined,
    includeTags: js.UndefOr[scala.Boolean] = js.undefined,
    requireNoteContentClass: java.lang.String = null
  ): Anon_IncludeExpunged = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeExpunged)) __obj.updateDynamic("includeExpunged")(includeExpunged)
    if (!js.isUndefined(includeLinkedNotebooks)) __obj.updateDynamic("includeLinkedNotebooks")(includeLinkedNotebooks)
    if (!js.isUndefined(includeNoteApplicationDataFullMap)) __obj.updateDynamic("includeNoteApplicationDataFullMap")(includeNoteApplicationDataFullMap)
    if (!js.isUndefined(includeNoteAttributes)) __obj.updateDynamic("includeNoteAttributes")(includeNoteAttributes)
    if (!js.isUndefined(includeNoteResourceApplicationDataFullMap)) __obj.updateDynamic("includeNoteResourceApplicationDataFullMap")(includeNoteResourceApplicationDataFullMap)
    if (!js.isUndefined(includeNoteResources)) __obj.updateDynamic("includeNoteResources")(includeNoteResources)
    if (!js.isUndefined(includeNotebooks)) __obj.updateDynamic("includeNotebooks")(includeNotebooks)
    if (!js.isUndefined(includeNotes)) __obj.updateDynamic("includeNotes")(includeNotes)
    if (!js.isUndefined(includeResourceApplicationDataFullMap)) __obj.updateDynamic("includeResourceApplicationDataFullMap")(includeResourceApplicationDataFullMap)
    if (!js.isUndefined(includeResources)) __obj.updateDynamic("includeResources")(includeResources)
    if (!js.isUndefined(includeSearches)) __obj.updateDynamic("includeSearches")(includeSearches)
    if (!js.isUndefined(includeTags)) __obj.updateDynamic("includeTags")(includeTags)
    if (requireNoteContentClass != null) __obj.updateDynamic("requireNoteContentClass")(requireNoteContentClass)
    __obj.asInstanceOf[Anon_IncludeExpunged]
  }
}

