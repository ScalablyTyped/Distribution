package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasMobilePreferred extends js.Object {
  def isMobilePreferred(): Boolean
  def setMobilePreferred(isMobilePreferred: Boolean): Unit
}

object hasMobilePreferred {
  @scala.inline
  def apply(isMobilePreferred: () => Boolean, setMobilePreferred: Boolean => Unit): hasMobilePreferred = {
    val __obj = js.Dynamic.literal(isMobilePreferred = js.Any.fromFunction0(isMobilePreferred), setMobilePreferred = js.Any.fromFunction1(setMobilePreferred))
  
    __obj.asInstanceOf[hasMobilePreferred]
  }
}

