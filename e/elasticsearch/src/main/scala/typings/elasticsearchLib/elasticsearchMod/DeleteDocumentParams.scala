package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentParams extends GenericParams {
  var id: java.lang.String
  var index: java.lang.String
  var parent: js.UndefOr[java.lang.String] = js.undefined
  var refresh: js.UndefOr[Refresh] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var `type`: java.lang.String
  var version: js.UndefOr[scala.Double] = js.undefined
  var versionType: js.UndefOr[VersionType] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteDocumentParams {
  @scala.inline
  def apply(
    id: java.lang.String,
    index: java.lang.String,
    `type`: java.lang.String,
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    parent: java.lang.String = null,
    refresh: Refresh = null,
    requestTimeout: scala.Int | scala.Double = null,
    routing: java.lang.String = null,
    timeout: TimeSpan = null,
    version: scala.Int | scala.Double = null,
    versionType: VersionType = null,
    waitForActiveShards: java.lang.String = null
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

