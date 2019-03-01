package typings
package ejDotWebDotAllLib.ejNs.PivotChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeSeriesRenderEventArgs extends js.Object {
  /** series - Instance of the series which is about to get rendered
    */
  var data: js.UndefOr[js.Any] = js.undefined
}

object BeforeSeriesRenderEventArgs {
  @scala.inline
  def apply(data: js.Any = null): BeforeSeriesRenderEventArgs = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[BeforeSeriesRenderEventArgs]
  }
}

