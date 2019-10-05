package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSetup extends js.Object {
  /**
    * The device will be logged in on this account for the duration of the test.
    * Optional
    */
  var account: js.UndefOr[Account] = js.undefined
  /**
    * The directories on the device to upload to GCS at the end of the test;
    * they must be absolute, whitelisted paths.
    * Refer to RegularFile for whitelisted paths.
    * Optional
    */
  var directoriesToPull: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Environment variables to set for the test (only applicable for
    * instrumentation tests).
    */
  var environmentVariables: js.UndefOr[js.Array[EnvironmentVariable]] = js.undefined
  /** Optional */
  var filesToPush: js.UndefOr[js.Array[DeviceFile]] = js.undefined
  /**
    * The network traffic profile used for running the test.
    * Optional
    */
  var networkProfile: js.UndefOr[String] = js.undefined
}

object TestSetup {
  @scala.inline
  def apply(
    account: Account = null,
    directoriesToPull: js.Array[String] = null,
    environmentVariables: js.Array[EnvironmentVariable] = null,
    filesToPush: js.Array[DeviceFile] = null,
    networkProfile: String = null
  ): TestSetup = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (directoriesToPull != null) __obj.updateDynamic("directoriesToPull")(directoriesToPull)
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables)
    if (filesToPush != null) __obj.updateDynamic("filesToPush")(filesToPush)
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile)
    __obj.asInstanceOf[TestSetup]
  }
}

