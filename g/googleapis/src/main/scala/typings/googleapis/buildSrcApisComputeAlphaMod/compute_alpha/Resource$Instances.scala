package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Instances")
@js.native
class Resource$Instances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.instances.addAccessConfig
    * @desc Adds an access config to an instance's network interface.
    * @alias compute.instances.addAccessConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.networkInterface The name of the network interface to add to this instance.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().AccessConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addAccessConfig(): GaxiosPromise[Schema$Operation] = js.native
  def addAccessConfig(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def addAccessConfig(params: ParamsDollarResourceDollarInstancesDollarAddaccessconfig): GaxiosPromise[Schema$Operation] = js.native
  def addAccessConfig(
    params: ParamsDollarResourceDollarInstancesDollarAddaccessconfig,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addAccessConfig(
    params: ParamsDollarResourceDollarInstancesDollarAddaccessconfig,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addAccessConfig(params: ParamsDollarResourceDollarInstancesDollarAddaccessconfig, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def addAccessConfig(
    params: ParamsDollarResourceDollarInstancesDollarAddaccessconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.addResourcePolicies
    * @desc Adds existing resource policies to an instance. You can only add
    * one policy right now which will be applied to this instance for
    * scheduling live migrations.
    * @alias compute.instances.addResourcePolicies
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesAddResourcePoliciesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addResourcePolicies(): GaxiosPromise[Schema$Operation] = js.native
  def addResourcePolicies(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def addResourcePolicies(params: ParamsDollarResourceDollarInstancesDollarAddresourcepolicies): GaxiosPromise[Schema$Operation] = js.native
  def addResourcePolicies(
    params: ParamsDollarResourceDollarInstancesDollarAddresourcepolicies,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addResourcePolicies(
    params: ParamsDollarResourceDollarInstancesDollarAddresourcepolicies,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addResourcePolicies(params: ParamsDollarResourceDollarInstancesDollarAddresourcepolicies, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def addResourcePolicies(
    params: ParamsDollarResourceDollarInstancesDollarAddresourcepolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.aggregatedList
    * @desc Retrieves aggregated list of all of the instances in your project
    * across all regions and zones.
    * @alias compute.instances.aggregatedList
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregatedList(): GaxiosPromise[Schema$InstanceAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[Schema$InstanceAggregatedList]): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarInstancesDollarAggregatedlist): GaxiosPromise[Schema$InstanceAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarInstancesDollarAggregatedlist,
    callback: BodyResponseCallback[Schema$InstanceAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarInstancesDollarAggregatedlist,
    options: BodyResponseCallback[Schema$InstanceAggregatedList],
    callback: BodyResponseCallback[Schema$InstanceAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarInstancesDollarAggregatedlist, options: MethodOptions): GaxiosPromise[Schema$InstanceAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarInstancesDollarAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InstanceAggregatedList]
  ): Unit = js.native
  /**
    * compute.instances.attachDisk
    * @desc Attaches an existing Disk resource to an instance. You must first
    * create the disk before you can attach it. It is not possible to create
    * and attach a disk at the same time. For more information, read Adding a
    * persistent disk to your instance.
    * @alias compute.instances.attachDisk
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.forceAttach Whether to force attach the disk even if it's currently attached to another instance.
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().AttachedDisk} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def attachDisk(): GaxiosPromise[Schema$Operation] = js.native
  def attachDisk(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def attachDisk(params: ParamsDollarResourceDollarInstancesDollarAttachdisk): GaxiosPromise[Schema$Operation] = js.native
  def attachDisk(
    params: ParamsDollarResourceDollarInstancesDollarAttachdisk,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def attachDisk(
    params: ParamsDollarResourceDollarInstancesDollarAttachdisk,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def attachDisk(params: ParamsDollarResourceDollarInstancesDollarAttachdisk, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def attachDisk(
    params: ParamsDollarResourceDollarInstancesDollarAttachdisk,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.delete
    * @desc Deletes the specified Instance resource. For more information, see
    * Stopping or Deleting an Instance.
    * @alias compute.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInstancesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarInstancesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarInstancesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInstancesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarInstancesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.deleteAccessConfig
    * @desc Deletes an access config from an instance's network interface.
    * @alias compute.instances.deleteAccessConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accessConfig The name of the access config to delete.
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.networkInterface The name of the network interface.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteAccessConfig(): GaxiosPromise[Schema$Operation] = js.native
  def deleteAccessConfig(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def deleteAccessConfig(params: ParamsDollarResourceDollarInstancesDollarDeleteaccessconfig): GaxiosPromise[Schema$Operation] = js.native
  def deleteAccessConfig(
    params: ParamsDollarResourceDollarInstancesDollarDeleteaccessconfig,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteAccessConfig(
    params: ParamsDollarResourceDollarInstancesDollarDeleteaccessconfig,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteAccessConfig(params: ParamsDollarResourceDollarInstancesDollarDeleteaccessconfig, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def deleteAccessConfig(
    params: ParamsDollarResourceDollarInstancesDollarDeleteaccessconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.detachDisk
    * @desc Detaches a disk from an instance.
    * @alias compute.instances.detachDisk
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceName The device name of the disk to detach. Make a get() request on the instance to view currently attached disks and device names.
    * @param {string} params.instance Instance name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def detachDisk(): GaxiosPromise[Schema$Operation] = js.native
  def detachDisk(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def detachDisk(params: ParamsDollarResourceDollarInstancesDollarDetachdisk): GaxiosPromise[Schema$Operation] = js.native
  def detachDisk(
    params: ParamsDollarResourceDollarInstancesDollarDetachdisk,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def detachDisk(
    params: ParamsDollarResourceDollarInstancesDollarDetachdisk,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def detachDisk(params: ParamsDollarResourceDollarInstancesDollarDetachdisk, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def detachDisk(
    params: ParamsDollarResourceDollarInstancesDollarDetachdisk,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.get
    * @desc Returns the specified Instance resource. Gets a list of available
    * instances by making a list() request.
    * @alias compute.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Instance] = js.native
  def get(callback: BodyResponseCallback[Schema$Instance]): Unit = js.native
  def get(params: ParamsDollarResourceDollarInstancesDollarGet): GaxiosPromise[Schema$Instance] = js.native
  def get(
    params: ParamsDollarResourceDollarInstancesDollarGet,
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarInstancesDollarGet,
    options: BodyResponseCallback[Schema$Instance],
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarInstancesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Instance] = js.native
  def get(
    params: ParamsDollarResourceDollarInstancesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  /**
    * compute.instances.getGuestAttributes
    * @desc Returns the specified guest attributes entry.
    * @alias compute.instances.getGuestAttributes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.queryPath Specifies the guest attributes path to be queried.
    * @param {string=} params.variableKey Specifies the key for the guest attributes entry.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getGuestAttributes(): GaxiosPromise[Schema$GuestAttributes] = js.native
  def getGuestAttributes(callback: BodyResponseCallback[Schema$GuestAttributes]): Unit = js.native
  def getGuestAttributes(params: ParamsDollarResourceDollarInstancesDollarGetguestattributes): GaxiosPromise[Schema$GuestAttributes] = js.native
  def getGuestAttributes(
    params: ParamsDollarResourceDollarInstancesDollarGetguestattributes,
    callback: BodyResponseCallback[Schema$GuestAttributes]
  ): Unit = js.native
  def getGuestAttributes(
    params: ParamsDollarResourceDollarInstancesDollarGetguestattributes,
    options: BodyResponseCallback[Schema$GuestAttributes],
    callback: BodyResponseCallback[Schema$GuestAttributes]
  ): Unit = js.native
  def getGuestAttributes(params: ParamsDollarResourceDollarInstancesDollarGetguestattributes, options: MethodOptions): GaxiosPromise[Schema$GuestAttributes] = js.native
  def getGuestAttributes(
    params: ParamsDollarResourceDollarInstancesDollarGetguestattributes,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GuestAttributes]
  ): Unit = js.native
  /**
    * compute.instances.getIamPolicy
    * @desc Gets the access control policy for a resource. May be empty if no
    * such policy or resource exists.
    * @alias compute.instances.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarInstancesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarInstancesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarInstancesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarInstancesDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarInstancesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * compute.instances.getSerialPortOutput
    * @desc Returns the last 1 MB of serial port output from the specified
    * instance.
    * @alias compute.instances.getSerialPortOutput
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {integer=} params.port Specifies which COM or serial port to retrieve data from.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.start Returns output starting from a specific byte position. Use this to page through output when the output is too large to return in a single request. For the initial request, leave this field unspecified. For subsequent calls, this field should be set to the next value returned in the previous call.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getSerialPortOutput(): GaxiosPromise[Schema$SerialPortOutput] = js.native
  def getSerialPortOutput(callback: BodyResponseCallback[Schema$SerialPortOutput]): Unit = js.native
  def getSerialPortOutput(params: ParamsDollarResourceDollarInstancesDollarGetserialportoutput): GaxiosPromise[Schema$SerialPortOutput] = js.native
  def getSerialPortOutput(
    params: ParamsDollarResourceDollarInstancesDollarGetserialportoutput,
    callback: BodyResponseCallback[Schema$SerialPortOutput]
  ): Unit = js.native
  def getSerialPortOutput(
    params: ParamsDollarResourceDollarInstancesDollarGetserialportoutput,
    options: BodyResponseCallback[Schema$SerialPortOutput],
    callback: BodyResponseCallback[Schema$SerialPortOutput]
  ): Unit = js.native
  def getSerialPortOutput(params: ParamsDollarResourceDollarInstancesDollarGetserialportoutput, options: MethodOptions): GaxiosPromise[Schema$SerialPortOutput] = js.native
  def getSerialPortOutput(
    params: ParamsDollarResourceDollarInstancesDollarGetserialportoutput,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SerialPortOutput]
  ): Unit = js.native
  /**
    * compute.instances.getShieldedInstanceIdentity
    * @desc Returns the Shielded Instance Identity of an instance
    * @alias compute.instances.getShieldedInstanceIdentity
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name or id of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getShieldedInstanceIdentity(): GaxiosPromise[Schema$ShieldedInstanceIdentity] = js.native
  def getShieldedInstanceIdentity(callback: BodyResponseCallback[Schema$ShieldedInstanceIdentity]): Unit = js.native
  def getShieldedInstanceIdentity(params: ParamsDollarResourceDollarInstancesDollarGetshieldedinstanceidentity): GaxiosPromise[Schema$ShieldedInstanceIdentity] = js.native
  def getShieldedInstanceIdentity(
    params: ParamsDollarResourceDollarInstancesDollarGetshieldedinstanceidentity,
    callback: BodyResponseCallback[Schema$ShieldedInstanceIdentity]
  ): Unit = js.native
  def getShieldedInstanceIdentity(
    params: ParamsDollarResourceDollarInstancesDollarGetshieldedinstanceidentity,
    options: BodyResponseCallback[Schema$ShieldedInstanceIdentity],
    callback: BodyResponseCallback[Schema$ShieldedInstanceIdentity]
  ): Unit = js.native
  def getShieldedInstanceIdentity(
    params: ParamsDollarResourceDollarInstancesDollarGetshieldedinstanceidentity,
    options: MethodOptions
  ): GaxiosPromise[Schema$ShieldedInstanceIdentity] = js.native
  def getShieldedInstanceIdentity(
    params: ParamsDollarResourceDollarInstancesDollarGetshieldedinstanceidentity,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ShieldedInstanceIdentity]
  ): Unit = js.native
  /**
    * compute.instances.getShieldedVmIdentity
    * @desc Returns the Shielded VM Identity of an instance
    * @alias compute.instances.getShieldedVmIdentity
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getShieldedVmIdentity(): GaxiosPromise[Schema$ShieldedVmIdentity] = js.native
  def getShieldedVmIdentity(callback: BodyResponseCallback[Schema$ShieldedVmIdentity]): Unit = js.native
  def getShieldedVmIdentity(params: ParamsDollarResourceDollarInstancesDollarGetshieldedvmidentity): GaxiosPromise[Schema$ShieldedVmIdentity] = js.native
  def getShieldedVmIdentity(
    params: ParamsDollarResourceDollarInstancesDollarGetshieldedvmidentity,
    callback: BodyResponseCallback[Schema$ShieldedVmIdentity]
  ): Unit = js.native
  def getShieldedVmIdentity(
    params: ParamsDollarResourceDollarInstancesDollarGetshieldedvmidentity,
    options: BodyResponseCallback[Schema$ShieldedVmIdentity],
    callback: BodyResponseCallback[Schema$ShieldedVmIdentity]
  ): Unit = js.native
  def getShieldedVmIdentity(params: ParamsDollarResourceDollarInstancesDollarGetshieldedvmidentity, options: MethodOptions): GaxiosPromise[Schema$ShieldedVmIdentity] = js.native
  def getShieldedVmIdentity(
    params: ParamsDollarResourceDollarInstancesDollarGetshieldedvmidentity,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ShieldedVmIdentity]
  ): Unit = js.native
  /**
    * compute.instances.insert
    * @desc Creates an instance resource in the specified project using the
    * data included in the request.
    * @alias compute.instances.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string=} params.sourceInstanceTemplate Specifies instance template to create the instance.  This field is optional. It can be a full or partial URL. For example, the following are all valid URLs to an instance template:   - https://www.googleapis.com/compute/v1/projects/project/global/instanceTemplates/instanceTemplate  - projects/project/global/instanceTemplates/instanceTemplate  - global/instanceTemplates/instanceTemplate
    * @param {string=} params.sourceMachineImage Specifies instance machine to create the instance.  This field is optional. It can be a full or partial URL. For example, the following are all valid URLs to an instance template:   - https://www.googleapis.com/compute/v1/projects/project/global/global/machineImages/machineImage  - projects/project/global/global/machineImages/machineImage  - global/machineImages/machineImage
    * @param {string} params.zone The name of the zone for this request.
    * @param {().Instance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarInstancesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarInstancesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarInstancesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarInstancesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarInstancesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.list
    * @desc Retrieves the list of instances contained within the specified
    * zone.
    * @alias compute.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$InstanceList] = js.native
  def list(callback: BodyResponseCallback[Schema$InstanceList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarInstancesDollarList): GaxiosPromise[Schema$InstanceList] = js.native
  def list(
    params: ParamsDollarResourceDollarInstancesDollarList,
    callback: BodyResponseCallback[Schema$InstanceList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarInstancesDollarList,
    options: BodyResponseCallback[Schema$InstanceList],
    callback: BodyResponseCallback[Schema$InstanceList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarInstancesDollarList, options: MethodOptions): GaxiosPromise[Schema$InstanceList] = js.native
  def list(
    params: ParamsDollarResourceDollarInstancesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InstanceList]
  ): Unit = js.native
  /**
    * compute.instances.listReferrers
    * @desc Retrieves the list of referrers to instances contained within the
    * specified zone. For more information, read Viewing Referrers to VM
    * Instances.
    * @alias compute.instances.listReferrers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {string} params.instance Name of the target instance scoping this request, or '-' if the request should span over all instances in the container.
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listReferrers(): GaxiosPromise[Schema$InstanceListReferrers] = js.native
  def listReferrers(callback: BodyResponseCallback[Schema$InstanceListReferrers]): Unit = js.native
  def listReferrers(params: ParamsDollarResourceDollarInstancesDollarListreferrers): GaxiosPromise[Schema$InstanceListReferrers] = js.native
  def listReferrers(
    params: ParamsDollarResourceDollarInstancesDollarListreferrers,
    callback: BodyResponseCallback[Schema$InstanceListReferrers]
  ): Unit = js.native
  def listReferrers(
    params: ParamsDollarResourceDollarInstancesDollarListreferrers,
    options: BodyResponseCallback[Schema$InstanceListReferrers],
    callback: BodyResponseCallback[Schema$InstanceListReferrers]
  ): Unit = js.native
  def listReferrers(params: ParamsDollarResourceDollarInstancesDollarListreferrers, options: MethodOptions): GaxiosPromise[Schema$InstanceListReferrers] = js.native
  def listReferrers(
    params: ParamsDollarResourceDollarInstancesDollarListreferrers,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InstanceListReferrers]
  ): Unit = js.native
  /**
    * compute.instances.removeResourcePolicies
    * @desc Removes resource policies from an instance.
    * @alias compute.instances.removeResourcePolicies
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesRemoveResourcePoliciesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeResourcePolicies(): GaxiosPromise[Schema$Operation] = js.native
  def removeResourcePolicies(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def removeResourcePolicies(params: ParamsDollarResourceDollarInstancesDollarRemoveresourcepolicies): GaxiosPromise[Schema$Operation] = js.native
  def removeResourcePolicies(
    params: ParamsDollarResourceDollarInstancesDollarRemoveresourcepolicies,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def removeResourcePolicies(
    params: ParamsDollarResourceDollarInstancesDollarRemoveresourcepolicies,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def removeResourcePolicies(params: ParamsDollarResourceDollarInstancesDollarRemoveresourcepolicies, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def removeResourcePolicies(
    params: ParamsDollarResourceDollarInstancesDollarRemoveresourcepolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.reset
    * @desc Performs a reset on the instance. This is a hard reset the VM does
    * not do a graceful shutdown. For more information, see Resetting an
    * instance.
    * @alias compute.instances.reset
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[Schema$Operation] = js.native
  def reset(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def reset(params: ParamsDollarResourceDollarInstancesDollarReset): GaxiosPromise[Schema$Operation] = js.native
  def reset(
    params: ParamsDollarResourceDollarInstancesDollarReset,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def reset(
    params: ParamsDollarResourceDollarInstancesDollarReset,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def reset(params: ParamsDollarResourceDollarInstancesDollarReset, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def reset(
    params: ParamsDollarResourceDollarInstancesDollarReset,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.resume
    * @desc Resumes an instance that was suspended using the
    * instances().suspend method.
    * @alias compute.instances.resume
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to resume.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesResumeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resume(): GaxiosPromise[Schema$Operation] = js.native
  def resume(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def resume(params: ParamsDollarResourceDollarInstancesDollarResume): GaxiosPromise[Schema$Operation] = js.native
  def resume(
    params: ParamsDollarResourceDollarInstancesDollarResume,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def resume(
    params: ParamsDollarResourceDollarInstancesDollarResume,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def resume(params: ParamsDollarResourceDollarInstancesDollarResume, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def resume(
    params: ParamsDollarResourceDollarInstancesDollarResume,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setDeletionProtection
    * @desc Sets deletion protection on the instance.
    * @alias compute.instances.setDeletionProtection
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.deletionProtection Whether the resource should be protected against deletion.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setDeletionProtection(): GaxiosPromise[Schema$Operation] = js.native
  def setDeletionProtection(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setDeletionProtection(params: ParamsDollarResourceDollarInstancesDollarSetdeletionprotection): GaxiosPromise[Schema$Operation] = js.native
  def setDeletionProtection(
    params: ParamsDollarResourceDollarInstancesDollarSetdeletionprotection,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setDeletionProtection(
    params: ParamsDollarResourceDollarInstancesDollarSetdeletionprotection,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setDeletionProtection(params: ParamsDollarResourceDollarInstancesDollarSetdeletionprotection, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setDeletionProtection(
    params: ParamsDollarResourceDollarInstancesDollarSetdeletionprotection,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setDiskAutoDelete
    * @desc Sets the auto-delete flag for a disk attached to an instance.
    * @alias compute.instances.setDiskAutoDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean} params.autoDelete Whether to auto-delete the disk when the instance is deleted.
    * @param {string} params.deviceName The device name of the disk to modify. Make a get() request on the instance to view currently attached disks and device names.
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setDiskAutoDelete(): GaxiosPromise[Schema$Operation] = js.native
  def setDiskAutoDelete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setDiskAutoDelete(params: ParamsDollarResourceDollarInstancesDollarSetdiskautodelete): GaxiosPromise[Schema$Operation] = js.native
  def setDiskAutoDelete(
    params: ParamsDollarResourceDollarInstancesDollarSetdiskautodelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setDiskAutoDelete(
    params: ParamsDollarResourceDollarInstancesDollarSetdiskautodelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setDiskAutoDelete(params: ParamsDollarResourceDollarInstancesDollarSetdiskautodelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setDiskAutoDelete(
    params: ParamsDollarResourceDollarInstancesDollarSetdiskautodelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias compute.instances.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {().ZoneSetPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarInstancesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarInstancesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarInstancesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarInstancesDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarInstancesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * compute.instances.setLabels
    * @desc Sets labels on an instance. To learn more about labels, read the
    * Labeling Resources documentation.
    * @alias compute.instances.setLabels
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesSetLabelsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLabels(): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarInstancesDollarSetlabels): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarInstancesDollarSetlabels,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(
    params: ParamsDollarResourceDollarInstancesDollarSetlabels,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarInstancesDollarSetlabels, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarInstancesDollarSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setMachineResources
    * @desc Changes the number and/or type of accelerator for a stopped
    * instance to the values specified in the request.
    * @alias compute.instances.setMachineResources
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesSetMachineResourcesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMachineResources(): GaxiosPromise[Schema$Operation] = js.native
  def setMachineResources(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setMachineResources(params: ParamsDollarResourceDollarInstancesDollarSetmachineresources): GaxiosPromise[Schema$Operation] = js.native
  def setMachineResources(
    params: ParamsDollarResourceDollarInstancesDollarSetmachineresources,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMachineResources(
    params: ParamsDollarResourceDollarInstancesDollarSetmachineresources,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMachineResources(params: ParamsDollarResourceDollarInstancesDollarSetmachineresources, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setMachineResources(
    params: ParamsDollarResourceDollarInstancesDollarSetmachineresources,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setMachineType
    * @desc Changes the machine type for a stopped instance to the machine type
    * specified in the request.
    * @alias compute.instances.setMachineType
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesSetMachineTypeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMachineType(): GaxiosPromise[Schema$Operation] = js.native
  def setMachineType(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setMachineType(params: ParamsDollarResourceDollarInstancesDollarSetmachinetype): GaxiosPromise[Schema$Operation] = js.native
  def setMachineType(
    params: ParamsDollarResourceDollarInstancesDollarSetmachinetype,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMachineType(
    params: ParamsDollarResourceDollarInstancesDollarSetmachinetype,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMachineType(params: ParamsDollarResourceDollarInstancesDollarSetmachinetype, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setMachineType(
    params: ParamsDollarResourceDollarInstancesDollarSetmachinetype,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setMetadata
    * @desc Sets metadata for the specified instance to the data included in
    * the request.
    * @alias compute.instances.setMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().Metadata} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMetadata(): GaxiosPromise[Schema$Operation] = js.native
  def setMetadata(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setMetadata(params: ParamsDollarResourceDollarInstancesDollarSetmetadata): GaxiosPromise[Schema$Operation] = js.native
  def setMetadata(
    params: ParamsDollarResourceDollarInstancesDollarSetmetadata,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMetadata(
    params: ParamsDollarResourceDollarInstancesDollarSetmetadata,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMetadata(params: ParamsDollarResourceDollarInstancesDollarSetmetadata, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setMetadata(
    params: ParamsDollarResourceDollarInstancesDollarSetmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setMinCpuPlatform
    * @desc Changes the minimum CPU platform that this instance should use.
    * This method can only be called on a stopped instance. For more
    * information, read Specifying a Minimum CPU Platform.
    * @alias compute.instances.setMinCpuPlatform
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesSetMinCpuPlatformRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMinCpuPlatform(): GaxiosPromise[Schema$Operation] = js.native
  def setMinCpuPlatform(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setMinCpuPlatform(params: ParamsDollarResourceDollarInstancesDollarSetmincpuplatform): GaxiosPromise[Schema$Operation] = js.native
  def setMinCpuPlatform(
    params: ParamsDollarResourceDollarInstancesDollarSetmincpuplatform,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMinCpuPlatform(
    params: ParamsDollarResourceDollarInstancesDollarSetmincpuplatform,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMinCpuPlatform(params: ParamsDollarResourceDollarInstancesDollarSetmincpuplatform, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setMinCpuPlatform(
    params: ParamsDollarResourceDollarInstancesDollarSetmincpuplatform,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setScheduling
    * @desc Sets an instance's scheduling options.
    * @alias compute.instances.setScheduling
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Instance name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().Scheduling} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setScheduling(): GaxiosPromise[Schema$Operation] = js.native
  def setScheduling(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setScheduling(params: ParamsDollarResourceDollarInstancesDollarSetscheduling): GaxiosPromise[Schema$Operation] = js.native
  def setScheduling(
    params: ParamsDollarResourceDollarInstancesDollarSetscheduling,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setScheduling(
    params: ParamsDollarResourceDollarInstancesDollarSetscheduling,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setScheduling(params: ParamsDollarResourceDollarInstancesDollarSetscheduling, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setScheduling(
    params: ParamsDollarResourceDollarInstancesDollarSetscheduling,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setServiceAccount
    * @desc Sets the service account on the instance. For more information,
    * read Changing the service account and access scopes for an instance.
    * @alias compute.instances.setServiceAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to start.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesSetServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setServiceAccount(): GaxiosPromise[Schema$Operation] = js.native
  def setServiceAccount(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setServiceAccount(params: ParamsDollarResourceDollarInstancesDollarSetserviceaccount): GaxiosPromise[Schema$Operation] = js.native
  def setServiceAccount(
    params: ParamsDollarResourceDollarInstancesDollarSetserviceaccount,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setServiceAccount(
    params: ParamsDollarResourceDollarInstancesDollarSetserviceaccount,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setServiceAccount(params: ParamsDollarResourceDollarInstancesDollarSetserviceaccount, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setServiceAccount(
    params: ParamsDollarResourceDollarInstancesDollarSetserviceaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setShieldedInstanceIntegrityPolicy
    * @desc Sets the Shielded Instance integrity policy for an instance. You
    * can only use this method on a running instance. This method supports
    * PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    * @alias compute.instances.setShieldedInstanceIntegrityPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name or id of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().ShieldedInstanceIntegrityPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setShieldedInstanceIntegrityPolicy(): GaxiosPromise[Schema$Operation] = js.native
  def setShieldedInstanceIntegrityPolicy(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setShieldedInstanceIntegrityPolicy(params: ParamsDollarResourceDollarInstancesDollarSetshieldedinstanceintegritypolicy): GaxiosPromise[Schema$Operation] = js.native
  def setShieldedInstanceIntegrityPolicy(
    params: ParamsDollarResourceDollarInstancesDollarSetshieldedinstanceintegritypolicy,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setShieldedInstanceIntegrityPolicy(
    params: ParamsDollarResourceDollarInstancesDollarSetshieldedinstanceintegritypolicy,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setShieldedInstanceIntegrityPolicy(
    params: ParamsDollarResourceDollarInstancesDollarSetshieldedinstanceintegritypolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setShieldedInstanceIntegrityPolicy(
    params: ParamsDollarResourceDollarInstancesDollarSetshieldedinstanceintegritypolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setShieldedVmIntegrityPolicy
    * @desc Sets the Shielded VM integrity policy for a VM instance. You can
    * only use this method on a running VM instance. This method supports PATCH
    * semantics and uses the JSON merge patch format and processing rules.
    * @alias compute.instances.setShieldedVmIntegrityPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().ShieldedVmIntegrityPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setShieldedVmIntegrityPolicy(): GaxiosPromise[Schema$Operation] = js.native
  def setShieldedVmIntegrityPolicy(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setShieldedVmIntegrityPolicy(params: ParamsDollarResourceDollarInstancesDollarSetshieldedvmintegritypolicy): GaxiosPromise[Schema$Operation] = js.native
  def setShieldedVmIntegrityPolicy(
    params: ParamsDollarResourceDollarInstancesDollarSetshieldedvmintegritypolicy,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setShieldedVmIntegrityPolicy(
    params: ParamsDollarResourceDollarInstancesDollarSetshieldedvmintegritypolicy,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setShieldedVmIntegrityPolicy(
    params: ParamsDollarResourceDollarInstancesDollarSetshieldedvmintegritypolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setShieldedVmIntegrityPolicy(
    params: ParamsDollarResourceDollarInstancesDollarSetshieldedvmintegritypolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.setTags
    * @desc Sets network tags for the specified instance to the data included
    * in the request.
    * @alias compute.instances.setTags
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().Tags} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setTags(): GaxiosPromise[Schema$Operation] = js.native
  def setTags(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setTags(params: ParamsDollarResourceDollarInstancesDollarSettags): GaxiosPromise[Schema$Operation] = js.native
  def setTags(
    params: ParamsDollarResourceDollarInstancesDollarSettags,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setTags(
    params: ParamsDollarResourceDollarInstancesDollarSettags,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setTags(params: ParamsDollarResourceDollarInstancesDollarSettags, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setTags(
    params: ParamsDollarResourceDollarInstancesDollarSettags,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.simulateMaintenanceEvent
    * @desc Simulates a maintenance event on the instance.
    * @alias compute.instances.simulateMaintenanceEvent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def simulateMaintenanceEvent(): GaxiosPromise[Schema$Operation] = js.native
  def simulateMaintenanceEvent(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def simulateMaintenanceEvent(params: ParamsDollarResourceDollarInstancesDollarSimulatemaintenanceevent): GaxiosPromise[Schema$Operation] = js.native
  def simulateMaintenanceEvent(
    params: ParamsDollarResourceDollarInstancesDollarSimulatemaintenanceevent,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def simulateMaintenanceEvent(
    params: ParamsDollarResourceDollarInstancesDollarSimulatemaintenanceevent,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def simulateMaintenanceEvent(params: ParamsDollarResourceDollarInstancesDollarSimulatemaintenanceevent, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def simulateMaintenanceEvent(
    params: ParamsDollarResourceDollarInstancesDollarSimulatemaintenanceevent,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.start
    * @desc Starts an instance that was stopped using the instances().stop
    * method. For more information, see Restart an instance.
    * @alias compute.instances.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to start.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[Schema$Operation] = js.native
  def start(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def start(params: ParamsDollarResourceDollarInstancesDollarStart): GaxiosPromise[Schema$Operation] = js.native
  def start(
    params: ParamsDollarResourceDollarInstancesDollarStart,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def start(
    params: ParamsDollarResourceDollarInstancesDollarStart,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def start(params: ParamsDollarResourceDollarInstancesDollarStart, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def start(
    params: ParamsDollarResourceDollarInstancesDollarStart,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.startWithEncryptionKey
    * @desc Starts an instance that was stopped using the instances().stop
    * method. For more information, see Restart an instance.
    * @alias compute.instances.startWithEncryptionKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to start.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesStartWithEncryptionKeyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startWithEncryptionKey(): GaxiosPromise[Schema$Operation] = js.native
  def startWithEncryptionKey(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def startWithEncryptionKey(params: ParamsDollarResourceDollarInstancesDollarStartwithencryptionkey): GaxiosPromise[Schema$Operation] = js.native
  def startWithEncryptionKey(
    params: ParamsDollarResourceDollarInstancesDollarStartwithencryptionkey,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def startWithEncryptionKey(
    params: ParamsDollarResourceDollarInstancesDollarStartwithencryptionkey,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def startWithEncryptionKey(params: ParamsDollarResourceDollarInstancesDollarStartwithencryptionkey, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def startWithEncryptionKey(
    params: ParamsDollarResourceDollarInstancesDollarStartwithencryptionkey,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.stop
    * @desc Stops a running instance, shutting it down cleanly, and allows you
    * to restart the instance at a later time. Stopped instances do not incur
    * VM usage charges while they are stopped. However, resources that the VM
    * is using, such as persistent disks and static IP addresses, will continue
    * to be charged until they are deleted. For more information, see Stopping
    * an instance.
    * @alias compute.instances.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.discardLocalSsd If true, discard the contents of any attached localSSD partitions. Default value is false (== preserve localSSD data).
    * @param {string} params.instance Name of the instance resource to stop.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[Schema$Operation] = js.native
  def stop(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def stop(params: ParamsDollarResourceDollarInstancesDollarStop): GaxiosPromise[Schema$Operation] = js.native
  def stop(
    params: ParamsDollarResourceDollarInstancesDollarStop,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def stop(
    params: ParamsDollarResourceDollarInstancesDollarStop,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def stop(params: ParamsDollarResourceDollarInstancesDollarStop, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def stop(
    params: ParamsDollarResourceDollarInstancesDollarStop,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.suspend
    * @desc This method suspends a running instance, saving its state to
    * persistent storage, and allows you to resume the instance at a later
    * time. Suspended instances incur reduced per-minute, virtual machine usage
    * charges while they are suspended. Any resources the virtual machine is
    * using, such as persistent disks and static IP addresses, will continue to
    * be charged until they are deleted.
    * @alias compute.instances.suspend
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.discardLocalSsd If true, discard the contents of any attached localSSD partitions. Default value is false (== preserve localSSD data).
    * @param {string} params.instance Name of the instance resource to suspend.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def suspend(): GaxiosPromise[Schema$Operation] = js.native
  def suspend(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def suspend(params: ParamsDollarResourceDollarInstancesDollarSuspend): GaxiosPromise[Schema$Operation] = js.native
  def suspend(
    params: ParamsDollarResourceDollarInstancesDollarSuspend,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def suspend(
    params: ParamsDollarResourceDollarInstancesDollarSuspend,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def suspend(params: ParamsDollarResourceDollarInstancesDollarSuspend, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def suspend(
    params: ParamsDollarResourceDollarInstancesDollarSuspend,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.instances.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarInstancesDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarInstancesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarInstancesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarInstancesDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarInstancesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  /**
    * compute.instances.updateAccessConfig
    * @desc Updates the specified access config from an instance's network
    * interface with the data included in the request. This method supports
    * PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    * @alias compute.instances.updateAccessConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.networkInterface The name of the network interface where the access config is attached.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().AccessConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateAccessConfig(): GaxiosPromise[Schema$Operation] = js.native
  def updateAccessConfig(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def updateAccessConfig(params: ParamsDollarResourceDollarInstancesDollarUpdateaccessconfig): GaxiosPromise[Schema$Operation] = js.native
  def updateAccessConfig(
    params: ParamsDollarResourceDollarInstancesDollarUpdateaccessconfig,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateAccessConfig(
    params: ParamsDollarResourceDollarInstancesDollarUpdateaccessconfig,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateAccessConfig(params: ParamsDollarResourceDollarInstancesDollarUpdateaccessconfig, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def updateAccessConfig(
    params: ParamsDollarResourceDollarInstancesDollarUpdateaccessconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.updateDisplayDevice
    * @desc Updates the Display config for a VM instance. You can only use this
    * method on a stopped VM instance. This method supports PATCH semantics and
    * uses the JSON merge patch format and processing rules.
    * @alias compute.instances.updateDisplayDevice
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().DisplayDevice} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateDisplayDevice(): GaxiosPromise[Schema$Operation] = js.native
  def updateDisplayDevice(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def updateDisplayDevice(params: ParamsDollarResourceDollarInstancesDollarUpdatedisplaydevice): GaxiosPromise[Schema$Operation] = js.native
  def updateDisplayDevice(
    params: ParamsDollarResourceDollarInstancesDollarUpdatedisplaydevice,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateDisplayDevice(
    params: ParamsDollarResourceDollarInstancesDollarUpdatedisplaydevice,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateDisplayDevice(params: ParamsDollarResourceDollarInstancesDollarUpdatedisplaydevice, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def updateDisplayDevice(
    params: ParamsDollarResourceDollarInstancesDollarUpdatedisplaydevice,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.updateNetworkInterface
    * @desc Updates an instance's network interface. This method follows PATCH
    * semantics.
    * @alias compute.instances.updateNetworkInterface
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.networkInterface The name of the network interface to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().NetworkInterface} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateNetworkInterface(): GaxiosPromise[Schema$Operation] = js.native
  def updateNetworkInterface(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def updateNetworkInterface(params: ParamsDollarResourceDollarInstancesDollarUpdatenetworkinterface): GaxiosPromise[Schema$Operation] = js.native
  def updateNetworkInterface(
    params: ParamsDollarResourceDollarInstancesDollarUpdatenetworkinterface,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateNetworkInterface(
    params: ParamsDollarResourceDollarInstancesDollarUpdatenetworkinterface,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateNetworkInterface(params: ParamsDollarResourceDollarInstancesDollarUpdatenetworkinterface, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def updateNetworkInterface(
    params: ParamsDollarResourceDollarInstancesDollarUpdatenetworkinterface,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.updateShieldedInstanceConfig
    * @desc Updates the Shielded Instance config for an instance. You can only
    * use this method on a stopped instance. This method supports PATCH
    * semantics and uses the JSON merge patch format and processing rules.
    * @alias compute.instances.updateShieldedInstanceConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name or id of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().ShieldedInstanceConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateShieldedInstanceConfig(): GaxiosPromise[Schema$Operation] = js.native
  def updateShieldedInstanceConfig(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def updateShieldedInstanceConfig(params: ParamsDollarResourceDollarInstancesDollarUpdateshieldedinstanceconfig): GaxiosPromise[Schema$Operation] = js.native
  def updateShieldedInstanceConfig(
    params: ParamsDollarResourceDollarInstancesDollarUpdateshieldedinstanceconfig,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateShieldedInstanceConfig(
    params: ParamsDollarResourceDollarInstancesDollarUpdateshieldedinstanceconfig,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateShieldedInstanceConfig(
    params: ParamsDollarResourceDollarInstancesDollarUpdateshieldedinstanceconfig,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def updateShieldedInstanceConfig(
    params: ParamsDollarResourceDollarInstancesDollarUpdateshieldedinstanceconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instances.updateShieldedVmConfig
    * @desc Updates the Shielded VM config for a VM instance. You can only use
    * this method on a stopped VM instance. This method supports PATCH
    * semantics and uses the JSON merge patch format and processing rules.
    * @alias compute.instances.updateShieldedVmConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().ShieldedVmConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateShieldedVmConfig(): GaxiosPromise[Schema$Operation] = js.native
  def updateShieldedVmConfig(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def updateShieldedVmConfig(params: ParamsDollarResourceDollarInstancesDollarUpdateshieldedvmconfig): GaxiosPromise[Schema$Operation] = js.native
  def updateShieldedVmConfig(
    params: ParamsDollarResourceDollarInstancesDollarUpdateshieldedvmconfig,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateShieldedVmConfig(
    params: ParamsDollarResourceDollarInstancesDollarUpdateshieldedvmconfig,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateShieldedVmConfig(params: ParamsDollarResourceDollarInstancesDollarUpdateshieldedvmconfig, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def updateShieldedVmConfig(
    params: ParamsDollarResourceDollarInstancesDollarUpdateshieldedvmconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

