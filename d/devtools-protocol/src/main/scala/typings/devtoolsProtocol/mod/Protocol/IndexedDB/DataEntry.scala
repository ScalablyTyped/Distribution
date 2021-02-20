package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataEntry extends StObject {
  
  /**
    * Key object.
    */
  var key: RemoteObject = js.native
  
  /**
    * Primary key object.
    */
  var primaryKey: RemoteObject = js.native
  
  /**
    * Value object.
    */
  var value: RemoteObject = js.native
}
object DataEntry {
  
  @scala.inline
  def apply(key: RemoteObject, primaryKey: RemoteObject, value: RemoteObject): DataEntry = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEntry]
  }
  
  @scala.inline
  implicit class DataEntryMutableBuilder[Self <: DataEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: RemoteObject): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKey(value: RemoteObject): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: RemoteObject): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
