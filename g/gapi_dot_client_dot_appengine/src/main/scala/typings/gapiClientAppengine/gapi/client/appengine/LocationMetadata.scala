package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationMetadata extends js.Object {
  /** App Engine Flexible Environment is available in the given location.@OutputOnly */
  var flexibleEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined
  /** App Engine Standard Environment is available in the given location.@OutputOnly */
  var standardEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined
}

object LocationMetadata {
  @scala.inline
  def apply(
    flexibleEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined,
    standardEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined
  ): LocationMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flexibleEnvironmentAvailable)) __obj.updateDynamic("flexibleEnvironmentAvailable")(flexibleEnvironmentAvailable.asInstanceOf[js.Any])
    if (!js.isUndefined(standardEnvironmentAvailable)) __obj.updateDynamic("standardEnvironmentAvailable")(standardEnvironmentAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationMetadata]
  }
}

