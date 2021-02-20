package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of decision support service functionality
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ServiceDefinition extends DomainResource {
  
  /**
    * Contains extended information for property 'approvalDate'.
    */
  var _approvalDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'lastReviewDate'.
    */
  var _lastReviewDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'usage'.
    */
  var _usage: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * When the service definition was approved by publisher
    */
  var approvalDate: js.UndefOr[date] = js.native
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  
  /**
    * A content contributor
    */
  var contributor: js.UndefOr[js.Array[Contributor]] = js.native
  
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.native
  
  /**
    * What data is used by the module
    */
  var dataRequirement: js.UndefOr[js.Array[DataRequirement]] = js.native
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Natural language description of the service definition
    */
  var description: js.UndefOr[markdown] = js.native
  
  /**
    * When the service definition is expected to be used
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional identifier for the service definition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Intended jurisdiction for service definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * When the service definition was last reviewed
    */
  var lastReviewDate: js.UndefOr[date] = js.native
  
  /**
    * Name for this service definition (computer friendly)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Operation to invoke
    */
  var operationDefinition: js.UndefOr[Reference] = js.native
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  
  /**
    * Why this service definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  
  /**
    * Additional documentation, citations, etc
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.native
  
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  
  /**
    * Name for this service definition (human friendly)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * E.g. Education, Treatment, Assessment, etc
    */
  var topic: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * "when" the module should be invoked
    */
  var trigger: js.UndefOr[js.Array[TriggerDefinition]] = js.native
  
  /**
    * Logical URI to reference this service definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.native
  
  /**
    * Describes the clinical usage of the module
    */
  var usage: js.UndefOr[String] = js.native
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  
  /**
    * Business version of the service definition
    */
  var version: js.UndefOr[String] = js.native
}
object ServiceDefinition {
  
  @scala.inline
  def apply(status: code): ServiceDefinition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDefinition]
  }
  
  @scala.inline
  implicit class ServiceDefinitionMutableBuilder[Self <: ServiceDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalDate(value: date): Self = StObject.set(x, "approvalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalDateUndefined: Self = StObject.set(x, "approvalDate", js.undefined)
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setContributor(value: js.Array[Contributor]): Self = StObject.set(x, "contributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributorUndefined: Self = StObject.set(x, "contributor", js.undefined)
    
    @scala.inline
    def setContributorVarargs(value: Contributor*): Self = StObject.set(x, "contributor", js.Array(value :_*))
    
    @scala.inline
    def setCopyright(value: markdown): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setDataRequirement(value: js.Array[DataRequirement]): Self = StObject.set(x, "dataRequirement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRequirementUndefined: Self = StObject.set(x, "dataRequirement", js.undefined)
    
    @scala.inline
    def setDataRequirementVarargs(value: DataRequirement*): Self = StObject.set(x, "dataRequirement", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setLastReviewDate(value: date): Self = StObject.set(x, "lastReviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastReviewDateUndefined: Self = StObject.set(x, "lastReviewDate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperationDefinition(value: Reference): Self = StObject.set(x, "operationDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationDefinitionUndefined: Self = StObject.set(x, "operationDefinition", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    @scala.inline
    def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTopic(value: js.Array[CodeableConcept]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    @scala.inline
    def setTopicVarargs(value: CodeableConcept*): Self = StObject.set(x, "topic", js.Array(value :_*))
    
    @scala.inline
    def setTrigger(value: js.Array[TriggerDefinition]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setTriggerVarargs(value: TriggerDefinition*): Self = StObject.set(x, "trigger", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_approvalDate(value: Element): Self = StObject.set(x, "_approvalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_approvalDateUndefined: Self = StObject.set(x, "_approvalDate", js.undefined)
    
    @scala.inline
    def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    @scala.inline
    def set_lastReviewDate(value: Element): Self = StObject.set(x, "_lastReviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastReviewDateUndefined: Self = StObject.set(x, "_lastReviewDate", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    @scala.inline
    def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    @scala.inline
    def set_usage(value: Element): Self = StObject.set(x, "_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_usageUndefined: Self = StObject.set(x, "_usage", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
