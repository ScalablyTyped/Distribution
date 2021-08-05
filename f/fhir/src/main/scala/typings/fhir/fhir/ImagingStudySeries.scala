package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each study has one or more series of instances
  */
trait ImagingStudySeries
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'availability'.
    */
  var _availability: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'number'.
    */
  var _number: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'numberOfInstances'.
    */
  var _numberOfInstances: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'started'.
    */
  var _started: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * ONLINE | OFFLINE | NEARLINE | UNAVAILABLE
    */
  var availability: js.UndefOr[code] = js.undefined
  
  /**
    * Body part examined
    */
  var bodySite: js.UndefOr[Coding] = js.undefined
  
  /**
    * A short human readable summary of the series
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Series access endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A single SOP instance from the series
    */
  var instance: js.UndefOr[js.Array[ImagingStudySeriesInstance]] = js.undefined
  
  /**
    * Body part laterality
    */
  var laterality: js.UndefOr[Coding] = js.undefined
  
  /**
    * The modality of the instances in the series
    */
  var modality: Coding
  
  /**
    * Numeric identifier of this series
    */
  var number: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * Number of Series Related Instances
    */
  var numberOfInstances: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * Who performed the series
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * When the series started
    */
  var started: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Formal DICOM identifier for this series
    */
  var uid: oid
}
object ImagingStudySeries {
  
  inline def apply(modality: Coding, uid: oid): ImagingStudySeries = {
    val __obj = js.Dynamic.literal(modality = modality.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudySeries]
  }
  
  extension [Self <: ImagingStudySeries](x: Self) {
    
    inline def setAvailability(value: code): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setBodySite(value: Coding): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    inline def setInstance(value: js.Array[ImagingStudySeriesInstance]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setInstanceVarargs(value: ImagingStudySeriesInstance*): Self = StObject.set(x, "instance", js.Array(value :_*))
    
    inline def setLaterality(value: Coding): Self = StObject.set(x, "laterality", value.asInstanceOf[js.Any])
    
    inline def setLateralityUndefined: Self = StObject.set(x, "laterality", js.undefined)
    
    inline def setModality(value: Coding): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: unsignedInt): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInstances(value: unsignedInt): Self = StObject.set(x, "numberOfInstances", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInstancesUndefined: Self = StObject.set(x, "numberOfInstances", js.undefined)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPerformer(value: js.Array[Reference]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: Reference*): Self = StObject.set(x, "performer", js.Array(value :_*))
    
    inline def setStarted(value: dateTime): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    inline def setUid(value: oid): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_availability(value: Element): Self = StObject.set(x, "_availability", value.asInstanceOf[js.Any])
    
    inline def set_availabilityUndefined: Self = StObject.set(x, "_availability", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_number(value: Element): Self = StObject.set(x, "_number", value.asInstanceOf[js.Any])
    
    inline def set_numberOfInstances(value: Element): Self = StObject.set(x, "_numberOfInstances", value.asInstanceOf[js.Any])
    
    inline def set_numberOfInstancesUndefined: Self = StObject.set(x, "_numberOfInstances", js.undefined)
    
    inline def set_numberUndefined: Self = StObject.set(x, "_number", js.undefined)
    
    inline def set_started(value: Element): Self = StObject.set(x, "_started", value.asInstanceOf[js.Any])
    
    inline def set_startedUndefined: Self = StObject.set(x, "_started", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
