package typings
package fsDashExtraDashPromiseLib.fsDashExtraDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-extra-promise", "fchown")
@js.native
object fchownNs extends js.Object {
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: scala.Double, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = js.native
}

