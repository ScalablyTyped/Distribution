package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureInstance extends js.Object {
  var feature: js.UndefOr[Feature] = js.native
}

object FeatureInstance {
  @scala.inline
  def apply(): FeatureInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureInstance]
  }
  @scala.inline
  implicit class FeatureInstanceOps[Self <: FeatureInstance] (val x: Self) extends AnyVal {
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
    def setFeature(value: Feature): Self = this.set("feature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
  }
  
}

