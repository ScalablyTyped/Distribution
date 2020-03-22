package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPercentile extends js.Object {
  var category: js.UndefOr[String] = js.native
  var distributions: js.UndefOr[js.Array[AnonMax]] = js.native
  var percentile: js.UndefOr[Double] = js.native
}

object AnonPercentile {
  @scala.inline
  def apply(category: String = null, distributions: js.Array[AnonMax] = null, percentile: Int | Double = null): AnonPercentile = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (distributions != null) __obj.updateDynamic("distributions")(distributions.asInstanceOf[js.Any])
    if (percentile != null) __obj.updateDynamic("percentile")(percentile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPercentile]
  }
}

