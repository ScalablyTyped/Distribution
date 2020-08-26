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
  def apply(): SchemaModifyColumnFamiliesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyColumnFamiliesRequest]
  }
  @scala.inline
  implicit class SchemaModifyColumnFamiliesRequestOps[Self <: SchemaModifyColumnFamiliesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModificationsVarargs(value: SchemaModification*): Self = this.set("modifications", js.Array(value :_*))
    @scala.inline
    def setModifications(value: js.Array[SchemaModification]): Self = this.set("modifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifications: Self = this.set("modifications", js.undefined)
  }
  
}

