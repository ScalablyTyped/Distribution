package typings
package electronLib.ElectronNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[TouchBarGroupConstructorOptions]
  }
}

