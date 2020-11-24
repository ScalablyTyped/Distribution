package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for
  * google.bigtable.admin.v2.BigtableTableAdmin.CheckConsistency
  */
@js.native
trait SchemaCheckConsistencyRequest extends js.Object {
  
  /**
    * The token created using GenerateConsistencyToken for the Table.
    */
  var consistencyToken: js.UndefOr[String] = js.native
}
object SchemaCheckConsistencyRequest {
  
  @scala.inline
  def apply(): SchemaCheckConsistencyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckConsistencyRequest]
  }
  
  @scala.inline
  implicit class SchemaCheckConsistencyRequestOps[Self <: SchemaCheckConsistencyRequest] (val x: Self) extends AnyVal {
    
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
    def setConsistencyToken(value: String): Self = this.set("consistencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistencyToken: Self = this.set("consistencyToken", js.undefined)
  }
}
