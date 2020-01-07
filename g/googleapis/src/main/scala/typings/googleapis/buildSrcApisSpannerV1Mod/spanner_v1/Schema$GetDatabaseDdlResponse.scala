package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for GetDatabaseDdl.
  */
@js.native
trait Schema$GetDatabaseDdlResponse extends js.Object {
  /**
    * A list of formatted DDL statements defining the schema of the database
    * specified in the request.
    */
  var statements: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GetDatabaseDdlResponse {
  @scala.inline
  def apply(statements: js.Array[String] = null): Schema$GetDatabaseDdlResponse = {
    val __obj = js.Dynamic.literal()
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetDatabaseDdlResponse]
  }
}

