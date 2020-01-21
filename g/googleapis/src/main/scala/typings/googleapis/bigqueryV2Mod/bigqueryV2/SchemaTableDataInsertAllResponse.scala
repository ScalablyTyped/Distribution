package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableDataInsertAllResponse extends js.Object {
  /**
    * An array of errors for rows that were not inserted.
    */
  var insertErrors: js.UndefOr[js.Array[AnonErrors]] = js.native
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaTableDataInsertAllResponse {
  @scala.inline
  def apply(insertErrors: js.Array[AnonErrors] = null, kind: String = null): SchemaTableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    if (insertErrors != null) __obj.updateDynamic("insertErrors")(insertErrors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableDataInsertAllResponse]
  }
}

