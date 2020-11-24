package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteObjectStoreEntriesRequest extends js.Object {
  
  var databaseName: String = js.native
  
  /**
    * Range of entry keys to delete
    */
  var keyRange: KeyRange = js.native
  
  var objectStoreName: String = js.native
  
  var securityOrigin: String = js.native
}
object DeleteObjectStoreEntriesRequest {
  
  @scala.inline
  def apply(databaseName: String, keyRange: KeyRange, objectStoreName: String, securityOrigin: String): DeleteObjectStoreEntriesRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], keyRange = keyRange.asInstanceOf[js.Any], objectStoreName = objectStoreName.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectStoreEntriesRequest]
  }
  
  @scala.inline
  implicit class DeleteObjectStoreEntriesRequestOps[Self <: DeleteObjectStoreEntriesRequest] (val x: Self) extends AnyVal {
    
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
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRange(value: KeyRange): Self = this.set("keyRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectStoreName(value: String): Self = this.set("objectStoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityOrigin(value: String): Self = this.set("securityOrigin", value.asInstanceOf[js.Any])
  }
}
