package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrashReporterStartOptions extends js.Object {
  var companyName: String
  /**
    * Directory to store the crash reports temporarily (only used when the crash
    * reporter is started via `process.crashReporter.start`).
    */
  var crashesDirectory: js.UndefOr[String] = js.undefined
  /**
    * An object you can define that will be sent along with the report. Only string
    * properties are sent correctly. Nested objects are not supported. When using
    * Windows, the property names and values must be fewer than 64 characters.
    */
  var extra: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Default is `false`.
    */
  var ignoreSystemCrashHandler: js.UndefOr[Boolean] = js.undefined
  /**
    * Defaults to `app.name`.
    */
  var productName: js.UndefOr[String] = js.undefined
  /**
    * URL that crash reports will be sent to as POST.
    */
  var submitURL: String
  /**
    * Whether crash reports should be sent to the server. Default is `true`.
    */
  var uploadToServer: js.UndefOr[Boolean] = js.undefined
}

object CrashReporterStartOptions {
  @scala.inline
  def apply(
    companyName: String,
    submitURL: String,
    crashesDirectory: String = null,
    extra: Record[String, String] = null,
    ignoreSystemCrashHandler: js.UndefOr[Boolean] = js.undefined,
    productName: String = null,
    uploadToServer: js.UndefOr[Boolean] = js.undefined
  ): CrashReporterStartOptions = {
    val __obj = js.Dynamic.literal(companyName = companyName.asInstanceOf[js.Any], submitURL = submitURL.asInstanceOf[js.Any])
    if (crashesDirectory != null) __obj.updateDynamic("crashesDirectory")(crashesDirectory.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSystemCrashHandler)) __obj.updateDynamic("ignoreSystemCrashHandler")(ignoreSystemCrashHandler.get.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadToServer)) __obj.updateDynamic("uploadToServer")(uploadToServer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrashReporterStartOptions]
  }
}

