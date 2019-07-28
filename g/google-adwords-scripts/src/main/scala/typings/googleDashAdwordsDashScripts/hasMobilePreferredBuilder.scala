package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasMobilePreferredBuilder[B] extends js.Object {
  def withMobilePreferred(): B
}

object hasMobilePreferredBuilder {
  @scala.inline
  def apply[B](withMobilePreferred: () => B): hasMobilePreferredBuilder[B] = {
    val __obj = js.Dynamic.literal(withMobilePreferred = js.Any.fromFunction0(withMobilePreferred))
  
    __obj.asInstanceOf[hasMobilePreferredBuilder[B]]
  }
}

