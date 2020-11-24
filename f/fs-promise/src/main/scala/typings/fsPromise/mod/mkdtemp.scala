package typings.fsPromise.mod

import typings.mz.anon.Encoding
import typings.mz.anon.`0`
import typings.mz.anon.`1`
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "mkdtemp")
@js.native
object mkdtemp extends js.Object {
  
  def apply(prefix: String): js.Promise[String] = js.native
  def apply(
    prefix: String,
    callback: js.Function2[(/* err */ ErrnoException) | Null, /* folder */ String, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def apply(prefix: String, options: String): js.Promise[String | Buffer] = js.native
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
  def apply(prefix: String, options: Encoding): js.Promise[String] = js.native
  def apply(
    prefix: String,
    options: Encoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
  def apply(prefix: String, options: `0`): js.Promise[Buffer] = js.native
  def apply(
    prefix: String,
    options: `0`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  def apply(prefix: String, options: `1`): js.Promise[String | Buffer] = js.native
  def apply(
    prefix: String,
    options: `1`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
  def apply(
    prefix: String,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
}
