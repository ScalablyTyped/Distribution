package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A healthcare consumer's policy choices to permits or denies recipients or roles to perform actions for specific purposes and periods of time
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Consent
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'dateTime'.
    */
  var _dateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'policyRule'.
    */
  var _policyRule: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Actions controlled by this consent
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Who|what controlled by this consent (or group, by role)
    */
  var actor: js.UndefOr[js.Array[ConsentActor]] = js.undefined
  
  /**
    * Classification of the consent statement - for indexing/retrieval
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Who is agreeing to the policy and exceptions
    */
  var consentingParty: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Data controlled by this consent
    */
  var data: js.UndefOr[js.Array[ConsentData]] = js.undefined
  
  /**
    * Timeframe for data controlled by this consent
    */
  var dataPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * When this Consent was created or indexed
    */
  var dateTime: js.UndefOr[typings.fhir.fhir.dateTime] = js.undefined
  
  /**
    * Additional rule -  addition or removal of permissions
    */
  var except: js.UndefOr[js.Array[ConsentExcept]] = js.undefined
  
  /**
    * Identifier for this record (external references)
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Custodian of the consent
    */
  var organization: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Who the consent applies to
    */
  var patient: Reference
  
  /**
    * Period that this consent applies
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Policies covered by this consent
    */
  var policy: js.UndefOr[js.Array[ConsentPolicy]] = js.undefined
  
  /**
    * Policy that this consents to
    */
  var policyRule: js.UndefOr[uri] = js.undefined
  
  /**
    * Context of activities for which the agreement is made
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Source from which this consent is taken
    */
  var sourceAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Source from which this consent is taken
    */
  var sourceIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Source from which this consent is taken
    */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * draft | proposed | active | rejected | inactive | entered-in-error
    */
  var status: code
}
object Consent {
  
  inline def apply(patient: Reference, status: code): Consent = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consent]
  }
  
  extension [Self <: Consent](x: Self) {
    
    inline def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    inline def setActor(value: js.Array[ConsentActor]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setActorVarargs(value: ConsentActor*): Self = StObject.set(x, "actor", js.Array(value :_*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    inline def setConsentingParty(value: js.Array[Reference]): Self = StObject.set(x, "consentingParty", value.asInstanceOf[js.Any])
    
    inline def setConsentingPartyUndefined: Self = StObject.set(x, "consentingParty", js.undefined)
    
    inline def setConsentingPartyVarargs(value: Reference*): Self = StObject.set(x, "consentingParty", js.Array(value :_*))
    
    inline def setData(value: js.Array[ConsentData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataPeriod(value: Period): Self = StObject.set(x, "dataPeriod", value.asInstanceOf[js.Any])
    
    inline def setDataPeriodUndefined: Self = StObject.set(x, "dataPeriod", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ConsentData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDateTime(value: dateTime): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    inline def setExcept(value: js.Array[ConsentExcept]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
    
    inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
    
    inline def setExceptVarargs(value: ConsentExcept*): Self = StObject.set(x, "except", js.Array(value :_*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setOrganization(value: js.Array[Reference]): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOrganizationVarargs(value: Reference*): Self = StObject.set(x, "organization", js.Array(value :_*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPolicy(value: js.Array[ConsentPolicy]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyRule(value: uri): Self = StObject.set(x, "policyRule", value.asInstanceOf[js.Any])
    
    inline def setPolicyRuleUndefined: Self = StObject.set(x, "policyRule", js.undefined)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: ConsentPolicy*): Self = StObject.set(x, "policy", js.Array(value :_*))
    
    inline def setPurpose(value: js.Array[Coding]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setPurposeVarargs(value: Coding*): Self = StObject.set(x, "purpose", js.Array(value :_*))
    
    inline def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value :_*))
    
    inline def setSourceAttachment(value: Attachment): Self = StObject.set(x, "sourceAttachment", value.asInstanceOf[js.Any])
    
    inline def setSourceAttachmentUndefined: Self = StObject.set(x, "sourceAttachment", js.undefined)
    
    inline def setSourceIdentifier(value: Identifier): Self = StObject.set(x, "sourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentifierUndefined: Self = StObject.set(x, "sourceIdentifier", js.undefined)
    
    inline def setSourceReference(value: Reference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_dateTime(value: Element): Self = StObject.set(x, "_dateTime", value.asInstanceOf[js.Any])
    
    inline def set_dateTimeUndefined: Self = StObject.set(x, "_dateTime", js.undefined)
    
    inline def set_policyRule(value: Element): Self = StObject.set(x, "_policyRule", value.asInstanceOf[js.Any])
    
    inline def set_policyRuleUndefined: Self = StObject.set(x, "_policyRule", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
