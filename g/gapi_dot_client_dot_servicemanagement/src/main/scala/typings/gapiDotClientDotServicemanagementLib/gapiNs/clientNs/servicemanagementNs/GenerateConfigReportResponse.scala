package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateConfigReportResponse extends js.Object {
  /**
    * list of ChangeReport, each corresponding to comparison between two
    * service configurations.
    */
  var changeReports: js.UndefOr[js.Array[ChangeReport]] = js.undefined
  /**
    * Errors / Linter warnings associated with the service definition this
    * report
    * belongs to.
    */
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  /** ID of the service configuration this report belongs to. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the service this report belongs to. */
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
}

