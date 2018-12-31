package typings
package gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportType extends js.Object {
  /** The date/time when this report type was/will be deprecated. */
  var deprecateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the report type (max. 100 characters). */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the report type (max. 100 characters). */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True if this a system-managed report type; otherwise false. Reporting jobs
    * for system-managed report types are created automatically and can thus not
    * be used in the `CreateJob` method.
    */
  var systemManaged: js.UndefOr[scala.Boolean] = js.undefined
}

