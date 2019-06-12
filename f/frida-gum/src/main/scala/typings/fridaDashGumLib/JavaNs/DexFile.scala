package typings
package fridaDashGumLib.JavaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DexFile extends js.Object {
  /**
    * Determines available class names.
    */
  def getClassNames(): js.Array[java.lang.String]
  /**
    * Loads the contained classes into the VM.
    */
  def load(): scala.Unit
}

object DexFile {
  @scala.inline
  def apply(getClassNames: () => js.Array[java.lang.String], load: () => scala.Unit): DexFile = {
    val __obj = js.Dynamic.literal(getClassNames = js.Any.fromFunction0(getClassNames), load = js.Any.fromFunction0(load))
  
    __obj.asInstanceOf[DexFile]
  }
}

