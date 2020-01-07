package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EnvFromSource represents the source of a set of ConfigMaps
  */
@js.native
trait Schema$EnvFromSource extends js.Object {
  /**
    * The ConfigMap to select from +optional
    */
  var configMapRef: js.UndefOr[Schema$ConfigMapEnvSource] = js.native
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a
    * C_IDENTIFIER. +optional
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * The Secret to select from +optional
    */
  var secretRef: js.UndefOr[Schema$SecretEnvSource] = js.native
}

object Schema$EnvFromSource {
  @scala.inline
  def apply(
    configMapRef: Schema$ConfigMapEnvSource = null,
    prefix: String = null,
    secretRef: Schema$SecretEnvSource = null
  ): Schema$EnvFromSource = {
    val __obj = js.Dynamic.literal()
    if (configMapRef != null) __obj.updateDynamic("configMapRef")(configMapRef.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (secretRef != null) __obj.updateDynamic("secretRef")(secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EnvFromSource]
  }
}

