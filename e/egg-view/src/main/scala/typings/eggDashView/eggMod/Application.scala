package typings.eggDashView.eggMod

import typings.eggDashView.ViewManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  var view: ViewManager
}

object Application {
  @scala.inline
  def apply(view: ViewManager): Application = {
    val __obj = js.Dynamic.literal(view = view)
  
    __obj.asInstanceOf[Application]
  }
}

