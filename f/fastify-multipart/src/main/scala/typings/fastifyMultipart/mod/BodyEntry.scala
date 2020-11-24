package typings.fastifyMultipart.mod

import typings.fastifyMultipart.fastifyMultipartBooleans.`false`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyEntry extends js.Object {
  
  var data: Buffer = js.native
  
  var encoding: String = js.native
  
  var filename: String = js.native
  
  var limit: `false` = js.native
  
  var mimetype: String = js.native
}
object BodyEntry {
  
  @scala.inline
  def apply(data: Buffer, encoding: String, filename: String, limit: `false`, mimetype: String): BodyEntry = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyEntry]
  }
  
  @scala.inline
  implicit class BodyEntryOps[Self <: BodyEntry] (val x: Self) extends AnyVal {
    
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
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: `false`): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimetype(value: String): Self = this.set("mimetype", value.asInstanceOf[js.Any])
  }
}
