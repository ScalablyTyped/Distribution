package typings.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the given google.cloud.location.Location.
  */
@js.native
trait Schema$LocationMetadata extends js.Object {
  /**
    * App Engine flexible environment is available in the given
    * location.@OutputOnly
    */
  var flexibleEnvironmentAvailable: js.UndefOr[Boolean] = js.native
  /**
    * App Engine standard environment is available in the given
    * location.@OutputOnly
    */
  var standardEnvironmentAvailable: js.UndefOr[Boolean] = js.native
}

object Schema$LocationMetadata {
  @scala.inline
  def apply(
    flexibleEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined,
    standardEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined
  ): Schema$LocationMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flexibleEnvironmentAvailable)) __obj.updateDynamic("flexibleEnvironmentAvailable")(flexibleEnvironmentAvailable.asInstanceOf[js.Any])
    if (!js.isUndefined(standardEnvironmentAvailable)) __obj.updateDynamic("standardEnvironmentAvailable")(standardEnvironmentAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocationMetadata]
  }
}

