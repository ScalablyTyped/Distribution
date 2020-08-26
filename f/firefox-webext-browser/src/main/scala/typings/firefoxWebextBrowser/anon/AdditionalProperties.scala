package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.KeyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalProperties extends js.Object {
  /** @deprecated Unknown platform name */
  var additionalProperties: js.UndefOr[String] = js.native
  var android: js.UndefOr[String] = js.native
  var chromeos: js.UndefOr[String] = js.native
  var default: js.UndefOr[KeyName] = js.native
  var ios: js.UndefOr[String] = js.native
  var linux: js.UndefOr[KeyName] = js.native
  var mac: js.UndefOr[KeyName] = js.native
  var windows: js.UndefOr[KeyName] = js.native
}

object AdditionalProperties {
  @scala.inline
  def apply(): AdditionalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalProperties]
  }
  @scala.inline
  implicit class AdditionalPropertiesOps[Self <: AdditionalProperties] (val x: Self) extends AnyVal {
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
    def setAdditionalProperties(value: String): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    @scala.inline
    def setAndroid(value: String): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    @scala.inline
    def setChromeos(value: String): Self = this.set("chromeos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromeos: Self = this.set("chromeos", js.undefined)
    @scala.inline
    def setDefault(value: KeyName): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setIos(value: String): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
    @scala.inline
    def setLinux(value: KeyName): Self = this.set("linux", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinux: Self = this.set("linux", js.undefined)
    @scala.inline
    def setMac(value: KeyName): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
    @scala.inline
    def setWindows(value: KeyName): Self = this.set("windows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindows: Self = this.set("windows", js.undefined)
  }
  
}

