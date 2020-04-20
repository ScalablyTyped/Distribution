package typings.gapiClientDlp.gapi.client.dlp

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
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectResource]
  }
}

