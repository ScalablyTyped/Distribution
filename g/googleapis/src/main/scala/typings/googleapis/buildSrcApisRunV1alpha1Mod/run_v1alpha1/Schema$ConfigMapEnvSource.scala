package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigMapEnvSource selects a ConfigMap to populate the environment
  * variables with.  The contents of the target ConfigMap&#39;s Data field will
  * represent the key-value pairs as environment variables.
  */
@js.native
trait Schema$ConfigMapEnvSource extends js.Object {
  /**
    * The ConfigMap to select from.
    */
  var localObjectReference: js.UndefOr[Schema$LocalObjectReference] = js.native
  /**
    * Specify whether the ConfigMap must be defined +optional
    */
  var optional: js.UndefOr[Boolean] = js.native
}

object Schema$ConfigMapEnvSource {
  @scala.inline
  def apply(
    localObjectReference: Schema$LocalObjectReference = null,
    optional: js.UndefOr[Boolean] = js.undefined
  ): Schema$ConfigMapEnvSource = {
    val __obj = js.Dynamic.literal()
    if (localObjectReference != null) __obj.updateDynamic("localObjectReference")(localObjectReference.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConfigMapEnvSource]
  }
}

