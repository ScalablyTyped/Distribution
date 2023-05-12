package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductPackaged
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Batch numbering.
    */
  var batchIdentifier: js.UndefOr[js.Array[MedicinalProductPackagedBatchIdentifier]] = js.undefined
  
  /**
    * Textual description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The legal status of supply of the medicinal product as classified by the regulator.
    */
  var legalStatusOfSupply: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Manufacturer of this Package Item.
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Manufacturer of this Package Item.
    */
  var marketingAuthorization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Marketing information.
    */
  var marketingStatus: js.UndefOr[js.Array[MarketingStatus]] = js.undefined
  
  /**
    * A packaging item, as a contained for medicine, possibly with other packaging items within.
    */
  var packageItem: js.Array[MedicinalProductPackagedPackageItem]
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicinalProductPackaged: typings.fhir.fhirStrings.MedicinalProductPackaged
  
  /**
    * The product with this is a pack for.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
}
object MedicinalProductPackaged {
  
  inline def apply(packageItem: js.Array[MedicinalProductPackagedPackageItem]): MedicinalProductPackaged = {
    val __obj = js.Dynamic.literal(packageItem = packageItem.asInstanceOf[js.Any], resourceType = "MedicinalProductPackaged")
    __obj.asInstanceOf[MedicinalProductPackaged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductPackaged] (val x: Self) extends AnyVal {
    
    inline def setBatchIdentifier(value: js.Array[MedicinalProductPackagedBatchIdentifier]): Self = StObject.set(x, "batchIdentifier", value.asInstanceOf[js.Any])
    
    inline def setBatchIdentifierUndefined: Self = StObject.set(x, "batchIdentifier", js.undefined)
    
    inline def setBatchIdentifierVarargs(value: MedicinalProductPackagedBatchIdentifier*): Self = StObject.set(x, "batchIdentifier", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLegalStatusOfSupply(value: CodeableConcept): Self = StObject.set(x, "legalStatusOfSupply", value.asInstanceOf[js.Any])
    
    inline def setLegalStatusOfSupplyUndefined: Self = StObject.set(x, "legalStatusOfSupply", js.undefined)
    
    inline def setManufacturer(value: js.Array[Reference]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: Reference*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setMarketingAuthorization(value: Reference): Self = StObject.set(x, "marketingAuthorization", value.asInstanceOf[js.Any])
    
    inline def setMarketingAuthorizationUndefined: Self = StObject.set(x, "marketingAuthorization", js.undefined)
    
    inline def setMarketingStatus(value: js.Array[MarketingStatus]): Self = StObject.set(x, "marketingStatus", value.asInstanceOf[js.Any])
    
    inline def setMarketingStatusUndefined: Self = StObject.set(x, "marketingStatus", js.undefined)
    
    inline def setMarketingStatusVarargs(value: MarketingStatus*): Self = StObject.set(x, "marketingStatus", js.Array(value*))
    
    inline def setPackageItem(value: js.Array[MedicinalProductPackagedPackageItem]): Self = StObject.set(x, "packageItem", value.asInstanceOf[js.Any])
    
    inline def setPackageItemVarargs(value: MedicinalProductPackagedPackageItem*): Self = StObject.set(x, "packageItem", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicinalProductPackaged): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
