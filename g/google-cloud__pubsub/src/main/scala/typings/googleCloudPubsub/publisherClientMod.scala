package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleCloudPubsub.anon.Typeoffallback
import typings.googleCloudPubsub.anon.Typeofgax
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
    * @param {object} [options] - The configuration object.
    * The options accepted by the constructor are described in detail
    * in [this document](https://github.com/googleapis/gax-nodejs/blob/main/client-libraries.md#creating-the-client-instance).
    * The common options are:
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
    * @param {gax.ClientConfig} [options.clientConfig] - Client configuration override.
    *     Follows the structure of {@link gapicConfig}.
    * @param {boolean | "rest"} [options.fallback] - Use HTTP fallback mode.
    *     Pass "rest" to use HTTP/1.1 REST API instead of gRPC.
    *     For more information, please check the
    *     {@link https://github.com/googleapis/gax-nodejs/blob/main/client-libraries.md#http11-rest-api-mode documentation}.
    * @param {gax} [gaxInstance]: loaded instance of `google-gax`. Useful if you
    *     need to avoid loading the default gRPC version and want to use the fallback
    *     HTTP implementation. Load only fallback version and pass it to the constructor:
    *     ```
    *     const gax = require('google-gax/build/src/fallback'); // avoids loading google-gax with gRPC
    *     const client = new PublisherClient({fallback: 'rest'}, gax);
    *     ```
    */
  open class PublisherClient () extends StObject {
    def this(opts: ClientOptions) = this()
    def this(opts: Unit, gaxInstance: Typeoffallback) = this()
    def this(opts: Unit, gaxInstance: Typeofgax) = this()
    def this(opts: ClientOptions, gaxInstance: Typeoffallback) = this()
    def this(opts: ClientOptions, gaxInstance: Typeofgax) = this()
    
    /* private */ var _defaults: Any = js.native
    
    /* private */ var _gaxGrpc: Any = js.native
    
    /* private */ var _gaxModule: Any = js.native
    
    /* private */ var _opts: Any = js.native
    
    /* private */ var _protos: Any = js.native
    
    /* private */ var _providedCustomServicePath: Any = js.native
    
    /* private */ var _terminated: Any = js.native
    
    var auth: GoogleAuth[JSONClient] = js.native
    
    /**
      * Terminate the gRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      * @returns {Promise} A promise that resolves when the client is closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Creates the given topic with the given name. See the [resource name rules]
      * (https://cloud.google.com/pubsub/docs/admin#resource_names).
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. The name of the topic. It must have the format
      *   `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter,
      *   and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`),
      *   underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent
      *   signs (`%`). It must be between 3 and 255 characters in length, and it
      *   must not start with `"goog"`.
      * @param {number[]} request.labels
      *   See [Creating and managing labels]
      *   (https://cloud.google.com/pubsub/docs/labels).
      * @param {google.pubsub.v1.MessageStoragePolicy} request.messageStoragePolicy
      *   Policy constraining the set of Google Cloud Platform regions where messages
      *   published to the topic may be stored. If not present, then no constraints
      *   are in effect.
      * @param {string} request.kmsKeyName
      *   The resource name of the Cloud KMS CryptoKey to be used to protect access
      *   to messages published on this topic.
      *
      *   The expected format is `projects/ * /locations/ * /keyRings/ * /cryptoKeys/ *`.
      * @param {google.pubsub.v1.SchemaSettings} request.schemaSettings
      *   Settings for validating messages published against a schema.
      * @param {boolean} request.satisfiesPzs
      *   Reserved for future use. This field is set only in responses from the
      *   server; it is ignored if it is set in any requests.
      * @param {google.protobuf.Duration} request.messageRetentionDuration
      *   Indicates the minimum duration to retain a message after it is published to
      *   the topic. If this field is set, messages published to the topic in the
      *   last `message_retention_duration` are always available to subscribers. For
      *   instance, it allows any attached subscription to [seek to a
      *   timestamp](https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time)
      *   that is up to `message_retention_duration` in the past. If this field is
      *   not set, message retention is controlled by settings on individual
      *   subscriptions. Cannot be more than 7 days or less than 10 minutes.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Topic]{@link google.pubsub.v1.Topic}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def createTopic(): js.Promise[js.Tuple3[ITopic, js.UndefOr[ITopic], js.UndefOr[js.Object]]] = js.native
    def createTopic(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ITopic, js.UndefOr[ITopic], js.UndefOr[js.Object]]] = js.native
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
    
    /**
      * Deletes the topic with the given name. Returns `NOT_FOUND` if the topic
      * does not exist. After a topic is deleted, a new topic may be created with
      * the same name; this is an entirely new topic with none of the old
      * configuration or subscriptions. Existing subscriptions to this topic are
      * not deleted, but their `topic` field is set to `_deleted-topic_`.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.topic
      *   Required. Name of the topic to delete.
      *   Format is `projects/{project}/topics/{topic}`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def deleteTopic(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteTopicRequest], js.UndefOr[js.Object]]] = js.native
    def deleteTopic(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteTopicRequest], js.UndefOr[js.Object]]] = js.native
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
    
    /**
      * Detaches a subscription from this topic. All messages retained in the
      * subscription are dropped. Subsequent `Pull` and `StreamingPull` requests
      * will return FAILED_PRECONDITION. If the subscription is a push
      * subscription, pushes to the endpoint will stop.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.subscription
      *   Required. The subscription to detach.
      *   Format is `projects/{project}/subscriptions/{subscription}`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [DetachSubscriptionResponse]{@link google.pubsub.v1.DetachSubscriptionResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def detachSubscription(): js.Promise[
        js.Tuple3[
          IDetachSubscriptionResponse, 
          js.UndefOr[IDetachSubscriptionRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def detachSubscription(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          IDetachSubscriptionResponse, 
          js.UndefOr[IDetachSubscriptionRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
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
    
    /**
      * Gets the configuration of a topic.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.topic
      *   Required. The name of the topic to get.
      *   Format is `projects/{project}/topics/{topic}`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Topic]{@link google.pubsub.v1.Topic}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def getTopic(): js.Promise[js.Tuple3[ITopic, js.UndefOr[IGetTopicRequest], js.UndefOr[js.Object]]] = js.native
    def getTopic(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ITopic, js.UndefOr[IGetTopicRequest], js.UndefOr[js.Object]]] = js.native
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
    
    /**
      * Lists the names of the snapshots on this topic. Snapshots are used in
      * [Seek](https://cloud.google.com/pubsub/docs/replay-overview) operations,
      * which allow you to manage message acknowledgments in bulk. That is, you can
      * set the acknowledgment state of messages in an existing subscription to the
      * state captured by a snapshot.
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
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of string.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listTopicSnapshotsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listTopicSnapshots(): js.Promise[
        js.Tuple3[js.Array[String], IListTopicSnapshotsRequest | Null, IListTopicSnapshotsResponse]
      ] = js.native
    def listTopicSnapshots(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[String], IListTopicSnapshotsRequest | Null, IListTopicSnapshotsResponse]
      ] = js.native
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
      * Equivalent to `listTopicSnapshots`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
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
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   string. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listTopicSnapshotsAsync(): AsyncIterable[String] = js.native
    def listTopicSnapshotsAsync(request: Unit, options: CallOptions): AsyncIterable[String] = js.native
    def listTopicSnapshotsAsync(request: IListTopicSnapshotsRequest): AsyncIterable[String] = js.native
    def listTopicSnapshotsAsync(request: IListTopicSnapshotsRequest, options: CallOptions): AsyncIterable[String] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
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
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listTopicSnapshotsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listTopicSnapshotsStream(): Transform = js.native
    def listTopicSnapshotsStream(request: Unit, options: CallOptions): Transform = js.native
    def listTopicSnapshotsStream(request: IListTopicSnapshotsRequest): Transform = js.native
    def listTopicSnapshotsStream(request: IListTopicSnapshotsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Lists the names of the attached subscriptions on this topic.
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
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of string.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listTopicSubscriptionsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listTopicSubscriptions(): js.Promise[
        js.Tuple3[
          js.Array[String], 
          IListTopicSubscriptionsRequest | Null, 
          IListTopicSubscriptionsResponse
        ]
      ] = js.native
    def listTopicSubscriptions(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[String], 
          IListTopicSubscriptionsRequest | Null, 
          IListTopicSubscriptionsResponse
        ]
      ] = js.native
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
      * Equivalent to `listTopicSubscriptions`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
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
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   string. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listTopicSubscriptionsAsync(): AsyncIterable[String] = js.native
    def listTopicSubscriptionsAsync(request: Unit, options: CallOptions): AsyncIterable[String] = js.native
    def listTopicSubscriptionsAsync(request: IListTopicSubscriptionsRequest): AsyncIterable[String] = js.native
    def listTopicSubscriptionsAsync(request: IListTopicSubscriptionsRequest, options: CallOptions): AsyncIterable[String] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
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
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listTopicSubscriptionsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listTopicSubscriptionsStream(): Transform = js.native
    def listTopicSubscriptionsStream(request: Unit, options: CallOptions): Transform = js.native
    def listTopicSubscriptionsStream(request: IListTopicSubscriptionsRequest): Transform = js.native
    def listTopicSubscriptionsStream(request: IListTopicSubscriptionsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Lists matching topics.
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
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Topic]{@link google.pubsub.v1.Topic}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listTopicsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listTopics(): js.Promise[js.Tuple3[js.Array[ITopic], IListTopicsRequest | Null, IListTopicsResponse]] = js.native
    def listTopics(request: Unit, options: CallOptions): js.Promise[js.Tuple3[js.Array[ITopic], IListTopicsRequest | Null, IListTopicsResponse]] = js.native
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
      * Equivalent to `listTopics`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
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
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Topic]{@link google.pubsub.v1.Topic}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listTopicsAsync(): AsyncIterable[ITopic] = js.native
    def listTopicsAsync(request: Unit, options: CallOptions): AsyncIterable[ITopic] = js.native
    def listTopicsAsync(request: IListTopicsRequest): AsyncIterable[ITopic] = js.native
    def listTopicsAsync(request: IListTopicsRequest, options: CallOptions): AsyncIterable[ITopic] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
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
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listTopicsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
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
      * Parse the project from Schema resource.
      *
      * @param {string} schemaName
      *   A fully-qualified path representing Schema resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromSchemaName(schemaName: String): String | Double = js.native
    
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
      * Parse the schema from Schema resource.
      *
      * @param {string} schemaName
      *   A fully-qualified path representing Schema resource.
      * @returns {string} A string representing the schema.
      */
    def matchSchemaFromSchemaName(schemaName: String): String | Double = js.native
    
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
    
    /**
      * Adds one or more messages to the topic. Returns `NOT_FOUND` if the topic
      * does not exist.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.topic
      *   Required. The messages in the request will be published on this topic.
      *   Format is `projects/{project}/topics/{topic}`.
      * @param {number[]} request.messages
      *   Required. The messages to publish.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [PublishResponse]{@link google.pubsub.v1.PublishResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def publish(): js.Promise[js.Tuple3[IPublishResponse, js.UndefOr[IPublishRequest], js.UndefOr[js.Object]]] = js.native
    def publish(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IPublishResponse, js.UndefOr[IPublishRequest], js.UndefOr[js.Object]]] = js.native
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
      * Return a fully-qualified schema resource name string.
      *
      * @param {string} project
      * @param {string} schema
      * @returns {string} Resource name string.
      */
    def schemaPath(project: String, schema: String): String = js.native
    
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
    
    /**
      * Updates an existing topic. Note that certain properties of a
      * topic are not modifiable.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {google.pubsub.v1.Topic} request.topic
      *   Required. The updated topic object.
      * @param {google.protobuf.FieldMask} request.updateMask
      *   Required. Indicates which fields in the provided topic to update. Must be
      *   specified and non-empty. Note that if `update_mask` contains
      *   "message_storage_policy" but the `message_storage_policy` is not set in
      *   the `topic` provided above, then the updated value is determined by the
      *   policy configured at the project or organization level.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Topic]{@link google.pubsub.v1.Topic}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def updateTopic(): js.Promise[js.Tuple3[ITopic, js.UndefOr[IUpdateTopicRequest], js.UndefOr[js.Object]]] = js.native
    def updateTopic(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ITopic, js.UndefOr[IUpdateTopicRequest], js.UndefOr[js.Object]]] = js.native
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
    
    def warn(code: String, message: String): Unit = js.native
    def warn(code: String, message: String, warnType: String): Unit = js.native
  }
}
