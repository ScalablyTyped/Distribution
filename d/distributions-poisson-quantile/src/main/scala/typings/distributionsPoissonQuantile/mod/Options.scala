package typings.distributionsPoissonQuantile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** accessor function for accessing array values */
  var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.undefined
  /** boolean indicating if the function should return a new data structure, default=true */
  var copy: js.UndefOr[Boolean] = js.undefined
  /** output data type, default="float64" */
  var dtype: js.UndefOr[DataType] = js.undefined
  /** mean parameter, default=1 */
  var lambda: js.UndefOr[Double] = js.undefined
  /** deep get/set key path */
  var path: js.UndefOr[String] = js.undefined
  /** deep get/set key path separator, default="." */
  var sep: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    accessor: (/* d */ Data, /* i */ Double) => _ = null,
    copy: js.UndefOr[Boolean] = js.undefined,
    dtype: DataType = null,
    lambda: js.UndefOr[Double] = js.undefined,
    path: String = null,
    sep: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (accessor != null) __obj.updateDynamic("accessor")(js.Any.fromFunction2(accessor))
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy.get.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(lambda)) __obj.updateDynamic("lambda")(lambda.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sep != null) __obj.updateDynamic("sep")(sep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

