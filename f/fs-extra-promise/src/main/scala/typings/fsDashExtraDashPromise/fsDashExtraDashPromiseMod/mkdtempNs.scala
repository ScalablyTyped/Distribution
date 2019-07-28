package typings.fsDashExtraDashPromise.fsDashExtraDashPromiseMod

import typings.fsDashExtraDashPromise.fsDashExtraDashPromiseStrings.buffer
import typings.node.Anon_BufferEncoding
import typings.node.Anon_EncodingBufferEncoding
import typings.node.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-extra-promise", "mkdtemp")
@js.native
object mkdtempNs extends js.Object {
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(prefix: String): js.Promise[String] = js.native
  def __promisify__(prefix: String, options: String): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(prefix: String, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def __promisify__(prefix: String, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
  def __promisify__(prefix: String, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
  def __promisify__(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(prefix: String, options: buffer): js.Promise[Buffer] = js.native
}

