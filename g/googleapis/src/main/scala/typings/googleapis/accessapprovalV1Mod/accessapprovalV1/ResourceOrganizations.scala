package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/accessapproval/v1", "accessapproval_v1.Resource$Organizations")
@js.native
open class ResourceOrganizations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var approvalRequests: ResourceOrganizationsApprovalrequests = js.native
  
  var context: APIRequestContext = js.native
  
  def deleteAccessApprovalSettings(): GaxiosPromise[SchemaEmpty] = js.native
  def deleteAccessApprovalSettings(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteAccessApprovalSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteAccessApprovalSettings(params: ParamsResourceOrganizationsDeleteaccessapprovalsettings): GaxiosPromise[SchemaEmpty] = js.native
  def deleteAccessApprovalSettings(
    params: ParamsResourceOrganizationsDeleteaccessapprovalsettings,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def deleteAccessApprovalSettings(
    params: ParamsResourceOrganizationsDeleteaccessapprovalsettings,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def deleteAccessApprovalSettings(params: ParamsResourceOrganizationsDeleteaccessapprovalsettings, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteAccessApprovalSettings(
    params: ParamsResourceOrganizationsDeleteaccessapprovalsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the settings associated with a project, folder, or organization. This will have the effect of disabling Access Approval for the project, folder, or organization, but only if all ancestors also have Access Approval disabled. If Access Approval is enabled at a higher level of the hierarchy, then Access Approval will still be enabled at this level as the settings are inherited.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await accessapproval.organizations.deleteAccessApprovalSettings({
    *     // Name of the AccessApprovalSettings to delete.
    *     name: 'organizations/my-organization/accessApprovalSettings',
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
  def deleteAccessApprovalSettings(params: ParamsResourceOrganizationsDeleteaccessapprovalsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteAccessApprovalSettings(
    params: ParamsResourceOrganizationsDeleteaccessapprovalsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAccessApprovalSettings(): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def getAccessApprovalSettings(callback: BodyResponseCallback[SchemaAccessApprovalSettings]): Unit = js.native
  def getAccessApprovalSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def getAccessApprovalSettings(params: ParamsResourceOrganizationsGetaccessapprovalsettings): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def getAccessApprovalSettings(
    params: ParamsResourceOrganizationsGetaccessapprovalsettings,
    callback: BodyResponseCallback[SchemaAccessApprovalSettings]
  ): Unit = js.native
  def getAccessApprovalSettings(
    params: ParamsResourceOrganizationsGetaccessapprovalsettings,
    options: BodyResponseCallback[Readable | SchemaAccessApprovalSettings],
    callback: BodyResponseCallback[Readable | SchemaAccessApprovalSettings]
  ): Unit = js.native
  def getAccessApprovalSettings(params: ParamsResourceOrganizationsGetaccessapprovalsettings, options: MethodOptions): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def getAccessApprovalSettings(
    params: ParamsResourceOrganizationsGetaccessapprovalsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccessApprovalSettings]
  ): Unit = js.native
  /**
    * Gets the settings associated with a project, folder, or organization.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await accessapproval.organizations.getAccessApprovalSettings({
    *     // The name of the AccessApprovalSettings to retrieve. Format: "{projects|folders|organizations\}/{id\}/accessApprovalSettings"
    *     name: 'organizations/my-organization/accessApprovalSettings',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeKeyVersion": "my_activeKeyVersion",
    *   //   "ancestorHasActiveKeyVersion": false,
    *   //   "enrolledAncestor": false,
    *   //   "enrolledServices": [],
    *   //   "invalidKeyVersion": false,
    *   //   "name": "my_name",
    *   //   "notificationEmails": []
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
  def getAccessApprovalSettings(params: ParamsResourceOrganizationsGetaccessapprovalsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAccessApprovalSettings(
    params: ParamsResourceOrganizationsGetaccessapprovalsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getServiceAccount(): GaxiosPromise[SchemaAccessApprovalServiceAccount] = js.native
  def getServiceAccount(callback: BodyResponseCallback[SchemaAccessApprovalServiceAccount]): Unit = js.native
  def getServiceAccount(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccessApprovalServiceAccount] = js.native
  def getServiceAccount(params: ParamsResourceOrganizationsGetserviceaccount): GaxiosPromise[SchemaAccessApprovalServiceAccount] = js.native
  def getServiceAccount(
    params: ParamsResourceOrganizationsGetserviceaccount,
    callback: BodyResponseCallback[SchemaAccessApprovalServiceAccount]
  ): Unit = js.native
  def getServiceAccount(
    params: ParamsResourceOrganizationsGetserviceaccount,
    options: BodyResponseCallback[Readable | SchemaAccessApprovalServiceAccount],
    callback: BodyResponseCallback[Readable | SchemaAccessApprovalServiceAccount]
  ): Unit = js.native
  def getServiceAccount(params: ParamsResourceOrganizationsGetserviceaccount, options: MethodOptions): GaxiosPromise[SchemaAccessApprovalServiceAccount] = js.native
  def getServiceAccount(
    params: ParamsResourceOrganizationsGetserviceaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccessApprovalServiceAccount]
  ): Unit = js.native
  /**
    * Retrieves the service account that is used by Access Approval to access KMS keys for signing approved approval requests.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await accessapproval.organizations.getServiceAccount({
    *     // Name of the AccessApprovalServiceAccount to retrieve.
    *     name: 'organizations/my-organization/serviceAccount',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountEmail": "my_accountEmail",
    *   //   "name": "my_name"
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
  def getServiceAccount(params: ParamsResourceOrganizationsGetserviceaccount, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getServiceAccount(
    params: ParamsResourceOrganizationsGetserviceaccount,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateAccessApprovalSettings(): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def updateAccessApprovalSettings(callback: BodyResponseCallback[SchemaAccessApprovalSettings]): Unit = js.native
  def updateAccessApprovalSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def updateAccessApprovalSettings(params: ParamsResourceOrganizationsUpdateaccessapprovalsettings): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def updateAccessApprovalSettings(
    params: ParamsResourceOrganizationsUpdateaccessapprovalsettings,
    callback: BodyResponseCallback[SchemaAccessApprovalSettings]
  ): Unit = js.native
  def updateAccessApprovalSettings(
    params: ParamsResourceOrganizationsUpdateaccessapprovalsettings,
    options: BodyResponseCallback[Readable | SchemaAccessApprovalSettings],
    callback: BodyResponseCallback[Readable | SchemaAccessApprovalSettings]
  ): Unit = js.native
  def updateAccessApprovalSettings(params: ParamsResourceOrganizationsUpdateaccessapprovalsettings, options: MethodOptions): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def updateAccessApprovalSettings(
    params: ParamsResourceOrganizationsUpdateaccessapprovalsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccessApprovalSettings]
  ): Unit = js.native
  /**
    * Updates the settings associated with a project, folder, or organization. Settings to update are determined by the value of field_mask.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await accessapproval.organizations.updateAccessApprovalSettings({
    *     // The resource name of the settings. Format is one of: * "projects/{project\}/accessApprovalSettings" * "folders/{folder\}/accessApprovalSettings" * "organizations/{organization\}/accessApprovalSettings"
    *     name: 'organizations/my-organization/accessApprovalSettings',
    *     // The update mask applies to the settings. Only the top level fields of AccessApprovalSettings (notification_emails & enrolled_services) are supported. For each field, if it is included, the currently stored value will be entirely overwritten with the value of the field passed in this request. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If this field is left unset, only the notification_emails field will be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activeKeyVersion": "my_activeKeyVersion",
    *       //   "ancestorHasActiveKeyVersion": false,
    *       //   "enrolledAncestor": false,
    *       //   "enrolledServices": [],
    *       //   "invalidKeyVersion": false,
    *       //   "name": "my_name",
    *       //   "notificationEmails": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeKeyVersion": "my_activeKeyVersion",
    *   //   "ancestorHasActiveKeyVersion": false,
    *   //   "enrolledAncestor": false,
    *   //   "enrolledServices": [],
    *   //   "invalidKeyVersion": false,
    *   //   "name": "my_name",
    *   //   "notificationEmails": []
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
  def updateAccessApprovalSettings(params: ParamsResourceOrganizationsUpdateaccessapprovalsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateAccessApprovalSettings(
    params: ParamsResourceOrganizationsUpdateaccessapprovalsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
