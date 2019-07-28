package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeContainingNotebooks extends js.Object {
  var includeContainingNotebooks: js.UndefOr[Boolean] = js.undefined
  var maxNotebooks: js.UndefOr[Double] = js.undefined
  var maxNotes: js.UndefOr[Double] = js.undefined
  var maxTags: js.UndefOr[Double] = js.undefined
  var writableNotebooksOnly: js.UndefOr[Boolean] = js.undefined
}

object Anon_IncludeContainingNotebooks {
  @scala.inline
  def apply(
    includeContainingNotebooks: js.UndefOr[Boolean] = js.undefined,
    maxNotebooks: Int | Double = null,
    maxNotes: Int | Double = null,
    maxTags: Int | Double = null,
    writableNotebooksOnly: js.UndefOr[Boolean] = js.undefined
  ): Anon_IncludeContainingNotebooks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeContainingNotebooks)) __obj.updateDynamic("includeContainingNotebooks")(includeContainingNotebooks)
    if (maxNotebooks != null) __obj.updateDynamic("maxNotebooks")(maxNotebooks.asInstanceOf[js.Any])
    if (maxNotes != null) __obj.updateDynamic("maxNotes")(maxNotes.asInstanceOf[js.Any])
    if (maxTags != null) __obj.updateDynamic("maxTags")(maxTags.asInstanceOf[js.Any])
    if (!js.isUndefined(writableNotebooksOnly)) __obj.updateDynamic("writableNotebooksOnly")(writableNotebooksOnly)
    __obj.asInstanceOf[Anon_IncludeContainingNotebooks]
  }
}

