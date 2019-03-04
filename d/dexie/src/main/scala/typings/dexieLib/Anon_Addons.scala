package typings
package dexieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addons extends js.Object {
  var IDBKeyRange: js.UndefOr[Anon_IDBKeyRange] = js.undefined
  var addons: js.UndefOr[js.Array[js.Function1[/* db */ dexieLib.dexieMod.Dexie, scala.Unit]]] = js.undefined
  var autoOpen: js.UndefOr[scala.Boolean] = js.undefined
  var indexedDB: js.UndefOr[stdLib.IDBFactory] = js.undefined
}

object Anon_Addons {
  @scala.inline
  def apply(
    IDBKeyRange: Anon_IDBKeyRange = null,
    addons: js.Array[js.Function1[/* db */ dexieLib.dexieMod.Dexie, scala.Unit]] = null,
    autoOpen: js.UndefOr[scala.Boolean] = js.undefined,
    indexedDB: stdLib.IDBFactory = null
  ): Anon_Addons = {
    val __obj = js.Dynamic.literal()
    if (IDBKeyRange != null) __obj.updateDynamic("IDBKeyRange")(IDBKeyRange)
    if (addons != null) __obj.updateDynamic("addons")(addons)
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen)
    if (indexedDB != null) __obj.updateDynamic("indexedDB")(indexedDB)
    __obj.asInstanceOf[Anon_Addons]
  }
}

