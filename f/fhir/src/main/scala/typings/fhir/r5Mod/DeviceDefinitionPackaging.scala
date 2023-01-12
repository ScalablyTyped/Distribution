package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionPackaging
  extends StObject
     with BackboneElement {
  
  /**
    * The number of items contained in the package (devices or sub-packages).
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * An organization that distributes the packaged device.
    */
  var distributor: js.UndefOr[js.Array[DeviceDefinitionPackagingDistributor]] = js.undefined
  
  /**
    * The business identifier of the packaged medication.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Allows packages within packages.
    */
  var packaging: js.UndefOr[js.Array[DeviceDefinitionPackaging]] = js.undefined
  
  /**
    * A code that defines the specific type of packaging.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Unique Device Identifier (UDI) Barcode string on the packaging.
    */
  var udiDeviceIdentifier: js.UndefOr[js.Array[DeviceDefinitionPackagingUdiDeviceIdentifier]] = js.undefined
}
object DeviceDefinitionPackaging {
  
  inline def apply(): DeviceDefinitionPackaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDefinitionPackaging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDefinitionPackaging] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDistributor(value: js.Array[DeviceDefinitionPackagingDistributor]): Self = StObject.set(x, "distributor", value.asInstanceOf[js.Any])
    
    inline def setDistributorUndefined: Self = StObject.set(x, "distributor", js.undefined)
    
    inline def setDistributorVarargs(value: DeviceDefinitionPackagingDistributor*): Self = StObject.set(x, "distributor", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPackaging(value: js.Array[DeviceDefinitionPackaging]): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    inline def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    inline def setPackagingVarargs(value: DeviceDefinitionPackaging*): Self = StObject.set(x, "packaging", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUdiDeviceIdentifier(value: js.Array[DeviceDefinitionPackagingUdiDeviceIdentifier]): Self = StObject.set(x, "udiDeviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setUdiDeviceIdentifierUndefined: Self = StObject.set(x, "udiDeviceIdentifier", js.undefined)
    
    inline def setUdiDeviceIdentifierVarargs(value: DeviceDefinitionPackagingUdiDeviceIdentifier*): Self = StObject.set(x, "udiDeviceIdentifier", js.Array(value*))
  }
}
