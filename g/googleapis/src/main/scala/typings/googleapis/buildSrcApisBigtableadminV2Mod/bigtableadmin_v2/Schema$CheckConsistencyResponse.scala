package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for
  * google.bigtable.admin.v2.BigtableTableAdmin.CheckConsistency
  */
@js.native
trait Schema$CheckConsistencyResponse extends js.Object {
  /**
    * True only if the token is consistent. A token is consistent if
    * replication has caught up with the restrictions specified in the request.
    */
  var consistent: js.UndefOr[Boolean] = js.native
}

object Schema$CheckConsistencyResponse {
  @scala.inline
  def apply(consistent: js.UndefOr[Boolean] = js.undefined): Schema$CheckConsistencyResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CheckConsistencyResponse]
  }
}

