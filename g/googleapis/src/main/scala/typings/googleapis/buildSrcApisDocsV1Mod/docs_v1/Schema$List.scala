package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A List represents the list attributes for a group of paragraphs that all
  * belong to the same list. A paragraph that is part of a list has a reference
  * to the list&#39;s ID in its bullet.
  */
@js.native
trait Schema$List extends js.Object {
  /**
    * The properties of the list.
    */
  var listProperties: js.UndefOr[Schema$ListProperties] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this list.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion ID. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionId: js.UndefOr[String] = js.native
  /**
    * The suggested changes to the list properties, keyed by suggestion ID.
    */
  var suggestedListPropertiesChanges: js.UndefOr[StringDictionary[Schema$SuggestedListProperties]] = js.native
}

object Schema$List {
  @scala.inline
  def apply(
    listProperties: Schema$ListProperties = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionId: String = null,
    suggestedListPropertiesChanges: StringDictionary[Schema$SuggestedListProperties] = null
  ): Schema$List = {
    val __obj = js.Dynamic.literal()
    if (listProperties != null) __obj.updateDynamic("listProperties")(listProperties.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionId != null) __obj.updateDynamic("suggestedInsertionId")(suggestedInsertionId.asInstanceOf[js.Any])
    if (suggestedListPropertiesChanges != null) __obj.updateDynamic("suggestedListPropertiesChanges")(suggestedListPropertiesChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$List]
  }
}

