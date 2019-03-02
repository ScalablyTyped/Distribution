package typings
package eggDashViewLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  var view: eggDashViewLib.ViewManager
}

object Application {
  @scala.inline
  def apply(view: eggDashViewLib.ViewManager): Application = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Application]
  }
}

