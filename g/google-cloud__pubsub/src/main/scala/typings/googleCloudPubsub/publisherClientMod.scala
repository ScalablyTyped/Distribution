package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IEmpty
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDeleteTopicRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDetachSubscriptionRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDetachSubscriptionResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IGetTopicRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSnapshotsRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSnapshotsResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSubscriptionsRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSubscriptionsResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicsRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicsResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPublishRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPublishResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ITopic
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IUpdateTopicRequest
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publisherClientMod {
  
  @JSImport("@google-cloud/pubsub/build/src/v1/publisher_client", "PublisherClient")
  @js.native
  /**
    * Construct an instance of PublisherClient.
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
  class PublisherClient () extends StObject {
    def this(opts: ClientOptions) = this()
    
    var _defaults: js.Any = js.native
    
    var _gaxGrpc: js.Any = js.native
    
    var _gaxModule: js.Any = js.native
    
    var _opts: js.Any = js.native
    
    var _protos: js.Any = js.native
    
    var _terminated: js.Any = js.native
    
    var auth: GoogleAuth = js.native
    
    /**
      * Terminate the GRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      */
    def close(): js.Promise[Unit] = js.native
    
    def createTopic(request: ITopic): js.Promise[js.Tuple3[ITopic, js.UndefOr[ITopic], js.UndefOr[js.Object]]] = js.native
    def createTopic(
      request: ITopic,
      callback: Callback[ITopic, js.UndefOr[ITopic | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def createTopic(request: ITopic, options: CallOptions): js.Promise[js.Tuple3[ITopic, js.UndefOr[ITopic], js.UndefOr[js.Object]]] = js.native
    def createTopic(
      request: ITopic,
      options: CallOptions,
      callback: Callback[ITopic, js.UndefOr[ITopic | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    def deleteTopic(request: IDeleteTopicRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteTopicRequest], js.UndefOr[js.Object]]] = js.native
    def deleteTopic(
      request: IDeleteTopicRequest,
      callback: Callback[IEmpty, js.UndefOr[IDeleteTopicRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def deleteTopic(request: IDeleteTopicRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteTopicRequest], js.UndefOr[js.Object]]] = js.native
    def deleteTopic(
      request: IDeleteTopicRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IDeleteTopicRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    var descriptors: Descriptors = js.native
    
    def detachSubscription(request: IDetachSubscriptionRequest): js.Promise[
        js.Tuple3[
          IDetachSubscriptionResponse, 
          js.UndefOr[IDetachSubscriptionRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def detachSubscription(
      request: IDetachSubscriptionRequest,
      callback: Callback[
          IDetachSubscriptionResponse, 
          js.UndefOr[IDetachSubscriptionRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def detachSubscription(request: IDetachSubscriptionRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          IDetachSubscriptionResponse, 
          js.UndefOr[IDetachSubscriptionRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def detachSubscription(
      request: IDetachSubscriptionRequest,
      options: CallOptions,
      callback: Callback[
          IDetachSubscriptionResponse, 
          js.UndefOr[IDetachSubscriptionRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
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
      options: Unit,
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
    def getProjectId(callback: Callback[String, Unit, Unit]): Unit = js.native
    
    def getTopic(request: IGetTopicRequest): js.Promise[js.Tuple3[ITopic, js.UndefOr[IGetTopicRequest], js.UndefOr[js.Object]]] = js.native
    def getTopic(
      request: IGetTopicRequest,
      callback: Callback[ITopic, js.UndefOr[IGetTopicRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getTopic(request: IGetTopicRequest, options: CallOptions): js.Promise[js.Tuple3[ITopic, js.UndefOr[IGetTopicRequest], js.UndefOr[js.Object]]] = js.native
    def getTopic(
      request: IGetTopicRequest,
      options: CallOptions,
      callback: Callback[ITopic, js.UndefOr[IGetTopicRequest | Null], js.UndefOr[js.Object | Null]]
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
    
    def listTopicSnapshots(request: IListTopicSnapshotsRequest): js.Promise[
        js.Tuple3[js.Array[String], IListTopicSnapshotsRequest | Null, IListTopicSnapshotsResponse]
      ] = js.native
    def listTopicSnapshots(
      request: IListTopicSnapshotsRequest,
      callback: PaginationCallback[IListTopicSnapshotsRequest, js.UndefOr[IListTopicSnapshotsResponse | Null], String]
    ): Unit = js.native
    def listTopicSnapshots(request: IListTopicSnapshotsRequest, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[String], IListTopicSnapshotsRequest | Null, IListTopicSnapshotsResponse]
      ] = js.native
    def listTopicSnapshots(
      request: IListTopicSnapshotsRequest,
      options: CallOptions,
      callback: PaginationCallback[IListTopicSnapshotsRequest, js.UndefOr[IListTopicSnapshotsResponse | Null], String]
    ): Unit = js.native
    
    /**
      * Equivalent to {@link listTopicSnapshots}, but returns an iterable object.
      *
      * for-await-of syntax is used with the iterable to recursively get response element on-demand.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.topic
      *   Required. The name of the topic that snapshots are attached to.
      *   Format is `projects/{project}/topics/{topic}`.
      * @param {number} request.pageSize
      *   Maximum number of snapshot names to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListTopicSnapshotsResponse`; indicates
      *   that this is a continuation of a prior `ListTopicSnapshots` call, and
      *   that the system should return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that conforms to @link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols.
      */
    def listTopicSnapshotsAsync(): AsyncIterable[String] = js.native
    def listTopicSnapshotsAsync(request: Unit, options: CallOptions): AsyncIterable[String] = js.native
    def listTopicSnapshotsAsync(request: IListTopicSnapshotsRequest): AsyncIterable[String] = js.native
    def listTopicSnapshotsAsync(request: IListTopicSnapshotsRequest, options: CallOptions): AsyncIterable[String] = js.native
    
    /**
      * Equivalent to {@link listTopicSnapshots}, but returns a NodeJS Stream object.
      *
      * This fetches the paged responses for {@link listTopicSnapshots} continuously
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
      * @param {string} request.topic
      *   Required. The name of the topic that snapshots are attached to.
      *   Format is `projects/{project}/topics/{topic}`.
      * @param {number} request.pageSize
      *   Maximum number of snapshot names to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListTopicSnapshotsResponse`; indicates
      *   that this is a continuation of a prior `ListTopicSnapshots` call, and
      *   that the system should return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing string on 'data' event.
      */
    def listTopicSnapshotsStream(): Transform = js.native
    def listTopicSnapshotsStream(request: Unit, options: CallOptions): Transform = js.native
    def listTopicSnapshotsStream(request: IListTopicSnapshotsRequest): Transform = js.native
    def listTopicSnapshotsStream(request: IListTopicSnapshotsRequest, options: CallOptions): Transform = js.native
    
    def listTopicSubscriptions(request: IListTopicSubscriptionsRequest): js.Promise[
        js.Tuple3[
          js.Array[String], 
          IListTopicSubscriptionsRequest | Null, 
          IListTopicSubscriptionsResponse
        ]
      ] = js.native
    def listTopicSubscriptions(
      request: IListTopicSubscriptionsRequest,
      callback: PaginationCallback[
          IListTopicSubscriptionsRequest, 
          js.UndefOr[IListTopicSubscriptionsResponse | Null], 
          String
        ]
    ): Unit = js.native
    def listTopicSubscriptions(request: IListTopicSubscriptionsRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[String], 
          IListTopicSubscriptionsRequest | Null, 
          IListTopicSubscriptionsResponse
        ]
      ] = js.native
    def listTopicSubscriptions(
      request: IListTopicSubscriptionsRequest,
      options: CallOptions,
      callback: PaginationCallback[
          IListTopicSubscriptionsRequest, 
          js.UndefOr[IListTopicSubscriptionsResponse | Null], 
          String
        ]
    ): Unit = js.native
    
    /**
      * Equivalent to {@link listTopicSubscriptions}, but returns an iterable object.
      *
      * for-await-of syntax is used with the iterable to recursively get response element on-demand.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.topic
      *   Required. The name of the topic that subscriptions are attached to.
      *   Format is `projects/{project}/topics/{topic}`.
      * @param {number} request.pageSize
      *   Maximum number of subscription names to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListTopicSubscriptionsResponse`; indicates
      *   that this is a continuation of a prior `ListTopicSubscriptions` call, and
      *   that the system should return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that conforms to @link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols.
      */
    def listTopicSubscriptionsAsync(): AsyncIterable[String] = js.native
    def listTopicSubscriptionsAsync(request: Unit, options: CallOptions): AsyncIterable[String] = js.native
    def listTopicSubscriptionsAsync(request: IListTopicSubscriptionsRequest): AsyncIterable[String] = js.native
    def listTopicSubscriptionsAsync(request: IListTopicSubscriptionsRequest, options: CallOptions): AsyncIterable[String] = js.native
    
    /**
      * Equivalent to {@link listTopicSubscriptions}, but returns a NodeJS Stream object.
      *
      * This fetches the paged responses for {@link listTopicSubscriptions} continuously
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
      * @param {string} request.topic
      *   Required. The name of the topic that subscriptions are attached to.
      *   Format is `projects/{project}/topics/{topic}`.
      * @param {number} request.pageSize
      *   Maximum number of subscription names to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListTopicSubscriptionsResponse`; indicates
      *   that this is a continuation of a prior `ListTopicSubscriptions` call, and
      *   that the system should return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing string on 'data' event.
      */
    def listTopicSubscriptionsStream(): Transform = js.native
    def listTopicSubscriptionsStream(request: Unit, options: CallOptions): Transform = js.native
    def listTopicSubscriptionsStream(request: IListTopicSubscriptionsRequest): Transform = js.native
    def listTopicSubscriptionsStream(request: IListTopicSubscriptionsRequest, options: CallOptions): Transform = js.native
    
    def listTopics(request: IListTopicsRequest): js.Promise[js.Tuple3[js.Array[ITopic], IListTopicsRequest | Null, IListTopicsResponse]] = js.native
    def listTopics(
      request: IListTopicsRequest,
      callback: PaginationCallback[IListTopicsRequest, js.UndefOr[IListTopicsResponse | Null], ITopic]
    ): Unit = js.native
    def listTopics(request: IListTopicsRequest, options: CallOptions): js.Promise[js.Tuple3[js.Array[ITopic], IListTopicsRequest | Null, IListTopicsResponse]] = js.native
    def listTopics(
      request: IListTopicsRequest,
      options: CallOptions,
      callback: PaginationCallback[IListTopicsRequest, js.UndefOr[IListTopicsResponse | Null], ITopic]
    ): Unit = js.native
    
    /**
      * Equivalent to {@link listTopics}, but returns an iterable object.
      *
      * for-await-of syntax is used with the iterable to recursively get response element on-demand.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.project
      *   Required. The name of the project in which to list topics.
      *   Format is `projects/{project-id}`.
      * @param {number} request.pageSize
      *   Maximum number of topics to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListTopicsResponse`; indicates that this is
      *   a continuation of a prior `ListTopics` call, and that the system should
      *   return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that conforms to @link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols.
      */
    def listTopicsAsync(): AsyncIterable[ITopic] = js.native
    def listTopicsAsync(request: Unit, options: CallOptions): AsyncIterable[ITopic] = js.native
    def listTopicsAsync(request: IListTopicsRequest): AsyncIterable[ITopic] = js.native
    def listTopicsAsync(request: IListTopicsRequest, options: CallOptions): AsyncIterable[ITopic] = js.native
    
    /**
      * Equivalent to {@link listTopics}, but returns a NodeJS Stream object.
      *
      * This fetches the paged responses for {@link listTopics} continuously
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
      *   Required. The name of the project in which to list topics.
      *   Format is `projects/{project-id}`.
      * @param {number} request.pageSize
      *   Maximum number of topics to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListTopicsResponse`; indicates that this is
      *   a continuation of a prior `ListTopics` call, and that the system should
      *   return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Topic]{@link google.pubsub.v1.Topic} on 'data' event.
      */
    def listTopicsStream(): Transform = js.native
    def listTopicsStream(request: Unit, options: CallOptions): Transform = js.native
    def listTopicsStream(request: IListTopicsRequest): Transform = js.native
    def listTopicsStream(request: IListTopicsRequest, options: CallOptions): Transform = js.native
    
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
    
    def publish(request: IPublishRequest): js.Promise[js.Tuple3[IPublishResponse, js.UndefOr[IPublishRequest], js.UndefOr[js.Object]]] = js.native
    def publish(
      request: IPublishRequest,
      callback: Callback[IPublishResponse, js.UndefOr[IPublishRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def publish(request: IPublishRequest, options: CallOptions): js.Promise[js.Tuple3[IPublishResponse, js.UndefOr[IPublishRequest], js.UndefOr[js.Object]]] = js.native
    def publish(
      request: IPublishRequest,
      options: CallOptions,
      callback: Callback[IPublishResponse, js.UndefOr[IPublishRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    var publisherStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
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
      options: Unit,
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
      options: Unit,
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
    
    def updateTopic(request: IUpdateTopicRequest): js.Promise[js.Tuple3[ITopic, js.UndefOr[IUpdateTopicRequest], js.UndefOr[js.Object]]] = js.native
    def updateTopic(
      request: IUpdateTopicRequest,
      callback: Callback[ITopic, js.UndefOr[IUpdateTopicRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def updateTopic(request: IUpdateTopicRequest, options: CallOptions): js.Promise[js.Tuple3[ITopic, js.UndefOr[IUpdateTopicRequest], js.UndefOr[js.Object]]] = js.native
    def updateTopic(
      request: IUpdateTopicRequest,
      options: CallOptions,
      callback: Callback[ITopic, js.UndefOr[IUpdateTopicRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
  }
}
