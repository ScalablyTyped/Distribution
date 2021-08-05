package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.Empty
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.AcknowledgeCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.CreateSnapshotCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.CreateSubscriptionCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.DeleteSnapshotCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.DeleteSubscriptionCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.GetSnapshotCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.GetSubscriptionCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.ListSnapshotsCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.ListSubscriptionsCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.ModifyAckDeadlineCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.ModifyPushConfigCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.PullCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.SeekCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.StreamingPullCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.UpdateSnapshotCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscriber.UpdateSubscriptionCallback
import typings.googleGax.mod.protobuf.rpc.Service
import typings.protobufjs.mod.RPCImpl
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Subscriber */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Subscriber")
@js.native
class Subscriber protected () extends Service {
  /**
    * Constructs a new Subscriber service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls Acknowledge.
    * @param request AcknowledgeRequest message or plain object
    * @returns Promise
    */
  def acknowledge(request: IAcknowledgeRequest): js.Promise[Empty] = js.native
  /**
    * Calls Acknowledge.
    * @param request AcknowledgeRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def acknowledge(request: IAcknowledgeRequest, callback: AcknowledgeCallback): Unit = js.native
  
  /**
    * Calls CreateSnapshot.
    * @param request CreateSnapshotRequest message or plain object
    * @returns Promise
    */
  def createSnapshot(request: ICreateSnapshotRequest): js.Promise[Snapshot] = js.native
  /**
    * Calls CreateSnapshot.
    * @param request CreateSnapshotRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Snapshot
    */
  def createSnapshot(request: ICreateSnapshotRequest, callback: CreateSnapshotCallback): Unit = js.native
  
  /**
    * Calls CreateSubscription.
    * @param request Subscription message or plain object
    * @returns Promise
    */
  def createSubscription(request: ISubscription): js.Promise[Subscription] = js.native
  /**
    * Calls CreateSubscription.
    * @param request Subscription message or plain object
    * @param callback Node-style callback called with the error, if any, and Subscription
    */
  def createSubscription(request: ISubscription, callback: CreateSubscriptionCallback): Unit = js.native
  
