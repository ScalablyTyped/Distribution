package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ParagraphElement representing a horizontal line.
  */
@js.native
trait Schema$HorizontalRule extends js.Object {
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A HorizontalRule may have multiple insertion
    * IDs if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested text style changes to this HorizontalRule, keyed by
    * suggestion ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[Schema$SuggestedTextStyle]] = js.native
  /**
    * The text style of this HorizontalRule.  Similar to text content, like
    * text runs and footnote references, the text style of a horizontal rule
    * can affect content layout as well as the styling of text inserted
    * adjacent to it.
    */
  var textStyle: js.UndefOr[Schema$TextStyle] = js.native
}

object Schema$HorizontalRule {
  @scala.inline
  def apply(
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    suggestedTextStyleChanges: StringDictionary[Schema$SuggestedTextStyle] = null,
    textStyle: Schema$TextStyle = null
  ): Schema$HorizontalRule = {
    val __obj = js.Dynamic.literal()
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    if (suggestedTextStyleChanges != null) __obj.updateDynamic("suggestedTextStyleChanges")(suggestedTextStyleChanges.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HorizontalRule]
  }
}

