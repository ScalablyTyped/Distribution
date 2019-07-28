package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarGroupConstructorOptions extends js.Object {
  /**
    * Items to display as a group.
    */
  var items: TouchBar
}

object TouchBarGroupConstructorOptions {
  @scala.inline
  def apply(items: TouchBar): TouchBarGroupConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items)
  
    __obj.asInstanceOf[TouchBarGroupConstructorOptions]
  }
}

