package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IEmpty
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IAcknowledgeRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ICreateSnapshotRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDeleteSnapshotRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDeleteSubscriptionRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IGetSnapshotRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IGetSubscriptionRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListSnapshotsRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListSnapshotsResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListSubscriptionsRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListSubscriptionsResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IModifyAckDeadlineRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IModifyPushConfigRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPullRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPullResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISeekRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISeekResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISnapshot
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISubscription
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IUpdateSnapshotRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IUpdateSubscriptionRequest
import typings.googleGax.apitypesMod.CancellableStream
import typings.googleGax.clientInterfaceMod.Callback
import typings.googleGax.clientInterfaceMod.ClientOptions
import typings.googleGax.clientInterfaceMod.Descriptors
import typings.googleGax.clientInterfaceMod.PaginationCallback
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.mod.GoogleAuth
import typings.googleGax.mod.IamProtos.google.iam.v1.GetIamPolicyRequest
import typings.googleGax.mod.IamProtos.google.iam.v1.Policy
import typings.googleGax.mod.IamProtos.google.iam.v1.SetIamPolicyRequest
import typings.googleGax.mod.IamProtos.google.iam.v1.TestIamPermissionsRequest
import typings.googleGax.mod.IamProtos.google.iam.v1.TestIamPermissionsResponse
import typings.googleGax.mod.PathTemplate
import typings.googleGax.srcIamServiceMod.IamClient
import typings.node.streamMod.Transform
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriberClientMod {
  
  @JSImport("@google-cloud/pubsub/build/src/v1/subscriber_client", "SubscriberClient")
  @js.native
  /**
    * Construct an instance of SubscriberClient.
    *
    * @param {object} [options] - The configuration object. See the subsequent
    *   parameters for more details.
    * @param {object} [options.credentials] - Credentials object.
    * @param {string} [options.credentials.client_email]
    * @param {string} [options.credentials.private_key]
    * @param {string} [options.email] - Account email address. Required when
    *     using a .pem or .p12 keyFilename.
    * @param {string} [options.keyFilename] - Full path to the a .json, .pem, or
    *     .p12 key downloaded from the Google Developers Console. If you provide
    *     a path to a JSON file, the projectId option below is not necessary.
    *     NOTE: .pem and .p12 require you to specify options.email as well.
    * @param {number} [options.port] - The port on which to connect to
    *     the remote host.
    * @param {string} [options.projectId] - The project ID from the Google
    *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
    *     the environment variable GCLOUD_PROJECT for your project ID. If your
    *     app is running in an environment which supports
    *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
    *     your project ID will be detected automatically.
    * @param {string} [options.apiEndpoint] - The domain name of the
    *     API remote host.
    */
  class SubscriberClient () extends StObject {
    def this(opts: ClientOptions) = this()
    
    var _defaults: js.Any = js.native
    
    var _gaxGrpc: js.Any = js.native
    
    var _gaxModule: js.Any = js.native
    
    var _opts: js.Any = js.native
    
    var _protos: js.Any = js.native
    
    var _terminated: js.Any = js.native
    
    def acknowledge(request: IAcknowledgeRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IAcknowledgeRequest], js.UndefOr[js.Object]]] = js.native
    def acknowledge(
      request: IAcknowledgeRequest,
      callback: Callback[IEmpty, js.UndefOr[IAcknowledgeRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def acknowledge(request: IAcknowledgeRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IAcknowledgeRequest], js.UndefOr[js.Object]]] = js.native
    def acknowledge(
      request: IAcknowledgeRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IAcknowledgeRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    var auth: GoogleAuth = js.native
    
    /**
      * Terminate the GRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      */
    def close(): js.Promise[Unit] = js.native
    
    def createSnapshot(request: ICreateSnapshotRequest): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[ICreateSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def createSnapshot(
      request: ICreateSnapshotRequest,
      callback: Callback[ISnapshot, js.UndefOr[ICreateSnapshotRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def createSnapshot(request: ICreateSnapshotRequest, options: CallOptions): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[ICreateSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def createSnapshot(
      request: ICreateSnapshotRequest,
      options: CallOptions,
      callback: Callback[ISnapshot, js.UndefOr[ICreateSnapshotRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    def createSubscription(request: ISubscription): js.Promise[js.Tuple3[ISubscription, js.UndefOr[ISubscription], js.UndefOr[js.Object]]] = js.native
    def createSubscription(
      request: ISubscription,
      callback: Callback[ISubscription, js.UndefOr[ISubscription | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def createSubscription(request: ISubscription, options: CallOptions): js.Promise[js.Tuple3[ISubscription, js.UndefOr[ISubscription], js.UndefOr[js.Object]]] = js.native
    def createSubscription(
      request: ISubscription,
      options: CallOptions,
      callback: Callback[ISubscription, js.UndefOr[ISubscription | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    def deleteSnapshot(request: IDeleteSnapshotRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSnapshot(
      request: IDeleteSnapshotRequest,
      callback: Callback[IEmpty, js.UndefOr[IDeleteSnapshotRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def deleteSnapshot(request: IDeleteSnapshotRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSnapshot(
      request: IDeleteSnapshotRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IDeleteSnapshotRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    def deleteSubscription(request: IDeleteSubscriptionRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSubscriptionRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSubscription(
      request: IDeleteSubscriptionRequest,
      callback: Callback[IEmpty, js.UndefOr[IDeleteSubscriptionRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def deleteSubscription(request: IDeleteSubscriptionRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSubscriptionRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSubscription(
      request: IDeleteSubscriptionRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IDeleteSubscriptionRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    var descriptors: Descriptors = js.native
    
    /**
      * Gets the access control policy for a resource. Returns an empty policy
      * if the resource exists and does not have a policy set.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.resource
      *   REQUIRED: The resource for which the policy is being requested.
      *   See the operation documentation for the appropriate value for this field.
      * @param {Object} [request.options]
      *   OPTIONAL: A `GetPolicyOptions` object for specifying options to
      *   `GetIamPolicy`. This field is only used by Cloud IAM.
      *
      *   This object should have the same structure as [GetPolicyOptions]{@link google.iam.v1.GetPolicyOptions}
      * @param {Object} [options]
      *   Optional parameters. You can override the default settings for this call, e.g, timeout,
      *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html} for the details.
      * @param {function(?Error, ?Object)} [callback]
      *   The function which will be called with the result of the API call.
      *
      *   The second parameter to the callback is an object representing [Policy]{@link google.iam.v1.Policy}.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
      *   The promise has a method named "cancel" which cancels the ongoing API call.
      */
    def getIamPolicy(request: GetIamPolicyRequest): js.Promise[Policy] = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]],
      callback: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def getIamPolicy(request: GetIamPolicyRequest, options: CallOptions): js.Promise[Policy] = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: Callback[String, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]]): Unit = js.native
    
    def getSnapshot(request: IGetSnapshotRequest): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[IGetSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def getSnapshot(
      request: IGetSnapshotRequest,
      callback: Callback[ISnapshot, js.UndefOr[IGetSnapshotRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getSnapshot(request: IGetSnapshotRequest, options: CallOptions): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[IGetSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def getSnapshot(
      request: IGetSnapshotRequest,
      options: CallOptions,
      callback: Callback[ISnapshot, js.UndefOr[IGetSnapshotRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    def getSubscription(request: IGetSubscriptionRequest): js.Promise[
        js.Tuple3[ISubscription, js.UndefOr[IGetSubscriptionRequest], js.UndefOr[js.Object]]
      ] = js.native
    def getSubscription(
      request: IGetSubscriptionRequest,
      callback: Callback[
          ISubscription, 
          js.UndefOr[IGetSubscriptionRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def getSubscription(request: IGetSubscriptionRequest, options: CallOptions): js.Promise[
        js.Tuple3[ISubscription, js.UndefOr[IGetSubscriptionRequest], js.UndefOr[js.Object]]
      ] = js.native
    def getSubscription(
      request: IGetSubscriptionRequest,
      options: CallOptions,
      callback: Callback[
          ISubscription, 
          js.UndefOr[IGetSubscriptionRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    var iamClient: IamClient = js.native
    
    /**
      * Initialize the client.
      * Performs asynchronous operations (such as authentication) and prepares the client.
      * This function will be called automatically when any class method is called for the
      * first time, but if you need to initialize it before calling an actual method,
      * feel free to call initialize() directly.
      *
      * You can await on this method if you want to make sure the client is initialized.
      *
      * @returns {Promise} A promise that resolves to an authenticated service stub.
      */
    def initialize(): js.Promise[StringDictionary[js.Function]] = js.native
    
    var innerApiCalls: StringDictionary[js.Function] = js.native
    
    def listSnapshots(request: IListSnapshotsRequest): js.Promise[
        js.Tuple3[js.Array[ISnapshot], IListSnapshotsRequest | Null, IListSnapshotsResponse]
      ] = js.native
    def listSnapshots(
      request: IListSnapshotsRequest,
      callback: PaginationCallback[IListSnapshotsRequest, js.UndefOr[IListSnapshotsResponse | Null], ISnapshot]
    ): Unit = js.native
    def listSnapshots(request: IListSnapshotsRequest, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[ISnapshot], IListSnapshotsRequest | Null, IListSnapshotsResponse]
      ] = js.native
    def listSnapshots(
      request: IListSnapshotsRequest,
      options: CallOptions,
      callback: PaginationCallback[IListSnapshotsRequest, js.UndefOr[IListSnapshotsResponse | Null], ISnapshot]
    ): Unit = js.native
    
    /**
      * Equivalent to {@link listSnapshots}, but returns an iterable object.
      *
      * for-await-of syntax is used with the iterable to recursively get response element on-demand.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.project
      *   Required. The name of the project in which to list snapshots.
      *   Format is `projects/{project-id}`.
      * @param {number} request.pageSize
      *   Maximum number of snapshots to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListSnapshotsResponse`; indicates that this
      *   is a continuation of a prior `ListSnapshots` call, and that the system
      *   should return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that conforms to @link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols.
      */
    def listSnapshotsAsync(): AsyncIterable[ISnapshot] = js.native
    def listSnapshotsAsync(request: js.UndefOr[scala.Nothing], options: CallOptions): AsyncIterable[ISnapshot] = js.native
    def listSnapshotsAsync(request: IListSnapshotsRequest): AsyncIterable[ISnapshot] = js.native
    def listSnapshotsAsync(request: IListSnapshotsRequest, options: CallOptions): AsyncIterable[ISnapshot] = js.native
    
    /**
      * Equivalent to {@link listSnapshots}, but returns a NodeJS Stream object.
      *
      * This fetches the paged responses for {@link listSnapshots} continuously
      * and invokes the callback registered for 'data' event for each element in the
      * responses.
      *
      * The returned object has 'end' method when no more elements are required.
      *
      * autoPaginate option will be ignored.
      *
      * @see {@link https://nodejs.org/api/stream.html}
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.project
      *   Required. The name of the project in which to list snapshots.
      *   Format is `projects/{project-id}`.
      * @param {number} request.pageSize
      *   Maximum number of snapshots to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListSnapshotsResponse`; indicates that this
      *   is a continuation of a prior `ListSnapshots` call, and that the system
      *   should return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Snapshot]{@link google.pubsub.v1.Snapshot} on 'data' event.
      */
    def listSnapshotsStream(): Transform = js.native
    def listSnapshotsStream(request: js.UndefOr[scala.Nothing], options: CallOptions): Transform = js.native
    def listSnapshotsStream(request: IListSnapshotsRequest): Transform = js.native
    def listSnapshotsStream(request: IListSnapshotsRequest, options: CallOptions): Transform = js.native
    
    def listSubscriptions(request: IListSubscriptionsRequest): js.Promise[
        js.Tuple3[
          js.Array[ISubscription], 
          IListSubscriptionsRequest | Null, 
          IListSubscriptionsResponse
        ]
      ] = js.native
    def listSubscriptions(
      request: IListSubscriptionsRequest,
      callback: PaginationCallback[
          IListSubscriptionsRequest, 
          js.UndefOr[IListSubscriptionsResponse | Null], 
          ISubscription
        ]
    ): Unit = js.native
    def listSubscriptions(request: IListSubscriptionsRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[ISubscription], 
          IListSubscriptionsRequest | Null, 
          IListSubscriptionsResponse
        ]
      ] = js.native
    def listSubscriptions(
      request: IListSubscriptionsRequest,
      options: CallOptions,
      callback: PaginationCallback[
          IListSubscriptionsRequest, 
          js.UndefOr[IListSubscriptionsResponse | Null], 
          ISubscription
        ]
    ): Unit = js.native
    
    /**
      * Equivalent to {@link listSubscriptions}, but returns an iterable object.
      *
      * for-await-of syntax is used with the iterable to recursively get response element on-demand.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.project
      *   Required. The name of the project in which to list subscriptions.
      *   Format is `projects/{project-id}`.
      * @param {number} request.pageSize
      *   Maximum number of subscriptions to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListSubscriptionsResponse`; indicates that
      *   this is a continuation of a prior `ListSubscriptions` call, and that the
      *   system should return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that conforms to @link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols.
      */
    def listSubscriptionsAsync(): AsyncIterable[ISubscription] = js.native
    def listSubscriptionsAsync(request: js.UndefOr[scala.Nothing], options: CallOptions): AsyncIterable[ISubscription] = js.native
    def listSubscriptionsAsync(request: IListSubscriptionsRequest): AsyncIterable[ISubscription] = js.native
    def listSubscriptionsAsync(request: IListSubscriptionsRequest, options: CallOptions): AsyncIterable[ISubscription] = js.native
    
    /**
      * Equivalent to {@link listSubscriptions}, but returns a NodeJS Stream object.
      *
      * This fetches the paged responses for {@link listSubscriptions} continuously
      * and invokes the callback registered for 'data' event for each element in the
      * responses.
      *
      * The returned object has 'end' method when no more elements are required.
      *
      * autoPaginate option will be ignored.
      *
      * @see {@link https://nodejs.org/api/stream.html}
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.project
      *   Required. The name of the project in which to list subscriptions.
      *   Format is `projects/{project-id}`.
      * @param {number} request.pageSize
      *   Maximum number of subscriptions to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListSubscriptionsResponse`; indicates that
      *   this is a continuation of a prior `ListSubscriptions` call, and that the
      *   system should return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Subscription]{@link google.pubsub.v1.Subscription} on 'data' event.
      */
    def listSubscriptionsStream(): Transform = js.native
    def listSubscriptionsStream(request: js.UndefOr[scala.Nothing], options: CallOptions): Transform = js.native
    def listSubscriptionsStream(request: IListSubscriptionsRequest): Transform = js.native
    def listSubscriptionsStream(request: IListSubscriptionsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Parse the project from Project resource.
      *
      * @param {string} projectName
      *   A fully-qualified path representing Project resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromProjectName(projectName: String): String | Double = js.native
    
    /**
      * Parse the project from ProjectTopic resource.
      *
      * @param {string} projectTopicName
      *   A fully-qualified path representing project_topic resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromProjectTopicName(projectTopicName: String): String | Double = js.native
    
    /**
      * Parse the project from Snapshot resource.
      *
      * @param {string} snapshotName
      *   A fully-qualified path representing Snapshot resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromSnapshotName(snapshotName: String): String | Double = js.native
    
    /**
      * Parse the project from Subscription resource.
      *
      * @param {string} subscriptionName
      *   A fully-qualified path representing Subscription resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromSubscriptionName(subscriptionName: String): String | Double = js.native
    
    /**
      * Parse the snapshot from Snapshot resource.
      *
      * @param {string} snapshotName
      *   A fully-qualified path representing Snapshot resource.
      * @returns {string} A string representing the snapshot.
      */
    def matchSnapshotFromSnapshotName(snapshotName: String): String | Double = js.native
    
    /**
      * Parse the subscription from Subscription resource.
      *
      * @param {string} subscriptionName
      *   A fully-qualified path representing Subscription resource.
      * @returns {string} A string representing the subscription.
      */
    def matchSubscriptionFromSubscriptionName(subscriptionName: String): String | Double = js.native
    
    /**
      * Parse the topic from ProjectTopic resource.
      *
      * @param {string} projectTopicName
      *   A fully-qualified path representing project_topic resource.
      * @returns {string} A string representing the topic.
      */
    def matchTopicFromProjectTopicName(projectTopicName: String): String | Double = js.native
    
    def modifyAckDeadline(request: IModifyAckDeadlineRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IModifyAckDeadlineRequest], js.UndefOr[js.Object]]] = js.native
    def modifyAckDeadline(
      request: IModifyAckDeadlineRequest,
      callback: Callback[IEmpty, js.UndefOr[IModifyAckDeadlineRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def modifyAckDeadline(request: IModifyAckDeadlineRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IModifyAckDeadlineRequest], js.UndefOr[js.Object]]] = js.native
    def modifyAckDeadline(
      request: IModifyAckDeadlineRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IModifyAckDeadlineRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    def modifyPushConfig(request: IModifyPushConfigRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IModifyPushConfigRequest], js.UndefOr[js.Object]]] = js.native
    def modifyPushConfig(
      request: IModifyPushConfigRequest,
      callback: Callback[IEmpty, js.UndefOr[IModifyPushConfigRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def modifyPushConfig(request: IModifyPushConfigRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IModifyPushConfigRequest], js.UndefOr[js.Object]]] = js.native
    def modifyPushConfig(
      request: IModifyPushConfigRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IModifyPushConfigRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    var pathTemplates: StringDictionary[PathTemplate] = js.native
    
    /**
      * Return a fully-qualified project resource name string.
      *
      * @param {string} project
      * @returns {string} Resource name string.
      */
    def projectPath(project: String): String = js.native
    
    /**
      * Return a fully-qualified projectTopic resource name string.
      *
      * @param {string} project
      * @param {string} topic
      * @returns {string} Resource name string.
      */
    def projectTopicPath(project: String, topic: String): String = js.native
    
    def pull(request: IPullRequest): js.Promise[js.Tuple3[IPullResponse, js.UndefOr[IPullRequest], js.UndefOr[js.Object]]] = js.native
    def pull(
      request: IPullRequest,
      callback: Callback[IPullResponse, js.UndefOr[IPullRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def pull(request: IPullRequest, options: CallOptions): js.Promise[js.Tuple3[IPullResponse, js.UndefOr[IPullRequest], js.UndefOr[js.Object]]] = js.native
    def pull(
      request: IPullRequest,
      options: CallOptions,
      callback: Callback[IPullResponse, js.UndefOr[IPullRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    def seek(request: ISeekRequest): js.Promise[js.Tuple3[ISeekResponse, js.UndefOr[ISeekRequest], js.UndefOr[js.Object]]] = js.native
    def seek(
      request: ISeekRequest,
      callback: Callback[ISeekResponse, js.UndefOr[ISeekRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def seek(request: ISeekRequest, options: CallOptions): js.Promise[js.Tuple3[ISeekResponse, js.UndefOr[ISeekRequest], js.UndefOr[js.Object]]] = js.native
    def seek(
      request: ISeekRequest,
      options: CallOptions,
      callback: Callback[ISeekResponse, js.UndefOr[ISeekRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Returns permissions that a caller has on the specified resource. If the
      * resource does not exist, this will return an empty set of
      * permissions, not a NOT_FOUND error.
      *
      * Note: This operation is designed to be used for building
      * permission-aware UIs and command-line tools, not for authorization
      * checking. This operation may "fail open" without warning.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.resource
      *   REQUIRED: The resource for which the policy detail is being requested.
      *   See the operation documentation for the appropriate value for this field.
      * @param {string[]} request.permissions
      *   The set of permissions to check for the `resource`. Permissions with
      *   wildcards (such as '*' or 'storage.*') are not allowed. For more
      *   information see
      *   [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
      * @param {Object} [options]
      *   Optional parameters. You can override the default settings for this call, e.g, timeout,
      *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html} for the details.
      * @param {function(?Error, ?Object)} [callback]
      *   The function which will be called with the result of the API call.
      *
      *   The second parameter to the callback is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
      *   The promise has a method named "cancel" which cancels the ongoing API call.
      */
    def setIamPolicy(request: SetIamPolicyRequest): js.Promise[Policy] = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]],
      callback: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def setIamPolicy(request: SetIamPolicyRequest, options: CallOptions): js.Promise[Policy] = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    
    /**
      * Return a fully-qualified snapshot resource name string.
      *
      * @param {string} project
      * @param {string} snapshot
      * @returns {string} Resource name string.
      */
    def snapshotPath(project: String, snapshot: String): String = js.native
    
    /**
      * Establishes a stream with the server, which sends messages down to the
      * client. The client streams acknowledgements and ack deadline modifications
      * back to the server. The server will close the stream and return the status
      * on any error. The server may close the stream with status `UNAVAILABLE` to
      * reassign server-side resources, in which case, the client should
      * re-establish the stream. Flow control can be achieved by configuring the
      * underlying RPC channel.
      *
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which is both readable and writable. It accepts objects
      *   representing [StreamingPullRequest]{@link google.pubsub.v1.StreamingPullRequest} for write() method, and
      *   will emit objects representing [StreamingPullResponse]{@link google.pubsub.v1.StreamingPullResponse} on 'data' event asynchronously.
      */
    def streamingPull(): CancellableStream = js.native
    def streamingPull(options: CallOptions): CancellableStream = js.native
    
    var subscriberStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
    /**
      * Return a fully-qualified subscription resource name string.
      *
      * @param {string} project
      * @param {string} subscription
      * @returns {string} Resource name string.
      */
    def subscriptionPath(project: String, subscription: String): String = js.native
    
    /**
      * Returns permissions that a caller has on the specified resource. If the
      * resource does not exist, this will return an empty set of
      * permissions, not a NOT_FOUND error.
      *
      * Note: This operation is designed to be used for building
      * permission-aware UIs and command-line tools, not for authorization
      * checking. This operation may "fail open" without warning.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.resource
      *   REQUIRED: The resource for which the policy detail is being requested.
      *   See the operation documentation for the appropriate value for this field.
      * @param {string[]} request.permissions
      *   The set of permissions to check for the `resource`. Permissions with
      *   wildcards (such as '*' or 'storage.*') are not allowed. For more
      *   information see
      *   [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
      * @param {Object} [options]
      *   Optional parameters. You can override the default settings for this call, e.g, timeout,
      *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html} for the details.
      * @param {function(?Error, ?Object)} [callback]
      *   The function which will be called with the result of the API call.
      *
      *   The second parameter to the callback is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
      *   The promise has a method named "cancel" which cancels the ongoing API call.
      *
      */
    def testIamPermissions(request: TestIamPermissionsRequest): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      options: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      options: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ],
      callback: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(request: TestIamPermissionsRequest, options: CallOptions): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      options: CallOptions,
      callback: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
    
    def updateSnapshot(request: IUpdateSnapshotRequest): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[IUpdateSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def updateSnapshot(
      request: IUpdateSnapshotRequest,
      callback: Callback[ISnapshot, js.UndefOr[IUpdateSnapshotRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def updateSnapshot(request: IUpdateSnapshotRequest, options: CallOptions): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[IUpdateSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def updateSnapshot(
      request: IUpdateSnapshotRequest,
      options: CallOptions,
      callback: Callback[ISnapshot, js.UndefOr[IUpdateSnapshotRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    def updateSubscription(request: IUpdateSubscriptionRequest): js.Promise[
        js.Tuple3[ISubscription, js.UndefOr[IUpdateSubscriptionRequest], js.UndefOr[js.Object]]
      ] = js.native
    def updateSubscription(
      request: IUpdateSubscriptionRequest,
      callback: Callback[
          ISubscription, 
          js.UndefOr[IUpdateSubscriptionRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def updateSubscription(request: IUpdateSubscriptionRequest, options: CallOptions): js.Promise[
        js.Tuple3[ISubscription, js.UndefOr[IUpdateSubscriptionRequest], js.UndefOr[js.Object]]
      ] = js.native
    def updateSubscription(
      request: IUpdateSubscriptionRequest,
      options: CallOptions,
      callback: Callback[
          ISubscription, 
          js.UndefOr[IUpdateSubscriptionRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
  }
}
