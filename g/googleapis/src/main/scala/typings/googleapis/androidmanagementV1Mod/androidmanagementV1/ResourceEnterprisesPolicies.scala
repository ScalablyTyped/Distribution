package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Policies")
@js.native
open class ResourceEnterprisesPolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesPoliciesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesPoliciesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceEnterprisesPoliciesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceEnterprisesPoliciesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceEnterprisesPoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a policy. This operation is only permitted if no devices are currently referencing the policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.policies.delete({
    *     // The name of the policy in the form enterprises/{enterpriseId\}/policies/{policyId\}.
    *     name: 'enterprises/my-enterprise/policies/my-policie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceEnterprisesPoliciesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceEnterprisesPoliciesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def get(params: ParamsResourceEnterprisesPoliciesGet): GaxiosPromise[SchemaPolicy] = js.native
  def get(params: ParamsResourceEnterprisesPoliciesGet, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesPoliciesGet,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesPoliciesGet, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def get(
    params: ParamsResourceEnterprisesPoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets a policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.policies.get({
    *     // The name of the policy in the form enterprises/{enterpriseId\}/policies/{policyId\}.
    *     name: 'enterprises/my-enterprise/policies/my-policie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountTypesWithManagementDisabled": [],
    *   //   "addUserDisabled": false,
    *   //   "adjustVolumeDisabled": false,
    *   //   "advancedSecurityOverrides": {},
    *   //   "alwaysOnVpnPackage": {},
    *   //   "androidDevicePolicyTracks": [],
    *   //   "appAutoUpdatePolicy": "my_appAutoUpdatePolicy",
    *   //   "applications": [],
    *   //   "autoDateAndTimeZone": "my_autoDateAndTimeZone",
    *   //   "autoTimeRequired": false,
    *   //   "blockApplicationsEnabled": false,
    *   //   "bluetoothConfigDisabled": false,
    *   //   "bluetoothContactSharingDisabled": false,
    *   //   "bluetoothDisabled": false,
    *   //   "cameraAccess": "my_cameraAccess",
    *   //   "cameraDisabled": false,
    *   //   "cellBroadcastsConfigDisabled": false,
    *   //   "choosePrivateKeyRules": [],
    *   //   "complianceRules": [],
    *   //   "createWindowsDisabled": false,
    *   //   "credentialsConfigDisabled": false,
    *   //   "crossProfilePolicies": {},
    *   //   "dataRoamingDisabled": false,
    *   //   "debuggingFeaturesAllowed": false,
    *   //   "defaultPermissionPolicy": "my_defaultPermissionPolicy",
    *   //   "deviceOwnerLockScreenInfo": {},
    *   //   "encryptionPolicy": "my_encryptionPolicy",
    *   //   "ensureVerifyAppsEnabled": false,
    *   //   "factoryResetDisabled": false,
    *   //   "frpAdminEmails": [],
    *   //   "funDisabled": false,
    *   //   "installAppsDisabled": false,
    *   //   "installUnknownSourcesAllowed": false,
    *   //   "keyguardDisabled": false,
    *   //   "keyguardDisabledFeatures": [],
    *   //   "kioskCustomLauncherEnabled": false,
    *   //   "kioskCustomization": {},
    *   //   "locationMode": "my_locationMode",
    *   //   "longSupportMessage": {},
    *   //   "maximumTimeToLock": "my_maximumTimeToLock",
    *   //   "microphoneAccess": "my_microphoneAccess",
    *   //   "minimumApiLevel": 0,
    *   //   "mobileNetworksConfigDisabled": false,
    *   //   "modifyAccountsDisabled": false,
    *   //   "mountPhysicalMediaDisabled": false,
    *   //   "name": "my_name",
    *   //   "networkEscapeHatchEnabled": false,
    *   //   "networkResetDisabled": false,
    *   //   "oncCertificateProviders": [],
    *   //   "openNetworkConfiguration": {},
    *   //   "outgoingBeamDisabled": false,
    *   //   "outgoingCallsDisabled": false,
    *   //   "passwordPolicies": [],
    *   //   "passwordRequirements": {},
    *   //   "permissionGrants": [],
    *   //   "permittedAccessibilityServices": {},
    *   //   "permittedInputMethods": {},
    *   //   "persistentPreferredActivities": [],
    *   //   "personalUsagePolicies": {},
    *   //   "playStoreMode": "my_playStoreMode",
    *   //   "policyEnforcementRules": [],
    *   //   "preferentialNetworkService": "my_preferentialNetworkService",
    *   //   "privateKeySelectionEnabled": false,
    *   //   "recommendedGlobalProxy": {},
    *   //   "removeUserDisabled": false,
    *   //   "safeBootDisabled": false,
    *   //   "screenCaptureDisabled": false,
    *   //   "setUserIconDisabled": false,
    *   //   "setWallpaperDisabled": false,
    *   //   "setupActions": [],
    *   //   "shareLocationDisabled": false,
    *   //   "shortSupportMessage": {},
    *   //   "skipFirstUseHintsEnabled": false,
    *   //   "smsDisabled": false,
    *   //   "statusBarDisabled": false,
    *   //   "statusReportingSettings": {},
    *   //   "stayOnPluggedModes": [],
    *   //   "systemUpdate": {},
    *   //   "tetheringConfigDisabled": false,
    *   //   "uninstallAppsDisabled": false,
    *   //   "unmuteMicrophoneDisabled": false,
    *   //   "usageLog": {},
    *   //   "usbFileTransferDisabled": false,
    *   //   "usbMassStorageEnabled": false,
    *   //   "version": "my_version",
    *   //   "vpnConfigDisabled": false,
    *   //   "wifiConfigDisabled": false,
    *   //   "wifiConfigsLockdownEnabled": false
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceEnterprisesPoliciesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEnterprisesPoliciesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPoliciesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPoliciesResponse] = js.native
  def list(params: ParamsResourceEnterprisesPoliciesList): GaxiosPromise[SchemaListPoliciesResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesPoliciesList,
    callback: BodyResponseCallback[SchemaListPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesPoliciesList,
    options: BodyResponseCallback[Readable | SchemaListPoliciesResponse],
    callback: BodyResponseCallback[Readable | SchemaListPoliciesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesPoliciesList, options: MethodOptions): GaxiosPromise[SchemaListPoliciesResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesPoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPoliciesResponse]
  ): Unit = js.native
  /**
    * Lists policies for a given enterprise.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.policies.list({
    *     // The requested page size. The actual page size may be fixed to a min or max value.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results returned by the server.
    *     pageToken: 'placeholder-value',
    *     // The name of the enterprise in the form enterprises/{enterpriseId\}.
    *     parent: 'enterprises/my-enterprise',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "policies": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceEnterprisesPoliciesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEnterprisesPoliciesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPolicy] = js.native
  def patch(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def patch(params: ParamsResourceEnterprisesPoliciesPatch): GaxiosPromise[SchemaPolicy] = js.native
  def patch(params: ParamsResourceEnterprisesPoliciesPatch, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def patch(
    params: ParamsResourceEnterprisesPoliciesPatch,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def patch(params: ParamsResourceEnterprisesPoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def patch(
    params: ParamsResourceEnterprisesPoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Updates or creates a policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.policies.patch({
    *     // The name of the policy in the form enterprises/{enterpriseId\}/policies/{policyId\}.
    *     name: 'enterprises/my-enterprise/policies/my-policie',
    *     // The field mask indicating the fields to update. If not set, all modifiable fields will be modified.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountTypesWithManagementDisabled": [],
    *       //   "addUserDisabled": false,
    *       //   "adjustVolumeDisabled": false,
    *       //   "advancedSecurityOverrides": {},
    *       //   "alwaysOnVpnPackage": {},
    *       //   "androidDevicePolicyTracks": [],
    *       //   "appAutoUpdatePolicy": "my_appAutoUpdatePolicy",
    *       //   "applications": [],
    *       //   "autoDateAndTimeZone": "my_autoDateAndTimeZone",
    *       //   "autoTimeRequired": false,
    *       //   "blockApplicationsEnabled": false,
    *       //   "bluetoothConfigDisabled": false,
    *       //   "bluetoothContactSharingDisabled": false,
    *       //   "bluetoothDisabled": false,
    *       //   "cameraAccess": "my_cameraAccess",
    *       //   "cameraDisabled": false,
    *       //   "cellBroadcastsConfigDisabled": false,
    *       //   "choosePrivateKeyRules": [],
    *       //   "complianceRules": [],
    *       //   "createWindowsDisabled": false,
    *       //   "credentialsConfigDisabled": false,
    *       //   "crossProfilePolicies": {},
    *       //   "dataRoamingDisabled": false,
    *       //   "debuggingFeaturesAllowed": false,
    *       //   "defaultPermissionPolicy": "my_defaultPermissionPolicy",
    *       //   "deviceOwnerLockScreenInfo": {},
    *       //   "encryptionPolicy": "my_encryptionPolicy",
    *       //   "ensureVerifyAppsEnabled": false,
    *       //   "factoryResetDisabled": false,
    *       //   "frpAdminEmails": [],
    *       //   "funDisabled": false,
    *       //   "installAppsDisabled": false,
    *       //   "installUnknownSourcesAllowed": false,
    *       //   "keyguardDisabled": false,
    *       //   "keyguardDisabledFeatures": [],
    *       //   "kioskCustomLauncherEnabled": false,
    *       //   "kioskCustomization": {},
    *       //   "locationMode": "my_locationMode",
    *       //   "longSupportMessage": {},
    *       //   "maximumTimeToLock": "my_maximumTimeToLock",
    *       //   "microphoneAccess": "my_microphoneAccess",
    *       //   "minimumApiLevel": 0,
    *       //   "mobileNetworksConfigDisabled": false,
    *       //   "modifyAccountsDisabled": false,
    *       //   "mountPhysicalMediaDisabled": false,
    *       //   "name": "my_name",
    *       //   "networkEscapeHatchEnabled": false,
    *       //   "networkResetDisabled": false,
    *       //   "oncCertificateProviders": [],
    *       //   "openNetworkConfiguration": {},
    *       //   "outgoingBeamDisabled": false,
    *       //   "outgoingCallsDisabled": false,
    *       //   "passwordPolicies": [],
    *       //   "passwordRequirements": {},
    *       //   "permissionGrants": [],
    *       //   "permittedAccessibilityServices": {},
    *       //   "permittedInputMethods": {},
    *       //   "persistentPreferredActivities": [],
    *       //   "personalUsagePolicies": {},
    *       //   "playStoreMode": "my_playStoreMode",
    *       //   "policyEnforcementRules": [],
    *       //   "preferentialNetworkService": "my_preferentialNetworkService",
    *       //   "privateKeySelectionEnabled": false,
    *       //   "recommendedGlobalProxy": {},
    *       //   "removeUserDisabled": false,
    *       //   "safeBootDisabled": false,
    *       //   "screenCaptureDisabled": false,
    *       //   "setUserIconDisabled": false,
    *       //   "setWallpaperDisabled": false,
    *       //   "setupActions": [],
    *       //   "shareLocationDisabled": false,
    *       //   "shortSupportMessage": {},
    *       //   "skipFirstUseHintsEnabled": false,
    *       //   "smsDisabled": false,
    *       //   "statusBarDisabled": false,
    *       //   "statusReportingSettings": {},
    *       //   "stayOnPluggedModes": [],
    *       //   "systemUpdate": {},
    *       //   "tetheringConfigDisabled": false,
    *       //   "uninstallAppsDisabled": false,
    *       //   "unmuteMicrophoneDisabled": false,
    *       //   "usageLog": {},
    *       //   "usbFileTransferDisabled": false,
    *       //   "usbMassStorageEnabled": false,
    *       //   "version": "my_version",
    *       //   "vpnConfigDisabled": false,
    *       //   "wifiConfigDisabled": false,
    *       //   "wifiConfigsLockdownEnabled": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountTypesWithManagementDisabled": [],
    *   //   "addUserDisabled": false,
    *   //   "adjustVolumeDisabled": false,
    *   //   "advancedSecurityOverrides": {},
    *   //   "alwaysOnVpnPackage": {},
    *   //   "androidDevicePolicyTracks": [],
    *   //   "appAutoUpdatePolicy": "my_appAutoUpdatePolicy",
    *   //   "applications": [],
    *   //   "autoDateAndTimeZone": "my_autoDateAndTimeZone",
    *   //   "autoTimeRequired": false,
    *   //   "blockApplicationsEnabled": false,
    *   //   "bluetoothConfigDisabled": false,
    *   //   "bluetoothContactSharingDisabled": false,
    *   //   "bluetoothDisabled": false,
    *   //   "cameraAccess": "my_cameraAccess",
    *   //   "cameraDisabled": false,
    *   //   "cellBroadcastsConfigDisabled": false,
    *   //   "choosePrivateKeyRules": [],
    *   //   "complianceRules": [],
    *   //   "createWindowsDisabled": false,
    *   //   "credentialsConfigDisabled": false,
    *   //   "crossProfilePolicies": {},
    *   //   "dataRoamingDisabled": false,
    *   //   "debuggingFeaturesAllowed": false,
    *   //   "defaultPermissionPolicy": "my_defaultPermissionPolicy",
    *   //   "deviceOwnerLockScreenInfo": {},
    *   //   "encryptionPolicy": "my_encryptionPolicy",
    *   //   "ensureVerifyAppsEnabled": false,
    *   //   "factoryResetDisabled": false,
    *   //   "frpAdminEmails": [],
    *   //   "funDisabled": false,
    *   //   "installAppsDisabled": false,
    *   //   "installUnknownSourcesAllowed": false,
    *   //   "keyguardDisabled": false,
    *   //   "keyguardDisabledFeatures": [],
    *   //   "kioskCustomLauncherEnabled": false,
    *   //   "kioskCustomization": {},
    *   //   "locationMode": "my_locationMode",
    *   //   "longSupportMessage": {},
    *   //   "maximumTimeToLock": "my_maximumTimeToLock",
    *   //   "microphoneAccess": "my_microphoneAccess",
    *   //   "minimumApiLevel": 0,
    *   //   "mobileNetworksConfigDisabled": false,
    *   //   "modifyAccountsDisabled": false,
    *   //   "mountPhysicalMediaDisabled": false,
    *   //   "name": "my_name",
    *   //   "networkEscapeHatchEnabled": false,
    *   //   "networkResetDisabled": false,
    *   //   "oncCertificateProviders": [],
    *   //   "openNetworkConfiguration": {},
    *   //   "outgoingBeamDisabled": false,
    *   //   "outgoingCallsDisabled": false,
    *   //   "passwordPolicies": [],
    *   //   "passwordRequirements": {},
    *   //   "permissionGrants": [],
    *   //   "permittedAccessibilityServices": {},
    *   //   "permittedInputMethods": {},
    *   //   "persistentPreferredActivities": [],
    *   //   "personalUsagePolicies": {},
    *   //   "playStoreMode": "my_playStoreMode",
    *   //   "policyEnforcementRules": [],
    *   //   "preferentialNetworkService": "my_preferentialNetworkService",
    *   //   "privateKeySelectionEnabled": false,
    *   //   "recommendedGlobalProxy": {},
    *   //   "removeUserDisabled": false,
    *   //   "safeBootDisabled": false,
    *   //   "screenCaptureDisabled": false,
    *   //   "setUserIconDisabled": false,
    *   //   "setWallpaperDisabled": false,
    *   //   "setupActions": [],
    *   //   "shareLocationDisabled": false,
    *   //   "shortSupportMessage": {},
    *   //   "skipFirstUseHintsEnabled": false,
    *   //   "smsDisabled": false,
    *   //   "statusBarDisabled": false,
    *   //   "statusReportingSettings": {},
    *   //   "stayOnPluggedModes": [],
    *   //   "systemUpdate": {},
    *   //   "tetheringConfigDisabled": false,
    *   //   "uninstallAppsDisabled": false,
    *   //   "unmuteMicrophoneDisabled": false,
    *   //   "usageLog": {},
    *   //   "usbFileTransferDisabled": false,
    *   //   "usbMassStorageEnabled": false,
    *   //   "version": "my_version",
    *   //   "vpnConfigDisabled": false,
    *   //   "wifiConfigDisabled": false,
    *   //   "wifiConfigsLockdownEnabled": false
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceEnterprisesPoliciesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceEnterprisesPoliciesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
