package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCategoryDistributions extends js.Object {
  var category: js.UndefOr[String] = js.native
  var distributions: js.UndefOr[js.Array[AnonMax]] = js.native
  var median: js.UndefOr[Double] = js.native
}

object AnonCategoryDistributions {
  @scala.inline
  def apply(category: String = null, distributions: js.Array[AnonMax] = null, median: Int | Double = null): AnonCategoryDistributions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (distributions != null) __obj.updateDynamic("distributions")(distributions.asInstanceOf[js.Any])
    if (median != null) __obj.updateDynamic("median")(median.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategoryDistributions]
  }
}

