package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.force
import typings.elasticsearch.elasticsearchStrings.internal
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDocumentParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.undefined
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var id: String
  var index: String
  var lang: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[String] = js.undefined
  var refresh: js.UndefOr[Refresh] = js.undefined
  var retryOnConflict: js.UndefOr[Double] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var timestamp: js.UndefOr[Date | Double] = js.undefined
  var ttl: js.UndefOr[TimeSpan] = js.undefined
  var `type`: String
  var version: js.UndefOr[Double] = js.undefined
  var versionType: js.UndefOr[internal | force] = js.undefined
  var waitForActiveShards: js.UndefOr[String] = js.undefined
}

object UpdateDocumentParams {
  @scala.inline
  def apply(
    id: String,
    index: String,
    `type`: String,
    _source: NameList = null,
    _sourceExclude: NameList = null,
    _sourceInclude: NameList = null,
    body: js.Any = null,
    fields: NameList = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    lang: String = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    parent: String = null,
    refresh: Refresh = null,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    retryOnConflict: js.UndefOr[Double] = js.undefined,
    routing: String = null,
    timeout: TimeSpan = null,
    timestamp: Date | Double = null,
    ttl: TimeSpan = null,
    version: js.UndefOr[Double] = js.undefined,
    versionType: internal | force = null,
    waitForActiveShards: String = null
  ): UpdateDocumentParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_sourceExclude != null) __obj.updateDynamic("_sourceExclude")(_sourceExclude.asInstanceOf[js.Any])
    if (_sourceInclude != null) __obj.updateDynamic("_sourceInclude")(_sourceInclude.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryOnConflict)) __obj.updateDynamic("retryOnConflict")(retryOnConflict.get.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (versionType != null) __obj.updateDynamic("versionType")(versionType.asInstanceOf[js.Any])
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentParams]
  }
}

