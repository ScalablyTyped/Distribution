package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDlp.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceResource extends js.Object {
  /**
    * Schedules a job to compute risk analysis metrics over content in a Google
    * Cloud Platform repository.
    */
  def analyze(request: Anon_Accesstoken): Request[GoogleLongrunningOperation]
}

object DataSourceResource {
  @scala.inline
  def apply(analyze: Anon_Accesstoken => Request[GoogleLongrunningOperation]): DataSourceResource = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze))
  
    __obj.asInstanceOf[DataSourceResource]
  }
}

