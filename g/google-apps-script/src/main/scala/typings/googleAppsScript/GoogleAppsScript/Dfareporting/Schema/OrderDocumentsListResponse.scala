package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocumentsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var orderDocuments: js.UndefOr[js.Array[OrderDocument]] = js.undefined
}

object OrderDocumentsListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, orderDocuments: js.Array[OrderDocument] = null): OrderDocumentsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (orderDocuments != null) __obj.updateDynamic("orderDocuments")(orderDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderDocumentsListResponse]
  }
}

