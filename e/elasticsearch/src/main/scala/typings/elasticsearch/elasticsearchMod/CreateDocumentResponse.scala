package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDocumentResponse extends js.Object {
  var _id: String
  var _index: String
  var _shards: ShardsResponse
  var _type: String
  var _version: Double
  var created: Boolean
  var result: String
}

object CreateDocumentResponse {
  @scala.inline
  def apply(
    _id: String,
    _index: String,
    _shards: ShardsResponse,
    _type: String,
    _version: Double,
    created: Boolean,
    result: String
  ): CreateDocumentResponse = {
    val __obj = js.Dynamic.literal(_id = _id, _index = _index, _shards = _shards, _type = _type, _version = _version, created = created, result = result)
  
    __obj.asInstanceOf[CreateDocumentResponse]
  }
}

