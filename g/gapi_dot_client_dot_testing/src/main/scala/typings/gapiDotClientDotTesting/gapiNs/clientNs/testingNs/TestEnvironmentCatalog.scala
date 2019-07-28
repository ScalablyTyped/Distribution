package typings.gapiDotClientDotTesting.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEnvironmentCatalog extends js.Object {
  /** Android devices suitable for running Android Instrumentation Tests. */
  var androidDeviceCatalog: js.UndefOr[AndroidDeviceCatalog] = js.undefined
  /** Supported network configurations */
  var networkConfigurationCatalog: js.UndefOr[NetworkConfigurationCatalog] = js.undefined
}

object TestEnvironmentCatalog {
  @scala.inline
  def apply(
    androidDeviceCatalog: AndroidDeviceCatalog = null,
    networkConfigurationCatalog: NetworkConfigurationCatalog = null
  ): TestEnvironmentCatalog = {
    val __obj = js.Dynamic.literal()
    if (androidDeviceCatalog != null) __obj.updateDynamic("androidDeviceCatalog")(androidDeviceCatalog)
    if (networkConfigurationCatalog != null) __obj.updateDynamic("networkConfigurationCatalog")(networkConfigurationCatalog)
    __obj.asInstanceOf[TestEnvironmentCatalog]
  }
}

