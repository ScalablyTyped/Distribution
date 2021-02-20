package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class SpecimenProcessingMutableBuilder[Self <: SpecimenProcessing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditive(value: js.Array[Reference]): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
    
    @scala.inline
    def setAdditiveVarargs(value: Reference*): Self = StObject.set(x, "additive", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setProcedure(value: CodeableConcept): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    @scala.inline
    def setTimeDateTime(value: dateTime): Self = StObject.set(x, "timeDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDateTimeUndefined: Self = StObject.set(x, "timeDateTime", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: Period): Self = StObject.set(x, "timePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "timePeriod", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_timeDateTime(value: Element): Self = StObject.set(x, "_timeDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timeDateTimeUndefined: Self = StObject.set(x, "_timeDateTime", js.undefined)
  }
}
