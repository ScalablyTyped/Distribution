package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IFileOptions
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileOptions. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions")
@js.native
/**
  * Constructs a new FileOptions.
  * @param [properties] Properties to set
  */
class FileOptions ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions {
  def this(properties: IFileOptions) = this()
}
object FileOptions {
  
  /** OptimizeMode enum. */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.OptimizeMode")
  @js.native
  object OptimizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode with Double
      ] = js.native
    
    /* 2 */ val CODE_SIZE: typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode.CODE_SIZE with Double = js.native
    
    /* 3 */ val LITE_RUNTIME: typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode.LITE_RUNTIME with Double = js.native
    
    /* 1 */ val SPEED: typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions.OptimizeMode.SPEED with Double = js.native
  }
  
  /**
    * Creates a new FileOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileOptions instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.create")
  @js.native
  def create(properties: IFileOptions): typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  
  /**
    * Decodes a FileOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  
  /**
    * Decodes a FileOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  
  /**
    * Encodes the specified FileOptions message. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.encode")
  @js.native
  def encode(message: IFileOptions): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.encode")
  @js.native
  def encode(message: IFileOptions, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FileOptions message, length delimited. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileOptions): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFileOptions, writer: Writer): Writer = js.native
  
  /**
    * Creates a FileOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileOptions
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions = js.native
  
  /**
    * Creates a plain object from a FileOptions message. Also converts values to other types if specified.
    * @param message FileOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.FileOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FileOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.FileOptions.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
