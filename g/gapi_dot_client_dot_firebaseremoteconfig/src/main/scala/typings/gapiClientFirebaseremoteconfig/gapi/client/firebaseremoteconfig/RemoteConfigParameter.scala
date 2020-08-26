package typings.gapiClientFirebaseremoteconfig.gapi.client.firebaseremoteconfig

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteConfigParameter extends js.Object {
  /**
    * Optional - a map of (condition_name, value). The condition_name of the
    * highest priority (the one listed first in the conditions array) determines
    * the value of this parameter.
    */
  var conditionalValues: js.UndefOr[Record[String, RemoteConfigParameterValue]] = js.native
  /**
    * Optional - value to set the parameter to, when none of the named conditions
    * evaluate to <code>true</code>.
    */
  var defaultValue: js.UndefOr[RemoteConfigParameterValue] = js.native
}

object RemoteConfigParameter {
  @scala.inline
  def apply(): RemoteConfigParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteConfigParameter]
  }
  @scala.inline
  implicit class RemoteConfigParameterOps[Self <: RemoteConfigParameter] (val x: Self) extends AnyVal {
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
    def setConditionalValues(value: Record[String, RemoteConfigParameterValue]): Self = this.set("conditionalValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalValues: Self = this.set("conditionalValues", js.undefined)
    @scala.inline
    def setDefaultValue(value: RemoteConfigParameterValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
  }
  
}

