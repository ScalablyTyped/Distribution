package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudfunctions/v1", "cloudfunctions_v1.Resource$Projects$Locations$Functions")
@js.native
class ResourceProjectsLocationsFunctions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * cloudfunctions.projects.locations.functions.call
    * @desc Synchronously invokes a deployed Cloud Function. To be used for
    * testing purposes as very limited traffic is allowed. For more information
    * on the actual limits, refer to [Rate
    * Limits](https://cloud.google.com/functions/quotas#rate_limits).
    * @alias cloudfunctions.projects.locations.functions.call
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the function to be called.
    * @param {().CallFunctionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def call(): GaxiosPromise[SchemaCallFunctionResponse] = js.native
  def call(callback: BodyResponseCallback[SchemaCallFunctionResponse]): Unit = js.native
  def call(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCallFunctionResponse] = js.native
  def call(params: ParamsResourceProjectsLocationsFunctionsCall): GaxiosPromise[SchemaCallFunctionResponse] = js.native
  def call(
    params: ParamsResourceProjectsLocationsFunctionsCall,
    callback: BodyResponseCallback[SchemaCallFunctionResponse]
  ): Unit = js.native
  def call(
    params: ParamsResourceProjectsLocationsFunctionsCall,
    options: BodyResponseCallback[SchemaCallFunctionResponse],
    callback: BodyResponseCallback[SchemaCallFunctionResponse]
  ): Unit = js.native
  def call(params: ParamsResourceProjectsLocationsFunctionsCall, options: MethodOptions): GaxiosPromise[SchemaCallFunctionResponse] = js.native
  def call(
    params: ParamsResourceProjectsLocationsFunctionsCall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCallFunctionResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudfunctions.projects.locations.functions.create
    * @desc Creates a new function. If a function with the given name already
    * exists in the specified project, the long running operation will return
    * `ALREADY_EXISTS` error.
    * @alias cloudfunctions.projects.locations.functions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.location The project and location in which the function should be created, specified in the format `projects/x/locations/x`
    * @param {().CloudFunction} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsFunctionsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsFunctionsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsFunctionsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsFunctionsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsFunctionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudfunctions.projects.locations.functions.delete
    * @desc Deletes a function with the given name from the specified project.
    * If the given function is used by some trigger, the trigger will be
    * updated to remove this function.
    * @alias cloudfunctions.projects.locations.functions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the function which should be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsFunctionsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsFunctionsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsFunctionsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsFunctionsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsFunctionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudfunctions.projects.locations.functions.generateDownloadUrl
    * @desc Returns a signed URL for downloading deployed function source code.
    * The URL is only valid for a limited period and should be used within
    * minutes after generation. For more information about the signed URL usage
    * see: https://cloud.google.com/storage/docs/access-control/signed-urls
    * @alias cloudfunctions.projects.locations.functions.generateDownloadUrl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of function for which source code Google Cloud Storage signed URL should be generated.
    * @param {().GenerateDownloadUrlRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateDownloadUrl(): GaxiosPromise[SchemaGenerateDownloadUrlResponse] = js.native
  def generateDownloadUrl(callback: BodyResponseCallback[SchemaGenerateDownloadUrlResponse]): Unit = js.native
  def generateDownloadUrl(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGenerateDownloadUrlResponse] = js.native
  def generateDownloadUrl(params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl): GaxiosPromise[SchemaGenerateDownloadUrlResponse] = js.native
  def generateDownloadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl,
    callback: BodyResponseCallback[SchemaGenerateDownloadUrlResponse]
  ): Unit = js.native
  def generateDownloadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl,
    options: BodyResponseCallback[SchemaGenerateDownloadUrlResponse],
    callback: BodyResponseCallback[SchemaGenerateDownloadUrlResponse]
  ): Unit = js.native
  def generateDownloadUrl(params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl, options: MethodOptions): GaxiosPromise[SchemaGenerateDownloadUrlResponse] = js.native
  def generateDownloadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGeneratedownloadurl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateDownloadUrlResponse]
  ): Unit = js.native
  
  /**
    * cloudfunctions.projects.locations.functions.generateUploadUrl
    * @desc Returns a signed URL for uploading a function source code. For more
    * information about the signed URL usage see:
    * https://cloud.google.com/storage/docs/access-control/signed-urls. Once
    * the function source code upload is complete, the used signed URL should
    * be provided in CreateFunction or UpdateFunction request as a reference to
    * the function source code.  When uploading source code to the generated
    * signed URL, please follow these restrictions:  * Source file type should
    * be a zip file. * Source file size should not exceed 100MB limit. * No
    * credentials should be attached - the signed URLs provide access to the
    * target bucket using internal service identity; if credentials were
    * attached, the identity from the credentials would be used, but that
    * identity does not have permissions to upload files to the URL.  When
    * making a HTTP PUT request, these two headers need to be specified:  *
    * `content-type: application/zip` * `x-goog-content-length-range:
    * 0,104857600`  And this header SHOULD NOT be specified:  * `Authorization:
    * Bearer YOUR_TOKEN`
    * @alias cloudfunctions.projects.locations.functions.generateUploadUrl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project and location in which the Google Cloud Storage signed URL should be generated, specified in the format `projects/x/locations/x`.
    * @param {().GenerateUploadUrlRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateUploadUrl(): GaxiosPromise[SchemaGenerateUploadUrlResponse] = js.native
  def generateUploadUrl(callback: BodyResponseCallback[SchemaGenerateUploadUrlResponse]): Unit = js.native
  def generateUploadUrl(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGenerateUploadUrlResponse] = js.native
  def generateUploadUrl(params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl): GaxiosPromise[SchemaGenerateUploadUrlResponse] = js.native
  def generateUploadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl,
    callback: BodyResponseCallback[SchemaGenerateUploadUrlResponse]
  ): Unit = js.native
  def generateUploadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl,
    options: BodyResponseCallback[SchemaGenerateUploadUrlResponse],
    callback: BodyResponseCallback[SchemaGenerateUploadUrlResponse]
  ): Unit = js.native
  def generateUploadUrl(params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl, options: MethodOptions): GaxiosPromise[SchemaGenerateUploadUrlResponse] = js.native
  def generateUploadUrl(
    params: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateUploadUrlResponse]
  ): Unit = js.native
  
  /**
    * cloudfunctions.projects.locations.functions.get
    * @desc Returns a function with the given name from the requested project.
    * @alias cloudfunctions.projects.locations.functions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the function which details should be obtained.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCloudFunction] = js.native
  def get(callback: BodyResponseCallback[SchemaCloudFunction]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCloudFunction] = js.native
  def get(params: ParamsResourceProjectsLocationsFunctionsGet): GaxiosPromise[SchemaCloudFunction] = js.native
  def get(
    params: ParamsResourceProjectsLocationsFunctionsGet,
    callback: BodyResponseCallback[SchemaCloudFunction]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsFunctionsGet,
    options: BodyResponseCallback[SchemaCloudFunction],
    callback: BodyResponseCallback[SchemaCloudFunction]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsFunctionsGet, options: MethodOptions): GaxiosPromise[SchemaCloudFunction] = js.native
  def get(
    params: ParamsResourceProjectsLocationsFunctionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCloudFunction]
  ): Unit = js.native
  
  /**
    * cloudfunctions.projects.locations.functions.getIamPolicy
    * @desc Gets the IAM access control policy for a function. Returns an empty
    * policy if the function exists and does not have a policy set.
    * @alias cloudfunctions.projects.locations.functions.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsFunctionsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsFunctionsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * cloudfunctions.projects.locations.functions.list
    * @desc Returns a list of functions that belong to the requested project.
    * @alias cloudfunctions.projects.locations.functions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of functions to return per call.
    * @param {string=} params.pageToken The value returned by the last `ListFunctionsResponse`; indicates that this is a continuation of a prior `ListFunctions` call, and that the system should return the next page of data.
    * @param {string} params.parent The project and location from which the function should be listed, specified in the format `projects/x/locations/x` If you want to list functions in all locations, use "-" in place of a location.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListFunctionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFunctionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFunctionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsFunctionsList): GaxiosPromise[SchemaListFunctionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsFunctionsList,
    callback: BodyResponseCallback[SchemaListFunctionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsFunctionsList,
    options: BodyResponseCallback[SchemaListFunctionsResponse],
    callback: BodyResponseCallback[SchemaListFunctionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsFunctionsList, options: MethodOptions): GaxiosPromise[SchemaListFunctionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsFunctionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFunctionsResponse]
  ): Unit = js.native
  
  /**
    * cloudfunctions.projects.locations.functions.patch
    * @desc Updates existing function.
    * @alias cloudfunctions.projects.locations.functions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name A user-defined name of the function. Function names must be unique globally and match pattern `projects/x/locations/x/functions/x`
    * @param {string=} params.updateMask Required list of fields to be updated in this request.
    * @param {().CloudFunction} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsFunctionsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsFunctionsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsFunctionsPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsFunctionsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsFunctionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudfunctions.projects.locations.functions.setIamPolicy
    * @desc Sets the IAM access control policy on the specified function.
    * Replaces any existing policy.
    * @alias cloudfunctions.projects.locations.functions.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsFunctionsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsFunctionsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsFunctionsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * cloudfunctions.projects.locations.functions.testIamPermissions
    * @desc Tests the specified permissions against the IAM access control
    * policy for a function. If the function does not exist, this will return
    * an empty set of permissions, not a NOT_FOUND error.
    * @alias cloudfunctions.projects.locations.functions.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsFunctionsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsFunctionsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsFunctionsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsFunctionsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsFunctionsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
