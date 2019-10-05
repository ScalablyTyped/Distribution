package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidDevice extends js.Object {
  /**
    * The id of the Android device to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidModelId: js.UndefOr[String] = js.undefined
  /**
    * The id of the Android OS version to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidVersionId: js.UndefOr[String] = js.undefined
  /**
    * The locale the test device used for testing.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * How the device is oriented during the test.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var orientation: js.UndefOr[String] = js.undefined
}

object AndroidDevice {
  @scala.inline
  def apply(
    androidModelId: String = null,
    androidVersionId: String = null,
    locale: String = null,
    orientation: String = null
  ): AndroidDevice = {
    val __obj = js.Dynamic.literal()
    if (androidModelId != null) __obj.updateDynamic("androidModelId")(androidModelId)
    if (androidVersionId != null) __obj.updateDynamic("androidVersionId")(androidVersionId)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    __obj.asInstanceOf[AndroidDevice]
  }
}

