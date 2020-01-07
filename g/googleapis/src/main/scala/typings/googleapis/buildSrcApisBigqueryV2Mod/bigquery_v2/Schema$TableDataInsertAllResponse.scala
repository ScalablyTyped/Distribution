package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.googleapis.Anon_Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TableDataInsertAllResponse extends js.Object {
  /**
    * An array of errors for rows that were not inserted.
    */
  var insertErrors: js.UndefOr[js.Array[Anon_Errors]] = js.native
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$TableDataInsertAllResponse {
  @scala.inline
  def apply(insertErrors: js.Array[Anon_Errors] = null, kind: String = null): Schema$TableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    if (insertErrors != null) __obj.updateDynamic("insertErrors")(insertErrors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableDataInsertAllResponse]
  }
}

