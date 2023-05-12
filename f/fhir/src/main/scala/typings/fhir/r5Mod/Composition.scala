package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`final`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.appended
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.corrected
import typings.fhir.fhirStrings.deprecated
import typings.fhir.fhirStrings.partial
import typings.fhir.fhirStrings.preliminary
import typings.fhir.fhirStrings.registered
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Composition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Only list each attester once.
    */
  var attester: js.UndefOr[js.Array[CompositionAttester]] = js.undefined
  
  /**
    * Identifies who is responsible for the information in the composition, not necessarily who typed it in.
    */
  var author: js.Array[Reference]
  
  /**
    * A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This is useful when documents are derived from a composition - provides guidance for how to get the latest version of the document. This is optional because this is sometimes not known by the authoring system, and can be inferred by context. However, it is important that this information be known when working with a derived document, so providing a custodian is encouraged.
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  
  /**
    * The Last Modified Date on the composition may be after the date of the document was attested without being changed. This means that the date on an amended document is the date of the amendment, not the date of original authorship.
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
    * Similar to ClinicalDocument/setId in CDA. See discussion in resource definition for how these relate.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A comment, general note or annotation not coded elsewhere.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * To reference (using relatesTo) a Bundle of type "document" or another Composition where you only have the identifier, use a resourceReference with an identifier.\
    * When a Composition is an alternate representation of another type of document e.g. CDA, the other document could be referenced in a DocumentReference resource.
    * Here is an example of using relatesTo to reference another Bundle of type "document" or Composition where you only have the identifier:
    * ```
    * "relatesTo": [{
    *   "type": "replaces",
    *   "resourceReference": {
    *     "identifier": {
    *       "system": "...",
    *       "value": "..."
    *     }
    *   }
    * }]
    * ```
    */
  var relatesTo: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
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
  var status: registered | partial | preliminary | `final` | amended | corrected | appended | cancelled | `entered-in-error` | deprecated | unknown
  
  /**
    * For clinical documents, this is usually the patient.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * For many compositions, the title is the same as the text or a display name of Composition.type (e.g. a "consultation" or "progress note"). Note that CDA does not make title mandatory, but there are no known cases where it is useful for title to be omitted, so it is mandatory here. Feedback on this requirement is welcome during the trial use period.
    */
  var title: String
  
  /**
    * For Composition type, LOINC is ubiquitous and strongly endorsed by HL7. Most implementation guides will require a specific LOINC code, or use LOINC as an extensible binding.
    */
  var `type`: CodeableConcept
  
  /**
    * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred. Multiple instances may share the same URL if they have a distinct version.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple useContexts are specified, there is no expectation that all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * While each resource, including the composition itself, has its own version identifier, this is a formal identifier for the logical version of the Composition as a whole. It would remain constant if the resources were moved to a new server, and all got new individual resource versions, for example.
    */
  var version: js.UndefOr[String] = js.undefined
}
object Composition {
  
  inline def apply(
    author: js.Array[Reference],
    date: String,
    status: registered | partial | preliminary | `final` | amended | corrected | appended | cancelled | `entered-in-error` | deprecated | unknown,
    title: String,
    `type`: CodeableConcept
  ): Composition = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], resourceType = "Composition", status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
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
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCustodian(value: Reference): Self = StObject.set(x, "custodian", value.asInstanceOf[js.Any])
    
    inline def setCustodianUndefined: Self = StObject.set(x, "custodian", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEvent(value: js.Array[CompositionEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: CompositionEvent*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setRelatesTo(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatesTo", value.asInstanceOf[js.Any])
    
    inline def setRelatesToUndefined: Self = StObject.set(x, "relatesTo", js.undefined)
    
    inline def setRelatesToVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatesTo", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Composition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSection(value: js.Array[CompositionSection]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: CompositionSection*): Self = StObject.set(x, "section", js.Array(value*))
    
    inline def setStatus(
      value: registered | partial | preliminary | `final` | amended | corrected | appended | cancelled | `entered-in-error` | deprecated | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
