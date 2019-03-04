package typings
package dragsterLib.dragsterMod.DragsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dragster extends js.Object {
  def removeListeners(): scala.Unit
  def reset(): scala.Unit
}

object Dragster {
  @scala.inline
  def apply(removeListeners: js.Function0[scala.Unit], reset: js.Function0[scala.Unit]): Dragster = {
    val __obj = js.Dynamic.literal(removeListeners = removeListeners, reset = reset)
  
    __obj.asInstanceOf[Dragster]
  }
}

