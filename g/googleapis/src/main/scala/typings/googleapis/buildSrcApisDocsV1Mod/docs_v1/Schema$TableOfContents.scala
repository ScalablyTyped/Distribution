package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A StructuralElement representing a table of contents.
  */
@js.native
trait Schema$TableOfContents extends js.Object {
  /**
    * The content of the table of contents.
    */
  var content: js.UndefOr[js.Array[Schema$StructuralElement]] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A TableOfContents may have multiple
    * insertion IDs if it is a nested suggested change. If empty, then this is
    * not a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TableOfContents {
  @scala.inline
  def apply(
    content: js.Array[Schema$StructuralElement] = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null
  ): Schema$TableOfContents = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableOfContents]
  }
}

