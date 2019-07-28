package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainResponse extends js.Object {
  var _id: String
  var _index: String
  var _type: String
  var explanation: ExplainResponseDetails
  var matched: Boolean
}

object ExplainResponse {
  @scala.inline
  def apply(_id: String, _index: String, _type: String, explanation: ExplainResponseDetails, matched: Boolean): ExplainResponse = {
    val __obj = js.Dynamic.literal(_id = _id, _index = _index, _type = _type, explanation = explanation, matched = matched)
  
    __obj.asInstanceOf[ExplainResponse]
  }
}

