package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of a test environment.
  */
@js.native
trait Schema$TestEnvironmentCatalog extends js.Object {
  /**
    * Supported Android devices.
    */
  var androidDeviceCatalog: js.UndefOr[Schema$AndroidDeviceCatalog] = js.native
  /**
    * Supported iOS devices.
    */
  var iosDeviceCatalog: js.UndefOr[Schema$IosDeviceCatalog] = js.native
  /**
    * Supported network configurations.
    */
  var networkConfigurationCatalog: js.UndefOr[Schema$NetworkConfigurationCatalog] = js.native
  /**
    * The software test environment provided by TestExecutionService.
    */
  var softwareCatalog: js.UndefOr[Schema$ProvidedSoftwareCatalog] = js.native
}

object Schema$TestEnvironmentCatalog {
  @scala.inline
  def apply(
    androidDeviceCatalog: Schema$AndroidDeviceCatalog = null,
    iosDeviceCatalog: Schema$IosDeviceCatalog = null,
    networkConfigurationCatalog: Schema$NetworkConfigurationCatalog = null,
    softwareCatalog: Schema$ProvidedSoftwareCatalog = null
  ): Schema$TestEnvironmentCatalog = {
    val __obj = js.Dynamic.literal()
    if (androidDeviceCatalog != null) __obj.updateDynamic("androidDeviceCatalog")(androidDeviceCatalog.asInstanceOf[js.Any])
    if (iosDeviceCatalog != null) __obj.updateDynamic("iosDeviceCatalog")(iosDeviceCatalog.asInstanceOf[js.Any])
    if (networkConfigurationCatalog != null) __obj.updateDynamic("networkConfigurationCatalog")(networkConfigurationCatalog.asInstanceOf[js.Any])
    if (softwareCatalog != null) __obj.updateDynamic("softwareCatalog")(softwareCatalog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestEnvironmentCatalog]
  }
}

