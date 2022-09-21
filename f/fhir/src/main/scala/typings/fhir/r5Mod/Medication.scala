package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medication
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Information that only applies to packages (not products).
    */
  var batch: js.UndefOr[MedicationBatch] = js.undefined
  
  /**
    * Depending on the context of use, the code that was actually selected by the user (prescriber, dispenser, etc.) will have the coding.userSelected set to true.  As described in the coding datatype: "A coding may be marked as a "userSelected" if a user selected the particular coded value in a user interface (e.g. the user selects an item in a pick-list). If a user selected coding exists, it is the preferred choice for performing translations etc. Other codes can only be literal translations to alternative code systems, or codes at a lower level of granularity (e.g. a generic code for a vendor-specific primary one).
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When Medication is referenced from MedicationRequest, this is the ordered form.  When Medication is referenced within MedicationDispense, this is the dispensed form.  When Medication is referenced within MedicationAdministration, this is administered form.
    */
  var doseForm: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The serial number could be included as an identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The ingredients need not be a complete list.  If an ingredient is not specified, this does not indicate whether an ingredient is present or absent.  If an ingredient is specified it does not mean that all ingredients are specified.  It is possible to specify both inactive and active ingredients.
    */
  var ingredient: js.UndefOr[js.Array[MedicationIngredient]] = js.undefined
  
  /**
    * Describes the organization that is responsible for the manufacturing of the item and holds the registration to market the product in a jurisdiction. This might not be the company that physically manufactures the product.  May be known as "Sponsor" and is commonly called "Manufacturer".
    */
  var marketingAuthorizationHolder: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Medication: typings.fhir.fhirStrings.Medication
  
  /**
    * This status is intended to identify if the medication in a local system is in active use within a drug database or inventory.  For example, a pharmacy system may create a new drug file record for a compounded product "ABC Hospital Special Cream" with an active status.  At some point in the future, it may be determined that the drug record was created with an error and the status is changed to "entered in error".   This status is not intended to specify if a medication is part of a particular formulary.  It is possible that the drug record may be referenced by multiple formularies or catalogues and each of those entries would have a separate status.
    */
  var status: js.UndefOr[active | inactive | `entered-in-error`] = js.undefined
  
  /**
    * When the specified product code does not infer a package size, this is the specific amount of drug in the product.  For example, when specifying a product that has the same strength (For example, Insulin glargine 100 unit per mL solution for injection), this attribute provides additional clarification of the package amount (For example, 3 mL, 10mL, etc.).
    */
  var totalVolume: js.UndefOr[Ratio] = js.undefined
}
object Medication {
  
  inline def apply(): Medication = {
    val __obj = js.Dynamic.literal(resourceType = "Medication")
    __obj.asInstanceOf[Medication]
  }
  
  extension [Self <: Medication](x: Self) {
    
    inline def setBatch(value: MedicationBatch): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDoseForm(value: CodeableConcept): Self = StObject.set(x, "doseForm", value.asInstanceOf[js.Any])
    
    inline def setDoseFormUndefined: Self = StObject.set(x, "doseForm", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIngredient(value: js.Array[MedicationIngredient]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: MedicationIngredient*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setMarketingAuthorizationHolder(value: Reference): Self = StObject.set(x, "marketingAuthorizationHolder", value.asInstanceOf[js.Any])
    
    inline def setMarketingAuthorizationHolderUndefined: Self = StObject.set(x, "marketingAuthorizationHolder", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Medication): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | inactive | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotalVolume(value: Ratio): Self = StObject.set(x, "totalVolume", value.asInstanceOf[js.Any])
    
    inline def setTotalVolumeUndefined: Self = StObject.set(x, "totalVolume", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
