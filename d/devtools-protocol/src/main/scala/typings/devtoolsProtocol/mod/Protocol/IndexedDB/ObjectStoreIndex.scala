package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectStoreIndex extends js.Object {
  /**
    * Index key path.
    */
  var keyPath: KeyPath = js.native
  /**
    * If true, index allows multiple entries for a key.
    */
  var multiEntry: Boolean = js.native
  /**
    * Index name.
    */
  var name: String = js.native
  /**
    * If true, index is unique.
    */
  var unique: Boolean = js.native
}

object ObjectStoreIndex {
  @scala.inline
  def apply(keyPath: KeyPath, multiEntry: Boolean, name: String, unique: Boolean): ObjectStoreIndex = {
    val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], multiEntry = multiEntry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectStoreIndex]
  }
  @scala.inline
  implicit class ObjectStoreIndexOps[Self <: ObjectStoreIndex] (val x: Self) extends AnyVal {
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
    def setKeyPath(value: KeyPath): Self = this.set("keyPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiEntry(value: Boolean): Self = this.set("multiEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
  }
  
}

