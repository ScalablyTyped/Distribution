package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiskAnalysisResource extends js.Object {
  var operations: OperationsResource = js.native
}

object RiskAnalysisResource {
  @scala.inline
  def apply(operations: OperationsResource): RiskAnalysisResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskAnalysisResource]
  }
  @scala.inline
  implicit class RiskAnalysisResourceOps[Self <: RiskAnalysisResource] (val x: Self) extends AnyVal {
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
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
  }
  
}

