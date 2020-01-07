package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an Android Application with a Test Loop. The intent
  * \&lt;intent-name\&gt; will be implicitly added, since Games is the only
  * user of this api, for the time being.
  */
@js.native
trait Schema$AndroidTestLoop extends js.Object {
  /**
    * The APK for the application under test.
    */
  var appApk: js.UndefOr[Schema$FileReference] = js.native
  /**
    * A multi-apk app bundle for the application under test.
    */
  var appBundle: js.UndefOr[Schema$AppBundle] = js.native
  /**
    * The java package for the application under test. The default is
    * determined by examining the application&#39;s manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The list of scenario labels that should be run during the test. The
    * scenario labels should map to labels defined in the application&#39;s
    * manifest. For example, player_experience and
    * com.google.test.loops.player_experience add all of the loops labeled in
    * the manifest with the com.google.test.loops.player_experience name to the
    * execution. Scenarios can also be specified in the scenarios field.
    */
  var scenarioLabels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of scenarios that should be run during the test. The default is
    * all test loops, derived from the application&#39;s manifest.
    */
  var scenarios: js.UndefOr[js.Array[Double]] = js.native
}

object Schema$AndroidTestLoop {
  @scala.inline
  def apply(
    appApk: Schema$FileReference = null,
    appBundle: Schema$AppBundle = null,
    appPackageId: String = null,
    scenarioLabels: js.Array[String] = null,
    scenarios: js.Array[Double] = null
  ): Schema$AndroidTestLoop = {
    val __obj = js.Dynamic.literal()
    if (appApk != null) __obj.updateDynamic("appApk")(appApk.asInstanceOf[js.Any])
    if (appBundle != null) __obj.updateDynamic("appBundle")(appBundle.asInstanceOf[js.Any])
    if (appPackageId != null) __obj.updateDynamic("appPackageId")(appPackageId.asInstanceOf[js.Any])
    if (scenarioLabels != null) __obj.updateDynamic("scenarioLabels")(scenarioLabels.asInstanceOf[js.Any])
    if (scenarios != null) __obj.updateDynamic("scenarios")(scenarios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AndroidTestLoop]
  }
}

