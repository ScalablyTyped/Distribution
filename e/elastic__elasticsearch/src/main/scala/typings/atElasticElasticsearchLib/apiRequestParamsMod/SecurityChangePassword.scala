package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityChangePassword[T] extends Generic {
  var body: T
  var refresh: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`true` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`false` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.wait_for
  ] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object SecurityChangePassword {
  @scala.inline
  def apply[T](
    body: T,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`true` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`false` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.wait_for = null,
    source: java.lang.String = null,
    username: java.lang.String = null
  ): SecurityChangePassword[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[SecurityChangePassword[T]]
  }
}

