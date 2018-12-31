package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonComplianceDetailCondition extends js.Object {
  /** The reason the device is not in compliance with the setting. If not set, then this condition matches any reason. */
  var nonComplianceReason: js.UndefOr[java.lang.String] = js.undefined
  /** The package name indicating which application is out of compliance. If not set, then this condition matches any package name. */
  var packageName: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the policy setting. This is the JSON field name of a top-level Policy field. If not set, then this condition matches any setting name. */
  var settingName: js.UndefOr[java.lang.String] = js.undefined
}

