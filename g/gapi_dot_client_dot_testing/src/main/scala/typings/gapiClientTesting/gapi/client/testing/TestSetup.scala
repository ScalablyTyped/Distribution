package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSetup extends js.Object {
  /**
    * The device will be logged in on this account for the duration of the test.
    * Optional
    */
  var account: js.UndefOr[Account] = js.native
  /**
    * The directories on the device to upload to GCS at the end of the test;
    * they must be absolute, whitelisted paths.
    * Refer to RegularFile for whitelisted paths.
    * Optional
    */
  var directoriesToPull: js.UndefOr[js.Array[String]] = js.native
  /**
    * Environment variables to set for the test (only applicable for
    * instrumentation tests).
    */
  var environmentVariables: js.UndefOr[js.Array[EnvironmentVariable]] = js.native
  /** Optional */
  var filesToPush: js.UndefOr[js.Array[DeviceFile]] = js.native
  /**
    * The network traffic profile used for running the test.
    * Optional
    */
  var networkProfile: js.UndefOr[String] = js.native
}

object TestSetup {
  @scala.inline
  def apply(): TestSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSetup]
  }
  @scala.inline
  implicit class TestSetupOps[Self <: TestSetup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccount(value: Account): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    @scala.inline
    def setDirectoriesToPullVarargs(value: String*): Self = this.set("directoriesToPull", js.Array(value :_*))
    @scala.inline
    def setDirectoriesToPull(value: js.Array[String]): Self = this.set("directoriesToPull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoriesToPull: Self = this.set("directoriesToPull", js.undefined)
    @scala.inline
    def setEnvironmentVariablesVarargs(value: EnvironmentVariable*): Self = this.set("environmentVariables", js.Array(value :_*))
    @scala.inline
    def setEnvironmentVariables(value: js.Array[EnvironmentVariable]): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("environmentVariables", js.undefined)
    @scala.inline
    def setFilesToPushVarargs(value: DeviceFile*): Self = this.set("filesToPush", js.Array(value :_*))
    @scala.inline
    def setFilesToPush(value: js.Array[DeviceFile]): Self = this.set("filesToPush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilesToPush: Self = this.set("filesToPush", js.undefined)
    @scala.inline
    def setNetworkProfile(value: String): Self = this.set("networkProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkProfile: Self = this.set("networkProfile", js.undefined)
  }
  
}

