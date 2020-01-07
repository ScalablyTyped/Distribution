package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an iOS application that uses the XCTest framework. Xcode supports
  * the option to &quot;build for testing&quot;, which generates an .xctestrun
  * file that contains a test specification (arguments, test methods, etc).
  * This test type accepts a zip file containing the .xctestrun file and the
  * corresponding contents of the Build/Products directory that contains all
  * the binaries needed to run the tests.
  */
@js.native
trait Schema$IosXcTest extends js.Object {
  /**
    * Output only. The bundle id for the application under test.
    */
  var appBundleId: js.UndefOr[String] = js.native
  /**
    * Required. The .zip containing the .xctestrun file and the contents of the
    * DerivedData/Build/Products directory. The .xctestrun file in this zip is
    * ignored if the xctestrun field is specified.
    */
  var testsZip: js.UndefOr[Schema$FileReference] = js.native
  /**
    * The Xcode version that should be used for the test. Use the
    * TestEnvironmentDiscoveryService to get supported options. Defaults to the
    * latest Xcode version Firebase Test Lab supports.
    */
  var xcodeVersion: js.UndefOr[String] = js.native
  /**
    * An .xctestrun file that will override the .xctestrun file in the tests
    * zip. Because the .xctestrun file contains environment variables along
    * with test methods to run and/or ignore, this can be useful for sharding
    * tests. Default is taken from the tests zip.
    */
  var xctestrun: js.UndefOr[Schema$FileReference] = js.native
}

object Schema$IosXcTest {
  @scala.inline
  def apply(
    appBundleId: String = null,
    testsZip: Schema$FileReference = null,
    xcodeVersion: String = null,
    xctestrun: Schema$FileReference = null
  ): Schema$IosXcTest = {
    val __obj = js.Dynamic.literal()
    if (appBundleId != null) __obj.updateDynamic("appBundleId")(appBundleId.asInstanceOf[js.Any])
    if (testsZip != null) __obj.updateDynamic("testsZip")(testsZip.asInstanceOf[js.Any])
    if (xcodeVersion != null) __obj.updateDynamic("xcodeVersion")(xcodeVersion.asInstanceOf[js.Any])
    if (xctestrun != null) __obj.updateDynamic("xctestrun")(xctestrun.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IosXcTest]
  }
}

