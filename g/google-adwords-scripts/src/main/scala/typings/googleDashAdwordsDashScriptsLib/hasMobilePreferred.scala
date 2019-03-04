package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasMobilePreferred extends js.Object {
  def isMobilePreferred(): scala.Boolean
  def setMobilePreferred(isMobilePreferred: scala.Boolean): scala.Unit
}

object hasMobilePreferred {
  @scala.inline
  def apply(
    isMobilePreferred: js.Function0[scala.Boolean],
    setMobilePreferred: js.Function1[scala.Boolean, scala.Unit]
  ): hasMobilePreferred = {
    val __obj = js.Dynamic.literal(isMobilePreferred = isMobilePreferred, setMobilePreferred = setMobilePreferred)
  
    __obj.asInstanceOf[hasMobilePreferred]
  }
}

