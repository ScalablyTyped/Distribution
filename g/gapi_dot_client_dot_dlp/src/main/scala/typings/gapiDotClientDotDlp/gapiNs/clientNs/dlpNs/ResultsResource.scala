package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsResource extends js.Object {
  var findings: FindingsResource
}

object ResultsResource {
  @scala.inline
  def apply(findings: FindingsResource): ResultsResource = {
    val __obj = js.Dynamic.literal(findings = findings)
  
    __obj.asInstanceOf[ResultsResource]
  }
}

