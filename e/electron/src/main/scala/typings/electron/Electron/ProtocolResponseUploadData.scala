package typings.electron.Electron

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtocolResponseUploadData extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/structures/protocol-response-upload-data
  /**
    * MIME type of the content.
    */
  var contentType: String = js.native
  
  /**
    * Content to be sent.
    */
  var data: String | Buffer = js.native
}
object ProtocolResponseUploadData {
  
  @scala.inline
  def apply(contentType: String, data: String | Buffer): ProtocolResponseUploadData = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolResponseUploadData]
  }
  
  @scala.inline
  implicit class ProtocolResponseUploadDataOps[Self <: ProtocolResponseUploadData] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String | Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
