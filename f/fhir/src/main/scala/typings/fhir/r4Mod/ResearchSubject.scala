package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`follow-up`
import typings.fhir.fhirStrings.`not-registered`
import typings.fhir.fhirStrings.`off-study`
import typings.fhir.fhirStrings.`on-study-intervention`
import typings.fhir.fhirStrings.`on-study-observation`
import typings.fhir.fhirStrings.`on-study`
import typings.fhir.fhirStrings.`pending-on-study`
import typings.fhir.fhirStrings.`potential-candidate`
import typings.fhir.fhirStrings.candidate
import typings.fhir.fhirStrings.eligible
import typings.fhir.fhirStrings.ineligible
import typings.fhir.fhirStrings.screening
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
    * Identifiers assigned to this research subject for a study.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
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
    * The current state of the subject.
    */
  var status: candidate | eligible | `follow-up` | ineligible | `not-registered` | `off-study` | `on-study` | `on-study-intervention` | `on-study-observation` | `pending-on-study` | `potential-candidate` | screening | withdrawn
  
  /**
    * Reference to the study the subject is participating in.
    */
  var study: Reference
}
object ResearchSubject {
  
  inline def apply(
    individual: Reference,
    status: candidate | eligible | `follow-up` | ineligible | `not-registered` | `off-study` | `on-study` | `on-study-intervention` | `on-study-observation` | `pending-on-study` | `potential-candidate` | screening | withdrawn,
    study: Reference
  ): ResearchSubject = {
    val __obj = js.Dynamic.literal(individual = individual.asInstanceOf[js.Any], resourceType = "ResearchSubject", status = status.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchSubject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResearchSubject] (val x: Self) extends AnyVal {
    
    inline def setActualArm(value: String): Self = StObject.set(x, "actualArm", value.asInstanceOf[js.Any])
    
    inline def setActualArmUndefined: Self = StObject.set(x, "actualArm", js.undefined)
    
    inline def setAssignedArm(value: String): Self = StObject.set(x, "assignedArm", value.asInstanceOf[js.Any])
    
    inline def setAssignedArmUndefined: Self = StObject.set(x, "assignedArm", js.undefined)
    
    inline def setConsent(value: Reference): Self = StObject.set(x, "consent", value.asInstanceOf[js.Any])
    
    inline def setConsentUndefined: Self = StObject.set(x, "consent", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIndividual(value: Reference): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ResearchSubject): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: candidate | eligible | `follow-up` | ineligible | `not-registered` | `off-study` | `on-study` | `on-study-intervention` | `on-study-observation` | `pending-on-study` | `potential-candidate` | screening | withdrawn
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStudy(value: Reference): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def set_actualArm(value: Element): Self = StObject.set(x, "_actualArm", value.asInstanceOf[js.Any])
    
    inline def set_actualArmUndefined: Self = StObject.set(x, "_actualArm", js.undefined)
    
    inline def set_assignedArm(value: Element): Self = StObject.set(x, "_assignedArm", value.asInstanceOf[js.Any])
    
    inline def set_assignedArmUndefined: Self = StObject.set(x, "_assignedArm", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
