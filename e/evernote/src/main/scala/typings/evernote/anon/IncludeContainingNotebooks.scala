package typings.evernote.anon

import typings.evernote.mod.Types.RelatedContentType
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeContainingNotebooks extends js.Object {
  var includeContainingNotebooks: js.UndefOr[Boolean] = js.undefined
  var includeDebugInfo: js.UndefOr[Boolean] = js.undefined
  var maxExperts: js.UndefOr[Double] = js.undefined
  var maxNotebooks: js.UndefOr[Double] = js.undefined
  var maxNotes: js.UndefOr[Double] = js.undefined
  var maxRelatedContent: js.UndefOr[Double] = js.undefined
  var maxTags: js.UndefOr[Double] = js.undefined
  var relatedContentTypes: js.UndefOr[Set[RelatedContentType]] = js.undefined
  var writableNotebooksOnly: js.UndefOr[Boolean] = js.undefined
}

object IncludeContainingNotebooks {
  @scala.inline
  def apply(
    includeContainingNotebooks: js.UndefOr[Boolean] = js.undefined,
    includeDebugInfo: js.UndefOr[Boolean] = js.undefined,
    maxExperts: js.UndefOr[Double] = js.undefined,
    maxNotebooks: js.UndefOr[Double] = js.undefined,
    maxNotes: js.UndefOr[Double] = js.undefined,
    maxRelatedContent: js.UndefOr[Double] = js.undefined,
    maxTags: js.UndefOr[Double] = js.undefined,
    relatedContentTypes: Set[RelatedContentType] = null,
    writableNotebooksOnly: js.UndefOr[Boolean] = js.undefined
  ): IncludeContainingNotebooks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeContainingNotebooks)) __obj.updateDynamic("includeContainingNotebooks")(includeContainingNotebooks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDebugInfo)) __obj.updateDynamic("includeDebugInfo")(includeDebugInfo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxExperts)) __obj.updateDynamic("maxExperts")(maxExperts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNotebooks)) __obj.updateDynamic("maxNotebooks")(maxNotebooks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNotes)) __obj.updateDynamic("maxNotes")(maxNotes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRelatedContent)) __obj.updateDynamic("maxRelatedContent")(maxRelatedContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTags)) __obj.updateDynamic("maxTags")(maxTags.get.asInstanceOf[js.Any])
    if (relatedContentTypes != null) __obj.updateDynamic("relatedContentTypes")(relatedContentTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(writableNotebooksOnly)) __obj.updateDynamic("writableNotebooksOnly")(writableNotebooksOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeContainingNotebooks]
  }
}

