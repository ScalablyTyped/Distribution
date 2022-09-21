package typings.fhir.r5Mod

import typings.fhir.fhirStrings.available
import typings.fhir.fhirStrings.biologicalAgent
import typings.fhir.fhirStrings.cells
import typings.fhir.fhirStrings.fluid
import typings.fhir.fhirStrings.organ
import typings.fhir.fhirStrings.tissue
import typings.fhir.fhirStrings.unavailable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiologicallyDerivedProduct
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _division: js.UndefOr[Element] = js.undefined
  
  var _expirationDate: js.UndefOr[Element] = js.undefined
  
  var _productCategory: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Necessary to support mandatory requirements for traceability from donor/source to recipient and vice versa.  The element is defined consistently across BiologicallyDerivedProduct, NutritionProduct, and Device.
    */
  var biologicalSource: js.UndefOr[Identifier] = js.undefined
  
  /**
    * How this product was collected.
    */
  var collection: js.UndefOr[BiologicallyDerivedProductCollection] = js.undefined
  
  /**
    * Description of division.
    */
  var division: js.UndefOr[String] = js.undefined
  
  /**
    * Date of expiration.
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * This records identifiers associated with this biologically derived product instance that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * For products that have multiple collections. For example Peripheral Blood Stem Cells may be collected over several days from a single donor and the donation split into in multiple containers which must be linked to the parent donation.
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A jurisdiction may indicate whether to only include an identifier or a full reference for the facility.
    */
  var processingFacility: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Broad category of this product.
    */
  var productCategory: js.UndefOr[organ | tissue | fluid | cells | biologicalAgent] = js.undefined
  
  /**
    * A code that identifies the kind of this biologically derived product (SNOMED Ctcode).
    */
  var productCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A property that is specific to this BiologicallyDerviedProduct instance.
    */
  var property: js.UndefOr[js.Array[BiologicallyDerivedProductProperty]] = js.undefined
  
  /**
    * Procedure request to obtain this biologically derived product.
    */
  var request: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_BiologicallyDerivedProduct: typings.fhir.fhirStrings.BiologicallyDerivedProduct
  
  /**
    * Whether the product is currently available.
    */
  var status: js.UndefOr[available | unavailable_] = js.undefined
  
  /**
    * Product storage temp requirements.
    */
  var storageTempRequirements: js.UndefOr[Range] = js.undefined
}
object BiologicallyDerivedProduct {
  
  inline def apply(): BiologicallyDerivedProduct = {
    val __obj = js.Dynamic.literal(resourceType = "BiologicallyDerivedProduct")
    __obj.asInstanceOf[BiologicallyDerivedProduct]
  }
  
  extension [Self <: BiologicallyDerivedProduct](x: Self) {
    
    inline def setBiologicalSource(value: Identifier): Self = StObject.set(x, "biologicalSource", value.asInstanceOf[js.Any])
    
    inline def setBiologicalSourceUndefined: Self = StObject.set(x, "biologicalSource", js.undefined)
    
    inline def setCollection(value: BiologicallyDerivedProductCollection): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setDivision(value: String): Self = StObject.set(x, "division", value.asInstanceOf[js.Any])
    
    inline def setDivisionUndefined: Self = StObject.set(x, "division", js.undefined)
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setParent(value: js.Array[Reference]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setParentVarargs(value: Reference*): Self = StObject.set(x, "parent", js.Array(value*))
    
    inline def setProcessingFacility(value: js.Array[Reference]): Self = StObject.set(x, "processingFacility", value.asInstanceOf[js.Any])
    
    inline def setProcessingFacilityUndefined: Self = StObject.set(x, "processingFacility", js.undefined)
    
    inline def setProcessingFacilityVarargs(value: Reference*): Self = StObject.set(x, "processingFacility", js.Array(value*))
    
    inline def setProductCategory(value: organ | tissue | fluid | cells | biologicalAgent): Self = StObject.set(x, "productCategory", value.asInstanceOf[js.Any])
    
    inline def setProductCategoryUndefined: Self = StObject.set(x, "productCategory", js.undefined)
    
    inline def setProductCode(value: CodeableConcept): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def setProperty(value: js.Array[BiologicallyDerivedProductProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: BiologicallyDerivedProductProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setRequest(value: js.Array[Reference]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestVarargs(value: Reference*): Self = StObject.set(x, "request", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.BiologicallyDerivedProduct): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: available | unavailable_): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStorageTempRequirements(value: Range): Self = StObject.set(x, "storageTempRequirements", value.asInstanceOf[js.Any])
    
    inline def setStorageTempRequirementsUndefined: Self = StObject.set(x, "storageTempRequirements", js.undefined)
    
    inline def set_division(value: Element): Self = StObject.set(x, "_division", value.asInstanceOf[js.Any])
    
    inline def set_divisionUndefined: Self = StObject.set(x, "_division", js.undefined)
    
    inline def set_expirationDate(value: Element): Self = StObject.set(x, "_expirationDate", value.asInstanceOf[js.Any])
    
    inline def set_expirationDateUndefined: Self = StObject.set(x, "_expirationDate", js.undefined)
    
    inline def set_productCategory(value: Element): Self = StObject.set(x, "_productCategory", value.asInstanceOf[js.Any])
    
    inline def set_productCategoryUndefined: Self = StObject.set(x, "_productCategory", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
