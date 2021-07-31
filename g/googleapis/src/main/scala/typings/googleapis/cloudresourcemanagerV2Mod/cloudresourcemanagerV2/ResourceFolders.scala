package typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudresourcemanager/v2", "cloudresourcemanager_v2.Resource$Folders")
@js.native
class ResourceFolders protected () extends StObject {
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
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceFoldersCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceFoldersCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceFoldersCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceFoldersCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceFoldersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def delete(): GaxiosPromise[SchemaFolder] = js.native
  def delete(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def delete(params: ParamsResourceFoldersDelete): GaxiosPromise[SchemaFolder] = js.native
  def delete(params: ParamsResourceFoldersDelete, callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def delete(
    params: ParamsResourceFoldersDelete,
    options: BodyResponseCallback[SchemaFolder],
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def delete(params: ParamsResourceFoldersDelete, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def delete(
    params: ParamsResourceFoldersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
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
  def get(): GaxiosPromise[SchemaFolder] = js.native
  def get(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def get(params: ParamsResourceFoldersGet): GaxiosPromise[SchemaFolder] = js.native
  def get(params: ParamsResourceFoldersGet, callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def get(
    params: ParamsResourceFoldersGet,
    options: BodyResponseCallback[SchemaFolder],
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def get(params: ParamsResourceFoldersGet, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def get(
    params: ParamsResourceFoldersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
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
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceFoldersGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceFoldersGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceFoldersGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceFoldersGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceFoldersGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def list(): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFoldersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(params: ParamsResourceFoldersList): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(params: ParamsResourceFoldersList, callback: BodyResponseCallback[SchemaListFoldersResponse]): Unit = js.native
  def list(
    params: ParamsResourceFoldersList,
    options: BodyResponseCallback[SchemaListFoldersResponse],
    callback: BodyResponseCallback[SchemaListFoldersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFoldersList, options: MethodOptions): GaxiosPromise[SchemaListFoldersResponse] = js.native
  def list(
    params: ParamsResourceFoldersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFoldersResponse]
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
  def move(): GaxiosPromise[SchemaOperation] = js.native
  def move(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def move(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def move(params: ParamsResourceFoldersMove): GaxiosPromise[SchemaOperation] = js.native
  def move(params: ParamsResourceFoldersMove, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def move(
    params: ParamsResourceFoldersMove,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def move(params: ParamsResourceFoldersMove, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def move(
    params: ParamsResourceFoldersMove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def patch(): GaxiosPromise[SchemaFolder] = js.native
  def patch(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def patch(params: ParamsResourceFoldersPatch): GaxiosPromise[SchemaFolder] = js.native
  def patch(params: ParamsResourceFoldersPatch, callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def patch(
    params: ParamsResourceFoldersPatch,
    options: BodyResponseCallback[SchemaFolder],
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def patch(params: ParamsResourceFoldersPatch, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def patch(
    params: ParamsResourceFoldersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
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
  def search(): GaxiosPromise[SchemaSearchFoldersResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchFoldersResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchFoldersResponse] = js.native
  def search(params: ParamsResourceFoldersSearch): GaxiosPromise[SchemaSearchFoldersResponse] = js.native
  def search(params: ParamsResourceFoldersSearch, callback: BodyResponseCallback[SchemaSearchFoldersResponse]): Unit = js.native
  def search(
    params: ParamsResourceFoldersSearch,
    options: BodyResponseCallback[SchemaSearchFoldersResponse],
    callback: BodyResponseCallback[SchemaSearchFoldersResponse]
  ): Unit = js.native
  def search(params: ParamsResourceFoldersSearch, options: MethodOptions): GaxiosPromise[SchemaSearchFoldersResponse] = js.native
  def search(
    params: ParamsResourceFoldersSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchFoldersResponse]
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
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceFoldersSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceFoldersSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceFoldersSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceFoldersSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceFoldersSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceFoldersTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceFoldersTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceFoldersTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceFoldersTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceFoldersTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
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
  def undelete(): GaxiosPromise[SchemaFolder] = js.native
  def undelete(callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def undelete(params: ParamsResourceFoldersUndelete): GaxiosPromise[SchemaFolder] = js.native
  def undelete(params: ParamsResourceFoldersUndelete, callback: BodyResponseCallback[SchemaFolder]): Unit = js.native
  def undelete(
    params: ParamsResourceFoldersUndelete,
    options: BodyResponseCallback[SchemaFolder],
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
  def undelete(params: ParamsResourceFoldersUndelete, options: MethodOptions): GaxiosPromise[SchemaFolder] = js.native
  def undelete(
    params: ParamsResourceFoldersUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFolder]
  ): Unit = js.native
}
