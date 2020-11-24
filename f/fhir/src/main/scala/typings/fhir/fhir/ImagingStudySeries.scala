package typings.fhir.fhir

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
  implicit class ImagingStudySeriesOps[Self <: ImagingStudySeries] (val x: Self) extends AnyVal {
    
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
    def setModality(value: Coding): Self = this.set("modality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: oid): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_availability(value: Element): Self = this.set("_availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_availability: Self = this.set("_availability", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_number(value: Element): Self = this.set("_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_number: Self = this.set("_number", js.undefined)
    
    @scala.inline
    def set_numberOfInstances(value: Element): Self = this.set("_numberOfInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_numberOfInstances: Self = this.set("_numberOfInstances", js.undefined)
    
    @scala.inline
    def set_started(value: Element): Self = this.set("_started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_started: Self = this.set("_started", js.undefined)
    
    @scala.inline
    def set_uid(value: Element): Self = this.set("_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_uid: Self = this.set("_uid", js.undefined)
    
    @scala.inline
    def setAvailability(value: code): Self = this.set("availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    
    @scala.inline
    def setBodySite(value: Coding): Self = this.set("bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodySite: Self = this.set("bodySite", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = this.set("endpoint", js.Array(value :_*))
    
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setInstanceVarargs(value: ImagingStudySeriesInstance*): Self = this.set("instance", js.Array(value :_*))
    
    @scala.inline
    def setInstance(value: js.Array[ImagingStudySeriesInstance]): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setLaterality(value: Coding): Self = this.set("laterality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaterality: Self = this.set("laterality", js.undefined)
    
    @scala.inline
    def setNumber(value: unsignedInt): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setNumberOfInstances(value: unsignedInt): Self = this.set("numberOfInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfInstances: Self = this.set("numberOfInstances", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: Reference*): Self = this.set("performer", js.Array(value :_*))
    
    @scala.inline
    def setPerformer(value: js.Array[Reference]): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setStarted(value: dateTime): Self = this.set("started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarted: Self = this.set("started", js.undefined)
  }
}
