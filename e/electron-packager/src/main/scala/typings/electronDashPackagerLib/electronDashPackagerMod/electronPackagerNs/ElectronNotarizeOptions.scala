package typings
package electronDashPackagerLib.electronDashPackagerMod.electronPackagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectronNotarizeOptions extends js.Object {
  var appleId: java.lang.String
  var appleIdPassword: java.lang.String
}

object ElectronNotarizeOptions {
  @scala.inline
  def apply(appleId: java.lang.String, appleIdPassword: java.lang.String): ElectronNotarizeOptions = {
    val __obj = js.Dynamic.literal(appleId = appleId, appleIdPassword = appleIdPassword)
  
    __obj.asInstanceOf[ElectronNotarizeOptions]
  }
}

