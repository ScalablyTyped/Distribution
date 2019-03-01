package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: java.lang.String | js.Array[java.lang.String]
  var query: js.UndefOr[js.Any] = js.undefined
  var remote: js.UndefOr[Anon_Host] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(
    index: java.lang.String | js.Array[java.lang.String],
    query: js.Any = null,
    remote: Anon_Host = null,
    size: scala.Int | scala.Double = null,
    sort: js.Any = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null
  ): Anon_Index = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (remote != null) __obj.updateDynamic("remote")(remote)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Index]
  }
}

