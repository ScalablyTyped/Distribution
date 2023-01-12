package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the DiagramCoordinates class.
  */
trait ASPxClientDiagramCoordinates extends StObject {
  
  /**
    * Gets the value of the client-side axis instance. An ASPxClientAxisValue object that contains the information about the axis scale type and value.
    * @param axis An ASPxClientAxisBase class descendant, representing the axis that contains the requested value.
    */
  def GetAxisValue(axis: ASPxClientAxisBase): ASPxClientAxisValue
  
  /**
    * Checks whether the current object represents a point outside the diagram area.
    */
  def IsEmpty(): Boolean
  
  /**
    * Gets the type of the argument scale.
    */
  var argumentScaleType: String
  
  /**
    * Gets the X-axis of the diagram point.
    */
  var axisX: ASPxClientAxisBase
  
  /**
    * Gets the Y-axis of the diagram point.
    */
  var axisY: ASPxClientAxisBase
  
  /**
    * Gets the date-time representation of the data point's argument.
    */
  var dateTimeArgument: js.Date
  
  /**
    * Gets the date-time representation of the data point's value.
    */
  var dateTimeValue: js.Date
  
  /**
    * Gets the numerical representation of the data point's argument.
    */
  var numericalArgument: Double
  
  /**
    * Gets the numerical representation of the data point's value.
    */
  var numericalValue: Double
  
  /**
    * Gets the pane of the diagram point.
    */
  var pane: ASPxClientXYDiagramPane
  
  /**
    * Gets the argument of the data point as a text string.
    */
  var qualitativeArgument: String
  
  var timeSpanArgument: Any
  
  var timeSpanValue: Any
  
  /**
    * Gets the type of the value scale.
    */
  var valueScaleType: String
}
object ASPxClientDiagramCoordinates {
  
  inline def apply(
    GetAxisValue: ASPxClientAxisBase => ASPxClientAxisValue,
    IsEmpty: () => Boolean,
    argumentScaleType: String,
    axisX: ASPxClientAxisBase,
    axisY: ASPxClientAxisBase,
    dateTimeArgument: js.Date,
    dateTimeValue: js.Date,
    numericalArgument: Double,
    numericalValue: Double,
    pane: ASPxClientXYDiagramPane,
    qualitativeArgument: String,
    timeSpanArgument: Any,
    timeSpanValue: Any,
    valueScaleType: String
  ): ASPxClientDiagramCoordinates = {
    val __obj = js.Dynamic.literal(GetAxisValue = js.Any.fromFunction1(GetAxisValue), IsEmpty = js.Any.fromFunction0(IsEmpty), argumentScaleType = argumentScaleType.asInstanceOf[js.Any], axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], dateTimeArgument = dateTimeArgument.asInstanceOf[js.Any], dateTimeValue = dateTimeValue.asInstanceOf[js.Any], numericalArgument = numericalArgument.asInstanceOf[js.Any], numericalValue = numericalValue.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], qualitativeArgument = qualitativeArgument.asInstanceOf[js.Any], timeSpanArgument = timeSpanArgument.asInstanceOf[js.Any], timeSpanValue = timeSpanValue.asInstanceOf[js.Any], valueScaleType = valueScaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDiagramCoordinates] (val x: Self) extends AnyVal {
    
    inline def setArgumentScaleType(value: String): Self = StObject.set(x, "argumentScaleType", value.asInstanceOf[js.Any])
    
    inline def setAxisX(value: ASPxClientAxisBase): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    inline def setAxisY(value: ASPxClientAxisBase): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    inline def setDateTimeArgument(value: js.Date): Self = StObject.set(x, "dateTimeArgument", value.asInstanceOf[js.Any])
    
    inline def setDateTimeValue(value: js.Date): Self = StObject.set(x, "dateTimeValue", value.asInstanceOf[js.Any])
    
    inline def setGetAxisValue(value: ASPxClientAxisBase => ASPxClientAxisValue): Self = StObject.set(x, "GetAxisValue", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "IsEmpty", js.Any.fromFunction0(value))
    
    inline def setNumericalArgument(value: Double): Self = StObject.set(x, "numericalArgument", value.asInstanceOf[js.Any])
    
    inline def setNumericalValue(value: Double): Self = StObject.set(x, "numericalValue", value.asInstanceOf[js.Any])
    
    inline def setPane(value: ASPxClientXYDiagramPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setQualitativeArgument(value: String): Self = StObject.set(x, "qualitativeArgument", value.asInstanceOf[js.Any])
    
    inline def setTimeSpanArgument(value: Any): Self = StObject.set(x, "timeSpanArgument", value.asInstanceOf[js.Any])
    
    inline def setTimeSpanValue(value: Any): Self = StObject.set(x, "timeSpanValue", value.asInstanceOf[js.Any])
    
    inline def setValueScaleType(value: String): Self = StObject.set(x, "valueScaleType", value.asInstanceOf[js.Any])
  }
}
