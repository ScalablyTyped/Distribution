package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a chart control's ASPxClientWebChartControl.ObjectHotTracked and ASPxClientWebChartControl.ObjectSelected events on the client side.
  */
@JSGlobal("ASPxClientWebChartControlHotTrackEventArgs")
@js.native
class ASPxClientWebChartControlHotTrackEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  def this(
    processOnServer: Boolean,
    hitObject: ASPxClientWebChartElement,
    additionalHitObject: ASPxClientWebChartElement,
    hitInfo: ASPxClientWebChartHitInfo,
    htmlElement: js.Any,
    x: Double,
    y: Double
  ) = this()
  def this(
    processOnServer: Boolean,
    hitObject: ASPxClientWebChartElement,
    additionalHitObject: ASPxClientWebChartElement,
    hitInfo: ASPxClientWebChartHitInfo,
    htmlElement: js.Any,
    x: Double,
    y: Double,
    absoluteX: Double
  ) = this()
  def this(
    processOnServer: Boolean,
    hitObject: ASPxClientWebChartElement,
    additionalHitObject: ASPxClientWebChartElement,
    hitInfo: ASPxClientWebChartHitInfo,
    htmlElement: js.Any,
    x: Double,
    y: Double,
    absoluteX: Double,
    absoluteY: Double
  ) = this()
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    */
  var absoluteX: Double = js.native
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    */
  var absoluteY: Double = js.native
  /**
    * Provides access on the client side to the object, which is in some way related to the object being hit. The returned value depends on the ASPxClientWebChartControlHotTrackEventArgs.hitObject type and hit point location.
    */
  var additionalHitObject: ASPxClientWebChartElement = js.native
  /**
    * Gets a value indicating whether the hot-tracking or object selection should be canceled.
    */
  var cancel: Boolean = js.native
  /**
    * Provides access on the client side to the chart and all its elements.
    */
  var chart: ASPxClientWebChart = js.native
  /**
    * Gets details on the chart elements located at the point where an end-user has clicked when hot-tracking or selecting a chart element on the client side.
    */
  var hitInfo: ASPxClientWebChartHitInfo = js.native
  /**
    * Provides access on the client side to the chart element, for which the event was raised.
    */
  var hitObject: ASPxClientWebChartElement = js.native
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the chart.
    */
  var x: Double = js.native
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the chart.
    */
  var y: Double = js.native
}

