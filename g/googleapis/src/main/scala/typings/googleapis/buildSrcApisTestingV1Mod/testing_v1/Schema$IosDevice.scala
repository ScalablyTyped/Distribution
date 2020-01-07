package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single iOS device.
  */
@js.native
trait Schema$IosDevice extends js.Object {
  /**
    * Required. The id of the iOS device to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var iosModelId: js.UndefOr[String] = js.native
  /**
    * Required. The id of the iOS major software version to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var iosVersionId: js.UndefOr[String] = js.native
  /**
    * Required. The locale the test device used for testing. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Required. How the device is oriented during the test. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var orientation: js.UndefOr[String] = js.native
}

object Schema$IosDevice {
  @scala.inline
  def apply(
    iosModelId: String = null,
    iosVersionId: String = null,
    locale: String = null,
    orientation: String = null
  ): Schema$IosDevice = {
    val __obj = js.Dynamic.literal()
    if (iosModelId != null) __obj.updateDynamic("iosModelId")(iosModelId.asInstanceOf[js.Any])
    if (iosVersionId != null) __obj.updateDynamic("iosVersionId")(iosVersionId.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IosDevice]
  }
}

