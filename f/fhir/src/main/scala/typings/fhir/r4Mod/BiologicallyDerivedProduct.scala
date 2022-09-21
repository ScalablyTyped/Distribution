package typings.fhir.r4Mod

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
  
  var _productCategory: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * How this product was collected.
    */
  var collection: js.UndefOr[BiologicallyDerivedProductCollection] = js.undefined
  
  /**
    * This records identifiers associated with this biologically derived product instance that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Any manipulation of product post-collection that is intended to alter the product.  For example a buffy-coat enrichment or CD8 reduction of Peripheral Blood Stem Cells to make it more suitable for infusion.
    */
  var manipulation: js.UndefOr[BiologicallyDerivedProductManipulation] = js.undefined
  
  /**
    * For products that have multiple collections. For example Peripheral Blood Stem Cells may be collected over several days from a single donor and the donation split into in multiple containers which must be linked to the parent donation.
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Any processing of the product during collection that does not change the fundamental nature of the product. For example adding anti-coagulants during the collection of Peripheral Blood Stem Cells.
    */
  var processing: js.UndefOr[js.Array[BiologicallyDerivedProductProcessing]] = js.undefined
  
  /**
    * Broad category of this product.
    */
  var productCategory: js.UndefOr[organ | tissue | fluid | cells | biologicalAgent] = js.undefined
  
  /**
    * A code that identifies the kind of this biologically derived product (SNOMED Ctcode).
    */
  var productCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Number of discrete units within this product.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  
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
    * Product storage.
    */
  var storage: js.UndefOr[js.Array[BiologicallyDerivedProductStorage]] = js.undefined
}
object BiologicallyDerivedProduct {
  
  inline def apply(): BiologicallyDerivedProduct = {
    val __obj = js.Dynamic.literal(resourceType = "BiologicallyDerivedProduct")
    __obj.asInstanceOf[BiologicallyDerivedProduct]
  }
  
  extension [Self <: BiologicallyDerivedProduct](x: Self) {
    
    inline def setCollection(value: BiologicallyDerivedProductCollection): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManipulation(value: BiologicallyDerivedProductManipulation): Self = StObject.set(x, "manipulation", value.asInstanceOf[js.Any])
    
    inline def setManipulationUndefined: Self = StObject.set(x, "manipulation", js.undefined)
    
    inline def setParent(value: js.Array[Reference]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setParentVarargs(value: Reference*): Self = StObject.set(x, "parent", js.Array(value*))
    
    inline def setProcessing(value: js.Array[BiologicallyDerivedProductProcessing]): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    inline def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
    
    inline def setProcessingVarargs(value: BiologicallyDerivedProductProcessing*): Self = StObject.set(x, "processing", js.Array(value*))
    
    inline def setProductCategory(value: organ | tissue | fluid | cells | biologicalAgent): Self = StObject.set(x, "productCategory", value.asInstanceOf[js.Any])
    
    inline def setProductCategoryUndefined: Self = StObject.set(x, "productCategory", js.undefined)
    
    inline def setProductCode(value: CodeableConcept): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRequest(value: js.Array[Reference]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestVarargs(value: Reference*): Self = StObject.set(x, "request", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.BiologicallyDerivedProduct): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: available | unavailable_): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStorage(value: js.Array[BiologicallyDerivedProductStorage]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setStorageVarargs(value: BiologicallyDerivedProductStorage*): Self = StObject.set(x, "storage", js.Array(value*))
    
    inline def set_productCategory(value: Element): Self = StObject.set(x, "_productCategory", value.asInstanceOf[js.Any])
    
    inline def set_productCategoryUndefined: Self = StObject.set(x, "_productCategory", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
