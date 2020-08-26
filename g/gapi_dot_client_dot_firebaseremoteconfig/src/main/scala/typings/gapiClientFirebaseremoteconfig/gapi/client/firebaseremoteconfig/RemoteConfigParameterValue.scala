package typings.gapiClientFirebaseremoteconfig.gapi.client.firebaseremoteconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteConfigParameterValue extends js.Object {
  /** if true, omit the parameter from the map of fetched parameter values */
  var useInAppDefault: js.UndefOr[Boolean] = js.native
  /** the string to set the parameter to */
  var value: js.UndefOr[String] = js.native
}

object RemoteConfigParameterValue {
  @scala.inline
  def apply(): RemoteConfigParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteConfigParameterValue]
  }
  @scala.inline
  implicit class RemoteConfigParameterValueOps[Self <: RemoteConfigParameterValue] (val x: Self) extends AnyVal {
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
    def setUseInAppDefault(value: Boolean): Self = this.set("useInAppDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseInAppDefault: Self = this.set("useInAppDefault", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

