package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidDevice extends js.Object {
  /**
    * The id of the Android device to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidModelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id of the Android OS version to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidVersionId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The locale the test device used for testing.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How the device is oriented during the test.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
}

