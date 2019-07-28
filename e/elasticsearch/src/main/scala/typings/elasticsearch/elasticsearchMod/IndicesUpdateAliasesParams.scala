package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.Anon_Actions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesUpdateAliasesParams extends GenericParams {
  @JSName("body")
  var body_IndicesUpdateAliasesParams: Anon_Actions
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}

object IndicesUpdateAliasesParams {
  @scala.inline
  def apply(
    body: Anon_Actions,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    requestTimeout: Int | Double = null,
    timeout: TimeSpan = null
  ): IndicesUpdateAliasesParams = {
    val __obj = js.Dynamic.literal(body = body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[IndicesUpdateAliasesParams]
  }
}

