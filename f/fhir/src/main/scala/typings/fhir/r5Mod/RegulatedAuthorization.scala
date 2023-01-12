package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegulatedAuthorization
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _statusDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional information or supporting documentation about the authorization.
    */
  var attachedDocument: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The legal or regulatory framework against which this authorization is granted, or other reasons for it.
    */
  var basis: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The case or regulatory procedure for granting or amending a marketing authorization. Note: This area is subject to ongoing review and the workgroup is seeking implementer feedback on its use (see link at bottom of page).
    */
  var `case`: js.UndefOr[RegulatedAuthorizationCase] = js.undefined
  
  /**
    * General textual supporting information.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The organization that holds the granted authorization.
    */
  var holder: js.UndefOr[Reference] = js.undefined
  
  /**
    * Business identifier for the authorization, typically assigned by the authorizing body.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Condition for which the use of the regulated product applies.
    */
  var indication: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * The intended use of the product, e.g. prevention, treatment.
    */
  var intendedUse: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The territory (e.g., country, jurisdiction etc.) in which the authorization has been granted.
    */
  var region: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The regulatory authority or authorizing body granting the authorization. For example, European Medicines Agency (EMA), Food and Drug Administration (FDA), Health Canada (HC), etc.
    */
  var regulator: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_RegulatedAuthorization: typings.fhir.fhirStrings.RegulatedAuthorization
  
  /**
    * The status that is authorised e.g. approved. Intermediate states can be tracked with cases and applications.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date at which the current status was assigned.
    */
  var statusDate: js.UndefOr[String] = js.undefined
  
  /**
    * The product type, treatment, facility or activity that is being authorized.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Overall type of this authorization, for example drug marketing approval, orphan drug designation.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The time period in which the regulatory approval, clearance or licencing is in effect. As an example, a Marketing Authorization includes the date of authorization and/or an expiration date.
    */
  var validityPeriod: js.UndefOr[Period] = js.undefined
}
object RegulatedAuthorization {
  
  inline def apply(): RegulatedAuthorization = {
    val __obj = js.Dynamic.literal(resourceType = "RegulatedAuthorization")
    __obj.asInstanceOf[RegulatedAuthorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegulatedAuthorization] (val x: Self) extends AnyVal {
    
    inline def setAttachedDocument(value: js.Array[Reference]): Self = StObject.set(x, "attachedDocument", value.asInstanceOf[js.Any])
    
    inline def setAttachedDocumentUndefined: Self = StObject.set(x, "attachedDocument", js.undefined)
    
    inline def setAttachedDocumentVarargs(value: Reference*): Self = StObject.set(x, "attachedDocument", js.Array(value*))
    
    inline def setBasis(value: js.Array[CodeableConcept]): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    inline def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
    
    inline def setBasisVarargs(value: CodeableConcept*): Self = StObject.set(x, "basis", js.Array(value*))
    
    inline def setCase(value: RegulatedAuthorizationCase): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
    
    inline def setCaseUndefined: Self = StObject.set(x, "case", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHolder(value: Reference): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
    
    inline def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIndication(value: CodeableReference): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setIntendedUse(value: CodeableConcept): Self = StObject.set(x, "intendedUse", value.asInstanceOf[js.Any])
    
    inline def setIntendedUseUndefined: Self = StObject.set(x, "intendedUse", js.undefined)
    
    inline def setRegion(value: js.Array[CodeableConcept]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRegionVarargs(value: CodeableConcept*): Self = StObject.set(x, "region", js.Array(value*))
    
    inline def setRegulator(value: Reference): Self = StObject.set(x, "regulator", value.asInstanceOf[js.Any])
    
    inline def setRegulatorUndefined: Self = StObject.set(x, "regulator", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.RegulatedAuthorization): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDate(value: String): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidityPeriod(value: Period): Self = StObject.set(x, "validityPeriod", value.asInstanceOf[js.Any])
    
    inline def setValidityPeriodUndefined: Self = StObject.set(x, "validityPeriod", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_statusDate(value: Element): Self = StObject.set(x, "_statusDate", value.asInstanceOf[js.Any])
    
    inline def set_statusDateUndefined: Self = StObject.set(x, "_statusDate", js.undefined)
  }
}
