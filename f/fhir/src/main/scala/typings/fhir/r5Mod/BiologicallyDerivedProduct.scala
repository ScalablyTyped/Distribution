package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiologicallyDerivedProduct
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _division: js.UndefOr[Element] = js.undefined
  
  var _expirationDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Necessary to support mandatory requirements for traceability from donor/source to recipient and vice versa, while also satisfying donor anonymity requirements. The element is defined consistently across BiologicallyDerivedProduct, NutritionProduct, and Device.  The identifier references an event that links to a single biological entity such as a blood donor, or to multiple biological entities (e.g. when the product is an embryo or a pooled platelet product).  A single biologicalSourceEvent identifier may appear on multiple products of many types derived from a single donation event or source extraction.  As an example, a single donation event may provide 2 kidneys and a liver for organ transplantation, 2 corneas for eye surgery, heart valves and arterial tissue for cardiovascular surgery, multiple skin grafts, tendons, multiple shaped bone grafts and a large number of bone putty/paste products; and each of them may be assigned to the same biological source event identifier.
    */
  var biologicalSourceEvent: js.UndefOr[Identifier] = js.undefined
  
  /**
    * How this product was collected.
    */
  var collection: js.UndefOr[BiologicallyDerivedProductCollection] = js.undefined
  
  /**
    * A unique identifier for an aliquot of a product.  Used to distinguish individual aliquots of a product carrying the same biologicalSource and productCode identifiers.
    */
  var division: js.UndefOr[String] = js.undefined
  
  /**
    * Date, and where relevant time, of expiration.
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * This identifier should uniquely identify the product instance in the business domain.  Ideally it should be a globally unique identifier under the control of an ISO/IEC 15459 Issuing Agency.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * For products that have multiple collections. For example Peripheral Blood Stem Cells may be collected over several days from a single donor and the donation split into in multiple containers which must be linked to the parent donation.
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Processing facilities responsible for the labeling and distribution of this biologically derived product.
    */
  var processingFacility: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Broad category of this product.
    */
  var productCategory: js.UndefOr[Coding] = js.undefined
  
  /**
    * A codified value that systematically supports characterization and classification of medical products of human origin inclusive of processing conditions such as additives, volumes and handling conditions.
    */
  var productCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Whether the product is currently available.
    */
  var productStatus: js.UndefOr[Coding] = js.undefined
  
  /**
    * Property can be used to provide information on a wide range of additional information specific to a particular biologicallyDerivedProduct.
    */
  var property: js.UndefOr[js.Array[BiologicallyDerivedProductProperty]] = js.undefined
  
  /**
    * Request to obtain and/or infuse this biologically derived product.
    */
  var request: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_BiologicallyDerivedProduct: typings.fhir.fhirStrings.BiologicallyDerivedProduct
  
  /**
    * May be extracted from information held in the Product Description Code.
    */
  var storageTempRequirements: js.UndefOr[Range] = js.undefined
}
object BiologicallyDerivedProduct {
  
  inline def apply(): BiologicallyDerivedProduct = {
    val __obj = js.Dynamic.literal(resourceType = "BiologicallyDerivedProduct")
    __obj.asInstanceOf[BiologicallyDerivedProduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BiologicallyDerivedProduct] (val x: Self) extends AnyVal {
    
    inline def setBiologicalSourceEvent(value: Identifier): Self = StObject.set(x, "biologicalSourceEvent", value.asInstanceOf[js.Any])
    
    inline def setBiologicalSourceEventUndefined: Self = StObject.set(x, "biologicalSourceEvent", js.undefined)
    
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
    
    inline def setProductCategory(value: Coding): Self = StObject.set(x, "productCategory", value.asInstanceOf[js.Any])
    
    inline def setProductCategoryUndefined: Self = StObject.set(x, "productCategory", js.undefined)
    
    inline def setProductCode(value: CodeableConcept): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def setProductStatus(value: Coding): Self = StObject.set(x, "productStatus", value.asInstanceOf[js.Any])
    
    inline def setProductStatusUndefined: Self = StObject.set(x, "productStatus", js.undefined)
    
    inline def setProperty(value: js.Array[BiologicallyDerivedProductProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: BiologicallyDerivedProductProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setRequest(value: js.Array[Reference]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestVarargs(value: Reference*): Self = StObject.set(x, "request", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.BiologicallyDerivedProduct): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStorageTempRequirements(value: Range): Self = StObject.set(x, "storageTempRequirements", value.asInstanceOf[js.Any])
    
    inline def setStorageTempRequirementsUndefined: Self = StObject.set(x, "storageTempRequirements", js.undefined)
    
    inline def set_division(value: Element): Self = StObject.set(x, "_division", value.asInstanceOf[js.Any])
    
    inline def set_divisionUndefined: Self = StObject.set(x, "_division", js.undefined)
    
    inline def set_expirationDate(value: Element): Self = StObject.set(x, "_expirationDate", value.asInstanceOf[js.Any])
    
    inline def set_expirationDateUndefined: Self = StObject.set(x, "_expirationDate", js.undefined)
  }
}
