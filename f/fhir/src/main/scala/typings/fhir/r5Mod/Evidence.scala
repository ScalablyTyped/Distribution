package typings.fhir.r5Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Evidence
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _approvalDate: js.UndefOr[Element] = js.undefined
  
  var _assertion: js.UndefOr[Element] = js.undefined
  
  var _citeAsMarkdown: js.UndefOr[Element] = js.undefined
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _copyrightLabel: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _lastReviewDate: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  var _versionAlgorithmString: js.UndefOr[Element] = js.undefined
  
  /**
    * The 'date' element may be more recent than the approval date because of minor changes or editorial corrections.
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var approvalDate: js.UndefOr[String] = js.undefined
  
  /**
    * Declarative description of the Evidence.
    */
  var assertion: js.UndefOr[String] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
    */
  var author: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Assessment of certainty, confidence in the estimates, or quality of the evidence.
    */
  var certainty: js.UndefOr[js.Array[EvidenceCertainty]] = js.undefined
  
  /**
    * Citation Resource or display of suggested citation for this evidence.
    */
  var citeAsMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * Citation Resource or display of suggested citation for this evidence.
    */
  var citeAsReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * The short copyright declaration (e.g. (c) '2015+ xyz organization' should be sent in the copyrightLabel element.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The (c) symbol should NOT be included in this string. It will be added by software when rendering the notation. Full details about licensing, restrictions, warrantees, etc. goes in the more general 'copyright' element.
    */
  var copyrightLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The date is often not tracked until the resource is published, but may be present on draft content. Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the summary. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * This description can be used to capture details such as comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the evidence as conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the information is available from context (e.g. the language of the evidence is presumed to be the predominant language in the place the evidence was created).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
    */
  var editor: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var endorser: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * A Boolean value to indicate that this resource is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data type, and can then identify this summary outside of FHIR, where it is not possible to use the logical URI.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * If specified, this date follows the original approval date.
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var lastReviewDate: js.UndefOr[String] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Footnotes and/or explanatory notes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Usually an organization but may be an individual. The publisher (or steward) of the evidence is the organization or individual primarily responsible for the maintenance and upkeep of the evidence. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the evidence. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * This element does not describe the usage of the Evidence. Instead, it provides traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to point to source materials or specifications that drove the structure of this Evidence.
    */
  var purpose: js.UndefOr[String] = js.undefined
  
  /**
    * Link or citation to artifact associated with the summary.
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Evidence: typings.fhir.fhirStrings.Evidence
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var reviewer: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Values and parameters for a single statistic.
    */
  var statistic: js.UndefOr[js.Array[EvidenceStatistic]] = js.undefined
  
  /**
    * Allows filtering of summarys s that are appropriate for use versus not.
    * See guidance around (not) making local changes to elements [here](canonicalresource.html#localization).
    */
  var status: draft | active | retired | unknown
  
  /**
    * The design of the study that produced this evidence. The design is described with any number of study design characteristics.
    */
  var studyDesign: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The method to combine studies.
    */
  var synthesisType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A short, descriptive, user-friendly title for the summary.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * In some cases, the resource can no longer be found at the stated url, but the url itself cannot change. Implementations can use the meta.source element to indicate where the current master source of the resource can be found.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple useContexts are specified, there is no expectation that all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * Evidence variable such as population, exposure, or outcome.
    */
  var variableDefinition: js.Array[EvidenceVariableDefinition]
  
  /**
    * The determination of when to create a new version of a resource (same url, new version) vs. defining a new artifact is up to the author. Considerations for making this decision are found in Technical and Business Versions.
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * If set as a string, this is a FHIRPath expression that has two additional context variables passed in - %version1 and %version2 and will return a negative number if version1 is newer, a positive number if version2 is newer, and a 0 if the version ordering can't successfully be determined.
    */
  var versionAlgorithmCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * If set as a string, this is a FHIRPath expression that has two additional context variables passed in - %version1 and %version2 and will return a negative number if version1 is newer, a positive number if version2 is newer, and a 0 if the version ordering can't successfully be determined.
    */
  var versionAlgorithmString: js.UndefOr[String] = js.undefined
}
object Evidence {
  
