package typings.evernote.anon

import typings.evernote.mod.Types.Notebook
import typings.evernote.mod.Types.NotebookDescriptor
import typings.evernote.mod.Types.RelatedContent
import typings.evernote.mod.Types.Tag
import typings.evernote.mod.Types.UserProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheExpires extends js.Object {
  var cacheExpires: js.UndefOr[Double] = js.undefined
  var cacheKey: js.UndefOr[String] = js.undefined
  var containingNotebooks: js.UndefOr[js.Array[NotebookDescriptor]] = js.undefined
  var debugInfo: js.UndefOr[String] = js.undefined
  var experts: js.UndefOr[js.Array[UserProfile]] = js.undefined
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.undefined
  var notes: js.UndefOr[js.Array[typings.evernote.mod.Types.Note]] = js.undefined
  var relatedContent: js.UndefOr[js.Array[RelatedContent]] = js.undefined
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}

object CacheExpires {
  @scala.inline
  def apply(
    cacheExpires: js.UndefOr[Double] = js.undefined,
    cacheKey: String = null,
    containingNotebooks: js.Array[NotebookDescriptor] = null,
    debugInfo: String = null,
    experts: js.Array[UserProfile] = null,
    notebooks: js.Array[Notebook] = null,
    notes: js.Array[typings.evernote.mod.Types.Note] = null,
    relatedContent: js.Array[RelatedContent] = null,
    tags: js.Array[Tag] = null
  ): CacheExpires = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheExpires)) __obj.updateDynamic("cacheExpires")(cacheExpires.get.asInstanceOf[js.Any])
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey.asInstanceOf[js.Any])
    if (containingNotebooks != null) __obj.updateDynamic("containingNotebooks")(containingNotebooks.asInstanceOf[js.Any])
    if (debugInfo != null) __obj.updateDynamic("debugInfo")(debugInfo.asInstanceOf[js.Any])
    if (experts != null) __obj.updateDynamic("experts")(experts.asInstanceOf[js.Any])
    if (notebooks != null) __obj.updateDynamic("notebooks")(notebooks.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (relatedContent != null) __obj.updateDynamic("relatedContent")(relatedContent.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheExpires]
  }
}

