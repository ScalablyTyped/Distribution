package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentResponse extends js.Object {
  var _id: java.lang.String
  var _index: java.lang.String
  var _shards: ShardsResponse
  var _type: java.lang.String
  var _version: scala.Double
  var found: scala.Boolean
  var result: java.lang.String
}

object DeleteDocumentResponse {
  @scala.inline
  def apply(
    _id: java.lang.String,
    _index: java.lang.String,
    _shards: ShardsResponse,
    _type: java.lang.String,
    _version: scala.Double,
    found: scala.Boolean,
    result: java.lang.String
  ): DeleteDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    __obj.updateDynamic("_index")(_index)
    __obj.updateDynamic("_shards")(_shards)
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("_version")(_version)
    __obj.updateDynamic("found")(found)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[DeleteDocumentResponse]
  }
}

