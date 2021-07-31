package typings.devexpressWeb

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the information about an axis value.
  */
trait ASPxClientAxisValue extends StObject {
  
  /**
    * Gets the axis value, if the axis scale type is date-time.
    */
  var dateTimeValue: Date
  
  /**
    * Gets the axis value, if the axis scale type is numerical.
    */
  var numericalValue: Double
  
  /**
    * Gets the axis value, if the axis scale type is qualitative.
    */
  var qualitativeValue: String
  
  /**
    * Gets the axis scale type.
    */
  var scaleType: String
  
  var timeSpanValue: js.Any
}
object ASPxClientAxisValue {
  
  @scala.inline
  def apply(
    dateTimeValue: Date,
    numericalValue: Double,
    qualitativeValue: String,
    scaleType: String,
    timeSpanValue: js.Any
  ): ASPxClientAxisValue = {
    val __obj = js.Dynamic.literal(dateTimeValue = dateTimeValue.asInstanceOf[js.Any], numericalValue = numericalValue.asInstanceOf[js.Any], qualitativeValue = qualitativeValue.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any], timeSpanValue = timeSpanValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisValue]
  }
  
  @scala.inline
  implicit class ASPxClientAxisValueMutableBuilder[Self <: ASPxClientAxisValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateTimeValue(value: Date): Self = StObject.set(x, "dateTimeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericalValue(value: Double): Self = StObject.set(x, "numericalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualitativeValue(value: String): Self = StObject.set(x, "qualitativeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleType(value: String): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSpanValue(value: js.Any): Self = StObject.set(x, "timeSpanValue", value.asInstanceOf[js.Any])
  }
}
