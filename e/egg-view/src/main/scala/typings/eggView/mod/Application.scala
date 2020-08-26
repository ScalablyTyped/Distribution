package typings.eggView.mod

import typings.eggView.ViewManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  var view: ViewManager = js.native
}

object Application {
  @scala.inline
  def apply(view: ViewManager): Application = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setView(value: ViewManager): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

