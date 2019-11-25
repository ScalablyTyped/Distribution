package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListSessionEntityTypesRequest. */
trait IListSessionEntityTypesRequest extends js.Object {
  /** ListSessionEntityTypesRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListSessionEntityTypesRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListSessionEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IListSessionEntityTypesRequest {
  @scala.inline
  def apply(pageSize: Int | Double = null, pageToken: String = null, parent: String = null): IListSessionEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListSessionEntityTypesRequest]
  }
}

