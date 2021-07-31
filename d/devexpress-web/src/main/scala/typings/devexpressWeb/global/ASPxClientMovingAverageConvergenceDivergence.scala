package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the MovingAverageConvergenceDivergence class.
  */
@JSGlobal("ASPxClientMovingAverageConvergenceDivergence")
@js.native
class ASPxClientMovingAverageConvergenceDivergence ()
  extends StObject
     with typings.devexpressWeb.ASPxClientMovingAverageConvergenceDivergence {
  
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
    * Returns the long period value required to calculate the indicator.
    */
  /* CompleteClass */
  var longPeriod: Double = js.native
  
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
    * Returns the short period value required to calculate the indicator.
    */
  /* CompleteClass */
  var shortPeriod: Double = js.native
  
  /**
    * Returns the smoothing period value required to calculate the indicator.
    */
  /* CompleteClass */
  var signalSmoothingPeriod: Double = js.native
}
