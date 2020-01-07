package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CategoryDistributionsPercentile extends js.Object {
  var category: js.UndefOr[String] = js.native
  var distributions: js.UndefOr[js.Array[Anon_Max]] = js.native
  var percentile: js.UndefOr[Double] = js.native
}

object Anon_CategoryDistributionsPercentile {
  @scala.inline
  def apply(category: String = null, distributions: js.Array[Anon_Max] = null, percentile: Int | Double = null): Anon_CategoryDistributionsPercentile = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (distributions != null) __obj.updateDynamic("distributions")(distributions.asInstanceOf[js.Any])
    if (percentile != null) __obj.updateDynamic("percentile")(percentile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CategoryDistributionsPercentile]
  }
}

