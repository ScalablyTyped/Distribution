package typings.gapiDotClientDotFirebaseremoteconfig.gapi.client.firebaseremoteconfig

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConfigParameter extends js.Object {
  /**
    * Optional - a map of (condition_name, value). The condition_name of the
    * highest priority (the one listed first in the conditions array) determines
    * the value of this parameter.
    */
  var conditionalValues: js.UndefOr[Record[String, RemoteConfigParameterValue]] = js.undefined
  /**
    * Optional - value to set the parameter to, when none of the named conditions
    * evaluate to <code>true</code>.
    */
  var defaultValue: js.UndefOr[RemoteConfigParameterValue] = js.undefined
}

object RemoteConfigParameter {
  @scala.inline
  def apply(
    conditionalValues: Record[String, RemoteConfigParameterValue] = null,
    defaultValue: RemoteConfigParameterValue = null
  ): RemoteConfigParameter = {
    val __obj = js.Dynamic.literal()
    if (conditionalValues != null) __obj.updateDynamic("conditionalValues")(conditionalValues.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteConfigParameter]
  }
}

