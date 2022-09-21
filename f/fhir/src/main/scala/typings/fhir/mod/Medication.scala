package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medication
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _isBrand: js.UndefOr[Element] = js.undefined
  
  /**
    * Information that only applies to packages (not products).
    */
  @JSName("package")
  var _package: js.UndefOr[MedicationPackage] = js.undefined
  
  /**
    * A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Set to true if the item is attributable to a specific manufacturer.
    */
  var isBrand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes the details of the manufacturer.
    */
  var manufacturer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Information that only applies to products (not packages).
    */
  var product: js.UndefOr[MedicationProduct] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Medication: typings.fhir.fhirStrings.Medication
}
object Medication {
  
  inline def apply(): Medication = {
    val __obj = js.Dynamic.literal(resourceType = "Medication")
    __obj.asInstanceOf[Medication]
  }
  
  extension [Self <: Medication](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIsBrand(value: Boolean): Self = StObject.set(x, "isBrand", value.asInstanceOf[js.Any])
    
    inline def setIsBrandUndefined: Self = StObject.set(x, "isBrand", js.undefined)
    
    inline def setManufacturer(value: Reference): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setProduct(value: MedicationProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Medication): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def set_isBrand(value: Element): Self = StObject.set(x, "_isBrand", value.asInstanceOf[js.Any])
    
    inline def set_isBrandUndefined: Self = StObject.set(x, "_isBrand", js.undefined)
    
    inline def set_package(value: MedicationPackage): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
