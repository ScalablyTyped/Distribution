package typings.dexie.mod

import org.scalablytyped.runtime.Instantiable0
import typings.dexie.anon.Instantiable
import typings.std.IDBFactory
import typings.std.global.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexieDOMDependencies extends js.Object {
  var IDBKeyRange: Instantiable with Instantiable0[typings.std.global.IDBKeyRange] = js.native
  var indexedDB: IDBFactory = js.native
}

object DexieDOMDependencies {
  @scala.inline
  def apply(IDBKeyRange: Instantiable with Instantiable0[IDBKeyRange], indexedDB: IDBFactory): DexieDOMDependencies = {
    val __obj = js.Dynamic.literal(IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[DexieDOMDependencies]
  }
  @scala.inline
  implicit class DexieDOMDependenciesOps[Self <: DexieDOMDependencies] (val x: Self) extends AnyVal {
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
    def setIDBKeyRange(value: Instantiable with Instantiable0[IDBKeyRange]): Self = this.set("IDBKeyRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexedDB(value: IDBFactory): Self = this.set("indexedDB", value.asInstanceOf[js.Any])
  }
  
}

