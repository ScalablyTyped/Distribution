package typings.dexie.mod

import typings.dexie.anon.Bound
import typings.dexie.anon.Open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexieOptions extends js.Object {
  var IDBKeyRange: js.UndefOr[Bound] = js.native
  var addons: js.UndefOr[js.Array[js.Function1[/* db */ Dexie, Unit]]] = js.native
  var allowEmptyDB: js.UndefOr[Boolean] = js.native
  var autoOpen: js.UndefOr[Boolean] = js.native
  var indexedDB: js.UndefOr[Open] = js.native
}

object DexieOptions {
  @scala.inline
  def apply(): DexieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DexieOptions]
  }
  @scala.inline
  implicit class DexieOptionsOps[Self <: DexieOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIDBKeyRange(value: Bound): Self = this.set("IDBKeyRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIDBKeyRange: Self = this.set("IDBKeyRange", js.undefined)
    @scala.inline
    def setAddonsVarargs(value: (js.Function1[/* db */ Dexie, Unit])*): Self = this.set("addons", js.Array(value :_*))
    @scala.inline
    def setAddons(value: js.Array[js.Function1[/* db */ Dexie, Unit]]): Self = this.set("addons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddons: Self = this.set("addons", js.undefined)
    @scala.inline
    def setAllowEmptyDB(value: Boolean): Self = this.set("allowEmptyDB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmptyDB: Self = this.set("allowEmptyDB", js.undefined)
    @scala.inline
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    @scala.inline
    def setIndexedDB(value: Open): Self = this.set("indexedDB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexedDB: Self = this.set("indexedDB", js.undefined)
  }
  
}

