package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListEntityTypesResponse. */
trait IListEntityTypesResponse extends js.Object {
  /** ListEntityTypesResponse entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.undefined
  /** ListEntityTypesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}

object IListEntityTypesResponse {
  @scala.inline
  def apply(entityTypes: js.Array[IEntityType] = null, nextPageToken: String = null): IListEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[IListEntityTypesResponse]
  }
}

