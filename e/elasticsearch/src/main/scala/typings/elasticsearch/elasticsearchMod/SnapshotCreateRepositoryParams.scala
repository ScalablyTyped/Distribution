package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCreateRepositoryParams extends GenericParams {
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var repository: String
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var verify: js.UndefOr[Boolean] = js.undefined
}

object SnapshotCreateRepositoryParams {
  @scala.inline
  def apply(
    repository: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    requestTimeout: Int | Double = null,
    timeout: TimeSpan = null,
    verify: js.UndefOr[Boolean] = js.undefined
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

