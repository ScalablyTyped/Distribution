package typings.dexie.anon

import typings.dexie.mod.IndexableType
import typings.dexie.mod.IndexableTypePart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key[TKey] extends js.Object {
  var key: IndexableType = js.native
  var primaryKey: TKey = js.native
}

object Key {
  @scala.inline
  def apply[TKey](key: IndexableType, primaryKey: TKey): Key[TKey] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[TKey]]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key[_], TKey] (val x: Self with Key[TKey]) extends AnyVal {
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
    def setKeyVarargs(value: (js.Array[Unit] | IndexableTypePart)*): Self = this.set("key", js.Array(value :_*))
    @scala.inline
    def setKey(value: IndexableType): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryKey(value: TKey): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
  }
  
}

