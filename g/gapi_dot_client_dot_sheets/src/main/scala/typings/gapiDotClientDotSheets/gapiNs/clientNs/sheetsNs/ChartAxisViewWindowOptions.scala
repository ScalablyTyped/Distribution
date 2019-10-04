package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisViewWindowOptions extends js.Object {
  /**
    * The maximum numeric value to be shown in this view window. If unset, will
    * automatically determine a maximum value that looks good for the data.
    */
  var viewWindowMax: js.UndefOr[Double] = js.undefined
  /**
    * The minimum numeric value to be shown in this view window. If unset, will
    * automatically determine a minimum value that looks good for the data.
    */
  var viewWindowMin: js.UndefOr[Double] = js.undefined
  /** The view window's mode. */
  var viewWindowMode: js.UndefOr[String] = js.undefined
}

object ChartAxisViewWindowOptions {
  @scala.inline
  def apply(
    viewWindowMax: Int | Double = null,
    viewWindowMin: Int | Double = null,
    viewWindowMode: String = null
  ): ChartAxisViewWindowOptions = {
    val __obj = js.Dynamic.literal()
    if (viewWindowMax != null) __obj.updateDynamic("viewWindowMax")(viewWindowMax.asInstanceOf[js.Any])
    if (viewWindowMin != null) __obj.updateDynamic("viewWindowMin")(viewWindowMin.asInstanceOf[js.Any])
    if (viewWindowMode != null) __obj.updateDynamic("viewWindowMode")(viewWindowMode)
    __obj.asInstanceOf[ChartAxisViewWindowOptions]
  }
}

