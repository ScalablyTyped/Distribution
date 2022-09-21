package typings.fhir.r5Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _definition: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _hasBodySite: js.UndefOr[Element] = js.undefined
  
  var _hasSeverity: js.UndefOr[Element] = js.undefined
  
  var _hasStage: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _subtitle: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Only used if not implicit in code found in ConditionDefinition.code. If the use case requires attributes from the BodySite resource (e.g. to identify and track separately) then use the standard extension [bodySite](extension-bodysite.html).  May be a summary code, or a reference to a very precise definition of the location, or both.
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identification of the condition, problem or diagnosis.
    */
  var code: CodeableConcept
  
  /**
    * May be a web site, an email address, a telephone number, etc.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the condition definition. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Formal definitions of the condition. These may be references to ontologies, published clinical protocols or research papers.
    */
  var definition: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This description can be used to capture details such as why the condition definition was built, comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the condition definition as conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the information is available from context (e.g. the language of the condition definition is presumed to be the predominant language in the place the condition definition was created).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Allows filtering of condition definitions that are appropriate for use versus not.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether bodySite is appropriate to collect for this condition.
    */
  var hasBodySite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether Severity is appropriate to collect for this condition.
    */
  var hasSeverity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether stage is appropriate to collect for this condition.
    */
  var hasStage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data type, and can then identify this condition definition outside of FHIR, where it is not possible to use the logical URI.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * It may be possible for the condition definition to be used in jurisdictions other than those for which it was originally designed or intended.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Medications particularly relevant for this condition.
    */
  var medication: js.UndefOr[js.Array[ConditionDefinitionMedication]] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Observations particularly relevant to this condition.
    */
  var observation: js.UndefOr[js.Array[ConditionDefinitionObservation]] = js.undefined
  
  /**
    * Plan that is appropriate.
    */
  var plan: js.UndefOr[js.Array[ConditionDefinitionPlan]] = js.undefined
  
  /**
    * An observation that suggests that this condition applies.
    */
  var precondition: js.UndefOr[js.Array[ConditionDefinitionPrecondition]] = js.undefined
  
  /**
    * Usually an organization but may be an individual. The publisher (or steward) of the condition definition is the organization or individual primarily responsible for the maintenance and upkeep of the condition definition. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the condition definition. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Questionnaire for this condition.
    */
  var questionnaire: js.UndefOr[js.Array[ConditionDefinitionQuestionnaire]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ConditionDefinition: typings.fhir.fhirStrings.ConditionDefinition
  
  /**
    * Coding of the severity with a terminology is preferred, where possible.
    */
  var severity: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Clinical stage or grade of a condition. May include formal severity assessments.
    */
  var stage: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Allows filtering of condition definitions that are appropriate for use versus not.
    */
  var status: draft | active | retired | unknown
  
  /**
    * An explanatory or alternate title for the event definition giving additional information about its content.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * Appropriate team for this condition.
    */
  var team: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This name does not need to be machine-processing friendly and may contain punctuation, white-space, etc.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred.  Multiple instances may share the same URL if they have a distinct version.
    * The determination of when to create a new version of a resource (same url, new version) vs. defining a new artifact is up to the author.  Considerations for making this decision are found in [Technical and Business Versions](resource.html#versions).
    * In some cases, the resource can no longer be found at the stated url, but the url itself cannot change. Implementations can use the [meta.source](resource.html#meta) element to indicate where the current master source of the resource can be found.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple useContexts are specified, there is no expectation that all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * There may be different condition definition instances that have the same identifier but different versions.  The version can be appended to the url in a reference to allow a reference to a particular business version of the condition definition with the format [url]|[version].
    */
  var version: js.UndefOr[String] = js.undefined
}
object ConditionDefinition {
  
  inline def apply(code: CodeableConcept, status: draft | active | retired | unknown): ConditionDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "ConditionDefinition", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionDefinition]
  }
  
  extension [Self <: ConditionDefinition](x: Self) {
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDefinition(value: js.Array[String]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: String*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setHasBodySite(value: Boolean): Self = StObject.set(x, "hasBodySite", value.asInstanceOf[js.Any])
    
    inline def setHasBodySiteUndefined: Self = StObject.set(x, "hasBodySite", js.undefined)
    
    inline def setHasSeverity(value: Boolean): Self = StObject.set(x, "hasSeverity", value.asInstanceOf[js.Any])
    
    inline def setHasSeverityUndefined: Self = StObject.set(x, "hasSeverity", js.undefined)
    
    inline def setHasStage(value: Boolean): Self = StObject.set(x, "hasStage", value.asInstanceOf[js.Any])
    
    inline def setHasStageUndefined: Self = StObject.set(x, "hasStage", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setMedication(value: js.Array[ConditionDefinitionMedication]): Self = StObject.set(x, "medication", value.asInstanceOf[js.Any])
    
    inline def setMedicationUndefined: Self = StObject.set(x, "medication", js.undefined)
    
    inline def setMedicationVarargs(value: ConditionDefinitionMedication*): Self = StObject.set(x, "medication", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObservation(value: js.Array[ConditionDefinitionObservation]): Self = StObject.set(x, "observation", value.asInstanceOf[js.Any])
    
    inline def setObservationUndefined: Self = StObject.set(x, "observation", js.undefined)
    
    inline def setObservationVarargs(value: ConditionDefinitionObservation*): Self = StObject.set(x, "observation", js.Array(value*))
    
    inline def setPlan(value: js.Array[ConditionDefinitionPlan]): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setPlanVarargs(value: ConditionDefinitionPlan*): Self = StObject.set(x, "plan", js.Array(value*))
    
    inline def setPrecondition(value: js.Array[ConditionDefinitionPrecondition]): Self = StObject.set(x, "precondition", value.asInstanceOf[js.Any])
    
    inline def setPreconditionUndefined: Self = StObject.set(x, "precondition", js.undefined)
    
    inline def setPreconditionVarargs(value: ConditionDefinitionPrecondition*): Self = StObject.set(x, "precondition", js.Array(value*))
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setQuestionnaire(value: js.Array[ConditionDefinitionQuestionnaire]): Self = StObject.set(x, "questionnaire", value.asInstanceOf[js.Any])
    
    inline def setQuestionnaireUndefined: Self = StObject.set(x, "questionnaire", js.undefined)
    
    inline def setQuestionnaireVarargs(value: ConditionDefinitionQuestionnaire*): Self = StObject.set(x, "questionnaire", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ConditionDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: CodeableConcept): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStage(value: CodeableConcept): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTeam(value: js.Array[Reference]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    
    inline def setTeamVarargs(value: Reference*): Self = StObject.set(x, "team", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_definition(value: js.Array[Element]): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_definitionVarargs(value: Element*): Self = StObject.set(x, "_definition", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_hasBodySite(value: Element): Self = StObject.set(x, "_hasBodySite", value.asInstanceOf[js.Any])
    
    inline def set_hasBodySiteUndefined: Self = StObject.set(x, "_hasBodySite", js.undefined)
    
    inline def set_hasSeverity(value: Element): Self = StObject.set(x, "_hasSeverity", value.asInstanceOf[js.Any])
    
    inline def set_hasSeverityUndefined: Self = StObject.set(x, "_hasSeverity", js.undefined)
    
    inline def set_hasStage(value: Element): Self = StObject.set(x, "_hasStage", value.asInstanceOf[js.Any])
    
    inline def set_hasStageUndefined: Self = StObject.set(x, "_hasStage", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_subtitle(value: Element): Self = StObject.set(x, "_subtitle", value.asInstanceOf[js.Any])
    
    inline def set_subtitleUndefined: Self = StObject.set(x, "_subtitle", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
