package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The definition of a specific activity to be taken, independent of any particular patient or context
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ActivityDefinition extends DomainResource {
  
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
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.native
  
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
    * Contains extended information for property 'timingDateTime'.
    */
  var _timingDateTime: js.UndefOr[Element] = js.native
  
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
    * When the activity definition was approved by publisher
    */
  var approvalDate: js.UndefOr[date] = js.native
  
  /**
    * What part of body to perform on
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Detail type of activity
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
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
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Natural language description of the activity definition
    */
  var description: js.UndefOr[markdown] = js.native
  
  /**
    * Detailed dosage instructions
    */
  var dosage: js.UndefOr[js.Array[Dosage]] = js.native
  
  /**
    * Dynamic aspects of the definition
    */
  var dynamicValue: js.UndefOr[js.Array[ActivityDefinitionDynamicValue]] = js.native
  
  /**
    * When the activity definition is expected to be used
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional identifier for the activity definition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Intended jurisdiction for activity definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Kind of resource
    */
  var kind: js.UndefOr[code] = js.native
  
  /**
    * When the activity definition was last reviewed
    */
  var lastReviewDate: js.UndefOr[date] = js.native
  
  /**
    * Logic used by the asset
    */
  var library: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Where it should happen
    */
  var location: js.UndefOr[Reference] = js.native
  
  /**
    * Name for this activity definition (computer friendly)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Who should participate in the action
    */
  var participant: js.UndefOr[js.Array[ActivityDefinitionParticipant]] = js.native
  
  /**
    * What's administered/supplied
    */
  var productCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * What's administered/supplied
    */
  var productReference: js.UndefOr[Reference] = js.native
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  
  /**
    * Why this activity definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  
  /**
    * How much is administered/consumed/supplied
    */
  var quantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Additional documentation, citations, etc
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.native
  
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  
  /**
    * When activity is to occur
    */
  var timingDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * When activity is to occur
    */
  var timingPeriod: js.UndefOr[Period] = js.native
  
  /**
    * When activity is to occur
    */
  var timingRange: js.UndefOr[Range] = js.native
  
  /**
    * When activity is to occur
    */
  var timingTiming: js.UndefOr[Timing] = js.native
  
  /**
    * Name for this activity definition (human friendly)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * E.g. Education, Treatment, Assessment, etc
    */
  var topic: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Transform to apply the template
    */
  var transform: js.UndefOr[Reference] = js.native
  
  /**
    * Logical URI to reference this activity definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.native
  
  /**
    * Describes the clinical usage of the asset
    */
  var usage: js.UndefOr[String] = js.native
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  
  /**
    * Business version of the activity definition
    */
  var version: js.UndefOr[String] = js.native
}
object ActivityDefinition {
  
  @scala.inline
  def apply(status: code): ActivityDefinition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityDefinition]
  }
  
  @scala.inline
  implicit class ActivityDefinitionMutableBuilder[Self <: ActivityDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalDate(value: date): Self = StObject.set(x, "approvalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalDateUndefined: Self = StObject.set(x, "approvalDate", js.undefined)
    
    @scala.inline
    def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    @scala.inline
    def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
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
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDosage(value: js.Array[Dosage]): Self = StObject.set(x, "dosage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDosageUndefined: Self = StObject.set(x, "dosage", js.undefined)
    
    @scala.inline
    def setDosageVarargs(value: Dosage*): Self = StObject.set(x, "dosage", js.Array(value :_*))
    
    @scala.inline
    def setDynamicValue(value: js.Array[ActivityDefinitionDynamicValue]): Self = StObject.set(x, "dynamicValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicValueUndefined: Self = StObject.set(x, "dynamicValue", js.undefined)
    
    @scala.inline
    def setDynamicValueVarargs(value: ActivityDefinitionDynamicValue*): Self = StObject.set(x, "dynamicValue", js.Array(value :_*))
    
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
    def setKind(value: code): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastReviewDate(value: date): Self = StObject.set(x, "lastReviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastReviewDateUndefined: Self = StObject.set(x, "lastReviewDate", js.undefined)
    
    @scala.inline
    def setLibrary(value: js.Array[Reference]): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    @scala.inline
    def setLibraryVarargs(value: Reference*): Self = StObject.set(x, "library", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParticipant(value: js.Array[ActivityDefinitionParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    @scala.inline
    def setParticipantVarargs(value: ActivityDefinitionParticipant*): Self = StObject.set(x, "participant", js.Array(value :_*))
    
    @scala.inline
    def setProductCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "productCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodeableConceptUndefined: Self = StObject.set(x, "productCodeableConcept", js.undefined)
    
    @scala.inline
    def setProductReference(value: Reference): Self = StObject.set(x, "productReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductReferenceUndefined: Self = StObject.set(x, "productReference", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    @scala.inline
    def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingDateTime(value: dateTime): Self = StObject.set(x, "timingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingDateTimeUndefined: Self = StObject.set(x, "timingDateTime", js.undefined)
    
    @scala.inline
    def setTimingPeriod(value: Period): Self = StObject.set(x, "timingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingPeriodUndefined: Self = StObject.set(x, "timingPeriod", js.undefined)
    
    @scala.inline
    def setTimingRange(value: Range): Self = StObject.set(x, "timingRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingRangeUndefined: Self = StObject.set(x, "timingRange", js.undefined)
    
    @scala.inline
    def setTimingTiming(value: Timing): Self = StObject.set(x, "timingTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingTimingUndefined: Self = StObject.set(x, "timingTiming", js.undefined)
    
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
    def setTransform(value: Reference): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
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
    def set_kind(value: Element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_kindUndefined: Self = StObject.set(x, "_kind", js.undefined)
    
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
    def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
    
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
