package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureSettings extends js.Object {
  /**
    * Boolean value indicating if split health checks should be used instead of the legacy health checks. At an app.yaml level, this means defaulting to
    * 'readiness_check' and 'liveness_check' values instead of 'health_check' ones. Once the legacy 'health_check' behavior is deprecated, and this value is
    * always true, this setting can be removed.
    */
  var splitHealthChecks: js.UndefOr[Boolean] = js.native
}

object FeatureSettings {
  @scala.inline
  def apply(): FeatureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSettings]
  }
  @scala.inline
  implicit class FeatureSettingsOps[Self <: FeatureSettings] (val x: Self) extends AnyVal {
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
    def setSplitHealthChecks(value: Boolean): Self = this.set("splitHealthChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitHealthChecks: Self = this.set("splitHealthChecks", js.undefined)
  }
  
}

