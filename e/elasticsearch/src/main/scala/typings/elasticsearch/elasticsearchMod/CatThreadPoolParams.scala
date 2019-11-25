package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.elasticsearchStrings.Empty
import typings.elasticsearch.elasticsearchStrings.g
import typings.elasticsearch.elasticsearchStrings.k
import typings.elasticsearch.elasticsearchStrings.m
import typings.elasticsearch.elasticsearchStrings.p
import typings.elasticsearch.elasticsearchStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatThreadPoolParams extends CatCommonParams {
  var size: js.UndefOr[Empty | k | m | g | t | p] = js.undefined
  var threadPoolPatterns: js.UndefOr[NameList] = js.undefined
}

object CatThreadPoolParams {
  @scala.inline
  def apply(
    format: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    h: NameList = null,
    help: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    local: js.UndefOr[Boolean] = js.undefined,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    requestTimeout: Int | Double = null,
    size: Empty | k | m | g | t | p = null,
    threadPoolPatterns: NameList = null,
    v: js.UndefOr[Boolean] = js.undefined
  ): CatThreadPoolParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (threadPoolPatterns != null) __obj.updateDynamic("threadPoolPatterns")(threadPoolPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatThreadPoolParams]
  }
}

