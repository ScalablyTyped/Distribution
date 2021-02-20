package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.ISourceCodeInfo
import typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo.ILocation
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourceCodeInfo. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo")
@js.native
/**
  * Constructs a new SourceCodeInfo.
  * @param [properties] Properties to set
  */
class SourceCodeInfo ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo {
  def this(properties: ISourceCodeInfo) = this()
}
object SourceCodeInfo {
  
  /** Represents a Location. */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  class Location ()
    extends typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo.Location {
    def this(properties: ILocation) = this()
  }
  object Location {
    
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.create")
    @js.native
    def create(): typings.std.Location = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.create")
    @js.native
    def create(properties: ILocation): typings.std.Location = js.native
    
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: Reader): typings.std.Location = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.std.Location = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: Uint8Array): typings.std.Location = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.std.Location = js.native
    
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.std.Location = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.std.Location = js.native
    
    /**
      * Encodes the specified Location message. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.encode")
    @js.native
    def encode(message: ILocation): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.encode")
    @js.native
    def encode(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation): Writer = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.std.Location = js.native
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.toObject")
    @js.native
    def toObject(message: typings.std.Location): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.toObject")
    @js.native
    def toObject(message: typings.std.Location, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.Location.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new SourceCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourceCodeInfo instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.create")
  @js.native
  def create(properties: ISourceCodeInfo): typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo = js.native
  
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo = js.native
  
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo = js.native
  
  /**
    * Encodes the specified SourceCodeInfo message. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.encode")
  @js.native
  def encode(message: ISourceCodeInfo): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.encode")
  @js.native
  def encode(message: ISourceCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SourceCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourceCodeInfo): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourceCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Creates a SourceCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourceCodeInfo
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo = js.native
  
  /**
    * Creates a plain object from a SourceCodeInfo message. Also converts values to other types if specified.
    * @param message SourceCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SourceCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.protobuf.SourceCodeInfo.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
