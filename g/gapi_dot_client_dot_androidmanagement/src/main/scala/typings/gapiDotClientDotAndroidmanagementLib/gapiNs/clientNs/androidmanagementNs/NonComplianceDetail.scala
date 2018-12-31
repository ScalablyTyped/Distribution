package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonComplianceDetail extends js.Object {
  /** If the policy setting could not be applied, the current value of the setting on the device. */
  var currentValue: js.UndefOr[js.Any] = js.undefined
  /**
    * For settings with nested fields, if a particular nested field is out of compliance, this specifies the full path to the offending field. The path is
    * formatted in the same way the policy JSON field would be referenced in JavaScript, that is: 1) For object-typed fields, the field name is followed by a
    * dot then by a  subfield name. 2) For array-typed fields, the field name is followed by the array index  enclosed in brackets. For example, to indicate
    * a problem with the url field in the externalData field in the 3rd application, the path would be applications[2].externalData.url
    */
  var fieldPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If package_name is set and the non-compliance reason is APP_NOT_INSTALLED or APP_NOT_UPDATED, the detailed reason the app cannot be installed or
    * updated.
    */
  var installationFailureReason: js.UndefOr[java.lang.String] = js.undefined
  /** The reason the device is not in compliance with the setting. */
  var nonComplianceReason: js.UndefOr[java.lang.String] = js.undefined
  /** The package name indicating which application is out of compliance, if applicable. */
  var packageName: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the policy setting. This is the JSON field name of a top-level Policy  field. */
  var settingName: js.UndefOr[java.lang.String] = js.undefined
}

