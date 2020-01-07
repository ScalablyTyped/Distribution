package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Custom field filter of the search.
  */
@js.native
trait Schema$CustomFieldFilter extends js.Object {
  /**
    * Required.  The query strings for the filter.
    */
  var queries: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  The type of filter. Defaults to FilterType.OR.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$CustomFieldFilter {
  @scala.inline
  def apply(queries: js.Array[String] = null, `type`: String = null): Schema$CustomFieldFilter = {
    val __obj = js.Dynamic.literal()
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomFieldFilter]
  }
}

