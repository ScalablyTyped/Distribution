package typings.fhir.r2Mod

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
    * Identifies responsibility for the accuracy of the composition content.
    */
  var attester: js.UndefOr[js.Array[CompositionAttester]] = js.undefined
  
  /**
    * Identifies who is responsible for the content.
    */
  var author: js.Array[Reference]
  
  /**
    * Helps humans to assess whether the composition is of interest when viewing an index of compositions or documents.
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The code specifying the level of confidentiality of the Composition.
    */
  var confidentiality: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies where to go to find the current version, where to report issues, etc.
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  
  /**
    * dateTime is used for tracking, organizing versions and searching.
    */
  var date: String
  
  /**
    * Provides context for the composition and supports searching.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Provides context for the composition and creates a linkage between a resource describing an event and the composition created describing the event.
    */
  var event: js.UndefOr[js.Array[CompositionEvent]] = js.undefined
  
  /**
    * Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Composition: typings.fhir.fhirStrings.Composition
  
  /**
    * The root of the sections that make up the composition.
    */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.undefined
  
  /**
    * Need to be able to mark interim, amended, or withdrawn compositions or documents.
    */
  var status: preliminary | `final` | amended | `entered-in-error`
  
  /**
    * Essential metadata for searching for the composition. Identifies who and/or what the composition/document is about.
    */
  var subject: Reference
  
  /**
    * Official human-readable label for the composition.
    */
  var title: String
  
  /**
    * Key metadata element describing the composition, used in searching/filtering.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Composition] (val x: Self) extends AnyVal {
    
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
