package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ParagraphElement that contains an InlineObject.
  */
@js.native
trait Schema$InlineObjectElement extends js.Object {
  /**
    * The ID of the InlineObject this element contains.
    */
  var inlineObjectId: js.UndefOr[String] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. An InlineObjectElement may have multiple
    * insertion IDs if it is a nested suggested change. If empty, then this is
    * not a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested text style changes to this InlineObject, keyed by
    * suggestion ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[Schema$SuggestedTextStyle]] = js.native
  /**
    * The text style of this InlineObjectElement.  Similar to text content,
    * like text runs and footnote references, the text style of an inline
    * object element can affect content layout as well as the styling of text
    * inserted adjacent to it.
    */
  var textStyle: js.UndefOr[Schema$TextStyle] = js.native
}

object Schema$InlineObjectElement {
  @scala.inline
  def apply(
    inlineObjectId: String = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    suggestedTextStyleChanges: StringDictionary[Schema$SuggestedTextStyle] = null,
    textStyle: Schema$TextStyle = null
  ): Schema$InlineObjectElement = {
    val __obj = js.Dynamic.literal()
    if (inlineObjectId != null) __obj.updateDynamic("inlineObjectId")(inlineObjectId.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    if (suggestedTextStyleChanges != null) __obj.updateDynamic("suggestedTextStyleChanges")(suggestedTextStyleChanges.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InlineObjectElement]
  }
}

