package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RiskAnalysisResource extends js.Object {
  var operations: OperationsResource
}

object RiskAnalysisResource {
  @scala.inline
  def apply(operations: OperationsResource): RiskAnalysisResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[RiskAnalysisResource]
  }
}

