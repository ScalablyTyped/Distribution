package typings.fsPromise.mod

import typings.fsPromise.fsPromiseStrings.buffer
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "mkdtemp")
@js.native
object mkdtemp_buffer extends js.Object {
  
  def apply(prefix: String, options: buffer): js.Promise[Buffer] = js.native
  def apply(
    prefix: String,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
}
