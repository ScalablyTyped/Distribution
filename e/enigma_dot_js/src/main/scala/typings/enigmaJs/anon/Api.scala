package typings.enigmaJs.anon

import typings.enigmaJs.enigmaJS.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  var api: IGeneratedAPI = js.native
  var config: js.Any = js.native
}

object Api {
  @scala.inline
  def apply(api: IGeneratedAPI, config: js.Any): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  @scala.inline
  implicit class ApiOps[Self <: Api] (val x: Self) extends AnyVal {
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
    def setApi(value: IGeneratedAPI): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
  }
  
}

