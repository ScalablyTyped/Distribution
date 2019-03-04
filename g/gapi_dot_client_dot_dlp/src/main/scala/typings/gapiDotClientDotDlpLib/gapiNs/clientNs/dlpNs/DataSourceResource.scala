package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceResource extends js.Object {
  /**
    * Schedules a job to compute risk analysis metrics over content in a Google
    * Cloud Platform repository.
    */
  def analyze(request: gapiDotClientDotDlpLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunningOperation]
}

object DataSourceResource {
  @scala.inline
  def apply(
    analyze: js.Function1[
      gapiDotClientDotDlpLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunningOperation]
    ]
  ): DataSourceResource = {
    val __obj = js.Dynamic.literal(analyze = analyze)
  
    __obj.asInstanceOf[DataSourceResource]
  }
}

