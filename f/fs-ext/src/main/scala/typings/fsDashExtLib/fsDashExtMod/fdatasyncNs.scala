package typings
package fsDashExtLib.fsDashExtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-ext", "fdatasync")
@js.native
object fdatasyncNs extends js.Object {
  /**
    * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: scala.Double): js.Promise[scala.Unit] = js.native
}

