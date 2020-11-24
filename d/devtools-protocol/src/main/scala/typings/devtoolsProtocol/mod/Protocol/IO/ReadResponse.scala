package typings.devtoolsProtocol.mod.Protocol.IO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadResponse extends js.Object {
  
  /**
    * Set if the data is base64-encoded
    */
  var base64Encoded: js.UndefOr[Boolean] = js.native
  
  /**
    * Data that were read.
    */
  var data: String = js.native
  
  /**
    * Set if the end-of-file condition occured while reading.
    */
  var eof: Boolean = js.native
}
object ReadResponse {
  
  @scala.inline
  def apply(data: String, eof: Boolean): ReadResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eof = eof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadResponse]
  }
  
  @scala.inline
  implicit class ReadResponseOps[Self <: ReadResponse] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEof(value: Boolean): Self = this.set("eof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase64Encoded(value: Boolean): Self = this.set("base64Encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase64Encoded: Self = this.set("base64Encoded", js.undefined)
  }
}
