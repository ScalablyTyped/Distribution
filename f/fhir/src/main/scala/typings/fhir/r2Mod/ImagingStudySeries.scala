package typings.fhir.r2Mod

import typings.fhir.fhirStrings.NEARLINE
import typings.fhir.fhirStrings.OFFLINE
import typings.fhir.fhirStrings.ONLINE
import typings.fhir.fhirStrings.UNAVAILABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingStudySeries
  extends StObject
     with BackboneElement {
  
  var _availability: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _started: js.UndefOr[Element] = js.undefined
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Availability of series (online, offline or nearline).
    */
  var availability: js.UndefOr[ONLINE | OFFLINE | NEARLINE | UNAVAILABLE] = js.undefined
  
  /**
    * Body part examined. See  DICOM Part 16 Annex L for the mapping from DICOM to Snomed CT.
    */
  var bodySite: js.UndefOr[Coding] = js.undefined
  
  /**
    * A description of the series.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A single SOP Instance within the series, e.g. an image, or presentation state.
    */
  var instance: js.UndefOr[js.Array[ImagingStudySeriesInstance]] = js.undefined
  
  /**
    * Laterality if body site is paired anatomic structure and laterality is not pre-coordinated in body site code.
    */
  var laterality: js.UndefOr[Coding] = js.undefined
  
  /**
    * The modality of this series sequence.
    */
  var modality: Coding
  
  /**
    * The Numeric identifier of this series in the study.
    */
  var number: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of SOP Instances in Series.
    */
  var numberOfInstances: Double
  
  /**
    * The date and time the series was started.
    */
  var started: js.UndefOr[String] = js.undefined
  
  /**
    * Formal identifier for this series.
    */
  var uid: String
  
  /**
    * URI/URL specifying the location of the referenced series using WADO-RS.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ImagingStudySeries {
  
  inline def apply(modality: Coding, numberOfInstances: Double, uid: String): ImagingStudySeries = {
    val __obj = js.Dynamic.literal(modality = modality.asInstanceOf[js.Any], numberOfInstances = numberOfInstances.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudySeries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingStudySeries] (val x: Self) extends AnyVal {
    
    inline def setAvailability(value: ONLINE | OFFLINE | NEARLINE | UNAVAILABLE): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setBodySite(value: Coding): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInstance(value: js.Array[ImagingStudySeriesInstance]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setInstanceVarargs(value: ImagingStudySeriesInstance*): Self = StObject.set(x, "instance", js.Array(value*))
    
    inline def setLaterality(value: Coding): Self = StObject.set(x, "laterality", value.asInstanceOf[js.Any])
    
    inline def setLateralityUndefined: Self = StObject.set(x, "laterality", js.undefined)
    
    inline def setModality(value: Coding): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInstances(value: Double): Self = StObject.set(x, "numberOfInstances", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_availability(value: Element): Self = StObject.set(x, "_availability", value.asInstanceOf[js.Any])
    
    inline def set_availabilityUndefined: Self = StObject.set(x, "_availability", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_started(value: Element): Self = StObject.set(x, "_started", value.asInstanceOf[js.Any])
    
    inline def set_startedUndefined: Self = StObject.set(x, "_started", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
