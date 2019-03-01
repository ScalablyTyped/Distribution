package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericParams extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var filterPath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var ignore: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
}

object GenericParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null
  ): GenericParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericParams]
  }
}

