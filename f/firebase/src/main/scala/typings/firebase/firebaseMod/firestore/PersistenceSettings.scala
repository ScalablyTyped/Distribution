package typings.firebase.firebaseMod.firestore

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
    * @deprecated This setting is deprecated. To enabled synchronization between
    * multiple tabs, please use `synchronizeTabs: true` instead.
    */
  var experimentalTabSynchronization: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to synchronize the in-memory state of multiple tabs. Setting this
    * to 'true' in all open tabs enables shared access to local persistence,
    * shared execution of queries and latency-compensated local document updates
    * across all connected instances.
    *
    * To enable this mode, `synchronizeTabs:true` needs to be set globally in all
    * active tabs. If omitted or set to 'false', `enablePersistence()` will fail
    * in all but the first tab.
    */
  var synchronizeTabs: js.UndefOr[Boolean] = js.undefined
}

object PersistenceSettings {
  @scala.inline
  def apply(
    experimentalTabSynchronization: js.UndefOr[Boolean] = js.undefined,
    synchronizeTabs: js.UndefOr[Boolean] = js.undefined
  ): PersistenceSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(experimentalTabSynchronization)) __obj.updateDynamic("experimentalTabSynchronization")(experimentalTabSynchronization.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronizeTabs)) __obj.updateDynamic("synchronizeTabs")(synchronizeTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceSettings]
  }
}

