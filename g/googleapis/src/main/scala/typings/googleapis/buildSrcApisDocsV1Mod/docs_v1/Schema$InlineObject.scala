package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that appears inline with text. An InlineObject contains an
  * EmbeddedObject such as an image.
  */
@js.native
trait Schema$InlineObject extends js.Object {
  /**
    * The properties of this inline object.
    */
  var inlineObjectProperties: js.UndefOr[Schema$InlineObjectProperties] = js.native
  /**
    * The ID of this inline object.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested changes to the inline object properties, keyed by
    * suggestion ID.
    */
  var suggestedInlineObjectPropertiesChanges: js.UndefOr[StringDictionary[Schema$SuggestedInlineObjectProperties]] = js.native
  /**
    * The suggested insertion ID. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionId: js.UndefOr[String] = js.native
}

object Schema$InlineObject {
  @scala.inline
  def apply(
    inlineObjectProperties: Schema$InlineObjectProperties = null,
    objectId: String = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInlineObjectPropertiesChanges: StringDictionary[Schema$SuggestedInlineObjectProperties] = null,
    suggestedInsertionId: String = null
  ): Schema$InlineObject = {
    val __obj = js.Dynamic.literal()
    if (inlineObjectProperties != null) __obj.updateDynamic("inlineObjectProperties")(inlineObjectProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInlineObjectPropertiesChanges != null) __obj.updateDynamic("suggestedInlineObjectPropertiesChanges")(suggestedInlineObjectPropertiesChanges.asInstanceOf[js.Any])
    if (suggestedInsertionId != null) __obj.updateDynamic("suggestedInsertionId")(suggestedInsertionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InlineObject]
  }
}

