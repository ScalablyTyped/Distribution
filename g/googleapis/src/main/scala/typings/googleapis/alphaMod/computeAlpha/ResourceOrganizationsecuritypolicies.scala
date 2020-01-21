package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Organizationsecuritypolicies")
@js.native
class ResourceOrganizationsecuritypolicies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.organizationSecurityPolicies.addAssociation
    * @desc Inserts an association for the specified security policy.
    * @alias compute.organizationSecurityPolicies.addAssociation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.replaceExistingAssociation Indicates whether or not to replace it if an association of the attachment already exists. This is false by default, in which case an error will be returned if an assocation already exists.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {().SecurityPolicyAssociation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addAssociation(): GaxiosPromise[SchemaOperation] = js.native
  def addAssociation(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addAssociation(params: ParamsResourceOrganizationsecuritypoliciesAddassociation): GaxiosPromise[SchemaOperation] = js.native
  def addAssociation(
    params: ParamsResourceOrganizationsecuritypoliciesAddassociation,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addAssociation(
    params: ParamsResourceOrganizationsecuritypoliciesAddassociation,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addAssociation(params: ParamsResourceOrganizationsecuritypoliciesAddassociation, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addAssociation(
    params: ParamsResourceOrganizationsecuritypoliciesAddassociation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.addRule
    * @desc Inserts a rule into a security policy.
    * @alias compute.organizationSecurityPolicies.addRule
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {().SecurityPolicyRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addRule(): GaxiosPromise[SchemaOperation] = js.native
  def addRule(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addRule(params: ParamsResourceOrganizationsecuritypoliciesAddrule): GaxiosPromise[SchemaOperation] = js.native
  def addRule(
    params: ParamsResourceOrganizationsecuritypoliciesAddrule,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addRule(
    params: ParamsResourceOrganizationsecuritypoliciesAddrule,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addRule(params: ParamsResourceOrganizationsecuritypoliciesAddrule, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addRule(
    params: ParamsResourceOrganizationsecuritypoliciesAddrule,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.copyRules
    * @desc Copies rules to the specified security policy.
    * @alias compute.organizationSecurityPolicies.copyRules
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {string=} params.sourceSecurityPolicy The security policy from which to copy rules.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def copyRules(): GaxiosPromise[SchemaOperation] = js.native
  def copyRules(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def copyRules(params: ParamsResourceOrganizationsecuritypoliciesCopyrules): GaxiosPromise[SchemaOperation] = js.native
  def copyRules(
    params: ParamsResourceOrganizationsecuritypoliciesCopyrules,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def copyRules(
    params: ParamsResourceOrganizationsecuritypoliciesCopyrules,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def copyRules(params: ParamsResourceOrganizationsecuritypoliciesCopyrules, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def copyRules(
    params: ParamsResourceOrganizationsecuritypoliciesCopyrules,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.delete
    * @desc Deletes the specified policy.
    * @alias compute.organizationSecurityPolicies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.securityPolicy Name of the security policy to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: ParamsResourceOrganizationsecuritypoliciesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceOrganizationsecuritypoliciesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsecuritypoliciesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsecuritypoliciesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceOrganizationsecuritypoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.get
    * @desc List all of the ordered rules present in a single specified policy.
    * @alias compute.organizationSecurityPolicies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.securityPolicy Name of the security policy to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSecurityPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaSecurityPolicy]): Unit = js.native
  def get(params: ParamsResourceOrganizationsecuritypoliciesGet): GaxiosPromise[SchemaSecurityPolicy] = js.native
  def get(
    params: ParamsResourceOrganizationsecuritypoliciesGet,
    callback: BodyResponseCallback[SchemaSecurityPolicy]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsecuritypoliciesGet,
    options: BodyResponseCallback[SchemaSecurityPolicy],
    callback: BodyResponseCallback[SchemaSecurityPolicy]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsecuritypoliciesGet, options: MethodOptions): GaxiosPromise[SchemaSecurityPolicy] = js.native
  def get(
    params: ParamsResourceOrganizationsecuritypoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityPolicy]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.getAssociation
    * @desc Gets an association with the specified name.
    * @alias compute.organizationSecurityPolicies.getAssociation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.name The name of the association to get from the security policy.
    * @param {string} params.securityPolicy Name of the security policy to which the queried rule belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAssociation(): GaxiosPromise[SchemaSecurityPolicyAssociation] = js.native
  def getAssociation(callback: BodyResponseCallback[SchemaSecurityPolicyAssociation]): Unit = js.native
  def getAssociation(params: ParamsResourceOrganizationsecuritypoliciesGetassociation): GaxiosPromise[SchemaSecurityPolicyAssociation] = js.native
  def getAssociation(
    params: ParamsResourceOrganizationsecuritypoliciesGetassociation,
    callback: BodyResponseCallback[SchemaSecurityPolicyAssociation]
  ): Unit = js.native
  def getAssociation(
    params: ParamsResourceOrganizationsecuritypoliciesGetassociation,
    options: BodyResponseCallback[SchemaSecurityPolicyAssociation],
    callback: BodyResponseCallback[SchemaSecurityPolicyAssociation]
  ): Unit = js.native
  def getAssociation(params: ParamsResourceOrganizationsecuritypoliciesGetassociation, options: MethodOptions): GaxiosPromise[SchemaSecurityPolicyAssociation] = js.native
  def getAssociation(
    params: ParamsResourceOrganizationsecuritypoliciesGetassociation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityPolicyAssociation]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.getRule
    * @desc Gets a rule at the specified priority.
    * @alias compute.organizationSecurityPolicies.getRule
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.priority The priority of the rule to get from the security policy.
    * @param {string} params.securityPolicy Name of the security policy to which the queried rule belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getRule(): GaxiosPromise[SchemaSecurityPolicyRule] = js.native
  def getRule(callback: BodyResponseCallback[SchemaSecurityPolicyRule]): Unit = js.native
  def getRule(params: ParamsResourceOrganizationsecuritypoliciesGetrule): GaxiosPromise[SchemaSecurityPolicyRule] = js.native
  def getRule(
    params: ParamsResourceOrganizationsecuritypoliciesGetrule,
    callback: BodyResponseCallback[SchemaSecurityPolicyRule]
  ): Unit = js.native
  def getRule(
    params: ParamsResourceOrganizationsecuritypoliciesGetrule,
    options: BodyResponseCallback[SchemaSecurityPolicyRule],
    callback: BodyResponseCallback[SchemaSecurityPolicyRule]
  ): Unit = js.native
  def getRule(params: ParamsResourceOrganizationsecuritypoliciesGetrule, options: MethodOptions): GaxiosPromise[SchemaSecurityPolicyRule] = js.native
  def getRule(
    params: ParamsResourceOrganizationsecuritypoliciesGetrule,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityPolicyRule]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.insert
    * @desc Creates a new policy in the specified project using the data
    * included in the request.
    * @alias compute.organizationSecurityPolicies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.parentId Parent ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().SecurityPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: ParamsResourceOrganizationsecuritypoliciesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceOrganizationsecuritypoliciesInsert,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(
    params: ParamsResourceOrganizationsecuritypoliciesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceOrganizationsecuritypoliciesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceOrganizationsecuritypoliciesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.list
    * @desc List all the policies that have been configured for the specified
    * project.
    * @alias compute.organizationSecurityPolicies.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string=} params.parentId Parent ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSecurityPolicyList] = js.native
  def list(callback: BodyResponseCallback[SchemaSecurityPolicyList]): Unit = js.native
  def list(params: ParamsResourceOrganizationsecuritypoliciesList): GaxiosPromise[SchemaSecurityPolicyList] = js.native
  def list(
    params: ParamsResourceOrganizationsecuritypoliciesList,
    callback: BodyResponseCallback[SchemaSecurityPolicyList]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsecuritypoliciesList,
    options: BodyResponseCallback[SchemaSecurityPolicyList],
    callback: BodyResponseCallback[SchemaSecurityPolicyList]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsecuritypoliciesList, options: MethodOptions): GaxiosPromise[SchemaSecurityPolicyList] = js.native
  def list(
    params: ParamsResourceOrganizationsecuritypoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityPolicyList]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.listAssociations
    * @desc Lists associations of a specified target, i.e., organization or
    * folder.
    * @alias compute.organizationSecurityPolicies.listAssociations
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.targetResource The target resource to list associations. It is an organization, or a folder.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listAssociations(): GaxiosPromise[SchemaOrganizationSecurityPoliciesListAssociationsResponse] = js.native
  def listAssociations(callback: BodyResponseCallback[SchemaOrganizationSecurityPoliciesListAssociationsResponse]): Unit = js.native
  def listAssociations(params: ParamsResourceOrganizationsecuritypoliciesListassociations): GaxiosPromise[SchemaOrganizationSecurityPoliciesListAssociationsResponse] = js.native
  def listAssociations(
    params: ParamsResourceOrganizationsecuritypoliciesListassociations,
    callback: BodyResponseCallback[SchemaOrganizationSecurityPoliciesListAssociationsResponse]
  ): Unit = js.native
  def listAssociations(
    params: ParamsResourceOrganizationsecuritypoliciesListassociations,
    options: BodyResponseCallback[SchemaOrganizationSecurityPoliciesListAssociationsResponse],
    callback: BodyResponseCallback[SchemaOrganizationSecurityPoliciesListAssociationsResponse]
  ): Unit = js.native
  def listAssociations(params: ParamsResourceOrganizationsecuritypoliciesListassociations, options: MethodOptions): GaxiosPromise[SchemaOrganizationSecurityPoliciesListAssociationsResponse] = js.native
  def listAssociations(
    params: ParamsResourceOrganizationsecuritypoliciesListassociations,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrganizationSecurityPoliciesListAssociationsResponse]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.move
    * @desc Moves the specified security policy.
    * @alias compute.organizationSecurityPolicies.move
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.parentId The new parent of the security policy.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def move(): GaxiosPromise[SchemaOperation] = js.native
  def move(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def move(params: ParamsResourceOrganizationsecuritypoliciesMove): GaxiosPromise[SchemaOperation] = js.native
  def move(
    params: ParamsResourceOrganizationsecuritypoliciesMove,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def move(
    params: ParamsResourceOrganizationsecuritypoliciesMove,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def move(params: ParamsResourceOrganizationsecuritypoliciesMove, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def move(
    params: ParamsResourceOrganizationsecuritypoliciesMove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.patch
    * @desc Patches the specified policy with the data included in the request.
    * @alias compute.organizationSecurityPolicies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {().SecurityPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: ParamsResourceOrganizationsecuritypoliciesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceOrganizationsecuritypoliciesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsecuritypoliciesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsecuritypoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceOrganizationsecuritypoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.patchRule
    * @desc Patches a rule at the specified priority.
    * @alias compute.organizationSecurityPolicies.patchRule
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.priority The priority of the rule to patch.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {().SecurityPolicyRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patchRule(): GaxiosPromise[SchemaOperation] = js.native
  def patchRule(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patchRule(params: ParamsResourceOrganizationsecuritypoliciesPatchrule): GaxiosPromise[SchemaOperation] = js.native
  def patchRule(
    params: ParamsResourceOrganizationsecuritypoliciesPatchrule,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patchRule(
    params: ParamsResourceOrganizationsecuritypoliciesPatchrule,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patchRule(params: ParamsResourceOrganizationsecuritypoliciesPatchrule, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patchRule(
    params: ParamsResourceOrganizationsecuritypoliciesPatchrule,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.removeAssociation
    * @desc Removes an association for the specified security policy.
    * @alias compute.organizationSecurityPolicies.removeAssociation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.name Name for the attachment that will be removed.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeAssociation(): GaxiosPromise[SchemaOperation] = js.native
  def removeAssociation(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removeAssociation(params: ParamsResourceOrganizationsecuritypoliciesRemoveassociation): GaxiosPromise[SchemaOperation] = js.native
  def removeAssociation(
    params: ParamsResourceOrganizationsecuritypoliciesRemoveassociation,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removeAssociation(
    params: ParamsResourceOrganizationsecuritypoliciesRemoveassociation,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removeAssociation(params: ParamsResourceOrganizationsecuritypoliciesRemoveassociation, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removeAssociation(
    params: ParamsResourceOrganizationsecuritypoliciesRemoveassociation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.organizationSecurityPolicies.removeRule
    * @desc Deletes a rule at the specified priority.
    * @alias compute.organizationSecurityPolicies.removeRule
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.priority The priority of the rule to remove from the security policy.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeRule(): GaxiosPromise[SchemaOperation] = js.native
  def removeRule(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removeRule(params: ParamsResourceOrganizationsecuritypoliciesRemoverule): GaxiosPromise[SchemaOperation] = js.native
  def removeRule(
    params: ParamsResourceOrganizationsecuritypoliciesRemoverule,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removeRule(
    params: ParamsResourceOrganizationsecuritypoliciesRemoverule,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removeRule(params: ParamsResourceOrganizationsecuritypoliciesRemoverule, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removeRule(
    params: ParamsResourceOrganizationsecuritypoliciesRemoverule,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

