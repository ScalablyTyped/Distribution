package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListIntentsRequest. */
trait IListIntentsRequest extends js.Object {
  /** ListIntentsRequest intentView */
  var intentView: js.UndefOr[
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String) | Null
  ] = js.undefined
  /** ListIntentsRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** ListIntentsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListIntentsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListIntentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IListIntentsRequest {
  @scala.inline
  def apply(
    intentView: js.UndefOr[
      Null | IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String)
    ] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    pageSize: js.UndefOr[Null | Double] = js.undefined,
    pageToken: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): IListIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intentView)) __obj.updateDynamic("intentView")(intentView.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pageToken)) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListIntentsRequest]
  }
}

