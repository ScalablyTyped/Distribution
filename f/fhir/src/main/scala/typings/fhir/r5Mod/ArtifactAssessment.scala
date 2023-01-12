package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`not-persuasive-with-modification`
import typings.fhir.fhirStrings.`not-persuasive`
import typings.fhir.fhirStrings.`persuasive-with-modification`
import typings.fhir.fhirStrings.`resolved-change-required`
import typings.fhir.fhirStrings.`resolved-no-change`
import typings.fhir.fhirStrings.`waiting-for-input`
import typings.fhir.fhirStrings.applied
import typings.fhir.fhirStrings.deferred
import typings.fhir.fhirStrings.duplicate
import typings.fhir.fhirStrings.persuasive
import typings.fhir.fhirStrings.published
import typings.fhir.fhirStrings.submitted
import typings.fhir.fhirStrings.triaged
import typings.fhir.fhirStrings.unresolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactAssessment
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _approvalDate: js.UndefOr[Element] = js.undefined
  
  var _artifactCanonical: js.UndefOr[Element] = js.undefined
  
  var _artifactUri: js.UndefOr[Element] = js.undefined
  
  var _citeAsMarkdown: js.UndefOr[Element] = js.undefined
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _disposition: js.UndefOr[Element] = js.undefined
  
  var _lastReviewDate: js.UndefOr[Element] = js.undefined
  
  var _workflowStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * The 'date' element may be more recent than the approval date because of minor changes or editorial corrections.
    */
  var approvalDate: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to a resource, canonical resource, or non-FHIR resource which the comment or assessment is about.
    */
  var artifactCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to a resource, canonical resource, or non-FHIR resource which the comment or assessment is about.
    */
  var artifactReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A reference to a resource, canonical resource, or non-FHIR resource which the comment or assessment is about.
    */
  var artifactUri: js.UndefOr[String] = js.undefined
  
  /**
    * Display of or reference to the bibliographic citation of the comment, classifier, or rating.
    */
  var citeAsMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * Display of or reference to the bibliographic citation of the comment, classifier, or rating.
    */
  var citeAsReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A component comment, classifier, or rating of the artifact.
    */
  var content: js.UndefOr[js.Array[ArtifactAssessmentContent]] = js.undefined
  
  /**
    * A copyright statement relating to the artifact assessment and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the artifact assessment.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the artifact assessment. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the disposition of the responsible party to the comment or change request.
    */
  var disposition: js.UndefOr[
    unresolved | `not-persuasive` | persuasive | `persuasive-with-modification` | `not-persuasive-with-modification`
  ] = js.undefined
  
  /**
    * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data type, and can then identify this activity definition outside of FHIR, where it is not possible to use the logical URI.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * If specified, this date follows the original approval date.
    */
  var lastReviewDate: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ArtifactAssessment: typings.fhir.fhirStrings.ArtifactAssessment
  
  /**
    * Indicates the workflow status of the comment or change request.
    */
  var workflowStatus: js.UndefOr[
    submitted | triaged | `waiting-for-input` | `resolved-no-change` | `resolved-change-required` | deferred | duplicate | applied | published
  ] = js.undefined
}
object ArtifactAssessment {
  
  inline def apply(): ArtifactAssessment = {
    val __obj = js.Dynamic.literal(resourceType = "ArtifactAssessment")
    __obj.asInstanceOf[ArtifactAssessment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactAssessment] (val x: Self) extends AnyVal {
    
    inline def setApprovalDate(value: String): Self = StObject.set(x, "approvalDate", value.asInstanceOf[js.Any])
    
    inline def setApprovalDateUndefined: Self = StObject.set(x, "approvalDate", js.undefined)
    
    inline def setArtifactCanonical(value: String): Self = StObject.set(x, "artifactCanonical", value.asInstanceOf[js.Any])
    
    inline def setArtifactCanonicalUndefined: Self = StObject.set(x, "artifactCanonical", js.undefined)
    
    inline def setArtifactReference(value: Reference): Self = StObject.set(x, "artifactReference", value.asInstanceOf[js.Any])
    
    inline def setArtifactReferenceUndefined: Self = StObject.set(x, "artifactReference", js.undefined)
    
    inline def setArtifactUri(value: String): Self = StObject.set(x, "artifactUri", value.asInstanceOf[js.Any])
    
    inline def setArtifactUriUndefined: Self = StObject.set(x, "artifactUri", js.undefined)
    
    inline def setCiteAsMarkdown(value: String): Self = StObject.set(x, "citeAsMarkdown", value.asInstanceOf[js.Any])
    
    inline def setCiteAsMarkdownUndefined: Self = StObject.set(x, "citeAsMarkdown", js.undefined)
    
    inline def setCiteAsReference(value: Reference): Self = StObject.set(x, "citeAsReference", value.asInstanceOf[js.Any])
    
    inline def setCiteAsReferenceUndefined: Self = StObject.set(x, "citeAsReference", js.undefined)
    
    inline def setContent(value: js.Array[ArtifactAssessmentContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: ArtifactAssessmentContent*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDisposition(
      value: unresolved | `not-persuasive` | persuasive | `persuasive-with-modification` | `not-persuasive-with-modification`
    ): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLastReviewDate(value: String): Self = StObject.set(x, "lastReviewDate", value.asInstanceOf[js.Any])
    
    inline def setLastReviewDateUndefined: Self = StObject.set(x, "lastReviewDate", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ArtifactAssessment): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStatus(
      value: submitted | triaged | `waiting-for-input` | `resolved-no-change` | `resolved-change-required` | deferred | duplicate | applied | published
    ): Self = StObject.set(x, "workflowStatus", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStatusUndefined: Self = StObject.set(x, "workflowStatus", js.undefined)
    
    inline def set_approvalDate(value: Element): Self = StObject.set(x, "_approvalDate", value.asInstanceOf[js.Any])
    
    inline def set_approvalDateUndefined: Self = StObject.set(x, "_approvalDate", js.undefined)
    
    inline def set_artifactCanonical(value: Element): Self = StObject.set(x, "_artifactCanonical", value.asInstanceOf[js.Any])
    
    inline def set_artifactCanonicalUndefined: Self = StObject.set(x, "_artifactCanonical", js.undefined)
    
    inline def set_artifactUri(value: Element): Self = StObject.set(x, "_artifactUri", value.asInstanceOf[js.Any])
    
    inline def set_artifactUriUndefined: Self = StObject.set(x, "_artifactUri", js.undefined)
    
    inline def set_citeAsMarkdown(value: Element): Self = StObject.set(x, "_citeAsMarkdown", value.asInstanceOf[js.Any])
    
    inline def set_citeAsMarkdownUndefined: Self = StObject.set(x, "_citeAsMarkdown", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_lastReviewDate(value: Element): Self = StObject.set(x, "_lastReviewDate", value.asInstanceOf[js.Any])
    
    inline def set_lastReviewDateUndefined: Self = StObject.set(x, "_lastReviewDate", js.undefined)
    
    inline def set_workflowStatus(value: Element): Self = StObject.set(x, "_workflowStatus", value.asInstanceOf[js.Any])
    
    inline def set_workflowStatusUndefined: Self = StObject.set(x, "_workflowStatus", js.undefined)
  }
}
