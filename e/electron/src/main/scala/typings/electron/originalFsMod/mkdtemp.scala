package typings.electron.originalFsMod

import typings.electron.electronStrings.buffer
import typings.node.Anon2
import typings.node.Anon3
import typings.node.AnonEncoding
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("original-fs", "mkdtemp")
@js.native
object mkdtemp extends js.Object {
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    */
  def apply(prefix: String, callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]): Unit = js.native
  def apply(
    prefix: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: String,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: Anon2,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: String,
    options: Anon3,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String | Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: String,
    options: AnonEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("__promisify__")
  def promisify(prefix: String): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify(prefix: String, options: String): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("__promisify__")
  def promisify(prefix: String, options: Anon2): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(prefix: String, options: Anon3): js.Promise[String | Buffer] = js.native
  @JSName("__promisify__")
  def promisify(prefix: String, options: AnonEncoding): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify_buffer(prefix: String, options: buffer): js.Promise[Buffer] = js.native
}

