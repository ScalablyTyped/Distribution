package typings
package electronDashStoreLib.electronDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ElectronStore[T] extends js.Object {
  /**
  	Open the storage file in the user's editor.
  	*/
  def openInEditor(): scala.Unit
}

object ElectronStore {
  @scala.inline
  def apply[T](openInEditor: () => scala.Unit): ElectronStore[T] = {
    val __obj = js.Dynamic.literal(openInEditor = js.Any.fromFunction0(openInEditor))
  
    __obj.asInstanceOf[ElectronStore[T]]
  }
}

