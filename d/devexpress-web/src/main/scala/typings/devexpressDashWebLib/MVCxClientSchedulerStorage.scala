package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side counterpart of the Scheduler Storage Control extension.
 */
@js.native
trait MVCxClientSchedulerStorage extends ASPxClientSchedulerStorageControl {
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientSchedulerStorage: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientSchedulerStorage]] = js.native
}

