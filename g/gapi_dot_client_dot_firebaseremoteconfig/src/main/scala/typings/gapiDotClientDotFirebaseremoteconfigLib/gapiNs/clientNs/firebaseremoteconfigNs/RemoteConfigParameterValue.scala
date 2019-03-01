package typings
package gapiDotClientDotFirebaseremoteconfigLib.gapiNs.clientNs.firebaseremoteconfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConfigParameterValue extends js.Object {
  /** if true, omit the parameter from the map of fetched parameter values */
  var useInAppDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** the string to set the parameter to */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object RemoteConfigParameterValue {
  @scala.inline
  def apply(useInAppDefault: js.UndefOr[scala.Boolean] = js.undefined, value: java.lang.String = null): RemoteConfigParameterValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useInAppDefault)) __obj.updateDynamic("useInAppDefault")(useInAppDefault)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RemoteConfigParameterValue]
  }
}

