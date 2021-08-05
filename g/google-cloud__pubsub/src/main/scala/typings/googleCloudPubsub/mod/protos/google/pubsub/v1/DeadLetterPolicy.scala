package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDeadLetterPolicy
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeadLetterPolicy. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy")
@js.native
/**
  * Constructs a new DeadLetterPolicy.
  * @param [properties] Properties to set
  */
class DeadLetterPolicy ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy {
  def this(properties: IDeadLetterPolicy) = this()
}
object DeadLetterPolicy {
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeadLetterPolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeadLetterPolicy instance
    */
  /* static member */
  inline def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy]
  inline def create(properties: IDeadLetterPolicy): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy]
  
  /**
    * Decodes a DeadLetterPolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeadLetterPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy]
  inline def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy]
  inline def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy]
  inline def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy]
  
  /**
    * Decodes a DeadLetterPolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeadLetterPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy]
  inline def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy]
  
  /**
    * Encodes the specified DeadLetterPolicy message. Does not implicitly {@link google.pubsub.v1.DeadLetterPolicy.verify|verify} messages.
    * @param message DeadLetterPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDeadLetterPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDeadLetterPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DeadLetterPolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.DeadLetterPolicy.verify|verify} messages.
    * @param message DeadLetterPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDeadLetterPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDeadLetterPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DeadLetterPolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeadLetterPolicy
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy]
  
  /**
    * Creates a plain object from a DeadLetterPolicy message. Also converts values to other types if specified.
    * @param message DeadLetterPolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a DeadLetterPolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
