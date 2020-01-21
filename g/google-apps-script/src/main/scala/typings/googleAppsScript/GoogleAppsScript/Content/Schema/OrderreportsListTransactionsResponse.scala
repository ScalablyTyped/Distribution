package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderreportsListTransactionsResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var transactions: js.UndefOr[js.Array[OrderReportTransaction]] = js.undefined
}

object OrderreportsListTransactionsResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    transactions: js.Array[OrderReportTransaction] = null
  ): OrderreportsListTransactionsResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (transactions != null) __obj.updateDynamic("transactions")(transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderreportsListTransactionsResponse]
  }
}

