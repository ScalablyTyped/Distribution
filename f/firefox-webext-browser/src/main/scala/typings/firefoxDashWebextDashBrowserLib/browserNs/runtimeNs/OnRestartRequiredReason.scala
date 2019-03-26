package typings
package firefoxDashWebextDashBrowserLib.browserNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The reason that the event is being dispatched. 'app_update' is used when the restart is needed because the
  * application is updated to a newer version. 'os_update' is used when the restart is needed because the browser/OS
  * is updated to a newer version. 'periodic' is used when the system runs for more than the permitted uptime set in
  * the enterprise policy.
  */
/* Rewritten from type alias, can be one of: 
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.app_update
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.os_update
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.periodic
*/
trait OnRestartRequiredReason extends js.Object

