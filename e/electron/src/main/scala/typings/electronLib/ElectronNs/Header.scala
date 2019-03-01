package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  /**
    * Specify an extra header name.
    */
  var name: java.lang.String
}

object Header {
  @scala.inline
  def apply(name: java.lang.String): Header = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Header]
  }
}

