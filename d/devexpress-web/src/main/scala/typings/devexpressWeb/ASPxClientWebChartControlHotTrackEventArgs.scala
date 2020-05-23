package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a chart control's ASPxClientWebChartControl.ObjectHotTracked and ASPxClientWebChartControl.ObjectSelected events on the client side.
  */
trait ASPxClientWebChartControlHotTrackEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    */
  var absoluteX: Double
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    */
  var absoluteY: Double
  /**
    * Provides access on the client side to the object, which is in some way related to the object being hit. The returned value depends on the ASPxClientWebChartControlHotTrackEventArgs.hitObject type and hit point location.
    */
  var additionalHitObject: ASPxClientWebChartElement
  /**
    * Gets a value indicating whether the hot-tracking or object selection should be canceled.
    */
  var cancel: Boolean
  /**
    * Provides access on the client side to the chart and all its elements.
    */
  var chart: ASPxClientWebChart
  /**
    * Gets details on the chart elements located at the point where an end-user has clicked when hot-tracking or selecting a chart element on the client side.
    */
  var hitInfo: ASPxClientWebChartHitInfo
  /**
    * Provides access on the client side to the chart element, for which the event was raised.
    */
  var hitObject: ASPxClientWebChartElement
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the chart.
    */
  var x: Double
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the chart.
    */
  var y: Double
}

object ASPxClientWebChartControlHotTrackEventArgs {
  @scala.inline
  def apply(
    absoluteX: Double,
    absoluteY: Double,
    additionalHitObject: ASPxClientWebChartElement,
    cancel: Boolean,
    chart: ASPxClientWebChart,
    hitInfo: ASPxClientWebChartHitInfo,
    hitObject: ASPxClientWebChartElement,
    htmlElement: js.Any,
    processOnServer: Boolean,
    x: Double,
    y: Double
  ): ASPxClientWebChartControlHotTrackEventArgs = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], additionalHitObject = additionalHitObject.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], hitInfo = hitInfo.asInstanceOf[js.Any], hitObject = hitObject.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartControlHotTrackEventArgs]
  }
}

