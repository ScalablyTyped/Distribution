package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSpecification extends js.Object {
  /** An Android instrumentation test. */
  var androidInstrumentationTest: js.UndefOr[AndroidInstrumentationTest] = js.undefined
  /** An Android robo test. */
  var androidRoboTest: js.UndefOr[AndroidRoboTest] = js.undefined
  /** An Android Application with a Test Loop */
  var androidTestLoop: js.UndefOr[AndroidTestLoop] = js.undefined
  /**
    * Enables automatic Google account login.
    * If set, the service will automatically generate a Google test account and
    * add it to the device, before executing the test. Note that test accounts
    * might be reused.
    * Many applications show their full set of functionalities when an account is
    * present on the device. Logging into the device with these generated
    * accounts allows testing more functionalities.
    * Default is false.
    * Optional
    */
  var autoGoogleLogin: js.UndefOr[Boolean] = js.undefined
  /** Disables performance metrics recording; may reduce test latency. */
  var disablePerformanceMetrics: js.UndefOr[Boolean] = js.undefined
  /** Disables video recording; may reduce test latency. */
  var disableVideoRecording: js.UndefOr[Boolean] = js.undefined
  /**
    * Test setup requirements e.g. files to install, bootstrap scripts
    * Optional
    */
  var testSetup: js.UndefOr[TestSetup] = js.undefined
  /**
    * Max time a test execution is allowed to run before it is
    * automatically cancelled.
    * Optional, default is 5 min.
    */
  var testTimeout: js.UndefOr[String] = js.undefined
}

object TestSpecification {
  @scala.inline
  def apply(
    androidInstrumentationTest: AndroidInstrumentationTest = null,
    androidRoboTest: AndroidRoboTest = null,
    androidTestLoop: AndroidTestLoop = null,
    autoGoogleLogin: js.UndefOr[Boolean] = js.undefined,
    disablePerformanceMetrics: js.UndefOr[Boolean] = js.undefined,
    disableVideoRecording: js.UndefOr[Boolean] = js.undefined,
    testSetup: TestSetup = null,
    testTimeout: String = null
  ): TestSpecification = {
    val __obj = js.Dynamic.literal()
    if (androidInstrumentationTest != null) __obj.updateDynamic("androidInstrumentationTest")(androidInstrumentationTest.asInstanceOf[js.Any])
    if (androidRoboTest != null) __obj.updateDynamic("androidRoboTest")(androidRoboTest.asInstanceOf[js.Any])
    if (androidTestLoop != null) __obj.updateDynamic("androidTestLoop")(androidTestLoop.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGoogleLogin)) __obj.updateDynamic("autoGoogleLogin")(autoGoogleLogin.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePerformanceMetrics)) __obj.updateDynamic("disablePerformanceMetrics")(disablePerformanceMetrics.asInstanceOf[js.Any])
    if (!js.isUndefined(disableVideoRecording)) __obj.updateDynamic("disableVideoRecording")(disableVideoRecording.asInstanceOf[js.Any])
    if (testSetup != null) __obj.updateDynamic("testSetup")(testSetup.asInstanceOf[js.Any])
    if (testTimeout != null) __obj.updateDynamic("testTimeout")(testTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSpecification]
  }
}

