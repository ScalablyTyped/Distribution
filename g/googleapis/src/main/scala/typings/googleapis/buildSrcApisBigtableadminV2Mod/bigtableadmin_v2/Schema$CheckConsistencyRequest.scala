package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for
  * google.bigtable.admin.v2.BigtableTableAdmin.CheckConsistency
  */
@js.native
trait Schema$CheckConsistencyRequest extends js.Object {
  /**
    * The token created using GenerateConsistencyToken for the Table.
    */
  var consistencyToken: js.UndefOr[String] = js.native
}

object Schema$CheckConsistencyRequest {
  @scala.inline
  def apply(consistencyToken: String = null): Schema$CheckConsistencyRequest = {
    val __obj = js.Dynamic.literal()
    if (consistencyToken != null) __obj.updateDynamic("consistencyToken")(consistencyToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CheckConsistencyRequest]
  }
}

