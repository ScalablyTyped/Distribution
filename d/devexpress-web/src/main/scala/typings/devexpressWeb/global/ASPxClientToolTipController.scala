package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ChartToolTipController class.
  */
@JSGlobal("ASPxClientToolTipController")
@js.native
class ASPxClientToolTipController ()
  extends typings.devexpressWeb.ASPxClientToolTipController {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets a value that defines the position of an image within a tooltip.
    */
  /* CompleteClass */
  override var imagePosition: String = js.native
  /**
    * Gets a value that defines when tooltips should be invoked.
    */
  /* CompleteClass */
  override var openMode: String = js.native
  /**
    * Gets a value indicating whether an image should be shown in tooltips.
    */
  /* CompleteClass */
  override var showImage: Boolean = js.native
  /**
    * Gets a value indicating whether it is necessary to show text in tooltips.
    */
  /* CompleteClass */
  override var showText: Boolean = js.native
}

