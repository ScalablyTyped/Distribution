package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for a chart control's ASPxClientWebChartControl.ObjectHotTracked and ASPxClientWebChartControl.ObjectSelected events on the client side.
  */
@JSGlobal("ASPxClientWebChartControlHotTrackEventArgs")
@js.native
class ASPxClientWebChartControlHotTrackEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientWebChartControlHotTrackEventArgs {
  /**
    * Initializes a new instance of the ASPxClientWebChartControlHotTrackEventArgs class with specified settings.
    */
  def this(
    processOnServer: Boolean,
    hitObject: typings.devexpressWeb.ASPxClientWebChartElement,
    additionalHitObject: typings.devexpressWeb.ASPxClientWebChartElement,
    hitInfo: typings.devexpressWeb.ASPxClientWebChartHitInfo,
    htmlElement: js.Any,
    x: Double,
    y: Double
  ) = this()
  def this(
    processOnServer: Boolean,
    hitObject: typings.devexpressWeb.ASPxClientWebChartElement,
    additionalHitObject: typings.devexpressWeb.ASPxClientWebChartElement,
    hitInfo: typings.devexpressWeb.ASPxClientWebChartHitInfo,
    htmlElement: js.Any,
    x: Double,
    y: Double,
    absoluteX: Double
  ) = this()
  def this(
    processOnServer: Boolean,
    hitObject: typings.devexpressWeb.ASPxClientWebChartElement,
    additionalHitObject: typings.devexpressWeb.ASPxClientWebChartElement,
    hitInfo: typings.devexpressWeb.ASPxClientWebChartHitInfo,
    htmlElement: js.Any,
    x: Double,
    y: Double,
    absoluteX: Double,
    absoluteY: Double
  ) = this()
  def this(
    processOnServer: Boolean,
    hitObject: typings.devexpressWeb.ASPxClientWebChartElement,
    additionalHitObject: typings.devexpressWeb.ASPxClientWebChartElement,
    hitInfo: typings.devexpressWeb.ASPxClientWebChartHitInfo,
    htmlElement: js.Any,
    x: Double,
    y: Double,
    absoluteX: Unit,
    absoluteY: Double
  ) = this()
  
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    */
  /* CompleteClass */
  var absoluteX: Double = js.native
  
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    */
  /* CompleteClass */
  var absoluteY: Double = js.native
  
  /**
    * Provides access on the client side to the object, which is in some way related to the object being hit. The returned value depends on the ASPxClientWebChartControlHotTrackEventArgs.hitObject type and hit point location.
    */
  /* CompleteClass */
  var additionalHitObject: typings.devexpressWeb.ASPxClientWebChartElement = js.native
  
  /**
    * Gets a value indicating whether the hot-tracking or object selection should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides access on the client side to the chart and all its elements.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets details on the chart elements located at the point where an end-user has clicked when hot-tracking or selecting a chart element on the client side.
    */
  /* CompleteClass */
  var hitInfo: typings.devexpressWeb.ASPxClientWebChartHitInfo = js.native
  
  /**
    * Provides access on the client side to the chart element, for which the event was raised.
    */
  /* CompleteClass */
  var hitObject: typings.devexpressWeb.ASPxClientWebChartElement = js.native
  
  /**
    * Gets the HTML object that contains the processed item.
    */
  /* CompleteClass */
  var htmlElement: js.Any = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
  
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the chart.
    */
  /* CompleteClass */
  var x: Double = js.native
  
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the chart.
    */
  /* CompleteClass */
  var y: Double = js.native
}
