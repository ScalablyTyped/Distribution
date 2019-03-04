package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCreateRepositoryParams extends GenericParams {
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var repository: java.lang.String
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var verify: js.UndefOr[scala.Boolean] = js.undefined
}

object SnapshotCreateRepositoryParams {
  @scala.inline
  def apply(
    repository: java.lang.String,
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    masterTimeout: TimeSpan = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    timeout: TimeSpan = null,
    verify: js.UndefOr[scala.Boolean] = js.undefined
  ): SnapshotCreateRepositoryParams = {
    val __obj = js.Dynamic.literal(repository = repository)
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (!js.isUndefined(verify)) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[SnapshotCreateRepositoryParams]
  }
}

