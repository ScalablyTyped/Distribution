package typings.elasticsearch.elasticsearchMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDocumentParams extends GenericParams {
  var id: js.UndefOr[String] = js.undefined
  var index: String
  var parent: js.UndefOr[String] = js.undefined
  var pipeline: js.UndefOr[String] = js.undefined
  var refresh: js.UndefOr[Refresh] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var timestamp: js.UndefOr[Date | Double] = js.undefined
  var ttl: js.UndefOr[TimeSpan] = js.undefined
  var `type`: String
  var version: js.UndefOr[Double] = js.undefined
  var versionType: js.UndefOr[VersionType] = js.undefined
  var waitForActiveShards: js.UndefOr[String] = js.undefined
}

object CreateDocumentParams {
  @scala.inline
  def apply(
    index: String,
    `type`: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    id: String = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: Int | Double = null,
    method: String = null,
    parent: String = null,
    pipeline: String = null,
    refresh: Refresh = null,
    requestTimeout: Int | Double = null,
    routing: String = null,
    timeout: TimeSpan = null,
    timestamp: Date | Double = null,
    ttl: TimeSpan = null,
    version: Int | Double = null,
    versionType: VersionType = null,
    waitForActiveShards: String = null
  ): CreateDocumentParams = {
    val __obj = js.Dynamic.literal(index = index)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionType != null) __obj.updateDynamic("versionType")(versionType)
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards)
    __obj.asInstanceOf[CreateDocumentParams]
  }
}

