package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Query options for group holds.
  */
@js.native
trait Schema$HeldGroupsQuery extends js.Object {
  /**
    * The end time range for the search query. These timestamps are in GMT and
    * rounded down to the start of the given date.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The start time range for the search query. These timestamps are in GMT
    * and rounded down to the start of the given date.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The search terms for the hold.
    */
  var terms: js.UndefOr[String] = js.native
}

object Schema$HeldGroupsQuery {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null, terms: String = null): Schema$HeldGroupsQuery = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HeldGroupsQuery]
  }
}

