package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for
  * google.bigtable.admin.v2.BigtableTableAdmin.ModifyColumnFamilies
  */
@js.native
trait SchemaModifyColumnFamiliesRequest extends js.Object {
  /**
    * Modifications to be atomically applied to the specified table&#39;s
    * families. Entries are applied in order, meaning that earlier
    * modifications can be masked by later ones (in the case of repeated
    * updates to the same family, for example).
    */
  var modifications: js.UndefOr[js.Array[SchemaModification]] = js.native
}

object SchemaModifyColumnFamiliesRequest {
  @scala.inline
  def apply(modifications: js.Array[SchemaModification] = null): SchemaModifyColumnFamiliesRequest = {
    val __obj = js.Dynamic.literal()
    if (modifications != null) __obj.updateDynamic("modifications")(modifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModifyColumnFamiliesRequest]
  }
}

