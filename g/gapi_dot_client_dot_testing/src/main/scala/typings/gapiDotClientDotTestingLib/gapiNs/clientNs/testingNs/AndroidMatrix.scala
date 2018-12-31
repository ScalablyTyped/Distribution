package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidMatrix extends js.Object {
  /**
    * The ids of the set of Android device to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidModelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The ids of the set of Android OS version to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidVersionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The set of locales the test device will enable for testing.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var locales: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The set of orientations to test with.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var orientations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

