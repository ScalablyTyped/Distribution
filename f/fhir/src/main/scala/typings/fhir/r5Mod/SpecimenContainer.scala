package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenContainer
  extends StObject
     with BackboneElement {
  
  /**
    * The device resource for the the container holding the specimen. If the container is in a holder then the referenced device will point to a parent device.
    */
  var device: Reference
  
  /**
    * The location of the container holding the specimen.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.
    */
  var specimenQuantity: js.UndefOr[Quantity] = js.undefined
}
object SpecimenContainer {
  
  inline def apply(device: Reference): SpecimenContainer = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecimenContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecimenContainer] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSpecimenQuantity(value: Quantity): Self = StObject.set(x, "specimenQuantity", value.asInstanceOf[js.Any])
    
    inline def setSpecimenQuantityUndefined: Self = StObject.set(x, "specimenQuantity", js.undefined)
  }
}
