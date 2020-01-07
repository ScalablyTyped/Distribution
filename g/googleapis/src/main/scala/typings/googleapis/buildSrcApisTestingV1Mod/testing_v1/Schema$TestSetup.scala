package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of how to set up the Android device prior to running the
  * test.
  */
@js.native
trait Schema$TestSetup extends js.Object {
  /**
    * The device will be logged in on this account for the duration of the
    * test.
    */
  var account: js.UndefOr[Schema$Account] = js.native
  /**
    * APKs to install in addition to those being directly tested. Currently
    * capped at 100.
    */
  var additionalApks: js.UndefOr[js.Array[Schema$Apk]] = js.native
  /**
    * List of directories on the device to upload to GCS at the end of the
    * test; they must be absolute paths under /sdcard or /data/local/tmp. Path
    * names are restricted to characters a-z A-Z 0-9 _ - . + and /  Note: The
    * paths /sdcard and /data will be made available and treated as implicit
    * path substitutions. E.g. if /sdcard on a particular device does not map
    * to external storage, the system will replace it with the external storage
    * path prefix for that device.
    */
  var directoriesToPull: js.UndefOr[js.Array[String]] = js.native
  /**
    * Environment variables to set for the test (only applicable for
    * instrumentation tests).
    */
  var environmentVariables: js.UndefOr[js.Array[Schema$EnvironmentVariable]] = js.native
  /**
    * List of files to push to the device before starting the test.
    */
  var filesToPush: js.UndefOr[js.Array[Schema$DeviceFile]] = js.native
  /**
    * The network traffic profile used for running the test. Available network
    * profiles can be queried by using the NETWORK_CONFIGURATION environment
    * type when calling
    * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
    */
  var networkProfile: js.UndefOr[String] = js.native
}

object Schema$TestSetup {
  @scala.inline
  def apply(
    account: Schema$Account = null,
    additionalApks: js.Array[Schema$Apk] = null,
    directoriesToPull: js.Array[String] = null,
    environmentVariables: js.Array[Schema$EnvironmentVariable] = null,
    filesToPush: js.Array[Schema$DeviceFile] = null,
    networkProfile: String = null
  ): Schema$TestSetup = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (additionalApks != null) __obj.updateDynamic("additionalApks")(additionalApks.asInstanceOf[js.Any])
    if (directoriesToPull != null) __obj.updateDynamic("directoriesToPull")(directoriesToPull.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (filesToPush != null) __obj.updateDynamic("filesToPush")(filesToPush.asInstanceOf[js.Any])
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestSetup]
  }
}

