package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for
  * google.bigtable.admin.v2.BigtableTableAdmin.ModifyColumnFamilies
  */
trait SchemaModifyColumnFamiliesRequest extends StObject {
  
  /**
    * Modifications to be atomically applied to the specified table&#39;s
    * families. Entries are applied in order, meaning that earlier
    * modifications can be masked by later ones (in the case of repeated
    * updates to the same family, for example).
    */
  var modifications: js.UndefOr[js.Array[SchemaModification]] = js.undefined
}
object SchemaModifyColumnFamiliesRequest {
  
  @scala.inline
  def apply(): SchemaModifyColumnFamiliesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyColumnFamiliesRequest]
  }
  
  @scala.inline
  implicit class SchemaModifyColumnFamiliesRequestMutableBuilder[Self <: SchemaModifyColumnFamiliesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifications(value: js.Array[SchemaModification]): Self = StObject.set(x, "modifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationsUndefined: Self = StObject.set(x, "modifications", js.undefined)
    
    @scala.inline
    def setModificationsVarargs(value: SchemaModification*): Self = StObject.set(x, "modifications", js.Array(value :_*))
  }
}
