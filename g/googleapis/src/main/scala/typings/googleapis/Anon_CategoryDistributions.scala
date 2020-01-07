package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CategoryDistributions extends js.Object {
  var category: js.UndefOr[String] = js.native
  var distributions: js.UndefOr[js.Array[Anon_Max]] = js.native
  var median: js.UndefOr[Double] = js.native
}

object Anon_CategoryDistributions {
  @scala.inline
  def apply(category: String = null, distributions: js.Array[Anon_Max] = null, median: Int | Double = null): Anon_CategoryDistributions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (distributions != null) __obj.updateDynamic("distributions")(distributions.asInstanceOf[js.Any])
    if (median != null) __obj.updateDynamic("median")(median.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CategoryDistributions]
  }
}

