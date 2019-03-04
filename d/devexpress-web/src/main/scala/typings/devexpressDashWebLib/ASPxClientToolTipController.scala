package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ChartToolTipController class.
  */
trait ASPxClientToolTipController extends ASPxClientWebChartElement {
  /**
    * Gets a value that defines the position of an image within a tooltip.
    * Value: A string value.
    */
  var imagePosition: java.lang.String
  /**
    * Gets a value that defines when tooltips should be invoked.
    * Value: A string value.
    */
  var openMode: java.lang.String
  /**
    * Gets a value indicating whether an image should be shown in tooltips.
    * Value: true to show an image in tooltips; otherwise, false.
    */
  var showImage: scala.Boolean
  /**
    * Gets a value indicating whether it is necessary to show text in tooltips.
    * Value: true to show text in tooltips; otherwise, false.
    */
  var showText: scala.Boolean
}

object ASPxClientToolTipController {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    imagePosition: java.lang.String,
    openMode: java.lang.String,
    showImage: scala.Boolean,
    showText: scala.Boolean
  ): ASPxClientToolTipController = {
    val __obj = js.Dynamic.literal(chart = chart, imagePosition = imagePosition, openMode = openMode, showImage = showImage, showText = showText)
  
    __obj.asInstanceOf[ASPxClientToolTipController]
  }
}

