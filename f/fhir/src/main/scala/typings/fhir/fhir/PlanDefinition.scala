package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The definition of a plan for a series of actions, independent of any specific patient or context
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait PlanDefinition
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'approvalDate'.
    */
  var _approvalDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'lastReviewDate'.
    */
  var _lastReviewDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'usage'.
    */
  var _usage: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Action defined by the plan
    */
  var action: js.UndefOr[js.Array[PlanDefinitionAction]] = js.undefined
  
  /**
    * When the plan definition was approved by publisher
    */
  var approvalDate: js.UndefOr[date] = js.undefined
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * A content contributor
    */
  var contributor: js.UndefOr[js.Array[Contributor]] = js.undefined
  
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Natural language description of the plan definition
    */
  var description: js.UndefOr[markdown] = js.undefined
  
  /**
    * When the plan definition is expected to be used
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * What the plan is trying to accomplish
    */
  var goal: js.UndefOr[js.Array[PlanDefinitionGoal]] = js.undefined
  
  /**
    * Additional identifier for the plan definition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Intended jurisdiction for plan definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * When the plan definition was last reviewed
    */
  var lastReviewDate: js.UndefOr[date] = js.undefined
  
  /**
    * Logic used by the plan definition
    */
  var library: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Name for this plan definition (computer friendly)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Why this plan definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  
  /**
    * Related artifacts for the asset
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * draft | active | retired | unknown
    */
  var status: code
  
  /**
    * Name for this plan definition (human friendly)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * E.g. Education, Treatment, Assessment, etc
    */
  var topic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * order-set | protocol | eca-rule
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Logical URI to reference this plan definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  
  /**
    * Describes the clinical usage of the asset
    */
  var usage: js.UndefOr[String] = js.undefined
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * Business version of the plan definition
    */
  var version: js.UndefOr[String] = js.undefined
}
object PlanDefinition {
  
  inline def apply(status: code): PlanDefinition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinition]
  }
  
  extension [Self <: PlanDefinition](x: Self) {
    
    inline def setAction(value: js.Array[PlanDefinitionAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: PlanDefinitionAction*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    inline def setApprovalDate(value: date): Self = StObject.set(x, "approvalDate", value.asInstanceOf[js.Any])
    
    inline def setApprovalDateUndefined: Self = StObject.set(x, "approvalDate", js.undefined)
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    inline def setContributor(value: js.Array[Contributor]): Self = StObject.set(x, "contributor", value.asInstanceOf[js.Any])
    
    inline def setContributorUndefined: Self = StObject.set(x, "contributor", js.undefined)
    
    inline def setContributorVarargs(value: Contributor*): Self = StObject.set(x, "contributor", js.Array(value :_*))
    
    inline def setCopyright(value: markdown): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setGoal(value: js.Array[PlanDefinitionGoal]): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    inline def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    inline def setGoalVarargs(value: PlanDefinitionGoal*): Self = StObject.set(x, "goal", js.Array(value :_*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    inline def setLastReviewDate(value: date): Self = StObject.set(x, "lastReviewDate", value.asInstanceOf[js.Any])
    
    inline def setLastReviewDateUndefined: Self = StObject.set(x, "lastReviewDate", js.undefined)
    
    inline def setLibrary(value: js.Array[Reference]): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    inline def setLibraryVarargs(value: Reference*): Self = StObject.set(x, "library", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurpose(value: markdown): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    inline def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value :_*))
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTopic(value: js.Array[CodeableConcept]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setTopicVarargs(value: CodeableConcept*): Self = StObject.set(x, "topic", js.Array(value :_*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value :_*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_approvalDate(value: Element): Self = StObject.set(x, "_approvalDate", value.asInstanceOf[js.Any])
    
    inline def set_approvalDateUndefined: Self = StObject.set(x, "_approvalDate", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_lastReviewDate(value: Element): Self = StObject.set(x, "_lastReviewDate", value.asInstanceOf[js.Any])
    
    inline def set_lastReviewDateUndefined: Self = StObject.set(x, "_lastReviewDate", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_usage(value: Element): Self = StObject.set(x, "_usage", value.asInstanceOf[js.Any])
    
    inline def set_usageUndefined: Self = StObject.set(x, "_usage", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
