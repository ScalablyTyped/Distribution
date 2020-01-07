package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceSpecPinnedType Pins this service to a specific revision name. The
  * revision must be owned by the configuration provided.  Deprecated and not
  * supported by Cloud Run.
  */
@js.native
trait Schema$ServiceSpecPinnedType extends js.Object {
  /**
    * The configuration for this service.
    */
  var configuration: js.UndefOr[Schema$ConfigurationSpec] = js.native
  /**
    * The revision name to pin this service to until changed to a different
    * service type.
    */
  var revisionName: js.UndefOr[String] = js.native
}

object Schema$ServiceSpecPinnedType {
  @scala.inline
  def apply(configuration: Schema$ConfigurationSpec = null, revisionName: String = null): Schema$ServiceSpecPinnedType = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (revisionName != null) __obj.updateDynamic("revisionName")(revisionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServiceSpecPinnedType]
  }
}

