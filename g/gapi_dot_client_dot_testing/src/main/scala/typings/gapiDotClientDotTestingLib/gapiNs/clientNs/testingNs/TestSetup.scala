package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

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
  var directoriesToPull: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var networkProfile: js.UndefOr[java.lang.String] = js.undefined
}

