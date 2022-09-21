package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the SeriesPoint class.
  */
@JSGlobal("ASPxClientSeriesPoint")
@js.native
open class ASPxClientSeriesPoint ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSeriesPoint {
  
  /**
    * Gets the data point's argument.
    */
  /* CompleteClass */
  var argument: Any = js.native
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets the color of a series point.
    */
  /* CompleteClass */
  var color: String = js.native
  
  /**
    * Gets the percent value of a series point.
    */
  /* CompleteClass */
  var percentValue: Double = js.native
  
  /**
    * Gets the series that owns the current series point object.
    */
  /* CompleteClass */
  var series: typings.devexpressWeb.ASPxClientSeries = js.native
  
  /**
    * Gets a hint that is shown in series points tooltips.
    */
  /* CompleteClass */
  var toolTipHint: String = js.native
  
  /**
    * Gets the text to be displayed within series points tooltips.
    */
  /* CompleteClass */
  var toolTipText: String = js.native
  
  /**
    * Gets the point's data value(s).
    */
  /* CompleteClass */
  var values: js.Array[Any] = js.native
}
