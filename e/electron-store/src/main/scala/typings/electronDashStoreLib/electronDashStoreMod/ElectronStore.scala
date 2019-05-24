package typings
package electronDashStoreLib.electronDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectronStore[T]
  extends confLib.confMod.^[T] {
  /**
  	Open the storage file in the user's editor.
  	*/
  def openInEditor(): scala.Unit = js.native
}

