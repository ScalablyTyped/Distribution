package typings.googleGax.mod.IamProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.ISourceCodeInfo
import typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo.ILocation
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourceCodeInfo. */
@JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo")
@js.native
/**
  * Constructs a new SourceCodeInfo.
  * @param [properties] Properties to set
  */
class SourceCodeInfo ()
  extends typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo {
  def this(properties: ISourceCodeInfo) = this()
}
object SourceCodeInfo {
  
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Location. */
  @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  class Location ()
    extends typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo.Location {
    def this(properties: ILocation) = this()
  }
  object Location {
    
    @JSImport("google-gax", "IamProtos.google.protobuf.SourceCodeInfo.Location")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    /* static member */
    @scala.inline
    def create(): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.std.Location]
    @scala.inline
    def create(properties: ILocation): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.std.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.std.Location]
    @scala.inline
    def decode(reader: Uint8Array): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.std.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.std.Location]
    
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    
    /**
      * Encodes the specified Location message. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.std.Location): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: typings.std.Location, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new SourceCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourceCodeInfo instance
    */
  /* static member */
  @scala.inline
  def create(): typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo]
  @scala.inline
  def create(properties: ISourceCodeInfo): typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo]
  
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo]
  @scala.inline
  def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo]
  
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo]
  
  /**
    * Encodes the specified SourceCodeInfo message. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ISourceCodeInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ISourceCodeInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SourceCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ISourceCodeInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ISourceCodeInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SourceCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourceCodeInfo
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo]
  
  /**
    * Creates a plain object from a SourceCodeInfo message. Also converts values to other types if specified.
    * @param message SourceCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SourceCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
