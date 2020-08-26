package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apiscript extends js.Object {
  var api_script: js.UndefOr[ExtensionURL] = js.native
}

object Apiscript {
  @scala.inline
  def apply(): Apiscript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apiscript]
  }
  @scala.inline
  implicit class ApiscriptOps[Self <: Apiscript] (val x: Self) extends AnyVal {
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
    def setApi_script(value: ExtensionURL): Self = this.set("api_script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi_script: Self = this.set("api_script", js.undefined)
  }
  
}

