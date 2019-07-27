package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityPutUser[T] extends Generic {
  var body: T
  var refresh: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`true` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`false` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.wait_for
  ] = js.undefined
  var username: java.lang.String
}

object SecurityPutUser {
  @scala.inline
  def apply[T](
    body: T,
    username: java.lang.String,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`true` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`false` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.wait_for = null,
    source: java.lang.String = null
  ): SecurityPutUser[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], username = username)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SecurityPutUser[T]]
  }
}

