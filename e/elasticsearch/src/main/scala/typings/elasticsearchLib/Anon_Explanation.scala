package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Explanation[T] extends js.Object {
  var _explanation: js.UndefOr[elasticsearchLib.elasticsearchMod.Explanation] = js.undefined
  var _id: java.lang.String
  var _index: java.lang.String
  var _score: scala.Double
  var _source: T
  var _type: java.lang.String
  var _version: js.UndefOr[scala.Double] = js.undefined
  var fields: js.UndefOr[js.Any] = js.undefined
  var highlight: js.UndefOr[js.Any] = js.undefined
  var inner_hits: js.UndefOr[js.Any] = js.undefined
  var matched_queries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Explanation {
  @scala.inline
  def apply[T](
    _id: java.lang.String,
    _index: java.lang.String,
    _score: scala.Double,
    _source: T,
    _type: java.lang.String,
    _explanation: elasticsearchLib.elasticsearchMod.Explanation = null,
    _version: scala.Int | scala.Double = null,
    fields: js.Any = null,
    highlight: js.Any = null,
    inner_hits: js.Any = null,
    matched_queries: js.Array[java.lang.String] = null,
    sort: js.Array[java.lang.String] = null
  ): Anon_Explanation[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    __obj.updateDynamic("_index")(_index)
    __obj.updateDynamic("_score")(_score)
    __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    __obj.updateDynamic("_type")(_type)
    if (_explanation != null) __obj.updateDynamic("_explanation")(_explanation)
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (inner_hits != null) __obj.updateDynamic("inner_hits")(inner_hits)
    if (matched_queries != null) __obj.updateDynamic("matched_queries")(matched_queries)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[Anon_Explanation[T]]
  }
}

