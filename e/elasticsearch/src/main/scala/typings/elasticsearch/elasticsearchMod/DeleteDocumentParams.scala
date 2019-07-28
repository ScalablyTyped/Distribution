package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentParams extends GenericParams {
  var id: String
  var index: String
  var parent: js.UndefOr[String] = js.undefined
  var refresh: js.UndefOr[Refresh] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var `type`: String
  var version: js.UndefOr[Double] = js.undefined
  var versionType: js.UndefOr[VersionType] = js.undefined
  var waitForActiveShards: js.UndefOr[String] = js.undefined
}

object DeleteDocumentParams {
  @scala.inline
  def apply(
    id: String,
    index: String,
    `type`: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: Int | Double = null,
    method: String = null,
    parent: String = null,
    refresh: Refresh = null,
    requestTimeout: Int | Double = null,
    routing: String = null,
    timeout: TimeSpan = null,
    version: Int | Double = null,
    versionType: VersionType = null,
    waitForActiveShards: String = null
  ): DeleteDocumentParams = {
    val __obj = js.Dynamic.literal(id = id, index = index)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionType != null) __obj.updateDynamic("versionType")(versionType)
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards)
    __obj.asInstanceOf[DeleteDocumentParams]
  }
}

