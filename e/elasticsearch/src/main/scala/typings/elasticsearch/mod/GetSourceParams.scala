package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSourceParams extends GenericParams {
  var _source: NameList
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var id: String
  var index: String
  var preference: js.UndefOr[String] = js.undefined
  var realtime: js.UndefOr[Boolean] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var `type`: String
  var version: js.UndefOr[Double] = js.undefined
  var versionType: js.UndefOr[VersionType] = js.undefined
}

object GetSourceParams {
  @scala.inline
  def apply(
    _source: NameList,
    id: String,
    index: String,
    `type`: String,
    _sourceExclude: NameList = null,
    _sourceInclude: NameList = null,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    preference: String = null,
    realtime: js.UndefOr[Boolean] = js.undefined,
    refresh: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    routing: String = null,
    version: js.UndefOr[Double] = js.undefined,
    versionType: VersionType = null
  ): GetSourceParams = {
    val __obj = js.Dynamic.literal(_source = _source.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_sourceExclude != null) __obj.updateDynamic("_sourceExclude")(_sourceExclude.asInstanceOf[js.Any])
    if (_sourceInclude != null) __obj.updateDynamic("_sourceInclude")(_sourceInclude.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (versionType != null) __obj.updateDynamic("versionType")(versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSourceParams]
  }
}

