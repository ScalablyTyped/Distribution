package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Explanation[T] extends js.Object {
  var _explanation: js.UndefOr[typings.elasticsearch.mod.Explanation] = js.undefined
  var _id: String
  var _index: String
  var _score: Double
  var _source: T
  var _type: String
  var _version: js.UndefOr[Double] = js.undefined
  var fields: js.UndefOr[js.Any] = js.undefined
  var highlight: js.UndefOr[js.Any] = js.undefined
  var inner_hits: js.UndefOr[js.Any] = js.undefined
  var matched_queries: js.UndefOr[js.Array[String]] = js.undefined
  var sort: js.UndefOr[js.Array[String]] = js.undefined
}

object Explanation {
  @scala.inline
  def apply[T](
    _id: String,
    _index: String,
    _score: Double,
    _source: T,
    _type: String,
    _explanation: typings.elasticsearch.mod.Explanation = null,
    _version: js.UndefOr[Double] = js.undefined,
    fields: js.Any = null,
    highlight: js.Any = null,
    inner_hits: js.Any = null,
    matched_queries: js.Array[String] = null,
    sort: js.Array[String] = null
  ): Explanation[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _score = _score.asInstanceOf[js.Any], _source = _source.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any])
    if (_explanation != null) __obj.updateDynamic("_explanation")(_explanation.asInstanceOf[js.Any])
    if (!js.isUndefined(_version)) __obj.updateDynamic("_version")(_version.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (inner_hits != null) __obj.updateDynamic("inner_hits")(inner_hits.asInstanceOf[js.Any])
    if (matched_queries != null) __obj.updateDynamic("matched_queries")(matched_queries.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explanation[T]]
  }
}

