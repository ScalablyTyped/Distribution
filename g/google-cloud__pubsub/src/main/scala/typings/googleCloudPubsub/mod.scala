package typings.googleCloudPubsub

import typings.googleCloudPubsub.buildSrcPublisherMod.PublishOptions
import typings.googleCloudPubsub.buildSrcPublisherPubsubMessageMod.Attributes
import typings.googleCloudPubsub.buildSrcPubsubMod.ClientConfig
import typings.googleCloudPubsub.buildSrcSchemaMod.SchemaMessageMetadata
import typings.googleCloudPubsub.buildSrcSubscriberMod.AckResponse
import typings.googleCloudPubsub.buildSrcSubscriberMod.Subscriber
import typings.googleCloudPubsub.buildSrcSubscriptionMod.SubscriptionMetadata
import typings.googleCloudPubsub.buildSrcSubscriptionMod.SubscriptionOptions
import typings.googleCloudPubsub.buildSrcTemporalMod.DurationLike
import typings.googleCloudPubsub.googleCloudPubsubStrings.AVRO
import typings.googleCloudPubsub.googleCloudPubsubStrings.BASIC
import typings.googleCloudPubsub.googleCloudPubsubStrings.BINARY
import typings.googleCloudPubsub.googleCloudPubsubStrings.FAILED_PRECONDITION
import typings.googleCloudPubsub.googleCloudPubsubStrings.FULL
import typings.googleCloudPubsub.googleCloudPubsubStrings.INVALID
import typings.googleCloudPubsub.googleCloudPubsubStrings.JSON
import typings.googleCloudPubsub.googleCloudPubsubStrings.OTHER
import typings.googleCloudPubsub.googleCloudPubsubStrings.PERMISSION_DENIED
import typings.googleCloudPubsub.googleCloudPubsubStrings.PROTOCOL_BUFFER
import typings.googleCloudPubsub.googleCloudPubsubStrings.SUCCESS
import typings.grpcGrpcJs.buildSrcCallMod.ServiceError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@google-cloud/pubsub", "AckError")
  @js.native
  open class AckError protected ()
    extends typings.googleCloudPubsub.buildSrcSubscriptionMod.AckError {
    def this(errorCode: AckResponse) = this()
    def this(errorCode: AckResponse, message: String) = this()
  }
  
  object AckResponses {
    
    @JSImport("@google-cloud/pubsub", "AckResponses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub", "AckResponses.FailedPrecondition")
    @js.native
    def FailedPrecondition: FAILED_PRECONDITION = js.native
    inline def FailedPrecondition_=(x: FAILED_PRECONDITION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FailedPrecondition")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "AckResponses.Invalid")
    @js.native
    def Invalid: INVALID = js.native
    inline def Invalid_=(x: INVALID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "AckResponses.Other")
    @js.native
    def Other: OTHER = js.native
    inline def Other_=(x: OTHER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Other")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "AckResponses.PermissionDenied")
    @js.native
    def PermissionDenied: PERMISSION_DENIED = js.native
    inline def PermissionDenied_=(x: PERMISSION_DENIED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PermissionDenied")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "AckResponses.Success")
    @js.native
    def Success: SUCCESS = js.native
    inline def Success_=(x: SUCCESS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/pubsub", "DebugMessage")
  @js.native
  open class DebugMessage protected ()
    extends typings.googleCloudPubsub.buildSrcDebugMod.DebugMessage {
    def this(message: String) = this()
    def this(message: String, error: js.Error) = this()
  }
  
  @JSImport("@google-cloud/pubsub", "Duration")
  @js.native
  /* private */ open class Duration ()
    extends typings.googleCloudPubsub.buildSrcTemporalMod.Duration
  /* static members */
  object Duration {
    
    @JSImport("@google-cloud/pubsub", "Duration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Duration from a DurationLike, which is an object
      * containing zero or more of the following: hours, seconds,
      * minutes, millis.
      */
    inline def from(durationLike: DurationLike): typings.googleCloudPubsub.buildSrcTemporalMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(durationLike.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.buildSrcTemporalMod.Duration]
    
    @JSImport("@google-cloud/pubsub", "Duration.hourInMillis")
    @js.native
    def hourInMillis: Any = js.native
    inline def hourInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourInMillis")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "Duration.minuteInMillis")
    @js.native
    def minuteInMillis: Any = js.native
    inline def minuteInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteInMillis")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "Duration.secondInMillis")
    @js.native
    def secondInMillis: Any = js.native
    inline def secondInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondInMillis")(x.asInstanceOf[js.Any])
  }
  
  object Encodings {
    
    @JSImport("@google-cloud/pubsub", "Encodings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub", "Encodings.Binary")
    @js.native
    def Binary: BINARY = js.native
    inline def Binary_=(x: BINARY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "Encodings.Json")
    @js.native
    def Json: JSON = js.native
    inline def Json_=(x: JSON): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Json")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/pubsub", "IAM")
  @js.native
  open class IAM protected ()
    extends typings.googleCloudPubsub.buildSrcIamMod.IAM {
    def this(pubsub: typings.googleCloudPubsub.buildSrcPubsubMod.PubSub, id: String) = this()
  }
  
  @JSImport("@google-cloud/pubsub", "Message")
  @js.native
  open class Message protected ()
    extends typings.googleCloudPubsub.buildSrcSubscriberMod.Message {
    /**
      * @hideconstructor
      *
      * @param {Subscriber} sub The parent subscriber.
      * @param {object} message The raw message response.
      */
    def this(
      sub: Subscriber,
      param1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.IReceivedMessage */ Any
    ) = this()
  }
  
  @JSImport("@google-cloud/pubsub", "PubSub")
  @js.native
  open class PubSub ()
    extends typings.googleCloudPubsub.buildSrcPubsubMod.PubSub {
    def this(options: ClientConfig) = this()
  }
  /* static members */
  object PubSub {
    
    @JSImport("@google-cloud/pubsub", "PubSub")
    @js.native
    val ^ : js.Any = js.native
    
    /*!
      * Format the name of a project. A project's full name is in the
      * format of projects/{projectId}.
      *
      * The GAPIC client should do this for us, but since we maintain
      * names rather than IDs, this is simpler.
      *
      * @private
      */
    inline def formatName_(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("@google-cloud/pubsub", "PublishError")
  @js.native
  open class PublishError protected ()
    extends typings.googleCloudPubsub.buildSrcPublisherPublishErrorMod.PublishError {
    def this(key: String, err: ServiceError) = this()
  }
  
  @JSImport("@google-cloud/pubsub", "Schema")
  @js.native
  open class Schema protected ()
    extends typings.googleCloudPubsub.buildSrcSchemaMod.Schema {
    def this(pubsub: typings.googleCloudPubsub.buildSrcPubsubMod.PubSub, idOrName: String) = this()
  }
  /* static members */
  object Schema {
    
    @JSImport("@google-cloud/pubsub", "Schema")
    @js.native
    val ^ : js.Any = js.native
    
    /*!
      * Format the name of a schema. A schema's full name is in the
      * format of projects/{projectId}/schemas/{schemaName}.
      *
      * The GAPIC client should do this for us, but since we maintain
      * names rather than IDs, this is simpler.
      *
      * @private
      */
    inline def formatName_(projectId: String, nameOrId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], nameOrId.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Translates the schema attributes in messages delivered from Pub/Sub.
      * All resulting fields may end up being blank.
      */
    inline def metadataFromMessage(attributes: Attributes): SchemaMessageMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("metadataFromMessage")(attributes.asInstanceOf[js.Any]).asInstanceOf[SchemaMessageMetadata]
  }
  
  object SchemaTypes {
    
    @JSImport("@google-cloud/pubsub", "SchemaTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub", "SchemaTypes.Avro")
    @js.native
    def Avro: AVRO = js.native
    inline def Avro_=(x: AVRO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Avro")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "SchemaTypes.ProtocolBuffer")
    @js.native
    def ProtocolBuffer: PROTOCOL_BUFFER = js.native
    inline def ProtocolBuffer_=(x: PROTOCOL_BUFFER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProtocolBuffer")(x.asInstanceOf[js.Any])
  }
  
  object SchemaViews {
    
    @JSImport("@google-cloud/pubsub", "SchemaViews")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub", "SchemaViews.Basic")
    @js.native
    def Basic: BASIC = js.native
    inline def Basic_=(x: BASIC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Basic")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "SchemaViews.Full")
    @js.native
    def Full: FULL = js.native
    inline def Full_=(x: FULL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Full")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/pubsub", "Snapshot")
  @js.native
  open class Snapshot protected ()
    extends typings.googleCloudPubsub.buildSrcSnapshotMod.Snapshot {
    def this(parent: typings.googleCloudPubsub.buildSrcPubsubMod.PubSub, name: String) = this()
    def this(parent: typings.googleCloudPubsub.buildSrcSubscriptionMod.Subscription, name: String) = this()
  }
  /* static members */
  object Snapshot {
    
    @JSImport("@google-cloud/pubsub", "Snapshot")
    @js.native
    val ^ : js.Any = js.native
    
    inline def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@google-cloud/pubsub", "Subscription")
  @js.native
  open class Subscription protected ()
    extends typings.googleCloudPubsub.buildSrcSubscriptionMod.Subscription {
    def this(pubsub: typings.googleCloudPubsub.buildSrcPubsubMod.PubSub, name: String) = this()
    def this(
      pubsub: typings.googleCloudPubsub.buildSrcPubsubMod.PubSub,
      name: String,
      options: SubscriptionOptions
    ) = this()
  }
  /* static members */
  object Subscription {
    
    @JSImport("@google-cloud/pubsub", "Subscription")
    @js.native
    val ^ : js.Any = js.native
    
    /*!
      * Formats Subscription metadata.
      *
      * @private
      */
    inline def formatMetadata_(metadata: SubscriptionMetadata): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMetadata_")(metadata.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /*!
      * Format the name of a subscription. A subscription's full name is in the
      * format of projects/{projectId}/subscriptions/{subName}.
      *
      * @private
      */
    inline def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@google-cloud/pubsub", "Topic")
  @js.native
  open class Topic protected ()
    extends typings.googleCloudPubsub.buildSrcTopicMod.Topic {
    def this(pubsub: typings.googleCloudPubsub.buildSrcPubsubMod.PubSub, name: String) = this()
    def this(pubsub: typings.googleCloudPubsub.buildSrcPubsubMod.PubSub, name: String, options: PublishOptions) = this()
  }
  /* static members */
  object Topic {
    
    @JSImport("@google-cloud/pubsub", "Topic")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Format the name of a topic. A Topic's full name is in the format of
      * 'projects/{projectId}/topics/{topicName}'.
      *
      * @private
      *
      * @return {string}
      */
    inline def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
