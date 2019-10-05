package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidMatrix extends js.Object {
  /**
    * The ids of the set of Android device to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidModelIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The ids of the set of Android OS version to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidVersionIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The set of locales the test device will enable for testing.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var locales: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The set of orientations to test with.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var orientations: js.UndefOr[js.Array[String]] = js.undefined
}

object AndroidMatrix {
  @scala.inline
  def apply(
    androidModelIds: js.Array[String] = null,
    androidVersionIds: js.Array[String] = null,
    locales: js.Array[String] = null,
    orientations: js.Array[String] = null
  ): AndroidMatrix = {
    val __obj = js.Dynamic.literal()
    if (androidModelIds != null) __obj.updateDynamic("androidModelIds")(androidModelIds)
    if (androidVersionIds != null) __obj.updateDynamic("androidVersionIds")(androidVersionIds)
    if (locales != null) __obj.updateDynamic("locales")(locales)
    if (orientations != null) __obj.updateDynamic("orientations")(orientations)
    __obj.asInstanceOf[AndroidMatrix]
  }
}

