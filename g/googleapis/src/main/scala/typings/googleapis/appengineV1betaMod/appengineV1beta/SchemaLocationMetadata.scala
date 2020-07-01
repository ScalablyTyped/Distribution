package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the given google.cloud.location.Location.
  */
@js.native
trait SchemaLocationMetadata extends js.Object {
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

object SchemaLocationMetadata {
  @scala.inline
  def apply(
    flexibleEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined,
    standardEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined
  ): SchemaLocationMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flexibleEnvironmentAvailable)) __obj.updateDynamic("flexibleEnvironmentAvailable")(flexibleEnvironmentAvailable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(standardEnvironmentAvailable)) __obj.updateDynamic("standardEnvironmentAvailable")(standardEnvironmentAvailable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocationMetadata]
  }
}

