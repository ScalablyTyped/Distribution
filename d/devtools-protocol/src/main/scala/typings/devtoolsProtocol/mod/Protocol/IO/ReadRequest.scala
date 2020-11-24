package typings.devtoolsProtocol.mod.Protocol.IO

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadRequest extends js.Object {
  
  /**
    * Handle of the stream to read.
    */
  var handle: StreamHandle = js.native
  
  /**
    * Seek to the specified offset before reading (if not specificed, proceed with offset
    * following the last read). Some types of streams may only support sequential reads.
    */
  var offset: js.UndefOr[integer] = js.native
  
  /**
    * Maximum number of bytes to read (left upon the agent discretion if not specified).
    */
  var size: js.UndefOr[integer] = js.native
}
object ReadRequest {
  
  @scala.inline
  def apply(handle: StreamHandle): ReadRequest = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadRequest]
  }
  
  @scala.inline
  implicit class ReadRequestOps[Self <: ReadRequest] (val x: Self) extends AnyVal {
    
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
    def setHandle(value: StreamHandle): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: integer): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setSize(value: integer): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
