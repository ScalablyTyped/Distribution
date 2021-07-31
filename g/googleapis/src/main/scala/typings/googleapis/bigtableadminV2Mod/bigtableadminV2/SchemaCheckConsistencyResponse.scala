package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for
  * google.bigtable.admin.v2.BigtableTableAdmin.CheckConsistency
  */
trait SchemaCheckConsistencyResponse extends StObject {
  
  /**
    * True only if the token is consistent. A token is consistent if
    * replication has caught up with the restrictions specified in the request.
    */
  var consistent: js.UndefOr[Boolean] = js.undefined
}
object SchemaCheckConsistencyResponse {
  
  @scala.inline
  def apply(): SchemaCheckConsistencyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckConsistencyResponse]
  }
  
  @scala.inline
  implicit class SchemaCheckConsistencyResponseMutableBuilder[Self <: SchemaCheckConsistencyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsistent(value: Boolean): Self = StObject.set(x, "consistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistentUndefined: Self = StObject.set(x, "consistent", js.undefined)
  }
}
