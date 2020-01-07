package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android mobile test specification.
  */
@js.native
trait Schema$AndroidTest extends js.Object {
  /**
    * Information about the application under test.
    */
  var androidAppInfo: js.UndefOr[Schema$AndroidAppInfo] = js.native
  /**
    * An Android instrumentation test.
    */
  var androidInstrumentationTest: js.UndefOr[Schema$AndroidInstrumentationTest] = js.native
  /**
    * An Android robo test.
    */
  var androidRoboTest: js.UndefOr[Schema$AndroidRoboTest] = js.native
  /**
    * Max time a test is allowed to run before it is automatically cancelled.
    */
  var testTimeout: js.UndefOr[Schema$Duration] = js.native
}

object Schema$AndroidTest {
  @scala.inline
  def apply(
    androidAppInfo: Schema$AndroidAppInfo = null,
    androidInstrumentationTest: Schema$AndroidInstrumentationTest = null,
    androidRoboTest: Schema$AndroidRoboTest = null,
    testTimeout: Schema$Duration = null
  ): Schema$AndroidTest = {
    val __obj = js.Dynamic.literal()
    if (androidAppInfo != null) __obj.updateDynamic("androidAppInfo")(androidAppInfo.asInstanceOf[js.Any])
    if (androidInstrumentationTest != null) __obj.updateDynamic("androidInstrumentationTest")(androidInstrumentationTest.asInstanceOf[js.Any])
    if (androidRoboTest != null) __obj.updateDynamic("androidRoboTest")(androidRoboTest.asInstanceOf[js.Any])
    if (testTimeout != null) __obj.updateDynamic("testTimeout")(testTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AndroidTest]
  }
}

