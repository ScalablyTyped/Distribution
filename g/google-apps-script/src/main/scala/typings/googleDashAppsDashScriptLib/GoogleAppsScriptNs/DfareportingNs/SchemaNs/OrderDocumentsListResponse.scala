package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocumentsListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var orderDocuments: js.UndefOr[js.Array[OrderDocument]] = js.undefined
}

object OrderDocumentsListResponse {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    orderDocuments: js.Array[OrderDocument] = null
  ): OrderDocumentsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (orderDocuments != null) __obj.updateDynamic("orderDocuments")(orderDocuments)
    __obj.asInstanceOf[OrderDocumentsListResponse]
  }
}

