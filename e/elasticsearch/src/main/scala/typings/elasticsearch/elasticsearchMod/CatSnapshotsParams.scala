package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatSnapshotsParams extends GenericParams {
  var format: String
  var h: js.UndefOr[NameList] = js.undefined
  var help: js.UndefOr[Boolean] = js.undefined
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var repository: js.UndefOr[NameList] = js.undefined
  var v: js.UndefOr[Boolean] = js.undefined
}

object CatSnapshotsParams {
  @scala.inline
  def apply(
    format: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    h: NameList = null,
    help: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignoreUnavailable: js.UndefOr[Boolean] = js.undefined,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    repository: NameList = null,
    requestTimeout: Int | Double = null,
    v: js.UndefOr[Boolean] = js.undefined
  ): CatSnapshotsParams = {
    val __obj = js.Dynamic.literal(format = format)
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[CatSnapshotsParams]
  }
}

