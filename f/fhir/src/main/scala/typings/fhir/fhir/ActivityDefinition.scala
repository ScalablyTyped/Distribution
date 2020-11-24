package typings.fhir.fhir

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
  implicit class ActivityDefinitionOps[Self <: ActivityDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_approvalDate(value: Element): Self = this.set("_approvalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_approvalDate: Self = this.set("_approvalDate", js.undefined)
    
    @scala.inline
    def set_copyright(value: Element): Self = this.set("_copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_copyright: Self = this.set("_copyright", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = this.set("_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_experimental: Self = this.set("_experimental", js.undefined)
    
    @scala.inline
    def set_kind(value: Element): Self = this.set("_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_kind: Self = this.set("_kind", js.undefined)
    
    @scala.inline
    def set_lastReviewDate(value: Element): Self = this.set("_lastReviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_lastReviewDate: Self = this.set("_lastReviewDate", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_publisher(value: Element): Self = this.set("_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_publisher: Self = this.set("_publisher", js.undefined)
    
    @scala.inline
    def set_purpose(value: Element): Self = this.set("_purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_purpose: Self = this.set("_purpose", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_timingDateTime(value: Element): Self = this.set("_timingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_timingDateTime: Self = this.set("_timingDateTime", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    
    @scala.inline
    def set_usage(value: Element): Self = this.set("_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_usage: Self = this.set("_usage", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def setApprovalDate(value: date): Self = this.set("approvalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovalDate: Self = this.set("approvalDate", js.undefined)
    
    @scala.inline
    def setBodySiteVarargs(value: CodeableConcept*): Self = this.set("bodySite", js.Array(value :_*))
    
    @scala.inline
    def setBodySite(value: js.Array[CodeableConcept]): Self = this.set("bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodySite: Self = this.set("bodySite", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setContributorVarargs(value: Contributor*): Self = this.set("contributor", js.Array(value :_*))
    
    @scala.inline
    def setContributor(value: js.Array[Contributor]): Self = this.set("contributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributor: Self = this.set("contributor", js.undefined)
    
    @scala.inline
    def setCopyright(value: markdown): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDosageVarargs(value: Dosage*): Self = this.set("dosage", js.Array(value :_*))
    
    @scala.inline
    def setDosage(value: js.Array[Dosage]): Self = this.set("dosage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDosage: Self = this.set("dosage", js.undefined)
    
    @scala.inline
    def setDynamicValueVarargs(value: ActivityDefinitionDynamicValue*): Self = this.set("dynamicValue", js.Array(value :_*))
    
    @scala.inline
    def setDynamicValue(value: js.Array[ActivityDefinitionDynamicValue]): Self = this.set("dynamicValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicValue: Self = this.set("dynamicValue", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = this.set("effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectivePeriod: Self = this.set("effectivePeriod", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    
    @scala.inline
    def setKind(value: code): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastReviewDate(value: date): Self = this.set("lastReviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastReviewDate: Self = this.set("lastReviewDate", js.undefined)
    
    @scala.inline
    def setLibraryVarargs(value: Reference*): Self = this.set("library", js.Array(value :_*))
    
    @scala.inline
    def setLibrary(value: js.Array[Reference]): Self = this.set("library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibrary: Self = this.set("library", js.undefined)
    
    @scala.inline
    def setLocation(value: Reference): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParticipantVarargs(value: ActivityDefinitionParticipant*): Self = this.set("participant", js.Array(value :_*))
    
    @scala.inline
    def setParticipant(value: js.Array[ActivityDefinitionParticipant]): Self = this.set("participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipant: Self = this.set("participant", js.undefined)
    
    @scala.inline
    def setProductCodeableConcept(value: CodeableConcept): Self = this.set("productCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCodeableConcept: Self = this.set("productCodeableConcept", js.undefined)
    
    @scala.inline
    def setProductReference(value: Reference): Self = this.set("productReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductReference: Self = this.set("productReference", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = this.set("purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = this.set("relatedArtifact", js.Array(value :_*))
    
    @scala.inline
    def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = this.set("relatedArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedArtifact: Self = this.set("relatedArtifact", js.undefined)
    
    @scala.inline
    def setTimingDateTime(value: dateTime): Self = this.set("timingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingDateTime: Self = this.set("timingDateTime", js.undefined)
    
    @scala.inline
    def setTimingPeriod(value: Period): Self = this.set("timingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingPeriod: Self = this.set("timingPeriod", js.undefined)
    
    @scala.inline
    def setTimingRange(value: Range): Self = this.set("timingRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingRange: Self = this.set("timingRange", js.undefined)
    
    @scala.inline
    def setTimingTiming(value: Timing): Self = this.set("timingTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingTiming: Self = this.set("timingTiming", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTopicVarargs(value: CodeableConcept*): Self = this.set("topic", js.Array(value :_*))
    
    @scala.inline
    def setTopic(value: js.Array[CodeableConcept]): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    
    @scala.inline
    def setTransform(value: Reference): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = this.set("useContext", js.Array(value :_*))
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = this.set("useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseContext: Self = this.set("useContext", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
