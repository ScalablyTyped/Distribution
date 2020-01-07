package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for
  * google.bigtable.admin.v2.BigtableTableAdmin.ModifyColumnFamilies
  */
@js.native
trait Schema$ModifyColumnFamiliesRequest extends js.Object {
  /**
    * Modifications to be atomically applied to the specified table&#39;s
    * families. Entries are applied in order, meaning that earlier
    * modifications can be masked by later ones (in the case of repeated
    * updates to the same family, for example).
    */
  var modifications: js.UndefOr[js.Array[Schema$Modification]] = js.native
}

object Schema$ModifyColumnFamiliesRequest {
  @scala.inline
  def apply(modifications: js.Array[Schema$Modification] = null): Schema$ModifyColumnFamiliesRequest = {
    val __obj = js.Dynamic.literal()
    if (modifications != null) __obj.updateDynamic("modifications")(modifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ModifyColumnFamiliesRequest]
  }
}

