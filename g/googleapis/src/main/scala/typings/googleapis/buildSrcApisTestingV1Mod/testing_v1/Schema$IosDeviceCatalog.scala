package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The currently supported iOS devices.
  */
@js.native
trait Schema$IosDeviceCatalog extends js.Object {
  /**
    * The set of supported iOS device models.
    */
  var models: js.UndefOr[js.Array[Schema$IosModel]] = js.native
  /**
    * The set of supported runtime configurations.
    */
  var runtimeConfiguration: js.UndefOr[Schema$IosRuntimeConfiguration] = js.native
  /**
    * The set of supported iOS software versions.
    */
  var versions: js.UndefOr[js.Array[Schema$IosVersion]] = js.native
  /**
    * The set of supported Xcode versions.
    */
  var xcodeVersions: js.UndefOr[js.Array[Schema$XcodeVersion]] = js.native
}

object Schema$IosDeviceCatalog {
  @scala.inline
  def apply(
    models: js.Array[Schema$IosModel] = null,
    runtimeConfiguration: Schema$IosRuntimeConfiguration = null,
    versions: js.Array[Schema$IosVersion] = null,
    xcodeVersions: js.Array[Schema$XcodeVersion] = null
  ): Schema$IosDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (runtimeConfiguration != null) __obj.updateDynamic("runtimeConfiguration")(runtimeConfiguration.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    if (xcodeVersions != null) __obj.updateDynamic("xcodeVersions")(xcodeVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IosDeviceCatalog]
  }
}

