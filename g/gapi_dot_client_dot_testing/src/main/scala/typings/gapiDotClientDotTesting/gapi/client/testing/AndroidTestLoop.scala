package typings.gapiDotClientDotTesting.gapi.client.testing

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
  var appPackageId: js.UndefOr[String] = js.undefined
  /**
    * The list of scenario labels that should be run during the test.
    * The scenario labels should map to labels defined in the application's
    * manifest. For example, player_experience and
    * com.google.test.loops.player_experience add all of the loops labeled in the
    * manifest with the com.google.test.loops.player_experience name to the
    * execution.
    * Optional. Scenarios can also be specified in the scenarios field.
    */
  var scenarioLabels: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The list of scenarios that should be run during the test.
    * Optional, default is all test loops, derived from the application's
    * manifest.
    */
  var scenarios: js.UndefOr[js.Array[Double]] = js.undefined
}

object AndroidTestLoop {
  @scala.inline
  def apply(
    appApk: FileReference = null,
    appPackageId: String = null,
    scenarioLabels: js.Array[String] = null,
    scenarios: js.Array[Double] = null
  ): AndroidTestLoop = {
    val __obj = js.Dynamic.literal()
    if (appApk != null) __obj.updateDynamic("appApk")(appApk.asInstanceOf[js.Any])
    if (appPackageId != null) __obj.updateDynamic("appPackageId")(appPackageId.asInstanceOf[js.Any])
    if (scenarioLabels != null) __obj.updateDynamic("scenarioLabels")(scenarioLabels.asInstanceOf[js.Any])
    if (scenarios != null) __obj.updateDynamic("scenarios")(scenarios.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidTestLoop]
  }
}

