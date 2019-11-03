package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListEntityTypesRequest. */
trait IListEntityTypesRequest extends js.Object {
  /** ListEntityTypesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** ListEntityTypesRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListEntityTypesRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IListEntityTypesRequest {
  @scala.inline
  def apply(
    languageCode: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    parent: String = null
  ): IListEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[IListEntityTypesRequest]
  }
}

