package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResponse[T] extends js.Object {
  var _id: String
  var _index: String
  var _routing: js.UndefOr[String] = js.undefined
  var _source: T
  var _type: String
  var _version: Double
  var found: Boolean
}

object GetResponse {
  @scala.inline
  def apply[T](
    _id: String,
    _index: String,
    _source: T,
    _type: String,
    _version: Double,
    found: Boolean,
    _routing: String = null
  ): GetResponse[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _source = _source.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any])
    if (_routing != null) __obj.updateDynamic("_routing")(_routing.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponse[T]]
  }
}

