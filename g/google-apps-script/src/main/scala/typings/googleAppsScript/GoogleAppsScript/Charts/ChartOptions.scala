package typings.googleAppsScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exposes options currently configured for a Chart, such as height, color, etc.
  *
  * Please see the visualization
  * reference documentation for information on what options are available. Specific options for
  * each chart can be found by clicking on the specific chart in the chart gallery.
  *
  * These options are immutable.
  */
trait ChartOptions extends js.Object {
  def get(option: String): js.Any
}

object ChartOptions {
  @scala.inline
  def apply(get: String => js.Any): ChartOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ChartOptions]
  }
}

