package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.FirefoxSpecificProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gecko extends js.Object {
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.native
}

object Gecko {
  @scala.inline
  def apply(): Gecko = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gecko]
  }
  @scala.inline
  implicit class GeckoOps[Self <: Gecko] (val x: Self) extends AnyVal {
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
    def setGecko(value: FirefoxSpecificProperties): Self = this.set("gecko", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGecko: Self = this.set("gecko", js.undefined)
  }
  
}

