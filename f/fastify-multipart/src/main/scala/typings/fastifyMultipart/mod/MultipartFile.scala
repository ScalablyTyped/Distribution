package typings.fastifyMultipart.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipartFile
  extends Multipart[js.Any] {
  
  var encoding: String = js.native
  
  var fieldname: String = js.native
  
  var fields: MultipartFields = js.native
  
  var file: ReadableStream = js.native
  
  var filename: String = js.native
  
  var filepath: String = js.native
  
  var mimetype: String = js.native
  
  def toBuffer(): js.Promise[Buffer] = js.native
}
object MultipartFile {
  
  @scala.inline
  def apply(
    encoding: String,
    fieldname: String,
    fields: MultipartFields,
    file: ReadableStream,
    filename: String,
    filepath: String,
    mimetype: String,
    toBuffer: () => js.Promise[Buffer]
  ): MultipartFile = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], toBuffer = js.Any.fromFunction0(toBuffer))
    __obj.asInstanceOf[MultipartFile]
  }
  
  @scala.inline
  implicit class MultipartFileOps[Self <: MultipartFile] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldname(value: String): Self = this.set("fieldname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: MultipartFields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: ReadableStream): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilepath(value: String): Self = this.set("filepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimetype(value: String): Self = this.set("mimetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToBuffer(value: () => js.Promise[Buffer]): Self = this.set("toBuffer", js.Any.fromFunction0(value))
  }
}
