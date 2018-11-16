package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ComplianceRule extends js.Object {
  /** A condition which is satisfied if the Android Framework API level on the device does not meet a minimum requirement. */
  var apiLevelCondition: js.UndefOr[ApiLevelCondition] = js.undefined
  /**
               * If set to true, the rule includes a mitigating action to disable applications so that the device is effectively disabled, but application data is
               * preserved. If the device is running an app in locked task mode, the app will be closed and a UI showing the reason for non-compliance will be
               * displayed.
               */
  var disableApps: js.UndefOr[scala.Boolean] = js.undefined
  /** A condition which is satisfied if there exists any matching NonComplianceDetail for the device. */
  var nonComplianceDetailCondition: js.UndefOr[NonComplianceDetailCondition] = js.undefined
}

