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
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _shards = _shards.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateDocumentResponse]
  }
}

