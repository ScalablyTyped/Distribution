package typings
package electronDashStoreLib.electronDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-store", JSImport.Namespace)
@js.native
class namespaced[T] () extends ElectronStore[T] {
  def this(options: ElectronStoreOptions[T]) = this()
}

