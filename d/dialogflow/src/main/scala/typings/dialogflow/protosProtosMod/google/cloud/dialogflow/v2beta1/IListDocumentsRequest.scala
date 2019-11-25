package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListDocumentsRequest. */
trait IListDocumentsRequest extends js.Object {
  /** ListDocumentsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListDocumentsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListDocumentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IListDocumentsRequest {
  @scala.inline
  def apply(pageSize: Int | Double = null, pageToken: String = null, parent: String = null): IListDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListDocumentsRequest]
  }
}

