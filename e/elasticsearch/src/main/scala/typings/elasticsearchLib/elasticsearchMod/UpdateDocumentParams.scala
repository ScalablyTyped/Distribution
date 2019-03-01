package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDocumentParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.undefined
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var id: java.lang.String
  var index: java.lang.String
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[java.lang.String] = js.undefined
  var refresh: js.UndefOr[Refresh] = js.undefined
  var retryOnConflict: js.UndefOr[scala.Double] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var timestamp: js.UndefOr[stdLib.Date | scala.Double] = js.undefined
  var ttl: js.UndefOr[TimeSpan] = js.undefined
  var `type`: java.lang.String
  var version: js.UndefOr[scala.Double] = js.undefined
  var versionType: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.internal | elasticsearchLib.elasticsearchLibStrings.force
  ] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateDocumentParams {
  @scala.inline
  def apply(
    id: java.lang.String,
    index: java.lang.String,
    `type`: java.lang.String,
    _source: NameList = null,
    _sourceExclude: NameList = null,
    _sourceInclude: NameList = null,
    body: js.Any = null,
    fields: NameList = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    lang: java.lang.String = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    parent: java.lang.String = null,
    refresh: Refresh = null,
    requestTimeout: scala.Int | scala.Double = null,
    retryOnConflict: scala.Int | scala.Double = null,
    routing: java.lang.String = null,
    timeout: TimeSpan = null,
    timestamp: stdLib.Date | scala.Double = null,
    ttl: TimeSpan = null,
    version: scala.Int | scala.Double = null,
    versionType: elasticsearchLib.elasticsearchLibStrings.internal | elasticsearchLib.elasticsearchLibStrings.force = null,
    waitForActiveShards: java.lang.String = null
  ): UpdateDocumentParams = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("index")(index)
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_sourceExclude != null) __obj.updateDynamic("_sourceExclude")(_sourceExclude.asInstanceOf[js.Any])
    if (_sourceInclude != null) __obj.updateDynamic("_sourceInclude")(_sourceInclude.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (retryOnConflict != null) __obj.updateDynamic("retryOnConflict")(retryOnConflict.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionType != null) __obj.updateDynamic("versionType")(versionType.asInstanceOf[js.Any])
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards)
    __obj.asInstanceOf[UpdateDocumentParams]
  }
}

