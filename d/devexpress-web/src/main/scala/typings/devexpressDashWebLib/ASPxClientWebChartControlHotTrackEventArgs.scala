package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a chart control's ObjectSelected events on the client side.
  */
trait ASPxClientWebChartControlHotTrackEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    * Value: An integer value specifying X-coordinate of the hit test point (in pixels).
    */
  var absoluteX: scala.Double
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    * Value: An integer value specifying Y-coordinate of the hit test point (in pixels).
    */
  var absoluteY: scala.Double
  /**
    * Provides access on the client side to the object, which is in some way related to the object being hit. The returned value depends on the hitObject type and hit point location.
    * Value: An ASPxClientWebChartElement object representing an additional object that relates to the one being hit.
    */
  var additionalHitObject: ASPxClientWebChartElement
  /**
    * Gets a value indicating whether the hot-tracking or object selection should be canceled.
    * Value: true to cancel the hot-tracking or selection of an object; otherwise, false.
    */
  var cancel: scala.Boolean
  /**
    * Provides access on the client side to the chart and all its elements.
    * Value: An ASPxClientWebChart object, which provides access to chart properties.
    */
  var chart: ASPxClientWebChart
  /**
    * Gets details on the chart elements located at the point where an end-user has clicked when hot-tracking or selecting a chart element on the client side.
    * Value: An ASPxClientWebChartHitInfo object, which contains information about the chart elements located at the point where an end-user has clicked.
    */
  var hitInfo: ASPxClientWebChartHitInfo
  /**
    * Provides access on the client side to the chart element, for which the event was raised.
    * Value: An ASPxClientWebChartElement object, which represents the chart element for which the event was raised.
    */
  var hitObject: ASPxClientWebChartElement
  /**
    * Gets the HTML object that contains the processed item.
    * Value: An object representing a container for the item related to the event.
    */
  var htmlElement: js.Object
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the chart.
    * Value: An integer value specifying X-coordinate of the hit test point (in pixels).
    */
  var x: scala.Double
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the chart.
    * Value: An integer value specifying Y-coordinate of the hit test point (in pixels).
    */
  var y: scala.Double
}

object ASPxClientWebChartControlHotTrackEventArgs {
  @scala.inline
  def apply(
    absoluteX: scala.Double,
    absoluteY: scala.Double,
    additionalHitObject: ASPxClientWebChartElement,
    cancel: scala.Boolean,
    chart: ASPxClientWebChart,
    hitInfo: ASPxClientWebChartHitInfo,
    hitObject: ASPxClientWebChartElement,
    htmlElement: js.Object,
    processOnServer: scala.Boolean,
    x: scala.Double,
    y: scala.Double
  ): ASPxClientWebChartControlHotTrackEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("absoluteX")(absoluteX)
    __obj.updateDynamic("absoluteY")(absoluteY)
    __obj.updateDynamic("additionalHitObject")(additionalHitObject)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("hitInfo")(hitInfo)
    __obj.updateDynamic("hitObject")(hitObject)
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[ASPxClientWebChartControlHotTrackEventArgs]
  }
}

