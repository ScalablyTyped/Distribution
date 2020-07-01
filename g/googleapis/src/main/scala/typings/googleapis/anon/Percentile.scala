package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Percentile extends js.Object {
  var category: js.UndefOr[String] = js.native
  var distributions: js.UndefOr[js.Array[Max]] = js.native
  var percentile: js.UndefOr[Double] = js.native
}

object Percentile {
  @scala.inline
  def apply(
    category: String = null,
    distributions: js.Array[Max] = null,
    percentile: js.UndefOr[Double] = js.undefined
  ): Percentile = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (distributions != null) __obj.updateDynamic("distributions")(distributions.asInstanceOf[js.Any])
    if (!js.isUndefined(percentile)) __obj.updateDynamic("percentile")(percentile.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Percentile]
  }
}

