package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`final`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.preliminary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Composition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _confidentiality: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Only list each attester once.
    */
  var attester: js.UndefOr[js.Array[CompositionAttester]] = js.undefined
  
  /**
    * Identifies who is responsible for the information in the composition, not necessarily who typed it in.
    */
  var author: js.Array[Reference]
  
  /**
    * This is a metadata field from [XDS/MHD](http://wiki.ihe.net/index.php?title=Mobile_access_to_Health_Documents_(MHD)).
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The exact use of this element, and enforcement and issues related to highly sensitive documents are out of scope for the base specification, and delegated to implementation profiles (see security section).
    * This element is labeled as a modifier because highly confidential documents must not be treated as if they are not.
    */
  var confidentiality: js.UndefOr[String] = js.undefined
  
  /**
    * This is useful when documents are derived from a composition - provides guidance for how to get the latest version of the document. This is optional because this is sometimes not known by the authoring system, and can be inferred by context. However, it is important that this information be known when working with a derived document, so providing a custodian is encouraged.
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  
  /**
    * The Last Modified Date on the composition may be after the date of the document was attested without being changed.
    */
  var date: String
  
  /**
    * Describes the clinical encounter or type of care this documentation is associated with.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * The event needs to be consistent with the type element, though can provide further information if desired.
    */
  var event: js.UndefOr[js.Array[CompositionEvent]] = js.undefined
  
  /**
    * See discussion in resource definition for how these relate.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * A document is a version specific composition.
    */
  var relatesTo: js.UndefOr[js.Array[CompositionRelatesTo]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Composition: typings.fhir.fhirStrings.Composition
  
  /**
    * The root of the sections that make up the composition.
    */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.undefined
  
  /**
    * If a composition is marked as withdrawn, the compositions/documents in the series, or data from the composition or document series, should never be displayed to a user without being clearly marked as untrustworthy. The flag "entered-in-error" is why this element is labeled as a modifier of other elements.
    * Some reporting work flows require that the original narrative of a final document never be altered; instead, only new narrative can be added. The composition resource has no explicit status for explicitly noting whether this business rule is in effect. This would be handled by an extension if required.
    */
  var status: preliminary | `final` | amended | `entered-in-error`
  
  /**
    * For clinical documents, this is usually the patient.
    */
  var subject: Reference
  
  /**
    * For many compositions, the title is the same as the text or a display name of Composition.type (e.g. a "consultation" or "progress note"). Note that CDA does not make title mandatory, but there are no known cases where it is useful for title to be omitted, so it is mandatory here. Feedback on this requirement is welcome during the trial use period.
    */
  var title: String
  
  /**
    * For Composition type, LOINC is ubiquitous and strongly endorsed by HL7. Most implementation guides will require a specific LOINC code, or use LOINC as an extensible binding.
    */
  var `type`: CodeableConcept
}
object Composition {
  
  inline def apply(
    author: js.Array[Reference],
    date: String,
    status: preliminary | `final` | amended | `entered-in-error`,
    subject: Reference,
    title: String,
    `type`: CodeableConcept
  ): Composition = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], resourceType = "Composition", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Composition]
  }
  
  extension [Self <: Composition](x: Self) {
    
    inline def setAttester(value: js.Array[CompositionAttester]): Self = StObject.set(x, "attester", value.asInstanceOf[js.Any])
    
    inline def setAttesterUndefined: Self = StObject.set(x, "attester", js.undefined)
    
    inline def setAttesterVarargs(value: CompositionAttester*): Self = StObject.set(x, "attester", js.Array(value*))
    
    inline def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setClass(value: CodeableConcept): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setConfidentiality(value: String): Self = StObject.set(x, "confidentiality", value.asInstanceOf[js.Any])
    
    inline def setConfidentialityUndefined: Self = StObject.set(x, "confidentiality", js.undefined)
    
    inline def setCustodian(value: Reference): Self = StObject.set(x, "custodian", value.asInstanceOf[js.Any])
    
    inline def setCustodianUndefined: Self = StObject.set(x, "custodian", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEvent(value: js.Array[CompositionEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: CompositionEvent*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setRelatesTo(value: js.Array[CompositionRelatesTo]): Self = StObject.set(x, "relatesTo", value.asInstanceOf[js.Any])
    
    inline def setRelatesToUndefined: Self = StObject.set(x, "relatesTo", js.undefined)
    
    inline def setRelatesToVarargs(value: CompositionRelatesTo*): Self = StObject.set(x, "relatesTo", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Composition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSection(value: js.Array[CompositionSection]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: CompositionSection*): Self = StObject.set(x, "section", js.Array(value*))
    
    inline def setStatus(value: preliminary | `final` | amended | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_confidentiality(value: Element): Self = StObject.set(x, "_confidentiality", value.asInstanceOf[js.Any])
    
    inline def set_confidentialityUndefined: Self = StObject.set(x, "_confidentiality", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
