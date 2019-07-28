package typings.electronDashStore.electronDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectronStore[T]
  extends typings.conf.confMod.^[T] {
  /**
  	Open the storage file in the user's editor.
  	*/
  def openInEditor(): Unit = js.native
}

