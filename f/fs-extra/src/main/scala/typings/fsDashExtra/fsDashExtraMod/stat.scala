package typings.fsDashExtra.fsDashExtraMod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-extra", "stat")
@js.native
object stat extends js.Object {
  def apply(path: String): js.Promise[typings.node.fsMod.Stats] = js.native
  def apply(
    path: String,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typings.node.fsMod.Stats, _]
  ): Unit = js.native
  def apply(path: Buffer): js.Promise[typings.node.fsMod.Stats] = js.native
  def apply(
    path: Buffer,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typings.node.fsMod.Stats, _]
  ): Unit = js.native
  /**
    * Asynchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  /**
    * Asynchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
}

