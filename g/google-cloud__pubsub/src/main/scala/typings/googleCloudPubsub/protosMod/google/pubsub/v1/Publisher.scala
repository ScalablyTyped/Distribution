package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.Empty
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Publisher.CreateTopicCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Publisher.DeleteTopicCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Publisher.DetachSubscriptionCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Publisher.GetTopicCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Publisher.ListTopicSnapshotsCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Publisher.ListTopicSubscriptionsCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Publisher.ListTopicsCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Publisher.PublishCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Publisher.UpdateTopicCallback
import typings.googleGax.mod.protobuf.rpc.Service
import typings.protobufjs.mod.RPCImpl
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Publisher */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Publisher")
@js.native
class Publisher protected () extends Service {
  /**
    * Constructs a new Publisher service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls CreateTopic.
    * @param request Topic message or plain object
    * @returns Promise
    */
  def createTopic(request: ITopic): js.Promise[Topic] = js.native
  /**
    * Calls CreateTopic.
    * @param request Topic message or plain object
    * @param callback Node-style callback called with the error, if any, and Topic
    */
  def createTopic(request: ITopic, callback: CreateTopicCallback): Unit = js.native
  
  /**
    * Calls DeleteTopic.
    * @param request DeleteTopicRequest message or plain object
    * @returns Promise
    */
  def deleteTopic(request: IDeleteTopicRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteTopic.
    * @param request DeleteTopicRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteTopic(request: IDeleteTopicRequest, callback: DeleteTopicCallback): Unit = js.native
  
  /**
    * Calls DetachSubscription.
    * @param request DetachSubscriptionRequest message or plain object
    * @returns Promise
    */
  def detachSubscription(request: IDetachSubscriptionRequest): js.Promise[DetachSubscriptionResponse] = js.native
  /**
    * Calls DetachSubscription.
    * @param request DetachSubscriptionRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and DetachSubscriptionResponse
    */
  def detachSubscription(request: IDetachSubscriptionRequest, callback: DetachSubscriptionCallback): Unit = js.native
  
  /**
    * Calls GetTopic.
    * @param request GetTopicRequest message or plain object
    * @returns Promise
    */
  def getTopic(request: IGetTopicRequest): js.Promise[Topic] = js.native
  /**
    * Calls GetTopic.
    * @param request GetTopicRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Topic
    */
  def getTopic(request: IGetTopicRequest, callback: GetTopicCallback): Unit = js.native
  
  /**
    * Calls ListTopicSnapshots.
    * @param request ListTopicSnapshotsRequest message or plain object
    * @returns Promise
    */
  def listTopicSnapshots(request: IListTopicSnapshotsRequest): js.Promise[ListTopicSnapshotsResponse] = js.native
  /**
    * Calls ListTopicSnapshots.
    * @param request ListTopicSnapshotsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListTopicSnapshotsResponse
    */
  def listTopicSnapshots(request: IListTopicSnapshotsRequest, callback: ListTopicSnapshotsCallback): Unit = js.native
  
  /**
    * Calls ListTopicSubscriptions.
    * @param request ListTopicSubscriptionsRequest message or plain object
    * @returns Promise
    */
  def listTopicSubscriptions(request: IListTopicSubscriptionsRequest): js.Promise[ListTopicSubscriptionsResponse] = js.native
  /**
    * Calls ListTopicSubscriptions.
    * @param request ListTopicSubscriptionsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListTopicSubscriptionsResponse
    */
  def listTopicSubscriptions(request: IListTopicSubscriptionsRequest, callback: ListTopicSubscriptionsCallback): Unit = js.native
  
  /**
    * Calls ListTopics.
    * @param request ListTopicsRequest message or plain object
    * @returns Promise
    */
  def listTopics(request: IListTopicsRequest): js.Promise[ListTopicsResponse] = js.native
  /**
    * Calls ListTopics.
    * @param request ListTopicsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListTopicsResponse
    */
  def listTopics(request: IListTopicsRequest, callback: ListTopicsCallback): Unit = js.native
  
  /**
    * Calls Publish.
    * @param request PublishRequest message or plain object
    * @returns Promise
    */
  def publish(request: IPublishRequest): js.Promise[PublishResponse] = js.native
  /**
    * Calls Publish.
    * @param request PublishRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and PublishResponse
    */
  def publish(request: IPublishRequest, callback: PublishCallback): Unit = js.native
  
  /**
    * Calls UpdateTopic.
    * @param request UpdateTopicRequest message or plain object
    * @returns Promise
    */
  def updateTopic(request: IUpdateTopicRequest): js.Promise[Topic] = js.native
  /**
    * Calls UpdateTopic.
    * @param request UpdateTopicRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Topic
    */
  def updateTopic(request: IUpdateTopicRequest, callback: UpdateTopicCallback): Unit = js.native
}
object Publisher {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Publisher")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new Publisher service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): Publisher = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[Publisher]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Publisher = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[Publisher]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Publisher = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Publisher]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): Publisher = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Publisher]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Publisher#createTopic}.
    * @param error Error, if any
    * @param [response] Topic
    */
  type CreateTopicCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Topic], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Publisher#deleteTopic}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteTopicCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Publisher#detachSubscription}.
    * @param error Error, if any
    * @param [response] DetachSubscriptionResponse
    */
  type DetachSubscriptionCallback = js.Function2[
    /* error */ Error | Null, 
    /* response */ js.UndefOr[DetachSubscriptionResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Publisher#getTopic}.
    * @param error Error, if any
    * @param [response] Topic
    */
  type GetTopicCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Topic], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Publisher#listTopicSnapshots}.
    * @param error Error, if any
    * @param [response] ListTopicSnapshotsResponse
    */
  type ListTopicSnapshotsCallback = js.Function2[
    /* error */ Error | Null, 
    /* response */ js.UndefOr[ListTopicSnapshotsResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Publisher#listTopicSubscriptions}.
    * @param error Error, if any
    * @param [response] ListTopicSubscriptionsResponse
    */
  type ListTopicSubscriptionsCallback = js.Function2[
    /* error */ Error | Null, 
    /* response */ js.UndefOr[ListTopicSubscriptionsResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Publisher#listTopics}.
    * @param error Error, if any
    * @param [response] ListTopicsResponse
    */
  type ListTopicsCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[ListTopicsResponse], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Publisher#publish}.
    * @param error Error, if any
    * @param [response] PublishResponse
    */
  type PublishCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[PublishResponse], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.Publisher#updateTopic}.
    * @param error Error, if any
    * @param [response] Topic
    */
  type UpdateTopicCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Topic], Unit]
}
