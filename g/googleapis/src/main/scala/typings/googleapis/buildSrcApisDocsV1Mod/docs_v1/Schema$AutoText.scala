package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ParagraphElement representing a spot in the text that is dynamically
  * replaced with content that can change over time, like a page number.
  */
@js.native
trait Schema$AutoText extends js.Object {
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. An AutoText may have multiple insertion IDs
    * if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested text style changes to this AutoText, keyed by suggestion
    * ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[Schema$SuggestedTextStyle]] = js.native
  /**
    * The text style of this AutoText.
    */
  var textStyle: js.UndefOr[Schema$TextStyle] = js.native
  /**
    * The type of this auto text.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$AutoText {
  @scala.inline
  def apply(
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    suggestedTextStyleChanges: StringDictionary[Schema$SuggestedTextStyle] = null,
    textStyle: Schema$TextStyle = null,
    `type`: String = null
  ): Schema$AutoText = {
    val __obj = js.Dynamic.literal()
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    if (suggestedTextStyleChanges != null) __obj.updateDynamic("suggestedTextStyleChanges")(suggestedTextStyleChanges.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutoText]
  }
}

