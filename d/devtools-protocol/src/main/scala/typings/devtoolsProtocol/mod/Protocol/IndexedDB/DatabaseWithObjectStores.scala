package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseWithObjectStores extends StObject {
  
  /**
    * Database name.
    */
  var name: String
  
  /**
    * Object stores in this database.
    */
  var objectStores: js.Array[ObjectStore]
  
  /**
    * Database version (type is not 'integer', as the standard
    * requires the version number to be 'unsigned long long')
    */
  var version: Double
}
object DatabaseWithObjectStores {
  
  inline def apply(name: String, objectStores: js.Array[ObjectStore], version: Double): DatabaseWithObjectStores = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], objectStores = objectStores.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseWithObjectStores]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseWithObjectStores] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObjectStores(value: js.Array[ObjectStore]): Self = StObject.set(x, "objectStores", value.asInstanceOf[js.Any])
    
    inline def setObjectStoresVarargs(value: ObjectStore*): Self = StObject.set(x, "objectStores", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
