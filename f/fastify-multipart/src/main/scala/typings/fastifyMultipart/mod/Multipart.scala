package typings.fastifyMultipart.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fastifyMultipart.mod.MultipartValue[T]
  - typings.fastifyMultipart.mod.MultipartFile
*/
trait Multipart[T] extends js.Object
object Multipart {
  
  @scala.inline
  def MultipartValue[T](value: T): Multipart[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multipart[T]]
  }
  
  @scala.inline
  def MultipartFile[T](
    encoding: String,
    fieldname: String,
    fields: MultipartFields,
    file: ReadableStream,
    filename: String,
    filepath: String,
    mimetype: String,
    toBuffer: () => js.Promise[Buffer]
  ): Multipart[T] = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], toBuffer = js.Any.fromFunction0(toBuffer))
    __obj.asInstanceOf[Multipart[T]]
  }
}
