package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceSettings extends js.Object {
  var experimentalForceOwningTab: js.UndefOr[Boolean] = js.undefined
  var experimentalTabSynchronization: js.UndefOr[Boolean] = js.undefined
  var synchronizeTabs: js.UndefOr[Boolean] = js.undefined
}

object PersistenceSettings {
  @scala.inline
  def apply(
    experimentalForceOwningTab: js.UndefOr[Boolean] = js.undefined,
    experimentalTabSynchronization: js.UndefOr[Boolean] = js.undefined,
    synchronizeTabs: js.UndefOr[Boolean] = js.undefined
  ): PersistenceSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(experimentalForceOwningTab)) __obj.updateDynamic("experimentalForceOwningTab")(experimentalForceOwningTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalTabSynchronization)) __obj.updateDynamic("experimentalTabSynchronization")(experimentalTabSynchronization.get.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronizeTabs)) __obj.updateDynamic("synchronizeTabs")(synchronizeTabs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceSettings]
  }
}

