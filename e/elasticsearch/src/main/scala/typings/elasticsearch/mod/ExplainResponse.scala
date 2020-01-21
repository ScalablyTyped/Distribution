package typings.elasticsearch.mod

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
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExplainResponse]
  }
}

