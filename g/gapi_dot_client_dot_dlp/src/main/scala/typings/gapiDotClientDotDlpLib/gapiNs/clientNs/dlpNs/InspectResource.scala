package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectResource extends js.Object {
  var operations: OperationsResource
  var results: ResultsResource
}

object InspectResource {
  @scala.inline
  def apply(operations: OperationsResource, results: ResultsResource): InspectResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operations")(operations)
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[InspectResource]
  }
}

