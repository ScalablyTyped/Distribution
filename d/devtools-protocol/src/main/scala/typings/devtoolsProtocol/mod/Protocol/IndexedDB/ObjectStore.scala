package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectStore extends js.Object {
  
  /**
    * If true, object store has auto increment flag set.
    */
  var autoIncrement: Boolean = js.native
  
  /**
    * Indexes in this object store.
    */
  var indexes: js.Array[ObjectStoreIndex] = js.native
  
  /**
    * Object store key path.
    */
  var keyPath: KeyPath = js.native
  
  /**
    * Object store name.
    */
  var name: String = js.native
}
object ObjectStore {
  
  @scala.inline
  def apply(autoIncrement: Boolean, indexes: js.Array[ObjectStoreIndex], keyPath: KeyPath, name: String): ObjectStore = {
    val __obj = js.Dynamic.literal(autoIncrement = autoIncrement.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectStore]
  }
  
  @scala.inline
  implicit class ObjectStoreOps[Self <: ObjectStore] (val x: Self) extends AnyVal {
    
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
    def setAutoIncrement(value: Boolean): Self = this.set("autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesVarargs(value: ObjectStoreIndex*): Self = this.set("indexes", js.Array(value :_*))
    
    @scala.inline
    def setIndexes(value: js.Array[ObjectStoreIndex]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPath(value: KeyPath): Self = this.set("keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
