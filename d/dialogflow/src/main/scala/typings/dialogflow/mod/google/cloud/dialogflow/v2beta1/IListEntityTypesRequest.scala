package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

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
    languageCode: js.UndefOr[Null | String] = js.undefined,
    pageSize: js.UndefOr[Null | Double] = js.undefined,
    pageToken: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): IListEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pageToken)) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListEntityTypesRequest]
  }
}

