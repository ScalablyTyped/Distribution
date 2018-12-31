package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YarnApplication extends js.Object {
  /** Required. The application name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The numerical progress of the application, from 1 to 100. */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /** Required. The application state. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or TimelineServer that provides application-specific information. The URL uses the
    * internal hostname, and requires a proxy server for resolution and, possibly, access.
    */
  var trackingUrl: js.UndefOr[java.lang.String] = js.undefined
}

