package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RiskAnalysisResource extends js.Object {
  var operations: OperationsResource
}

object RiskAnalysisResource {
  @scala.inline
  def apply(operations: OperationsResource): RiskAnalysisResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RiskAnalysisResource]
  }
}

