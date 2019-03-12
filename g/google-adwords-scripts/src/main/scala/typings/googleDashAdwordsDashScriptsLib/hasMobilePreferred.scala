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
  def apply(isMobilePreferred: () => scala.Boolean, setMobilePreferred: scala.Boolean => scala.Unit): hasMobilePreferred = {
    val __obj = js.Dynamic.literal(isMobilePreferred = js.Any.fromFunction0(isMobilePreferred), setMobilePreferred = js.Any.fromFunction1(setMobilePreferred))
  
    __obj.asInstanceOf[hasMobilePreferred]
  }
}

