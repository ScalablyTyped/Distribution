package typings.fhir.r3Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.candidate
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.enrolled
import typings.fhir.fhirStrings.suspended
import typings.fhir.fhirStrings.withdrawn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchSubject
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _actualArm: js.UndefOr[Element] = js.undefined
  
  var _assignedArm: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The name of the arm in the study the subject actually followed as part of this study.
    */
  var actualArm: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the arm in the study the subject is expected to follow as part of this study.
    */
  var assignedArm: js.UndefOr[String] = js.undefined
  
  /**
    * A record of the patient's informed agreement to participate in the study.
    */
  var consent: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifiers assigned to this research study by the sponsor or other systems.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The record of the person or animal who is involved in the study.
    */
  var individual: Reference
  
  /**
    * The dates the subject began and ended their participation in the study.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ResearchSubject: typings.fhir.fhirStrings.ResearchSubject
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: candidate | enrolled | active | suspended | withdrawn | completed
  
  /**
    * Reference to the study the subject is participating in.
    */
  var study: Reference
}
object ResearchSubject {
  
  inline def apply(
    individual: Reference,
    status: candidate | enrolled | active | suspended | withdrawn | completed,
    study: Reference
  ): ResearchSubject = {
    val __obj = js.Dynamic.literal(individual = individual.asInstanceOf[js.Any], resourceType = "ResearchSubject", status = status.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchSubject]
  }
  
  extension [Self <: ResearchSubject](x: Self) {
    
    inline def setActualArm(value: String): Self = StObject.set(x, "actualArm", value.asInstanceOf[js.Any])
    
    inline def setActualArmUndefined: Self = StObject.set(x, "actualArm", js.undefined)
    
    inline def setAssignedArm(value: String): Self = StObject.set(x, "assignedArm", value.asInstanceOf[js.Any])
    
    inline def setAssignedArmUndefined: Self = StObject.set(x, "assignedArm", js.undefined)
    
    inline def setConsent(value: Reference): Self = StObject.set(x, "consent", value.asInstanceOf[js.Any])
    
    inline def setConsentUndefined: Self = StObject.set(x, "consent", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIndividual(value: Reference): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ResearchSubject): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: candidate | enrolled | active | suspended | withdrawn | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStudy(value: Reference): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def set_actualArm(value: Element): Self = StObject.set(x, "_actualArm", value.asInstanceOf[js.Any])
    
    inline def set_actualArmUndefined: Self = StObject.set(x, "_actualArm", js.undefined)
    
    inline def set_assignedArm(value: Element): Self = StObject.set(x, "_assignedArm", value.asInstanceOf[js.Any])
    
    inline def set_assignedArmUndefined: Self = StObject.set(x, "_assignedArm", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
