package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.available
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingSelection
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _frameOfReferenceUid: js.UndefOr[Element] = js.undefined
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  var _seriesUid: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _studyUid: js.UndefOr[Element] = js.undefined
  
  /**
    * A list of the diagnostic requests that resulted in this imaging selection being performed.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings.
    */
  var bodySite: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * Classifies the imaging selection.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * *All* code-value and, if present, component.code-component.value pairs need to be taken into account to correctly understand the meaning of the observation.
    */
  var code: CodeableConcept
  
  /**
    * The imaging study from which the imaging selection is made.
    */
  var derivedFrom: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Typical endpoint types include DICOM WADO-RS, which is used to retrieve DICOM instances in native or rendered (e.g., JPG, PNG) formats using a RESTful API; DICOM WADO-URI, which can similarly retrieve native or rendered instances, except using an HTTP query-based approach.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * An imaging selection may reference a DICOM resource that itself references other DICOM resources.
    *        e.g. a presentation state references a set of source images or frames.
    */
  var focus: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * See [DICOM PS3.3 C.7.4.1](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.7.4.html).
    */
  var frameOfReferenceUid: js.UndefOr[String] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier -- see discussion under [Business Identifiers](resource.html#identifiers).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Each imaging selection includes one or more selected DICOM SOP instances.
    */
  var instance: js.UndefOr[js.Array[ImagingSelectionInstance]] = js.undefined
  
  /**
    * The date and time this imaging selection was created.
    */
  var issued: js.UndefOr[String] = js.undefined
  
  /**
    * Selector of the instances – human or machine.
    */
  var performer: js.UndefOr[js.Array[ImagingSelectionPerformer]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ImagingSelection: typings.fhir.fhirStrings.ImagingSelection
  
  /**
    * See [DICOM PS3.3 C.7.3](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.7.3.html).
    */
  var seriesNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * See [DICOM PS3.3 C.7.3](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.7.3.html).
    */
  var seriesUid: js.UndefOr[String] = js.undefined
  
  /**
    * Unknown does not represent "other" - one of the defined statuses must apply.  Unknown is used when the authoring system is not sure what the current status is.
    */
  var status: available | `entered-in-error` | unknown
  
  /**
    * See [DICOM PS3.3 C.7.2](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.7.2.html).
    */
  var studyUid: js.UndefOr[String] = js.undefined
  
  /**
    * The patient, or group of patients, location, device, organization, procedure or practitioner this imaging selection is about and into whose or what record the imaging selection is placed.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object ImagingSelection {
  
  inline def apply(code: CodeableConcept, status: available | `entered-in-error` | unknown): ImagingSelection = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "ImagingSelection", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingSelection] (val x: Self) extends AnyVal {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setBodySite(value: CodeableReference): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDerivedFrom(value: js.Array[Reference]): Self = StObject.set(x, "derivedFrom", value.asInstanceOf[js.Any])
    
    inline def setDerivedFromUndefined: Self = StObject.set(x, "derivedFrom", js.undefined)
    
    inline def setDerivedFromVarargs(value: Reference*): Self = StObject.set(x, "derivedFrom", js.Array(value*))
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setFocus(value: js.Array[Reference]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFocusVarargs(value: Reference*): Self = StObject.set(x, "focus", js.Array(value*))
    
    inline def setFrameOfReferenceUid(value: String): Self = StObject.set(x, "frameOfReferenceUid", value.asInstanceOf[js.Any])
    
    inline def setFrameOfReferenceUidUndefined: Self = StObject.set(x, "frameOfReferenceUid", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstance(value: js.Array[ImagingSelectionInstance]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setInstanceVarargs(value: ImagingSelectionInstance*): Self = StObject.set(x, "instance", js.Array(value*))
    
    inline def setIssued(value: String): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setPerformer(value: js.Array[ImagingSelectionPerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: ImagingSelectionPerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImagingSelection): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeriesNumber(value: Double): Self = StObject.set(x, "seriesNumber", value.asInstanceOf[js.Any])
    
    inline def setSeriesNumberUndefined: Self = StObject.set(x, "seriesNumber", js.undefined)
    
    inline def setSeriesUid(value: String): Self = StObject.set(x, "seriesUid", value.asInstanceOf[js.Any])
    
    inline def setSeriesUidUndefined: Self = StObject.set(x, "seriesUid", js.undefined)
    
    inline def setStatus(value: available | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStudyUid(value: String): Self = StObject.set(x, "studyUid", value.asInstanceOf[js.Any])
    
    inline def setStudyUidUndefined: Self = StObject.set(x, "studyUid", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_frameOfReferenceUid(value: Element): Self = StObject.set(x, "_frameOfReferenceUid", value.asInstanceOf[js.Any])
    
    inline def set_frameOfReferenceUidUndefined: Self = StObject.set(x, "_frameOfReferenceUid", js.undefined)
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_seriesUid(value: Element): Self = StObject.set(x, "_seriesUid", value.asInstanceOf[js.Any])
    
    inline def set_seriesUidUndefined: Self = StObject.set(x, "_seriesUid", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_studyUid(value: Element): Self = StObject.set(x, "_studyUid", value.asInstanceOf[js.Any])
    
    inline def set_studyUidUndefined: Self = StObject.set(x, "_studyUid", js.undefined)
  }
}
