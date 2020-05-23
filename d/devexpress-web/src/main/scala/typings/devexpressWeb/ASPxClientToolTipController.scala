package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ChartToolTipController class.
  */
trait ASPxClientToolTipController extends ASPxClientWebChartElement {
  /**
    * Gets a value that defines the position of an image within a tooltip.
    */
  var imagePosition: String
  /**
    * Gets a value that defines when tooltips should be invoked.
    */
  var openMode: String
  /**
    * Gets a value indicating whether an image should be shown in tooltips.
    */
  var showImage: Boolean
  /**
    * Gets a value indicating whether it is necessary to show text in tooltips.
    */
  var showText: Boolean
}

object ASPxClientToolTipController {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    imagePosition: String,
    openMode: String,
    showImage: Boolean,
    showText: Boolean
  ): ASPxClientToolTipController = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], imagePosition = imagePosition.asInstanceOf[js.Any], openMode = openMode.asInstanceOf[js.Any], showImage = showImage.asInstanceOf[js.Any], showText = showText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolTipController]
  }
}

