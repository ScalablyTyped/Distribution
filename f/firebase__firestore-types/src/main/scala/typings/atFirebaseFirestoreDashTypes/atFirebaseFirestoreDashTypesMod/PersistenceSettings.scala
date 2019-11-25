package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceSettings extends js.Object {
  var experimentalTabSynchronization: js.UndefOr[Boolean] = js.undefined
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