  inline def apply(
    status: draft | active | retired | unknown,
    variableDefinition: js.Array[EvidenceVariableDefinition]
  ): Evidence = {
    val __obj = js.Dynamic.literal(resourceType = "Evidence", status = status.asInstanceOf[js.Any], variableDefinition = variableDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Evidence] (val x: Self) extends AnyVal {
    
    inline def setApprovalDate(value: String): Self = StObject.set(x, "approvalDate", value.asInstanceOf[js.Any])
    
    inline def setApprovalDateUndefined: Self = StObject.set(x, "approvalDate", js.undefined)
    
    inline def setAssertion(value: String): Self = StObject.set(x, "assertion", value.asInstanceOf[js.Any])
    
    inline def setAssertionUndefined: Self = StObject.set(x, "assertion", js.undefined)
    
    inline def setAuthor(value: js.Array[ContactDetail]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: ContactDetail*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setCertainty(value: js.Array[EvidenceCertainty]): Self = StObject.set(x, "certainty", value.asInstanceOf[js.Any])
    
    inline def setCertaintyUndefined: Self = StObject.set(x, "certainty", js.undefined)
    
    inline def setCertaintyVarargs(value: EvidenceCertainty*): Self = StObject.set(x, "certainty", js.Array(value*))
    
    inline def setCiteAsMarkdown(value: String): Self = StObject.set(x, "citeAsMarkdown", value.asInstanceOf[js.Any])
    
    inline def setCiteAsMarkdownUndefined: Self = StObject.set(x, "citeAsMarkdown", js.undefined)
    
    inline def setCiteAsReference(value: Reference): Self = StObject.set(x, "citeAsReference", value.asInstanceOf[js.Any])
    
    inline def setCiteAsReferenceUndefined: Self = StObject.set(x, "citeAsReference", js.undefined)
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightLabel(value: String): Self = StObject.set(x, "copyrightLabel", value.asInstanceOf[js.Any])
    
    inline def setCopyrightLabelUndefined: Self = StObject.set(x, "copyrightLabel", js.undefined)
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEditor(value: js.Array[ContactDetail]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setEditorVarargs(value: ContactDetail*): Self = StObject.set(x, "editor", js.Array(value*))
    
    inline def setEndorser(value: js.Array[ContactDetail]): Self = StObject.set(x, "endorser", value.asInstanceOf[js.Any])
    
    inline def setEndorserUndefined: Self = StObject.set(x, "endorser", js.undefined)
    
    inline def setEndorserVarargs(value: ContactDetail*): Self = StObject.set(x, "endorser", js.Array(value*))
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLastReviewDate(value: String): Self = StObject.set(x, "lastReviewDate", value.asInstanceOf[js.Any])
    
    inline def setLastReviewDateUndefined: Self = StObject.set(x, "lastReviewDate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    inline def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Evidence): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setReviewer(value: js.Array[ContactDetail]): Self = StObject.set(x, "reviewer", value.asInstanceOf[js.Any])
    
    inline def setReviewerUndefined: Self = StObject.set(x, "reviewer", js.undefined)
    
    inline def setReviewerVarargs(value: ContactDetail*): Self = StObject.set(x, "reviewer", js.Array(value*))
    
    inline def setStatistic(value: js.Array[EvidenceStatistic]): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
    
    inline def setStatisticVarargs(value: EvidenceStatistic*): Self = StObject.set(x, "statistic", js.Array(value*))
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStudyDesign(value: js.Array[CodeableConcept]): Self = StObject.set(x, "studyDesign", value.asInstanceOf[js.Any])
    
    inline def setStudyDesignUndefined: Self = StObject.set(x, "studyDesign", js.undefined)
    
    inline def setStudyDesignVarargs(value: CodeableConcept*): Self = StObject.set(x, "studyDesign", js.Array(value*))
    
    inline def setSynthesisType(value: CodeableConcept): Self = StObject.set(x, "synthesisType", value.asInstanceOf[js.Any])
    
    inline def setSynthesisTypeUndefined: Self = StObject.set(x, "synthesisType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVariableDefinition(value: js.Array[EvidenceVariableDefinition]): Self = StObject.set(x, "variableDefinition", value.asInstanceOf[js.Any])
    
    inline def setVariableDefinitionVarargs(value: EvidenceVariableDefinition*): Self = StObject.set(x, "variableDefinition", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionAlgorithmCoding(value: Coding): Self = StObject.set(x, "versionAlgorithmCoding", value.asInstanceOf[js.Any])
    
    inline def setVersionAlgorithmCodingUndefined: Self = StObject.set(x, "versionAlgorithmCoding", js.undefined)
    
    inline def setVersionAlgorithmString(value: String): Self = StObject.set(x, "versionAlgorithmString", value.asInstanceOf[js.Any])
    
    inline def setVersionAlgorithmStringUndefined: Self = StObject.set(x, "versionAlgorithmString", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_approvalDate(value: Element): Self = StObject.set(x, "_approvalDate", value.asInstanceOf[js.Any])
    
    inline def set_approvalDateUndefined: Self = StObject.set(x, "_approvalDate", js.undefined)
    
    inline def set_assertion(value: Element): Self = StObject.set(x, "_assertion", value.asInstanceOf[js.Any])
    
    inline def set_assertionUndefined: Self = StObject.set(x, "_assertion", js.undefined)
    
    inline def set_citeAsMarkdown(value: Element): Self = StObject.set(x, "_citeAsMarkdown", value.asInstanceOf[js.Any])
    
    inline def set_citeAsMarkdownUndefined: Self = StObject.set(x, "_citeAsMarkdown", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightLabel(value: Element): Self = StObject.set(x, "_copyrightLabel", value.asInstanceOf[js.Any])
    
    inline def set_copyrightLabelUndefined: Self = StObject.set(x, "_copyrightLabel", js.undefined)
    
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
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionAlgorithmString(value: Element): Self = StObject.set(x, "_versionAlgorithmString", value.asInstanceOf[js.Any])
    
    inline def set_versionAlgorithmStringUndefined: Self = StObject.set(x, "_versionAlgorithmString", js.undefined)
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
