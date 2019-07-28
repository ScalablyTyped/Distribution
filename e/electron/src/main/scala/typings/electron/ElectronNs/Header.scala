package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  /**
    * Specify an extra header name.
    */
  var name: String
}

object Header {
  @scala.inline
  def apply(name: String): Header = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[Header]
  }
}

