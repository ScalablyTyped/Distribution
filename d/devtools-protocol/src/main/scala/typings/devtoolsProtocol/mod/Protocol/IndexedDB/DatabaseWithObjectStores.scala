package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseWithObjectStores extends StObject {
  
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
  implicit class DatabaseWithObjectStoresMutableBuilder[Self <: DatabaseWithObjectStores] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectStores(value: js.Array[ObjectStore]): Self = StObject.set(x, "objectStores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectStoresVarargs(value: ObjectStore*): Self = StObject.set(x, "objectStores", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
