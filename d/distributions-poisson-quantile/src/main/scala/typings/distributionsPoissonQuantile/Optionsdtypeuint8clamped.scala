package typings.distributionsPoissonQuantile

import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8_clamped
import typings.distributionsPoissonQuantile.mod.Data
import typings.distributionsPoissonQuantile.mod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype  :'uint8_clamped'} */
trait Optionsdtypeuint8clamped extends js.Object {
  /** accessor function for accessing array values */
  var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.undefined
  /** boolean indicating if the function should return a new data structure, default=true */
  var copy: js.UndefOr[Boolean] = js.undefined
  /** output data type, default="float64" */
  var dtype: js.UndefOr[DataType with uint8_clamped] = js.undefined
  /** mean parameter, default=1 */
  var lambda: js.UndefOr[Double] = js.undefined
  /** deep get/set key path */
  var path: js.UndefOr[String] = js.undefined
  /** deep get/set key path separator, default="." */
  var sep: js.UndefOr[String] = js.undefined
}

object Optionsdtypeuint8clamped {
  @scala.inline
  def apply(
    accessor: (/* d */ Data, /* i */ Double) => _ = null,
    copy: js.UndefOr[Boolean] = js.undefined,
    dtype: DataType with uint8_clamped = null,
    lambda: Int | Double = null,
    path: String = null,
    sep: String = null
  ): Optionsdtypeuint8clamped = {
    val __obj = js.Dynamic.literal()
    if (accessor != null) __obj.updateDynamic("accessor")(js.Any.fromFunction2(accessor))
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sep != null) __obj.updateDynamic("sep")(sep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsdtypeuint8clamped]
  }
}

