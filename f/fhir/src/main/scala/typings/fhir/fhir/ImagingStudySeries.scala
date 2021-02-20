package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each study has one or more series of instances
  */
@js.native
trait ImagingStudySeries extends BackboneElement {
  
  /**
    * Contains extended information for property 'availability'.
    */
  var _availability: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'number'.
    */
  var _number: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'numberOfInstances'.
    */
  var _numberOfInstances: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'started'.
    */
  var _started: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  
  /**
    * ONLINE | OFFLINE | NEARLINE | UNAVAILABLE
    */
  var availability: js.UndefOr[code] = js.native
  
  /**
    * Body part examined
    */
  var bodySite: js.UndefOr[Coding] = js.native
  
  /**
    * A short human readable summary of the series
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Series access endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * A single SOP instance from the series
    */
  var instance: js.UndefOr[js.Array[ImagingStudySeriesInstance]] = js.native
  
  /**
    * Body part laterality
    */
  var laterality: js.UndefOr[Coding] = js.native
  
  /**
    * The modality of the instances in the series
    */
  var modality: Coding = js.native
  
  /**
    * Numeric identifier of this series
    */
  var number: js.UndefOr[unsignedInt] = js.native
  
  /**
    * Number of Series Related Instances
    */
  var numberOfInstances: js.UndefOr[unsignedInt] = js.native
  
  /**
    * Who performed the series
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * When the series started
    */
  var started: js.UndefOr[dateTime] = js.native
  
  /**
    * Formal DICOM identifier for this series
    */
  var uid: oid = js.native
}
object ImagingStudySeries {
  
  @scala.inline
  def apply(modality: Coding, uid: oid): ImagingStudySeries = {
    val __obj = js.Dynamic.literal(modality = modality.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudySeries]
  }
  
  @scala.inline
  implicit class ImagingStudySeriesMutableBuilder[Self <: ImagingStudySeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailability(value: code): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    @scala.inline
    def setBodySite(value: Coding): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    @scala.inline
    def setInstance(value: js.Array[ImagingStudySeriesInstance]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setInstanceVarargs(value: ImagingStudySeriesInstance*): Self = StObject.set(x, "instance", js.Array(value :_*))
    
    @scala.inline
    def setLaterality(value: Coding): Self = StObject.set(x, "laterality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLateralityUndefined: Self = StObject.set(x, "laterality", js.undefined)
    
    @scala.inline
    def setModality(value: Coding): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: unsignedInt): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfInstances(value: unsignedInt): Self = StObject.set(x, "numberOfInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfInstancesUndefined: Self = StObject.set(x, "numberOfInstances", js.undefined)
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setPerformer(value: js.Array[Reference]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: Reference*): Self = StObject.set(x, "performer", js.Array(value :_*))
    
    @scala.inline
    def setStarted(value: dateTime): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    @scala.inline
    def setUid(value: oid): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_availability(value: Element): Self = StObject.set(x, "_availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_availabilityUndefined: Self = StObject.set(x, "_availability", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_number(value: Element): Self = StObject.set(x, "_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_numberOfInstances(value: Element): Self = StObject.set(x, "_numberOfInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_numberOfInstancesUndefined: Self = StObject.set(x, "_numberOfInstances", js.undefined)
    
    @scala.inline
    def set_numberUndefined: Self = StObject.set(x, "_number", js.undefined)
    
    @scala.inline
    def set_started(value: Element): Self = StObject.set(x, "_started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_startedUndefined: Self = StObject.set(x, "_started", js.undefined)
    
    @scala.inline
    def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
