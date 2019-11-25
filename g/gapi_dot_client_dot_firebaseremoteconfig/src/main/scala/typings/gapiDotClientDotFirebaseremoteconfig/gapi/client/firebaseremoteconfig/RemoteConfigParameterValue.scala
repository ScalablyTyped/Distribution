package typings.gapiDotClientDotFirebaseremoteconfig.gapi.client.firebaseremoteconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConfigParameterValue extends js.Object {
  /** if true, omit the parameter from the map of fetched parameter values */
  var useInAppDefault: js.UndefOr[Boolean] = js.undefined
  /** the string to set the parameter to */
  var value: js.UndefOr[String] = js.undefined
}

object RemoteConfigParameterValue {
  @scala.inline
  def apply(useInAppDefault: js.UndefOr[Boolean] = js.undefined, value: String = null): RemoteConfigParameterValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useInAppDefault)) __obj.updateDynamic("useInAppDefault")(useInAppDefault.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteConfigParameterValue]
  }
}

