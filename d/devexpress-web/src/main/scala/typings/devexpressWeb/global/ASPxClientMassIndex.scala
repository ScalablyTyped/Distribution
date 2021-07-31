package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the MassIndex class.
  */
@JSGlobal("ASPxClientMassIndex")
@js.native
class ASPxClientMassIndex ()
  extends StObject
     with typings.devexpressWeb.ASPxClientMassIndex {
  
  /**
    * Returns the name of the Y-axis that is used to plot the current indicator on a ASPxClientXYDiagram.
    */
  /* CompleteClass */
  var axisY: String = js.native
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Returns the count of points used to calculate the exponential moving average (EMA).
    */
  /* CompleteClass */
  var movingAveragePointsCount: Double = js.native
  
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Returns the name of a pane, used to plot the separate pane indicator on an XYDiagram.
    */
  /* CompleteClass */
  var pane: String = js.native
  
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  var series: typings.devexpressWeb.ASPxClientSeries = js.native
  
  /**
    * Returns the count of summable values.
    */
  /* CompleteClass */
  var sumPointsCount: Double = js.native
}
