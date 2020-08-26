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
@js.native
trait ChartOptions extends js.Object {
  def get(option: String): js.Any = js.native
}

object ChartOptions {
  @scala.inline
  def apply(get: String => js.Any): ChartOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ChartOptions]
  }
  @scala.inline
  implicit class ChartOptionsOps[Self <: ChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

