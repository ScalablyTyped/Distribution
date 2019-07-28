package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.elasticsearchStrings.create
import typings.elasticsearch.elasticsearchStrings.index
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexDocumentParams[T] extends GenericParams {
  @JSName("body")
  var body_IndexDocumentParams: T
  var id: js.UndefOr[String] = js.undefined
  var index: String
  var opType: js.UndefOr[index | create] = js.undefined
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

object IndexDocumentParams {
  @scala.inline
  def apply[T](
    body: T,
    index: String,
    `type`: String,
    filterPath: String | js.Array[String] = null,
    id: String = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: Int | Double = null,
    method: String = null,
    opType: index | create = null,
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
  ): IndexDocumentParams[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index)
    __obj.updateDynamic("type")(`type`)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (opType != null) __obj.updateDynamic("opType")(opType.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[IndexDocumentParams[T]]
  }
}

