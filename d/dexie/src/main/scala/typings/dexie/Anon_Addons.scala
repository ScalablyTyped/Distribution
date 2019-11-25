package typings.dexie

import typings.dexie.dexieMod.Dexie
import typings.std.IDBFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addons extends js.Object {
  var IDBKeyRange: js.UndefOr[Anon_IDBKeyRange] = js.undefined
  var addons: js.UndefOr[js.Array[js.Function1[/* db */ Dexie, Unit]]] = js.undefined
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  var indexedDB: js.UndefOr[IDBFactory] = js.undefined
}

object Anon_Addons {
  @scala.inline
  def apply(
    IDBKeyRange: Anon_IDBKeyRange = null,
    addons: js.Array[js.Function1[/* db */ Dexie, Unit]] = null,
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    indexedDB: IDBFactory = null
  ): Anon_Addons = {
    val __obj = js.Dynamic.literal()
    if (IDBKeyRange != null) __obj.updateDynamic("IDBKeyRange")(IDBKeyRange.asInstanceOf[js.Any])
    if (addons != null) __obj.updateDynamic("addons")(addons.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    if (indexedDB != null) __obj.updateDynamic("indexedDB")(indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Addons]
  }
}

