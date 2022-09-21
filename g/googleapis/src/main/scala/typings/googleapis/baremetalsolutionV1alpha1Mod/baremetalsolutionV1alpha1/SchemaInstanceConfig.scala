package typings.googleapis.baremetalsolutionV1alpha1Mod.baremetalsolutionV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceConfig extends StObject {
  
  /**
    * Client network address.
    */
  var clientNetwork: js.UndefOr[SchemaNetworkAddress] = js.undefined
  
  /**
    * Whether the instance should be provisioned with Hyperthreading enabled.
    */
  var hyperthreading: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A transient unique identifier to idenfity an instance within an ProvisioningConfig request.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instance type.
    */
  var instanceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Location where to deploy the instance.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * OS image to initialize the instance.
    */
  var osImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Private network address, if any.
    */
  var privateNetwork: js.UndefOr[SchemaNetworkAddress] = js.undefined
  
  /**
    * User note field, it can be used by customers to add additional information for the BMS Ops team (b/194021617).
    */
  var userNote: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceConfig {
  
  inline def apply(): SchemaInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceConfig]
  }
  
  extension [Self <: SchemaInstanceConfig](x: Self) {
    
    inline def setClientNetwork(value: SchemaNetworkAddress): Self = StObject.set(x, "clientNetwork", value.asInstanceOf[js.Any])
    
    inline def setClientNetworkUndefined: Self = StObject.set(x, "clientNetwork", js.undefined)
    
    inline def setHyperthreading(value: Boolean): Self = StObject.set(x, "hyperthreading", value.asInstanceOf[js.Any])
    
    inline def setHyperthreadingNull: Self = StObject.set(x, "hyperthreading", null)
    
    inline def setHyperthreadingUndefined: Self = StObject.set(x, "hyperthreading", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeNull: Self = StObject.set(x, "instanceType", null)
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOsImage(value: String): Self = StObject.set(x, "osImage", value.asInstanceOf[js.Any])
    
    inline def setOsImageNull: Self = StObject.set(x, "osImage", null)
    
    inline def setOsImageUndefined: Self = StObject.set(x, "osImage", js.undefined)
    
    inline def setPrivateNetwork(value: SchemaNetworkAddress): Self = StObject.set(x, "privateNetwork", value.asInstanceOf[js.Any])
    
    inline def setPrivateNetworkUndefined: Self = StObject.set(x, "privateNetwork", js.undefined)
    
    inline def setUserNote(value: String): Self = StObject.set(x, "userNote", value.asInstanceOf[js.Any])
    
    inline def setUserNoteNull: Self = StObject.set(x, "userNote", null)
    
    inline def setUserNoteUndefined: Self = StObject.set(x, "userNote", js.undefined)
  }
}
