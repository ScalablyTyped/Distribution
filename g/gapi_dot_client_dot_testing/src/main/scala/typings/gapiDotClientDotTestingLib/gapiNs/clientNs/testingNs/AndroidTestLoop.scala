package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidTestLoop extends js.Object {
  /**
    * The APK for the application under test.
    * Required
    */
  var appApk: js.UndefOr[FileReference] = js.undefined
  /**
    * The java package for the application under test.
    * Optional, default is determined by examining the application's manifest.
    */
  var appPackageId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of scenario labels that should be run during the test.
    * The scenario labels should map to labels defined in the application's
    * manifest. For example, player_experience and
    * com.google.test.loops.player_experience add all of the loops labeled in the
    * manifest with the com.google.test.loops.player_experience name to the
    * execution.
    * Optional. Scenarios can also be specified in the scenarios field.
    */
  var scenarioLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The list of scenarios that should be run during the test.
    * Optional, default is all test loops, derived from the application's
    * manifest.
    */
  var scenarios: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

