package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResponse[T] extends js.Object {
  var _id: java.lang.String
  var _index: java.lang.String
  var _routing: js.UndefOr[java.lang.String] = js.undefined
  var _source: T
  var _type: java.lang.String
  var _version: scala.Double
  var found: scala.Boolean
}

object GetResponse {
  @scala.inline
  def apply[T](
    _id: java.lang.String,
    _index: java.lang.String,
    _source: T,
    _type: java.lang.String,
    _version: scala.Double,
    found: scala.Boolean,
    _routing: java.lang.String = null
  ): GetResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    __obj.updateDynamic("_index")(_index)
    __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("_version")(_version)
    __obj.updateDynamic("found")(found)
    if (_routing != null) __obj.updateDynamic("_routing")(_routing)
    __obj.asInstanceOf[GetResponse[T]]
  }
}

