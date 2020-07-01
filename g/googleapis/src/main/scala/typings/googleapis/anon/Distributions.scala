package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distributions extends js.Object {
  var category: js.UndefOr[String] = js.native
  var distributions: js.UndefOr[js.Array[Max]] = js.native
  var median: js.UndefOr[Double] = js.native
}

object Distributions {
  @scala.inline
  def apply(
    category: String = null,
    distributions: js.Array[Max] = null,
    median: js.UndefOr[Double] = js.undefined
  ): Distributions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (distributions != null) __obj.updateDynamic("distributions")(distributions.asInstanceOf[js.Any])
    if (!js.isUndefined(median)) __obj.updateDynamic("median")(median.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distributions]
  }
}

