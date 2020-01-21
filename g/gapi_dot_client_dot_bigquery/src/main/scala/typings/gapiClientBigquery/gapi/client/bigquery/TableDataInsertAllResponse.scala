package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClientBigquery.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataInsertAllResponse extends js.Object {
  /** An array of errors for rows that were not inserted. */
  var insertErrors: js.UndefOr[js.Array[AnonErrors]] = js.undefined
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.undefined
}

object TableDataInsertAllResponse {
  @scala.inline
  def apply(insertErrors: js.Array[AnonErrors] = null, kind: String = null): TableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    if (insertErrors != null) __obj.updateDynamic("insertErrors")(insertErrors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDataInsertAllResponse]
  }
}

