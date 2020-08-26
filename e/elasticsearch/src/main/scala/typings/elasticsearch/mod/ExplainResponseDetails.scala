package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplainResponseDetails extends js.Object {
  var description: String = js.native
  var details: js.Array[ExplainResponseDetails] = js.native
  var value: Double = js.native
}

object ExplainResponseDetails {
  @scala.inline
  def apply(description: String, details: js.Array[ExplainResponseDetails], value: Double): ExplainResponseDetails = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainResponseDetails]
  }
  @scala.inline
  implicit class ExplainResponseDetailsOps[Self <: ExplainResponseDetails] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetailsVarargs(value: ExplainResponseDetails*): Self = this.set("details", js.Array(value :_*))
    @scala.inline
    def setDetails(value: js.Array[ExplainResponseDetails]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

