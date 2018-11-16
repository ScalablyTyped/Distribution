package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CrashReporterStartOptions extends js.Object {
  var companyName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Directory to store the crashreports temporarily (only used when the crash
       * reporter is started via process.crashReporter.start).
       */
  var crashesDirectory: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An object you can define that will be sent along with the report. Only string
       * properties are sent correctly. Nested objects are not supported and the property
       * names and values must be less than 64 characters long.
       */
  var extra: js.UndefOr[Extra] = js.undefined
  /**
       * Default is false.
       */
  var ignoreSystemCrashHandler: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Defaults to app.getName().
       */
  var productName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * URL that crash reports will be sent to as POST.
       */
  var submitURL: java.lang.String
  /**
       * Whether crash reports should be sent to the server Default is true.
       */
  var uploadToServer: js.UndefOr[scala.Boolean] = js.undefined
}

