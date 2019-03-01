package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceSettings extends js.Object {
  /**
    * Whether to synchronize the in-memory state of multiple tabs. Setting this
    * to 'true' in all open tabs enables shared access to local persistence,
    * shared execution of queries and latency-compensated local document updates
    * across all connected instances.
    *
    * To enable this mode, `experimentalTabSynchronization:true` needs to be set
    * globally in all active tabs. If omitted or set to 'false',
    * `enablePersistence()` will fail in all but the first tab.
    *
    * NOTE: This mode is not yet recommended for production use.
    */
  var experimentalTabSynchronization: js.UndefOr[scala.Boolean] = js.undefined
}

object PersistenceSettings {
  @scala.inline
  def apply(experimentalTabSynchronization: js.UndefOr[scala.Boolean] = js.undefined): PersistenceSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(experimentalTabSynchronization)) __obj.updateDynamic("experimentalTabSynchronization")(experimentalTabSynchronization)
    __obj.asInstanceOf[PersistenceSettings]
  }
}

