package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Processing and processing step details
  */
@js.native
trait SpecimenProcessing extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'timeDateTime'.
    */
  var _timeDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Material used in the processing step
    */
  var additive: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Textual description of procedure
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Indicates the treatment step  applied to the specimen
    */
  var procedure: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Date and time of specimen processing
    */
  var timeDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Date and time of specimen processing
    */
  var timePeriod: js.UndefOr[Period] = js.native
}
object SpecimenProcessing {
  
  @scala.inline
  def apply(): SpecimenProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenProcessing]
  }
  
  @scala.inline
  implicit class SpecimenProcessingOps[Self <: SpecimenProcessing] (val x: Self) extends AnyVal {
    
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
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_timeDateTime(value: Element): Self = this.set("_timeDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_timeDateTime: Self = this.set("_timeDateTime", js.undefined)
    
    @scala.inline
    def setAdditiveVarargs(value: Reference*): Self = this.set("additive", js.Array(value :_*))
    
    @scala.inline
    def setAdditive(value: js.Array[Reference]): Self = this.set("additive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditive: Self = this.set("additive", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setProcedure(value: CodeableConcept): Self = this.set("procedure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcedure: Self = this.set("procedure", js.undefined)
    
    @scala.inline
    def setTimeDateTime(value: dateTime): Self = this.set("timeDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeDateTime: Self = this.set("timeDateTime", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: Period): Self = this.set("timePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePeriod: Self = this.set("timePeriod", js.undefined)
  }
}
