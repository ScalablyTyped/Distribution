package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentResponse extends js.Object {
  var _id: String
  var _index: String
  var _shards: ShardsResponse
  var _type: String
  var _version: Double
  var found: Boolean
  var result: String
}

object DeleteDocumentResponse {
  @scala.inline
  def apply(
    _id: String,
    _index: String,
    _shards: ShardsResponse,
    _type: String,
    _version: Double,
    found: Boolean,
    result: String
  ): DeleteDocumentResponse = {
    val __obj = js.Dynamic.literal(_id = _id, _index = _index, _shards = _shards, _type = _type, _version = _version, found = found, result = result)
  
    __obj.asInstanceOf[DeleteDocumentResponse]
  }
}

