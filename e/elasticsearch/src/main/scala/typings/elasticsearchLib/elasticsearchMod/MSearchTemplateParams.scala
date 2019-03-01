package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSearchTemplateParams extends GenericParams {
  var index: js.UndefOr[NameList] = js.undefined
  var search_type: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.query_then_fetch | elasticsearchLib.elasticsearchLibStrings.query_and_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_then_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_and_fetch
  ] = js.undefined
  var `type`: js.UndefOr[NameList] = js.undefined
}

object MSearchTemplateParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    index: NameList = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    search_type: elasticsearchLib.elasticsearchLibStrings.query_then_fetch | elasticsearchLib.elasticsearchLibStrings.query_and_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_then_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_and_fetch = null,
    `type`: NameList = null
  ): MSearchTemplateParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (search_type != null) __obj.updateDynamic("search_type")(search_type.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSearchTemplateParams]
  }
}

