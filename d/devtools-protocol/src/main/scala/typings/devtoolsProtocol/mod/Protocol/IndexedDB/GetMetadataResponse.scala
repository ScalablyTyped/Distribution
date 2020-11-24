package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMetadataResponse extends js.Object {
  
  /**
    * the entries count
    */
  var entriesCount: Double = js.native
  
  /**
    * the current value of key generator, to become the next inserted
    * key into the object store. Valid if objectStore.autoIncrement
    * is true.
    */
  var keyGeneratorValue: Double = js.native
}
object GetMetadataResponse {
  
  @scala.inline
  def apply(entriesCount: Double, keyGeneratorValue: Double): GetMetadataResponse = {
    val __obj = js.Dynamic.literal(entriesCount = entriesCount.asInstanceOf[js.Any], keyGeneratorValue = keyGeneratorValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetadataResponse]
  }
  
  @scala.inline
  implicit class GetMetadataResponseOps[Self <: GetMetadataResponse] (val x: Self) extends AnyVal {
    
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
    def setEntriesCount(value: Double): Self = this.set("entriesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyGeneratorValue(value: Double): Self = this.set("keyGeneratorValue", value.asInstanceOf[js.Any])
  }
}
