package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of how to set up an iOS device prior to a test.
  */
@js.native
trait Schema$IosTestSetup extends js.Object {
  /**
    * The network traffic profile used for running the test. Available network
    * profiles can be queried by using the NETWORK_CONFIGURATION environment
    * type when calling
    * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
    */
  var networkProfile: js.UndefOr[String] = js.native
}

object Schema$IosTestSetup {
  @scala.inline
  def apply(networkProfile: String = null): Schema$IosTestSetup = {
    val __obj = js.Dynamic.literal()
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IosTestSetup]
  }
}

