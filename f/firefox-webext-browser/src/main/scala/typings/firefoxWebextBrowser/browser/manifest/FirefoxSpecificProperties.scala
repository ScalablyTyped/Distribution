package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirefoxSpecificProperties extends js.Object {
  var id: js.UndefOr[ExtensionID] = js.native
  var strict_max_version: js.UndefOr[String] = js.native
  var strict_min_version: js.UndefOr[String] = js.native
  var update_url: js.UndefOr[String] = js.native
}

object FirefoxSpecificProperties {
  @scala.inline
  def apply(): FirefoxSpecificProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirefoxSpecificProperties]
  }
  @scala.inline
  implicit class FirefoxSpecificPropertiesOps[Self <: FirefoxSpecificProperties] (val x: Self) extends AnyVal {
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
    def setId(value: ExtensionID): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setStrict_max_version(value: String): Self = this.set("strict_max_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict_max_version: Self = this.set("strict_max_version", js.undefined)
    @scala.inline
    def setStrict_min_version(value: String): Self = this.set("strict_min_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict_min_version: Self = this.set("strict_min_version", js.undefined)
    @scala.inline
    def setUpdate_url(value: String): Self = this.set("update_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate_url: Self = this.set("update_url", js.undefined)
  }
  
}

