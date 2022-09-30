package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription.State
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Subscription. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Subscription")
@js.native
/**
  * Constructs a new Subscription.
  * @param [properties] Properties to set
  */
open class Subscription ()
  extends StObject
     with ISubscription {
  def this(properties: ISubscription) = this()
  
  /** Subscription ackDeadlineSeconds. */
  @JSName("ackDeadlineSeconds")
  var ackDeadlineSeconds_Subscription: Double = js.native
  
  /** Subscription detached. */
  @JSName("detached")
  var detached_Subscription: Boolean = js.native
  
  /** Subscription enableExactlyOnceDelivery. */
  @JSName("enableExactlyOnceDelivery")
  var enableExactlyOnceDelivery_Subscription: Boolean = js.native
  
  /** Subscription enableMessageOrdering. */
  @JSName("enableMessageOrdering")
  var enableMessageOrdering_Subscription: Boolean = js.native
  
  /** Subscription filter. */
  @JSName("filter")
  var filter_Subscription: String = js.native
  
  /** Subscription labels. */
  @JSName("labels")
  var labels_Subscription: StringDictionary[String] = js.native
  
  /** Subscription name. */
  @JSName("name")
  var name_Subscription: String = js.native
  
  /** Subscription retainAckedMessages. */
  @JSName("retainAckedMessages")
  var retainAckedMessages_Subscription: Boolean = js.native
  
  /** Subscription state. */
  @JSName("state")
  var state_Subscription: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Subscription.State * / any */ String) = js.native
  
  /**
    * Converts this Subscription to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Subscription topic. */
  @JSName("topic")
  var topic_Subscription: String = js.native
}
object Subscription {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Subscription")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait State extends StObject
  /** State enum. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Subscription.State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State & Double] = js.native
    
    @js.native
    sealed trait ACTIVE
      extends StObject
         with State
    /* 1 */ val ACTIVE: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription.State.ACTIVE & Double = js.native
    
    @js.native
    sealed trait RESOURCE_ERROR
      extends StObject
         with State
    /* 2 */ val RESOURCE_ERROR: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription.State.RESOURCE_ERROR & Double = js.native
    
    @js.native
    sealed trait STATE_UNSPECIFIED
      extends StObject
         with State
    /* 0 */ val STATE_UNSPECIFIED: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription.State.STATE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new Subscription instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Subscription instance
    */
  /* static member */
  inline def create(): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Subscription]
  inline def create(properties: ISubscription): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Subscription]
  
  inline def decode(reader: js.typedarray.Uint8Array): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Subscription]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  /**
    * Decodes a Subscription message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Subscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Subscription]
  inline def decode(reader: Reader, length: Double): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Subscription]
  /**
    * Decodes a Subscription message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Subscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Subscription]
  
  /**
    * Encodes the specified Subscription message. Does not implicitly {@link google.pubsub.v1.Subscription.verify|verify} messages.
    * @param message Subscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISubscription): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISubscription, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Subscription message, length delimited. Does not implicitly {@link google.pubsub.v1.Subscription.verify|verify} messages.
    * @param message Subscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISubscription): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISubscription, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Subscription message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Subscription
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Subscription]
  
  /**
    * Gets the default type url for Subscription
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a Subscription message. Also converts values to other types if specified.
    * @param message Subscription
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Subscription): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Subscription, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Subscription message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
