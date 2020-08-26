package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplainResponse extends js.Object {
  var _id: String = js.native
  var _index: String = js.native
  var _type: String = js.native
  var explanation: ExplainResponseDetails = js.native
  var matched: Boolean = js.native
}

object ExplainResponse {
  @scala.inline
  def apply(_id: String, _index: String, _type: String, explanation: ExplainResponseDetails, matched: Boolean): ExplainResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainResponse]
  }
  @scala.inline
  implicit class ExplainResponseOps[Self <: ExplainResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def set_index(value: String): Self = this.set("_index", value.asInstanceOf[js.Any])
    @scala.inline
    def set_type(value: String): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setExplanation(value: ExplainResponseDetails): Self = this.set("explanation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatched(value: Boolean): Self = this.set("matched", value.asInstanceOf[js.Any])
  }
  
}

