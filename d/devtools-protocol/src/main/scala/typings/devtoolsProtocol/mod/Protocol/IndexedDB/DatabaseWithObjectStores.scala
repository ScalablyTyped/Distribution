package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseWithObjectStores extends js.Object {
  /**
    * Database name.
    */
  var name: String = js.native
  /**
    * Object stores in this database.
    */
  var objectStores: js.Array[ObjectStore] = js.native
  /**
    * Database version (type is not 'integer', as the standard
    * requires the version number to be 'unsigned long long')
    */
  var version: Double = js.native
}

object DatabaseWithObjectStores {
  @scala.inline
  def apply(name: String, objectStores: js.Array[ObjectStore], version: Double): DatabaseWithObjectStores = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], objectStores = objectStores.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseWithObjectStores]
  }
  @scala.inline
  implicit class DatabaseWithObjectStoresOps[Self <: DatabaseWithObjectStores] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectStoresVarargs(value: ObjectStore*): Self = this.set("objectStores", js.Array(value :_*))
    @scala.inline
    def setObjectStores(value: js.Array[ObjectStore]): Self = this.set("objectStores", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

