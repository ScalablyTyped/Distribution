package typings.gapiDotClientDotAndroidmanagement.gapi.client.androidmanagement

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
  var fieldPath: js.UndefOr[String] = js.undefined
  /**
    * If package_name is set and the non-compliance reason is APP_NOT_INSTALLED or APP_NOT_UPDATED, the detailed reason the app cannot be installed or
    * updated.
    */
  var installationFailureReason: js.UndefOr[String] = js.undefined
  /** The reason the device is not in compliance with the setting. */
  var nonComplianceReason: js.UndefOr[String] = js.undefined
  /** The package name indicating which application is out of compliance, if applicable. */
  var packageName: js.UndefOr[String] = js.undefined
  /** The name of the policy setting. This is the JSON field name of a top-level Policy  field. */
  var settingName: js.UndefOr[String] = js.undefined
}

object NonComplianceDetail {
  @scala.inline
  def apply(
    currentValue: js.Any = null,
    fieldPath: String = null,
    installationFailureReason: String = null,
    nonComplianceReason: String = null,
    packageName: String = null,
    settingName: String = null
  ): NonComplianceDetail = {
    val __obj = js.Dynamic.literal()
    if (currentValue != null) __obj.updateDynamic("currentValue")(currentValue)
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath)
    if (installationFailureReason != null) __obj.updateDynamic("installationFailureReason")(installationFailureReason)
    if (nonComplianceReason != null) __obj.updateDynamic("nonComplianceReason")(nonComplianceReason)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (settingName != null) __obj.updateDynamic("settingName")(settingName)
    __obj.asInstanceOf[NonComplianceDetail]
  }
}

