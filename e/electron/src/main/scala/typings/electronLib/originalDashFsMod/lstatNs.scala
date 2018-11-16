package typings
package electronLib.originalDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("original-fs", "lstat")
@js.native
object lstatNs extends js.Object {
  /**
           * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): stdLib.Promise[nodeLib.fsMod.Stats] = js.native
}

