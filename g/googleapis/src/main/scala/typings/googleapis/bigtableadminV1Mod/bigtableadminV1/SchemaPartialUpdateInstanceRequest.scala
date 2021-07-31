package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for BigtableInstanceAdmin.PartialUpdateInstance.
  */
trait SchemaPartialUpdateInstanceRequest extends StObject {
  
  /**
    * The Instance which will (partially) replace the current value.
    */
  var instance: js.UndefOr[SchemaInstance] = js.undefined
  
  /**
    * The subset of Instance fields which should be replaced. Must be
    * explicitly set.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object SchemaPartialUpdateInstanceRequest {
  
  @scala.inline
  def apply(): SchemaPartialUpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartialUpdateInstanceRequest]
  }
  
  @scala.inline
  implicit class SchemaPartialUpdateInstanceRequestMutableBuilder[Self <: SchemaPartialUpdateInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: SchemaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
