package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectStoreIndex extends StObject {
  
  /**
    * Index key path.
    */
  var keyPath: KeyPath
  
  /**
    * If true, index allows multiple entries for a key.
    */
  var multiEntry: Boolean
  
  /**
    * Index name.
    */
  var name: String
  
  /**
    * If true, index is unique.
    */
  var unique: Boolean
}
object ObjectStoreIndex {
  
  @scala.inline
  def apply(keyPath: KeyPath, multiEntry: Boolean, name: String, unique: Boolean): ObjectStoreIndex = {
    val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], multiEntry = multiEntry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectStoreIndex]
  }
  
  @scala.inline
  implicit class ObjectStoreIndexMutableBuilder[Self <: ObjectStoreIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPath(value: KeyPath): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiEntry(value: Boolean): Self = StObject.set(x, "multiEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
  }
}
