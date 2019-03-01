package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataInsertAllResponse extends js.Object {
  /** An array of errors for rows that were not inserted. */
  var insertErrors: js.UndefOr[js.Array[gapiDotClientDotBigqueryLib.Anon_Errors]] = js.undefined
  /** The resource type of the response. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object TableDataInsertAllResponse {
  @scala.inline
  def apply(
    insertErrors: js.Array[gapiDotClientDotBigqueryLib.Anon_Errors] = null,
    kind: java.lang.String = null
  ): TableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    if (insertErrors != null) __obj.updateDynamic("insertErrors")(insertErrors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[TableDataInsertAllResponse]
  }
}

