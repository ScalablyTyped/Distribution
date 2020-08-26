package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdBlockingConfiguration extends js.Object {
  var clickThroughUrl: js.UndefOr[String] = js.native
  var creativeBundleId: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var overrideClickThroughUrl: js.UndefOr[Boolean] = js.native
}

object AdBlockingConfiguration {
  @scala.inline
  def apply(): AdBlockingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdBlockingConfiguration]
  }
  @scala.inline
  implicit class AdBlockingConfigurationOps[Self <: AdBlockingConfiguration] (val x: Self) extends AnyVal {
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
    def setClickThroughUrl(value: String): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickThroughUrl: Self = this.set("clickThroughUrl", js.undefined)
    @scala.inline
    def setCreativeBundleId(value: String): Self = this.set("creativeBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeBundleId: Self = this.set("creativeBundleId", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setOverrideClickThroughUrl(value: Boolean): Self = this.set("overrideClickThroughUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideClickThroughUrl: Self = this.set("overrideClickThroughUrl", js.undefined)
  }
  
}

