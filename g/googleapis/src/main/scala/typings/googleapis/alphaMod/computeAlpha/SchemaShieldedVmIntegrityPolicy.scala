package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShieldedVmIntegrityPolicy extends StObject {
  
  /**
    * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
    */
  var updateAutoLearnPolicy: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaShieldedVmIntegrityPolicy {
  
  inline def apply(): SchemaShieldedVmIntegrityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedVmIntegrityPolicy]
  }
  
  extension [Self <: SchemaShieldedVmIntegrityPolicy](x: Self) {
    
    inline def setUpdateAutoLearnPolicy(value: Boolean): Self = StObject.set(x, "updateAutoLearnPolicy", value.asInstanceOf[js.Any])
    
    inline def setUpdateAutoLearnPolicyNull: Self = StObject.set(x, "updateAutoLearnPolicy", null)
    
    inline def setUpdateAutoLearnPolicyUndefined: Self = StObject.set(x, "updateAutoLearnPolicy", js.undefined)
  }
}
