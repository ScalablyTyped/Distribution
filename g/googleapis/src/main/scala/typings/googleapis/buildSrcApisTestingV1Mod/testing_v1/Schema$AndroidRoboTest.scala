package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an android application that explores the application on a virtual
  * or physical Android Device, finding culprits and crashes as it goes.
  */
@js.native
trait Schema$AndroidRoboTest extends js.Object {
  /**
    * The APK for the application under test.
    */
  var appApk: js.UndefOr[Schema$FileReference] = js.native
  /**
    * A multi-apk app bundle for the application under test.
    */
  var appBundle: js.UndefOr[Schema$AppBundle] = js.native
  /**
    * The initial activity that should be used to start the app.
    */
  var appInitialActivity: js.UndefOr[String] = js.native
  /**
    * The java package for the application under test. The default value is
    * determined by examining the application&#39;s manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The max depth of the traversal stack Robo can explore. Needs to be at
    * least 2 to make Robo explore the app beyond the first activity. Default
    * is 50.
    */
  var maxDepth: js.UndefOr[Double] = js.native
  /**
    * The max number of steps Robo can execute. Default is no limit.
    */
  var maxSteps: js.UndefOr[Double] = js.native
  /**
    * A set of directives Robo should apply during the crawl. This allows users
    * to customize the crawl. For example, the username and password for a test
    * account can be provided.
    */
  var roboDirectives: js.UndefOr[js.Array[Schema$RoboDirective]] = js.native
  /**
    * A JSON file with a sequence of actions Robo should perform as a prologue
    * for the crawl.
    */
  var roboScript: js.UndefOr[Schema$FileReference] = js.native
  /**
    * The intents used to launch the app for the crawl. If none are provided,
    * then the main launcher activity is launched. If some are provided, then
    * only those provided are launched (the main launcher activity must be
    * provided explicitly).
    */
  var startingIntents: js.UndefOr[js.Array[Schema$RoboStartingIntent]] = js.native
}

object Schema$AndroidRoboTest {
  @scala.inline
  def apply(
    appApk: Schema$FileReference = null,
    appBundle: Schema$AppBundle = null,
    appInitialActivity: String = null,
    appPackageId: String = null,
    maxDepth: Int | Double = null,
    maxSteps: Int | Double = null,
    roboDirectives: js.Array[Schema$RoboDirective] = null,
    roboScript: Schema$FileReference = null,
    startingIntents: js.Array[Schema$RoboStartingIntent] = null
  ): Schema$AndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    if (appApk != null) __obj.updateDynamic("appApk")(appApk.asInstanceOf[js.Any])
    if (appBundle != null) __obj.updateDynamic("appBundle")(appBundle.asInstanceOf[js.Any])
    if (appInitialActivity != null) __obj.updateDynamic("appInitialActivity")(appInitialActivity.asInstanceOf[js.Any])
    if (appPackageId != null) __obj.updateDynamic("appPackageId")(appPackageId.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (maxSteps != null) __obj.updateDynamic("maxSteps")(maxSteps.asInstanceOf[js.Any])
    if (roboDirectives != null) __obj.updateDynamic("roboDirectives")(roboDirectives.asInstanceOf[js.Any])
    if (roboScript != null) __obj.updateDynamic("roboScript")(roboScript.asInstanceOf[js.Any])
    if (startingIntents != null) __obj.updateDynamic("startingIntents")(startingIntents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AndroidRoboTest]
  }
}

