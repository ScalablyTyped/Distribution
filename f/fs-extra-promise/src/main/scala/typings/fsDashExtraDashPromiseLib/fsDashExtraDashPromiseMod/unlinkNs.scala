package typings
package fsDashExtraDashPromiseLib.fsDashExtraDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-extra-promise", "unlink")
@js.native
object unlinkNs extends js.Object {
  /**
           * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): js.Promise[scala.Unit] = js.native
}

