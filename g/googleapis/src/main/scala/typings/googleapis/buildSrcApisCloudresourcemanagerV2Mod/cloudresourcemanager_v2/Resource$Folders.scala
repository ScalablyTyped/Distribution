package typings.googleapis.buildSrcApisCloudresourcemanagerV2Mod.cloudresourcemanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudresourcemanager/v2", "cloudresourcemanager_v2.Resource$Folders")
@js.native
class Resource$Folders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudresourcemanager.folders.create
    * @desc Creates a Folder in the resource hierarchy. Returns an Operation
    * which can be used to track the progress of the folder creation workflow.
    * Upon success the Operation.response field will be populated with the
    * created Folder.  In order to succeed, the addition of this new Folder
    * must not violate the Folder naming, height or fanout constraints.  + The
    * Folder's display_name must be distinct from all other Folder's that share
    * its parent. + The addition of the Folder must not cause the active Folder
    * hierarchy to exceed a height of 4. Note, the full active + deleted Folder
    * hierarchy is allowed to reach a height of 8; this provides additional
    * headroom when moving folders that contain deleted folders. + The addition
    * of the Folder must not cause the total number of Folders under its parent
    * to exceed 100.  If the operation fails due to a folder constraint
    * violation, some errors may be returned by the CreateFolder request, with
    * status code FAILED_PRECONDITION and an error description. Other folder
    * constraint violations will be communicated in the Operation, with the
    * specific PreconditionFailure returned via the details list in the
    * Operation.error field.  The caller must have
    * `resourcemanager.folders.create` permission on the identified parent.
    * @alias cloudresourcemanager.folders.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.parent The resource name of the new Folder's parent. Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarFoldersDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarFoldersDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarFoldersDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarFoldersDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarFoldersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.delete
    * @desc Requests deletion of a Folder. The Folder is moved into the
    * DELETE_REQUESTED state immediately, and is deleted approximately 30 days
    * later. This method may only be called on an empty Folder in the ACTIVE
    * state, where a Folder is empty if it doesn't contain any Folders or
    * Projects in the ACTIVE state. The caller must have
    * `resourcemanager.folders.delete` permission on the identified folder.
    * @alias cloudresourcemanager.folders.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name the resource name of the Folder to be deleted. Must be of the form `folders/{folder_id}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Folder] = js.native
  def delete(callback: BodyResponseCallback[Schema$Folder]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarFoldersDollarDelete): GaxiosPromise[Schema$Folder] = js.native
  def delete(
    params: ParamsDollarResourceDollarFoldersDollarDelete,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarFoldersDollarDelete,
    options: BodyResponseCallback[Schema$Folder],
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarFoldersDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Folder] = js.native
  def delete(
    params: ParamsDollarResourceDollarFoldersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.get
    * @desc Retrieves a Folder identified by the supplied resource name. Valid
    * Folder resource names have the format `folders/{folder_id}` (for example,
    * `folders/1234`). The caller must have `resourcemanager.folders.get`
    * permission on the identified folder.
    * @alias cloudresourcemanager.folders.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Folder to retrieve. Must be of the form `folders/{folder_id}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Folder] = js.native
  def get(callback: BodyResponseCallback[Schema$Folder]): Unit = js.native
  def get(params: ParamsDollarResourceDollarFoldersDollarGet): GaxiosPromise[Schema$Folder] = js.native
  def get(params: ParamsDollarResourceDollarFoldersDollarGet, callback: BodyResponseCallback[Schema$Folder]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarFoldersDollarGet,
    options: BodyResponseCallback[Schema$Folder],
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarFoldersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Folder] = js.native
  def get(
    params: ParamsDollarResourceDollarFoldersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.getIamPolicy
    * @desc Gets the access control policy for a Folder. The returned policy
    * may be empty if no such policy or resource exists. The `resource` field
    * should be the Folder's resource name, e.g. "folders/1234". The caller
    * must have `resourcemanager.folders.getIamPolicy` permission on the
    * identified folder.
    * @alias cloudresourcemanager.folders.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarFoldersDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarFoldersDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarFoldersDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarFoldersDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarFoldersDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.list
    * @desc Lists the Folders that are direct descendants of supplied parent
    * resource. List provides a strongly consistent view of the Folders
    * underneath the specified parent resource. List returns Folders sorted
    * based upon the (ascending) lexical ordering of their display_name. The
    * caller must have `resourcemanager.folders.list` permission on the
    * identified parent.
    * @alias cloudresourcemanager.folders.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of Folders to return in the response. This field is optional.
    * @param {string=} params.pageToken A pagination token returned from a previous call to `ListFolders` that indicates where this listing should continue from. This field is optional.
    * @param {string=} params.parent The resource name of the Organization or Folder whose Folders are being listed. Must be of the form `folders/{folder_id}` or `organizations/{org_id}`. Access to this method is controlled by checking the `resourcemanager.folders.list` permission on the `parent`.
    * @param {boolean=} params.showDeleted Controls whether Folders in the DELETE_REQUESTED state should be returned. Defaults to false. This field is optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFoldersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFoldersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarFoldersDollarList): GaxiosPromise[Schema$ListFoldersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFoldersDollarList,
    callback: BodyResponseCallback[Schema$ListFoldersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarFoldersDollarList,
    options: BodyResponseCallback[Schema$ListFoldersResponse],
    callback: BodyResponseCallback[Schema$ListFoldersResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarFoldersDollarList, options: MethodOptions): GaxiosPromise[Schema$ListFoldersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFoldersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFoldersResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.move
    * @desc Moves a Folder under a new resource parent. Returns an Operation
    * which can be used to track the progress of the folder move workflow. Upon
    * success the Operation.response field will be populated with the moved
    * Folder. Upon failure, a FolderOperationError categorizing the failure
    * cause will be returned - if the failure occurs synchronously then the
    * FolderOperationError will be returned via the Status.details field and if
    * it occurs asynchronously then the FolderOperation will be returned via
    * the Operation.error field. In addition, the Operation.metadata field will
    * be populated with a FolderOperation message as an aid to stateless
    * clients. Folder moves will be rejected if they violate either the naming,
    * height or fanout constraints described in the CreateFolder documentation.
    * The caller must have `resourcemanager.folders.move` permission on the
    * folder's current and proposed new parent.
    * @alias cloudresourcemanager.folders.move
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Folder to move. Must be of the form folders/{folder_id}
    * @param {().MoveFolderRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def move(): GaxiosPromise[Schema$Operation] = js.native
  def move(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def move(params: ParamsDollarResourceDollarFoldersDollarMove): GaxiosPromise[Schema$Operation] = js.native
  def move(
    params: ParamsDollarResourceDollarFoldersDollarMove,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def move(
    params: ParamsDollarResourceDollarFoldersDollarMove,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def move(params: ParamsDollarResourceDollarFoldersDollarMove, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def move(
    params: ParamsDollarResourceDollarFoldersDollarMove,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.patch
    * @desc Updates a Folder, changing its display_name. Changes to the folder
    * display_name will be rejected if they violate either the display_name
    * formatting rules or naming constraints described in the CreateFolder
    * documentation.  The Folder's display name must start and end with a
    * letter or digit, may contain letters, digits, spaces, hyphens and
    * underscores and can be no longer than 30 characters. This is captured by
    * the regular expression: [\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?.
    * The caller must have `resourcemanager.folders.update` permission on the
    * identified folder.  If the update fails due to the unique name constraint
    * then a PreconditionFailure explaining this violation will be returned in
    * the Status.details field.
    * @alias cloudresourcemanager.folders.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The resource name of the Folder. Its format is `folders/{folder_id}`, for example: "folders/1234".
    * @param {string=} params.updateMask Fields to be updated. Only the `display_name` can be updated.
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Folder] = js.native
  def patch(callback: BodyResponseCallback[Schema$Folder]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFoldersDollarPatch): GaxiosPromise[Schema$Folder] = js.native
  def patch(
    params: ParamsDollarResourceDollarFoldersDollarPatch,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarFoldersDollarPatch,
    options: BodyResponseCallback[Schema$Folder],
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFoldersDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Folder] = js.native
  def patch(
    params: ParamsDollarResourceDollarFoldersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.search
    * @desc Search for folders that match specific filter criteria. Search
    * provides an eventually consistent view of the folders a user has access
    * to which meet the specified filter criteria.  This will only return
    * folders on which the caller has the permission
    * `resourcemanager.folders.get`.
    * @alias cloudresourcemanager.folders.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SearchFoldersRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$SearchFoldersResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$SearchFoldersResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarFoldersDollarSearch): GaxiosPromise[Schema$SearchFoldersResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarFoldersDollarSearch,
    callback: BodyResponseCallback[Schema$SearchFoldersResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarFoldersDollarSearch,
    options: BodyResponseCallback[Schema$SearchFoldersResponse],
    callback: BodyResponseCallback[Schema$SearchFoldersResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarFoldersDollarSearch, options: MethodOptions): GaxiosPromise[Schema$SearchFoldersResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarFoldersDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchFoldersResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.setIamPolicy
    * @desc Sets the access control policy on a Folder, replacing any existing
    * policy. The `resource` field should be the Folder's resource name, e.g.
    * "folders/1234". The caller must have
    * `resourcemanager.folders.setIamPolicy` permission on the identified
    * folder.
    * @alias cloudresourcemanager.folders.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarFoldersDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarFoldersDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarFoldersDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarFoldersDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarFoldersDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.testIamPermissions
    * @desc Returns permissions that a caller has on the specified Folder. The
    * `resource` field should be the Folder's resource name, e.g.
    * "folders/1234".  There are no permissions required for making this API
    * call.
    * @alias cloudresourcemanager.folders.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarFoldersDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarFoldersDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarFoldersDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarFoldersDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarFoldersDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.undelete
    * @desc Cancels the deletion request for a Folder. This method may only be
    * called on a Folder in the DELETE_REQUESTED state. In order to succeed,
    * the Folder's parent must be in the ACTIVE state. In addition,
    * reintroducing the folder into the tree must not violate folder naming,
    * height and fanout constraints described in the CreateFolder
    * documentation. The caller must have `resourcemanager.folders.undelete`
    * permission on the identified folder.
    * @alias cloudresourcemanager.folders.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Folder to undelete. Must be of the form `folders/{folder_id}`.
    * @param {().UndeleteFolderRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[Schema$Folder] = js.native
  def undelete(callback: BodyResponseCallback[Schema$Folder]): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarFoldersDollarUndelete): GaxiosPromise[Schema$Folder] = js.native
  def undelete(
    params: ParamsDollarResourceDollarFoldersDollarUndelete,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarFoldersDollarUndelete,
    options: BodyResponseCallback[Schema$Folder],
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarFoldersDollarUndelete, options: MethodOptions): GaxiosPromise[Schema$Folder] = js.native
  def undelete(
    params: ParamsDollarResourceDollarFoldersDollarUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
}

