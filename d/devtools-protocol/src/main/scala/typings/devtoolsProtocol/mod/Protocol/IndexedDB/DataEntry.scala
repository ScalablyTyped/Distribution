package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataEntry extends js.Object {
  
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
  implicit class DataEntryOps[Self <: DataEntry] (val x: Self) extends AnyVal {
    
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
    def setKey(value: RemoteObject): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKey(value: RemoteObject): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: RemoteObject): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
