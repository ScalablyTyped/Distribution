package typings.eggView.mod

import typings.eggView.anon.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggAppConfig extends js.Object {
  var view: Cache = js.native
}

object EggAppConfig {
  @scala.inline
  def apply(view: Cache): EggAppConfig = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppConfig]
  }
  @scala.inline
  implicit class EggAppConfigOps[Self <: EggAppConfig] (val x: Self) extends AnyVal {
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
    def setView(value: Cache): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