  /**
    * Calls DeleteSnapshot.
    * @param request DeleteSnapshotRequest message or plain object
    * @returns Promise
    */
  def deleteSnapshot(request: IDeleteSnapshotRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteSnapshot.
    * @param request DeleteSnapshotRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteSnapshot(request: IDeleteSnapshotRequest, callback: DeleteSnapshotCallback): Unit = js.native
  
  /**
    * Calls DeleteSubscription.
    * @param request DeleteSubscriptionRequest message or plain object
    * @returns Promise
    */
  def deleteSubscription(request: IDeleteSubscriptionRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteSubscription.
    * @param request DeleteSubscriptionRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteSubscription(request: IDeleteSubscriptionRequest, callback: DeleteSubscriptionCallback): Unit = js.native
  
  /**
    * Calls GetSnapshot.
    * @param request GetSnapshotRequest message or plain object
    * @returns Promise
    */
  def getSnapshot(request: IGetSnapshotRequest): js.Promise[Snapshot] = js.native
  /**
    * Calls GetSnapshot.
    * @param request GetSnapshotRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Snapshot
    */
  def getSnapshot(request: IGetSnapshotRequest, callback: GetSnapshotCallback): Unit = js.native
  
  /**
    * Calls GetSubscription.
    * @param request GetSubscriptionRequest message or plain object
    * @returns Promise
    */
  def getSubscription(request: IGetSubscriptionRequest): js.Promise[Subscription] = js.native
  /**
    * Calls GetSubscription.
    * @param request GetSubscriptionRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Subscription
    */
  def getSubscription(request: IGetSubscriptionRequest, callback: GetSubscriptionCallback): Unit = js.native
  
  /**
    * Calls ListSnapshots.
    * @param request ListSnapshotsRequest message or plain object
    * @returns Promise
    */
  def listSnapshots(request: IListSnapshotsRequest): js.Promise[ListSnapshotsResponse] = js.native
  /**
    * Calls ListSnapshots.
    * @param request ListSnapshotsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListSnapshotsResponse
    */
  def listSnapshots(request: IListSnapshotsRequest, callback: ListSnapshotsCallback): Unit = js.native
  
  /**
    * Calls ListSubscriptions.
    * @param request ListSubscriptionsRequest message or plain object
    * @returns Promise
    */
  def listSubscriptions(request: IListSubscriptionsRequest): js.Promise[ListSubscriptionsResponse] = js.native
  /**
    * Calls ListSubscriptions.
    * @param request ListSubscriptionsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListSubscriptionsResponse
    */
  def listSubscriptions(request: IListSubscriptionsRequest, callback: ListSubscriptionsCallback): Unit = js.native
  
  /**
    * Calls ModifyAckDeadline.
    * @param request ModifyAckDeadlineRequest message or plain object
    * @returns Promise
    */
  def modifyAckDeadline(request: IModifyAckDeadlineRequest): js.Promise[Empty] = js.native
  /**
    * Calls ModifyAckDeadline.
    * @param request ModifyAckDeadlineRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def modifyAckDeadline(request: IModifyAckDeadlineRequest, callback: ModifyAckDeadlineCallback): Unit = js.native
  
  /**
    * Calls ModifyPushConfig.
    * @param request ModifyPushConfigRequest message or plain object
    * @returns Promise
    */
  def modifyPushConfig(request: IModifyPushConfigRequest): js.Promise[Empty] = js.native
  /**
    * Calls ModifyPushConfig.
    * @param request ModifyPushConfigRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def modifyPushConfig(request: IModifyPushConfigRequest, callback: ModifyPushConfigCallback): Unit = js.native
  
  /**
    * Calls Pull.
    * @param request PullRequest message or plain object
    * @returns Promise
    */
  def pull(request: IPullRequest): js.Promise[PullResponse] = js.native
  /**
    * Calls Pull.
    * @param request PullRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and PullResponse
    */
  def pull(request: IPullRequest, callback: PullCallback): Unit = js.native
  
  /**
    * Calls Seek.
    * @param request SeekRequest message or plain object
    * @returns Promise
    */
  def seek(request: ISeekRequest): js.Promise[SeekResponse] = js.native
  /**
    * Calls Seek.
    * @param request SeekRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and SeekResponse
    */
  def seek(request: ISeekRequest, callback: SeekCallback): Unit = js.native
  
  /**
    * Calls StreamingPull.
    * @param request StreamingPullRequest message or plain object
    * @returns Promise
    */
  def streamingPull(request: IStreamingPullRequest): js.Promise[StreamingPullResponse] = js.native
  /**
    * Calls StreamingPull.
    * @param request StreamingPullRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and StreamingPullResponse
    */
  def streamingPull(request: IStreamingPullRequest, callback: StreamingPullCallback): Unit = js.native
  
  /**
    * Calls UpdateSnapshot.
    * @param request UpdateSnapshotRequest message or plain object
    * @returns Promise
    */
  def updateSnapshot(request: IUpdateSnapshotRequest): js.Promise[Snapshot] = js.native
  /**
    * Calls UpdateSnapshot.
    * @param request UpdateSnapshotRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Snapshot
    */
  def updateSnapshot(request: IUpdateSnapshotRequest, callback: UpdateSnapshotCallback): Unit = js.native
  
  /**
    * Calls UpdateSubscription.
    * @param request UpdateSubscriptionRequest message or plain object
    * @returns Promise
    */
  def updateSubscription(request: IUpdateSubscriptionRequest): js.Promise[Subscription] = js.native
  /**
    * Calls UpdateSubscription.
    * @param request UpdateSubscriptionRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Subscription
    */
  def updateSubscription(request: IUpdateSubscriptionRequest, callback: UpdateSubscriptionCallback): Unit = js.native
}
object Subscriber {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Subscriber")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new Subscriber service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): Subscriber = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[Subscriber]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Subscriber = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[Subscriber]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Subscriber = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Subscriber]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): Subscriber = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Subscriber]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#acknowledge}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type AcknowledgeCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#createSnapshot}.
    * @param error Error, if any
    * @param [response] Snapshot
    */
  type CreateSnapshotCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Snapshot], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#createSubscription}.
    * @param error Error, if any
    * @param [response] Subscription
    */
  type CreateSubscriptionCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Subscription], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#deleteSnapshot}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteSnapshotCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#deleteSubscription}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteSubscriptionCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#getSnapshot}.
    * @param error Error, if any
    * @param [response] Snapshot
    */
  type GetSnapshotCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Snapshot], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#getSubscription}.
    * @param error Error, if any
    * @param [response] Subscription
    */
  type GetSubscriptionCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Subscription], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#listSnapshots}.
    * @param error Error, if any
    * @param [response] ListSnapshotsResponse
    */
  type ListSnapshotsCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[ListSnapshotsResponse], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#listSubscriptions}.
    * @param error Error, if any
    * @param [response] ListSubscriptionsResponse
    */
  type ListSubscriptionsCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[ListSubscriptionsResponse], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#modifyAckDeadline}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type ModifyAckDeadlineCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#modifyPushConfig}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type ModifyPushConfigCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#pull}.
    * @param error Error, if any
    * @param [response] PullResponse
    */
  type PullCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[PullResponse], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#seek}.
    * @param error Error, if any
    * @param [response] SeekResponse
    */
  type SeekCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[SeekResponse], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#streamingPull}.
    * @param error Error, if any
    * @param [response] StreamingPullResponse
    */
  type StreamingPullCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[StreamingPullResponse], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#updateSnapshot}.
    * @param error Error, if any
    * @param [response] Snapshot
    */
  type UpdateSnapshotCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Snapshot], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Subscriber#updateSubscription}.
    * @param error Error, if any
    * @param [response] Subscription
    */
  type UpdateSubscriptionCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Subscription], Unit]
}
