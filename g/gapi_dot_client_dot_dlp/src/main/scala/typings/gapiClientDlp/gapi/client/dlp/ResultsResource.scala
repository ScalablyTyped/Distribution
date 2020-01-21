package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsResource extends js.Object {
  var findings: FindingsResource
}

object ResultsResource {
  @scala.inline
  def apply(findings: FindingsResource): ResultsResource = {
    val __obj = js.Dynamic.literal(findings = findings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResultsResource]
  }
}

