package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrashReporterStartOptions extends js.Object {
  var companyName: String
  /**
    * Directory to store the crashreports temporarily (only used when the crash
    * reporter is started via process.crashReporter.start).
    */
  var crashesDirectory: js.UndefOr[String] = js.undefined
  /**
    * An object you can define that will be sent along with the report. Only string
    * properties are sent correctly. Nested objects are not supported and the property
    * names and values must be less than 64 characters long.
    */
  var extra: js.UndefOr[Extra] = js.undefined
  /**
    * Default is false.
    */
  var ignoreSystemCrashHandler: js.UndefOr[Boolean] = js.undefined
  /**
    * Defaults to app.getName().
    */
  var productName: js.UndefOr[String] = js.undefined
  /**
    * URL that crash reports will be sent to as POST.
    */
  var submitURL: String
  /**
    * Whether crash reports should be sent to the server Default is true.
    */
  var uploadToServer: js.UndefOr[Boolean] = js.undefined
}

object CrashReporterStartOptions {
  @scala.inline
  def apply(
    companyName: String,
    submitURL: String,
    crashesDirectory: String = null,
    extra: Extra = null,
    ignoreSystemCrashHandler: js.UndefOr[Boolean] = js.undefined,
    productName: String = null,
    uploadToServer: js.UndefOr[Boolean] = js.undefined
  ): CrashReporterStartOptions = {
    val __obj = js.Dynamic.literal(companyName = companyName, submitURL = submitURL)
    if (crashesDirectory != null) __obj.updateDynamic("crashesDirectory")(crashesDirectory)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (!js.isUndefined(ignoreSystemCrashHandler)) __obj.updateDynamic("ignoreSystemCrashHandler")(ignoreSystemCrashHandler)
    if (productName != null) __obj.updateDynamic("productName")(productName)
    if (!js.isUndefined(uploadToServer)) __obj.updateDynamic("uploadToServer")(uploadToServer)
    __obj.asInstanceOf[CrashReporterStartOptions]
  }
}

