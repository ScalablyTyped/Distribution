package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListIntentsRequest. */
trait IListIntentsRequest extends js.Object {
  /** ListIntentsRequest intentView */
  var intentView: js.UndefOr[IntentView | Null] = js.undefined
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
    intentView: IntentView = null,
    languageCode: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    parent: String = null
  ): IListIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (intentView != null) __obj.updateDynamic("intentView")(intentView.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListIntentsRequest]
  }
}

