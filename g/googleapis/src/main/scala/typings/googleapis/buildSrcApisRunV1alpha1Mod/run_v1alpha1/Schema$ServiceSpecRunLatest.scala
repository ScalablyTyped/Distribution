package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceSpecRunLatest contains the options for always having a route to the
  * latest configuration. See ServiceSpec for more details.
  */
@js.native
trait Schema$ServiceSpecRunLatest extends js.Object {
  /**
    * The configuration for this service.
    */
  var configuration: js.UndefOr[Schema$ConfigurationSpec] = js.native
}

object Schema$ServiceSpecRunLatest {
  @scala.inline
  def apply(configuration: Schema$ConfigurationSpec = null): Schema$ServiceSpecRunLatest = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServiceSpecRunLatest]
  }
}

