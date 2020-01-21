package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DexFile extends js.Object {
  /**
    * Determines available class names.
    */
  def getClassNames(): js.Array[String]
  /**
    * Loads the contained classes into the VM.
    */
  def load(): Unit
}

object DexFile {
  @scala.inline
  def apply(getClassNames: () => js.Array[String], load: () => Unit): DexFile = {
    val __obj = js.Dynamic.literal(getClassNames = js.Any.fromFunction0(getClassNames), load = js.Any.fromFunction0(load))
  
    __obj.asInstanceOf[DexFile]
  }
}

