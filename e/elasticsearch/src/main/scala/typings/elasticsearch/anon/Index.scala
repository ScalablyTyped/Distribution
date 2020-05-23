package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: String | js.Array[String]
  var query: js.UndefOr[js.Any] = js.undefined
  var remote: js.UndefOr[Host] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Index {
  @scala.inline
  def apply(
    index: String | js.Array[String],
    query: js.Any = null,
    remote: Host = null,
    size: js.UndefOr[Double] = js.undefined,
    sort: js.Any = null,
    `type`: String | js.Array[String] = null
  ): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

