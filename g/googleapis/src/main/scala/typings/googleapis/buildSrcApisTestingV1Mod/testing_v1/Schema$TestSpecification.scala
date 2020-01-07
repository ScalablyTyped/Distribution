package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of how to run the test.
  */
@js.native
trait Schema$TestSpecification extends js.Object {
  /**
    * An Android instrumentation test.
    */
  var androidInstrumentationTest: js.UndefOr[Schema$AndroidInstrumentationTest] = js.native
  /**
    * An Android robo test.
    */
  var androidRoboTest: js.UndefOr[Schema$AndroidRoboTest] = js.native
  /**
    * An Android Application with a Test Loop.
    */
  var androidTestLoop: js.UndefOr[Schema$AndroidTestLoop] = js.native
  /**
    * Disables performance metrics recording; may reduce test latency.
    */
  var disablePerformanceMetrics: js.UndefOr[Boolean] = js.native
  /**
    * Disables video recording; may reduce test latency.
    */
  var disableVideoRecording: js.UndefOr[Boolean] = js.native
  /**
    * Test setup requirements for iOS.
    */
  var iosTestSetup: js.UndefOr[Schema$IosTestSetup] = js.native
  /**
    * An iOS XCTest, via an .xctestrun file.
    */
  var iosXcTest: js.UndefOr[Schema$IosXcTest] = js.native
  /**
    * Test setup requirements for Android e.g. files to install, bootstrap
    * scripts.
    */
  var testSetup: js.UndefOr[Schema$TestSetup] = js.native
  /**
    * Max time a test execution is allowed to run before it is automatically
    * cancelled. The default value is 5 min.
    */
  var testTimeout: js.UndefOr[String] = js.native
}

object Schema$TestSpecification {
  @scala.inline
  def apply(
    androidInstrumentationTest: Schema$AndroidInstrumentationTest = null,
    androidRoboTest: Schema$AndroidRoboTest = null,
    androidTestLoop: Schema$AndroidTestLoop = null,
    disablePerformanceMetrics: js.UndefOr[Boolean] = js.undefined,
    disableVideoRecording: js.UndefOr[Boolean] = js.undefined,
    iosTestSetup: Schema$IosTestSetup = null,
    iosXcTest: Schema$IosXcTest = null,
    testSetup: Schema$TestSetup = null,
    testTimeout: String = null
  ): Schema$TestSpecification = {
    val __obj = js.Dynamic.literal()
    if (androidInstrumentationTest != null) __obj.updateDynamic("androidInstrumentationTest")(androidInstrumentationTest.asInstanceOf[js.Any])
    if (androidRoboTest != null) __obj.updateDynamic("androidRoboTest")(androidRoboTest.asInstanceOf[js.Any])
    if (androidTestLoop != null) __obj.updateDynamic("androidTestLoop")(androidTestLoop.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePerformanceMetrics)) __obj.updateDynamic("disablePerformanceMetrics")(disablePerformanceMetrics.asInstanceOf[js.Any])
    if (!js.isUndefined(disableVideoRecording)) __obj.updateDynamic("disableVideoRecording")(disableVideoRecording.asInstanceOf[js.Any])
    if (iosTestSetup != null) __obj.updateDynamic("iosTestSetup")(iosTestSetup.asInstanceOf[js.Any])
    if (iosXcTest != null) __obj.updateDynamic("iosXcTest")(iosXcTest.asInstanceOf[js.Any])
    if (testSetup != null) __obj.updateDynamic("testSetup")(testSetup.asInstanceOf[js.Any])
    if (testTimeout != null) __obj.updateDynamic("testTimeout")(testTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestSpecification]
  }
}

