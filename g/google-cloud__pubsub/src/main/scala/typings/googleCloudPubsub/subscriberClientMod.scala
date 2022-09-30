package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleCloudPubsub.anon.Typeoffallback
import typings.googleCloudPubsub.anon.Typeofgax
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriberClientMod {
  
  @JSImport("@google-cloud/pubsub/build/src/v1/subscriber_client", "SubscriberClient")
  @js.native
  /**
    * Construct an instance of SubscriberClient.
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
    *     const client = new SubscriberClient({fallback: 'rest'}, gax);
    *     ```
    */
  open class SubscriberClient () extends StObject {
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
    
    /**
      * Acknowledges the messages associated with the `ack_ids` in the
      * `AcknowledgeRequest`. The Pub/Sub system can remove the relevant messages
      * from the subscription.
      *
      * Acknowledging a message whose ack deadline has expired may succeed,
      * but such a message may be redelivered later. Acknowledging a message more
      * than once will not result in an error.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.subscription
      *   Required. The subscription whose message is being acknowledged.
      *   Format is `projects/{project}/subscriptions/{sub}`.
      * @param {string[]} request.ackIds
      *   Required. The acknowledgment ID for the messages being acknowledged that
      *   was returned by the Pub/Sub system in the `Pull` response. Must not be
      *   empty.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def acknowledge(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IAcknowledgeRequest], js.UndefOr[js.Object]]] = js.native
    def acknowledge(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IAcknowledgeRequest], js.UndefOr[js.Object]]] = js.native
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
    
    var auth: GoogleAuth[JSONClient] = js.native
    
    /**
      * Terminate the gRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      * @returns {Promise} A promise that resolves when the client is closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Creates a snapshot from the requested subscription. Snapshots are used in
      * [Seek](https://cloud.google.com/pubsub/docs/replay-overview) operations,
      * which allow you to manage message acknowledgments in bulk. That is, you can
      * set the acknowledgment state of messages in an existing subscription to the
      * state captured by a snapshot.
      * If the snapshot already exists, returns `ALREADY_EXISTS`.
      * If the requested subscription doesn't exist, returns `NOT_FOUND`.
      * If the backlog in the subscription is too old -- and the resulting snapshot
      * would expire in less than 1 hour -- then `FAILED_PRECONDITION` is returned.
      * See also the `Snapshot.expire_time` field. If the name is not provided in
      * the request, the server will assign a random
      * name for this snapshot on the same project as the subscription, conforming
      * to the [resource name format]
      * (https://cloud.google.com/pubsub/docs/admin#resource_names). The
      * generated name is populated in the returned Snapshot object. Note that for
      * REST API requests, you must specify a name in the request.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. User-provided name for this snapshot. If the name is not provided
      *   in the request, the server will assign a random name for this snapshot on
      *   the same project as the subscription. Note that for REST API requests, you
      *   must specify a name.  See the <a
      *   href="https://cloud.google.com/pubsub/docs/admin#resource_names"> resource
      *   name rules</a>. Format is `projects/{project}/snapshots/{snap}`.
      * @param {string} request.subscription
      *   Required. The subscription whose backlog the snapshot retains.
      *   Specifically, the created snapshot is guaranteed to retain:
      *    (a) The existing backlog on the subscription. More precisely, this is
      *        defined as the messages in the subscription's backlog that are
      *        unacknowledged upon the successful completion of the
      *        `CreateSnapshot` request; as well as:
      *    (b) Any messages published to the subscription's topic following the
      *        successful completion of the CreateSnapshot request.
      *   Format is `projects/{project}/subscriptions/{sub}`.
      * @param {number[]} request.labels
      *   See <a href="https://cloud.google.com/pubsub/docs/labels"> Creating and
      *   managing labels</a>.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Snapshot]{@link google.pubsub.v1.Snapshot}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def createSnapshot(): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[ICreateSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def createSnapshot(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[ICreateSnapshotRequest], js.UndefOr[js.Object]]] = js.native
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
    
    /**
      * Creates a subscription to a given topic. See the [resource name rules]
      * (https://cloud.google.com/pubsub/docs/admin#resource_names).
      * If the subscription already exists, returns `ALREADY_EXISTS`.
      * If the corresponding topic doesn't exist, returns `NOT_FOUND`.
      *
      * If the name is not provided in the request, the server will assign a random
      * name for this subscription on the same project as the topic, conforming
      * to the [resource name format]
      * (https://cloud.google.com/pubsub/docs/admin#resource_names). The generated
      * name is populated in the returned Subscription object. Note that for REST
      * API requests, you must specify a name in the request.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. The name of the subscription. It must have the format
      *   `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must
      *   start with a letter, and contain only letters (`[A-Za-z]`), numbers
      *   (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`),
      *   plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters
      *   in length, and it must not start with `"goog"`.
      * @param {string} request.topic
      *   Required. The name of the topic from which this subscription is receiving
      *   messages. Format is `projects/{project}/topics/{topic}`. The value of this
      *   field will be `_deleted-topic_` if the topic has been deleted.
      * @param {google.pubsub.v1.PushConfig} request.pushConfig
      *   If push delivery is used with this subscription, this field is
      *   used to configure it. Either `pushConfig` or `bigQueryConfig` can be set,
      *   but not both. If both are empty, then the subscriber will pull and ack
      *   messages using API methods.
      * @param {google.pubsub.v1.BigQueryConfig} request.bigqueryConfig
      *   If delivery to BigQuery is used with this subscription, this field is
      *   used to configure it. Either `pushConfig` or `bigQueryConfig` can be set,
      *   but not both. If both are empty, then the subscriber will pull and ack
      *   messages using API methods.
      * @param {number} request.ackDeadlineSeconds
      *   The approximate amount of time (on a best-effort basis) Pub/Sub waits for
      *   the subscriber to acknowledge receipt before resending the message. In the
      *   interval after the message is delivered and before it is acknowledged, it
      *   is considered to be <i>outstanding</i>. During that time period, the
      *   message will not be redelivered (on a best-effort basis).
      *
      *   For pull subscriptions, this value is used as the initial value for the ack
      *   deadline. To override this value for a given message, call
      *   `ModifyAckDeadline` with the corresponding `ack_id` if using
      *   non-streaming pull or send the `ack_id` in a
      *   `StreamingModifyAckDeadlineRequest` if using streaming pull.
      *   The minimum custom deadline you can specify is 10 seconds.
      *   The maximum custom deadline you can specify is 600 seconds (10 minutes).
      *   If this parameter is 0, a default value of 10 seconds is used.
      *
      *   For push delivery, this value is also used to set the request timeout for
      *   the call to the push endpoint.
      *
      *   If the subscriber never acknowledges the message, the Pub/Sub
      *   system will eventually redeliver the message.
      * @param {boolean} request.retainAckedMessages
      *   Indicates whether to retain acknowledged messages. If true, then
      *   messages are not expunged from the subscription's backlog, even if they are
      *   acknowledged, until they fall out of the `message_retention_duration`
      *   window. This must be true if you would like to [`Seek` to a timestamp]
      *   (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in
      *   the past to replay previously-acknowledged messages.
      * @param {google.protobuf.Duration} request.messageRetentionDuration
      *   How long to retain unacknowledged messages in the subscription's backlog,
      *   from the moment a message is published.
      *   If `retain_acked_messages` is true, then this also configures the retention
      *   of acknowledged messages, and thus configures how far back in time a `Seek`
      *   can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10
      *   minutes.
      * @param {number[]} request.labels
      *   See <a href="https://cloud.google.com/pubsub/docs/labels"> Creating and
      *   managing labels</a>.
      * @param {boolean} request.enableMessageOrdering
      *   If true, messages published with the same `ordering_key` in `PubsubMessage`
      *   will be delivered to the subscribers in the order in which they
      *   are received by the Pub/Sub system. Otherwise, they may be delivered in
      *   any order.
      * @param {google.pubsub.v1.ExpirationPolicy} request.expirationPolicy
      *   A policy that specifies the conditions for this subscription's expiration.
      *   A subscription is considered active as long as any connected subscriber is
      *   successfully consuming messages from the subscription or is issuing
      *   operations on the subscription. If `expiration_policy` is not set, a
      *   *default policy* with `ttl` of 31 days will be used. The minimum allowed
      *   value for `expiration_policy.ttl` is 1 day.
      * @param {string} request.filter
      *   An expression written in the Pub/Sub [filter
      *   language](https://cloud.google.com/pubsub/docs/filtering). If non-empty,
      *   then only `PubsubMessage`s whose `attributes` field matches the filter are
      *   delivered on this subscription. If empty, then no messages are filtered
      *   out.
      * @param {google.pubsub.v1.DeadLetterPolicy} request.deadLetterPolicy
      *   A policy that specifies the conditions for dead lettering messages in
      *   this subscription. If dead_letter_policy is not set, dead lettering
      *   is disabled.
      *
      *   The Cloud Pub/Sub service account associated with this subscriptions's
      *   parent project (i.e.,
      *   service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have
      *   permission to Acknowledge() messages on this subscription.
      * @param {google.pubsub.v1.RetryPolicy} request.retryPolicy
      *   A policy that specifies how Pub/Sub retries message delivery for this
      *   subscription.
      *
      *   If not set, the default retry policy is applied. This generally implies
      *   that messages will be retried as soon as possible for healthy subscribers.
      *   RetryPolicy will be triggered on NACKs or acknowledgement deadline
      *   exceeded events for a given message.
      * @param {boolean} request.detached
      *   Indicates whether the subscription is detached from its topic. Detached
      *   subscriptions don't receive messages from their topic and don't retain any
      *   backlog. `Pull` and `StreamingPull` requests will return
      *   FAILED_PRECONDITION. If the subscription is a push subscription, pushes to
      *   the endpoint will not be made.
      * @param {boolean} request.enableExactlyOnceDelivery
      *   If true, Pub/Sub provides the following guarantees for the delivery of
      *   a message with a given value of `message_id` on this subscription:
      *
      *   * The message sent to a subscriber is guaranteed not to be resent
      *   before the message's acknowledgement deadline expires.
      *   * An acknowledged message will not be resent to a subscriber.
      *
      *   Note that subscribers may still receive multiple copies of a message
      *   when `enable_exactly_once_delivery` is true if the message was published
      *   multiple times by a publisher client. These copies are  considered distinct
      *   by Pub/Sub and have distinct `message_id` values.
      * @param {google.protobuf.Duration} request.topicMessageRetentionDuration
      *   Output only. Indicates the minimum duration for which a message is retained
      *   after it is published to the subscription's topic. If this field is set,
      *   messages published to the subscription's topic in the last
      *   `topic_message_retention_duration` are always available to subscribers. See
      *   the `message_retention_duration` field in `Topic`. This field is set only
      *   in responses from the server; it is ignored if it is set in any requests.
      * @param {google.pubsub.v1.Subscription.State} request.state
      *   Output only. An output-only field indicating whether or not the subscription can receive
      *   messages.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Subscription]{@link google.pubsub.v1.Subscription}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def createSubscription(): js.Promise[js.Tuple3[ISubscription, js.UndefOr[ISubscription], js.UndefOr[js.Object]]] = js.native
    def createSubscription(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ISubscription, js.UndefOr[ISubscription], js.UndefOr[js.Object]]] = js.native
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
    
    /**
      * Removes an existing snapshot. Snapshots are used in [Seek]
      * (https://cloud.google.com/pubsub/docs/replay-overview) operations, which
      * allow you to manage message acknowledgments in bulk. That is, you can set
      * the acknowledgment state of messages in an existing subscription to the
      * state captured by a snapshot.
      * When the snapshot is deleted, all messages retained in the snapshot
      * are immediately dropped. After a snapshot is deleted, a new one may be
      * created with the same name, but the new one has no association with the old
      * snapshot or its subscription, unless the same subscription is specified.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.snapshot
      *   Required. The name of the snapshot to delete.
      *   Format is `projects/{project}/snapshots/{snap}`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def deleteSnapshot(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSnapshot(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSnapshotRequest], js.UndefOr[js.Object]]] = js.native
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
    
    /**
      * Deletes an existing subscription. All messages retained in the subscription
      * are immediately dropped. Calls to `Pull` after deletion will return
      * `NOT_FOUND`. After a subscription is deleted, a new one may be created with
      * the same name, but the new one has no association with the old
      * subscription or its topic unless the same topic is specified.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.subscription
      *   Required. The subscription to delete.
      *   Format is `projects/{project}/subscriptions/{sub}`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def deleteSubscription(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSubscriptionRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSubscription(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSubscriptionRequest], js.UndefOr[js.Object]]] = js.native
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
      * Gets the configuration details of a snapshot. Snapshots are used in
      * <a href="https://cloud.google.com/pubsub/docs/replay-overview">Seek</a>
      * operations, which allow you to manage message acknowledgments in bulk. That
      * is, you can set the acknowledgment state of messages in an existing
      * subscription to the state captured by a snapshot.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.snapshot
      *   Required. The name of the snapshot to get.
      *   Format is `projects/{project}/snapshots/{snap}`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Snapshot]{@link google.pubsub.v1.Snapshot}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def getSnapshot(): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[IGetSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def getSnapshot(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[IGetSnapshotRequest], js.UndefOr[js.Object]]] = js.native
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
    
    /**
      * Gets the configuration details of a subscription.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.subscription
      *   Required. The name of the subscription to get.
      *   Format is `projects/{project}/subscriptions/{sub}`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Subscription]{@link google.pubsub.v1.Subscription}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def getSubscription(): js.Promise[
        js.Tuple3[ISubscription, js.UndefOr[IGetSubscriptionRequest], js.UndefOr[js.Object]]
      ] = js.native
    def getSubscription(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[ISubscription, js.UndefOr[IGetSubscriptionRequest], js.UndefOr[js.Object]]
      ] = js.native
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
    
    /**
      * Lists the existing snapshots. Snapshots are used in [Seek](
      * https://cloud.google.com/pubsub/docs/replay-overview) operations, which
      * allow you to manage message acknowledgments in bulk. That is, you can set
      * the acknowledgment state of messages in an existing subscription to the
      * state captured by a snapshot.
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
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Snapshot]{@link google.pubsub.v1.Snapshot}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listSnapshotsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSnapshots(): js.Promise[
        js.Tuple3[js.Array[ISnapshot], IListSnapshotsRequest | Null, IListSnapshotsResponse]
      ] = js.native
    def listSnapshots(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[ISnapshot], IListSnapshotsRequest | Null, IListSnapshotsResponse]
      ] = js.native
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
      * Equivalent to `listSnapshots`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
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
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Snapshot]{@link google.pubsub.v1.Snapshot}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSnapshotsAsync(): AsyncIterable[ISnapshot] = js.native
    def listSnapshotsAsync(request: Unit, options: CallOptions): AsyncIterable[ISnapshot] = js.native
    def listSnapshotsAsync(request: IListSnapshotsRequest): AsyncIterable[ISnapshot] = js.native
    def listSnapshotsAsync(request: IListSnapshotsRequest, options: CallOptions): AsyncIterable[ISnapshot] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
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
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listSnapshotsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSnapshotsStream(): Transform = js.native
    def listSnapshotsStream(request: Unit, options: CallOptions): Transform = js.native
    def listSnapshotsStream(request: IListSnapshotsRequest): Transform = js.native
    def listSnapshotsStream(request: IListSnapshotsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Lists matching subscriptions.
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
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Subscription]{@link google.pubsub.v1.Subscription}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listSubscriptionsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSubscriptions(): js.Promise[
        js.Tuple3[
          js.Array[ISubscription], 
          IListSubscriptionsRequest | Null, 
          IListSubscriptionsResponse
        ]
      ] = js.native
    def listSubscriptions(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[ISubscription], 
          IListSubscriptionsRequest | Null, 
          IListSubscriptionsResponse
        ]
      ] = js.native
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
      * Equivalent to `listSubscriptions`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
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
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Subscription]{@link google.pubsub.v1.Subscription}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSubscriptionsAsync(): AsyncIterable[ISubscription] = js.native
    def listSubscriptionsAsync(request: Unit, options: CallOptions): AsyncIterable[ISubscription] = js.native
    def listSubscriptionsAsync(request: IListSubscriptionsRequest): AsyncIterable[ISubscription] = js.native
    def listSubscriptionsAsync(request: IListSubscriptionsRequest, options: CallOptions): AsyncIterable[ISubscription] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
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
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listSubscriptionsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSubscriptionsStream(): Transform = js.native
    def listSubscriptionsStream(request: Unit, options: CallOptions): Transform = js.native
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
    
    /**
      * Modifies the ack deadline for a specific message. This method is useful
      * to indicate that more time is needed to process a message by the
      * subscriber, or to make the message available for redelivery if the
      * processing was interrupted. Note that this does not modify the
      * subscription-level `ackDeadlineSeconds` used for subsequent messages.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.subscription
      *   Required. The name of the subscription.
      *   Format is `projects/{project}/subscriptions/{sub}`.
      * @param {string[]} request.ackIds
      *   Required. List of acknowledgment IDs.
      * @param {number} request.ackDeadlineSeconds
      *   Required. The new ack deadline with respect to the time this request was
      *   sent to the Pub/Sub system. For example, if the value is 10, the new ack
      *   deadline will expire 10 seconds after the `ModifyAckDeadline` call was
      *   made. Specifying zero might immediately make the message available for
      *   delivery to another subscriber client. This typically results in an
      *   increase in the rate of message redeliveries (that is, duplicates).
      *   The minimum deadline you can specify is 0 seconds.
      *   The maximum deadline you can specify is 600 seconds (10 minutes).
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def modifyAckDeadline(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IModifyAckDeadlineRequest], js.UndefOr[js.Object]]] = js.native
    def modifyAckDeadline(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IModifyAckDeadlineRequest], js.UndefOr[js.Object]]] = js.native
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
    
    /**
      * Modifies the `PushConfig` for a specified subscription.
      *
      * This may be used to change a push subscription to a pull one (signified by
      * an empty `PushConfig`) or vice versa, or change the endpoint URL and other
      * attributes of a push subscription. Messages will accumulate for delivery
      * continuously through the call regardless of changes to the `PushConfig`.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.subscription
      *   Required. The name of the subscription.
      *   Format is `projects/{project}/subscriptions/{sub}`.
      * @param {google.pubsub.v1.PushConfig} request.pushConfig
      *   Required. The push configuration for future deliveries.
      *
      *   An empty `pushConfig` indicates that the Pub/Sub system should
      *   stop pushing messages from the given subscription and allow
      *   messages to be pulled and acknowledged - effectively pausing
      *   the subscription if `Pull` or `StreamingPull` is not called.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def modifyPushConfig(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IModifyPushConfigRequest], js.UndefOr[js.Object]]] = js.native
    def modifyPushConfig(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IModifyPushConfigRequest], js.UndefOr[js.Object]]] = js.native
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
    
    /**
      * Pulls messages from the server. The server may return `UNAVAILABLE` if
      * there are too many concurrent pull requests pending for the given
      * subscription.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.subscription
      *   Required. The subscription from which messages should be pulled.
      *   Format is `projects/{project}/subscriptions/{sub}`.
      * @param {boolean} [request.returnImmediately]
      *   Optional. If this field set to true, the system will respond immediately
      *   even if it there are no messages available to return in the `Pull`
      *   response. Otherwise, the system may wait (for a bounded amount of time)
      *   until at least one message is available, rather than returning no messages.
      *   Warning: setting this field to `true` is discouraged because it adversely
      *   impacts the performance of `Pull` operations. We recommend that users do
      *   not set this field.
      * @param {number} request.maxMessages
      *   Required. The maximum number of messages to return for this request. Must
      *   be a positive integer. The Pub/Sub system may return fewer than the number
      *   specified.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [PullResponse]{@link google.pubsub.v1.PullResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def pull(): js.Promise[js.Tuple3[IPullResponse, js.UndefOr[IPullRequest], js.UndefOr[js.Object]]] = js.native
    def pull(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IPullResponse, js.UndefOr[IPullRequest], js.UndefOr[js.Object]]] = js.native
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
    
    /**
      * Return a fully-qualified schema resource name string.
      *
      * @param {string} project
      * @param {string} schema
      * @returns {string} Resource name string.
      */
    def schemaPath(project: String, schema: String): String = js.native
    
    /**
      * Seeks an existing subscription to a point in time or to a given snapshot,
      * whichever is provided in the request. Snapshots are used in [Seek]
      * (https://cloud.google.com/pubsub/docs/replay-overview) operations, which
      * allow you to manage message acknowledgments in bulk. That is, you can set
      * the acknowledgment state of messages in an existing subscription to the
      * state captured by a snapshot. Note that both the subscription and the
      * snapshot must be on the same topic.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.subscription
      *   Required. The subscription to affect.
      * @param {google.protobuf.Timestamp} request.time
      *   The time to seek to.
      *   Messages retained in the subscription that were published before this
      *   time are marked as acknowledged, and messages retained in the
      *   subscription that were published after this time are marked as
      *   unacknowledged. Note that this operation affects only those messages
      *   retained in the subscription (configured by the combination of
      *   `message_retention_duration` and `retain_acked_messages`). For example,
      *   if `time` corresponds to a point before the message retention
      *   window (or to a point before the system's notion of the subscription
      *   creation time), only retained messages will be marked as unacknowledged,
      *   and already-expunged messages will not be restored.
      * @param {string} request.snapshot
      *   The snapshot to seek to. The snapshot's topic must be the same as that of
      *   the provided subscription.
      *   Format is `projects/{project}/snapshots/{snap}`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [SeekResponse]{@link google.pubsub.v1.SeekResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def seek(): js.Promise[js.Tuple3[ISeekResponse, js.UndefOr[ISeekRequest], js.UndefOr[js.Object]]] = js.native
    def seek(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ISeekResponse, js.UndefOr[ISeekRequest], js.UndefOr[js.Object]]] = js.native
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
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#bi-directional-streaming)
      *   for more details and examples.
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
      * Updates an existing snapshot. Snapshots are used in
      * <a href="https://cloud.google.com/pubsub/docs/replay-overview">Seek</a>
      * operations, which allow
      * you to manage message acknowledgments in bulk. That is, you can set the
      * acknowledgment state of messages in an existing subscription to the state
      * captured by a snapshot.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {google.pubsub.v1.Snapshot} request.snapshot
      *   Required. The updated snapshot object.
      * @param {google.protobuf.FieldMask} request.updateMask
      *   Required. Indicates which fields in the provided snapshot to update.
      *   Must be specified and non-empty.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Snapshot]{@link google.pubsub.v1.Snapshot}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def updateSnapshot(): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[IUpdateSnapshotRequest], js.UndefOr[js.Object]]] = js.native
    def updateSnapshot(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ISnapshot, js.UndefOr[IUpdateSnapshotRequest], js.UndefOr[js.Object]]] = js.native
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
    
    /**
      * Updates an existing subscription. Note that certain properties of a
      * subscription, such as its topic, are not modifiable.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {google.pubsub.v1.Subscription} request.subscription
      *   Required. The updated subscription object.
      * @param {google.protobuf.FieldMask} request.updateMask
      *   Required. Indicates which fields in the provided subscription to update.
      *   Must be specified and non-empty.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Subscription]{@link google.pubsub.v1.Subscription}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def updateSubscription(): js.Promise[
        js.Tuple3[ISubscription, js.UndefOr[IUpdateSubscriptionRequest], js.UndefOr[js.Object]]
      ] = js.native
    def updateSubscription(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[ISubscription, js.UndefOr[IUpdateSubscriptionRequest], js.UndefOr[js.Object]]
      ] = js.native
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
    
    def warn(code: String, message: String): Unit = js.native
    def warn(code: String, message: String, warnType: String): Unit = js.native
  }
}
