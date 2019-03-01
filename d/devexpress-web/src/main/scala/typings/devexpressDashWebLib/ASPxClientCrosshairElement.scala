package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the CrosshairElement class.
  */
trait ASPxClientCrosshairElement extends js.Object {
  /**
    * Provides access to the crosshair axis label element.
    * Value: An ASPxClientCrosshairAxisLabelElement object, representing the crosshair axis label element.
    */
  var AxisLabelElement: ASPxClientCrosshairAxisLabelElement
  /**
    * Gets an indicator that a crosshair element hovers over when the Crosshair Cursor is custom drawn.
    * Value: An ASPxClientIndicator object which represents the series currently being painted.
    */
  var Indicator: ASPxClientIndicator
  /**
    * Gets the crosshair label element.
    * Value: An ASPxClientCrosshairSeriesLabelElement object, representing the crosshair label element.
    */
  var LabelElement: ASPxClientCrosshairSeriesLabelElement
  /**
    * Gets or sets the crosshair line element to custom draw a crosshair cursor.
    * Value: An ASPxClientCrosshairLineElement object, representing the crosshair line element.
    */
  var LineElement: ASPxClientCrosshairLineElement
  /**
    * Gets the series point that a crosshair element hovers over when implementing a custom draw.
    * Value: An ASPxClientSeriesPoint object, representing the series point that a crosshair element hovers over.
    */
  var Point: ASPxClientSeriesPoint
  /**
    * Gets a series that a crosshair element hovers over when implementing a custom draw.
    * Value: An ASPxClientSeries object which represents the series currently being painted.
    */
  var Series: ASPxClientSeries
  /**
    * Specifies whether the crosshair element is visible when implementing custom drawing in the crosshair cursor.
    * Value: true, if the crosshair element is visible; otherwise, false.
    */
  var visible: scala.Boolean
}

object ASPxClientCrosshairElement {
  @scala.inline
  def apply(
    AxisLabelElement: ASPxClientCrosshairAxisLabelElement,
    Indicator: ASPxClientIndicator,
    LabelElement: ASPxClientCrosshairSeriesLabelElement,
    LineElement: ASPxClientCrosshairLineElement,
    Point: ASPxClientSeriesPoint,
    Series: ASPxClientSeries,
    visible: scala.Boolean
  ): ASPxClientCrosshairElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AxisLabelElement")(AxisLabelElement)
    __obj.updateDynamic("Indicator")(Indicator)
    __obj.updateDynamic("LabelElement")(LabelElement)
    __obj.updateDynamic("LineElement")(LineElement)
    __obj.updateDynamic("Point")(Point)
    __obj.updateDynamic("Series")(Series)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ASPxClientCrosshairElement]
  }
}

