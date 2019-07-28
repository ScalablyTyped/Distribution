package typings.gapiDotClientDotToolresults.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidTest extends js.Object {
  /** Infomation about the application under test. */
  var androidAppInfo: js.UndefOr[AndroidAppInfo] = js.undefined
  /** An Android instrumentation test. */
  var androidInstrumentationTest: js.UndefOr[AndroidInstrumentationTest] = js.undefined
  /** An Android robo test. */
  var androidRoboTest: js.UndefOr[AndroidRoboTest] = js.undefined
  /** Max time a test is allowed to run before it is automatically cancelled. */
  var testTimeout: js.UndefOr[Duration] = js.undefined
}

object AndroidTest {
  @scala.inline
  def apply(
    androidAppInfo: AndroidAppInfo = null,
    androidInstrumentationTest: AndroidInstrumentationTest = null,
    androidRoboTest: AndroidRoboTest = null,
    testTimeout: Duration = null
  ): AndroidTest = {
    val __obj = js.Dynamic.literal()
    if (androidAppInfo != null) __obj.updateDynamic("androidAppInfo")(androidAppInfo)
    if (androidInstrumentationTest != null) __obj.updateDynamic("androidInstrumentationTest")(androidInstrumentationTest)
    if (androidRoboTest != null) __obj.updateDynamic("androidRoboTest")(androidRoboTest)
    if (testTimeout != null) __obj.updateDynamic("testTimeout")(testTimeout)
    __obj.asInstanceOf[AndroidTest]
  }
}

