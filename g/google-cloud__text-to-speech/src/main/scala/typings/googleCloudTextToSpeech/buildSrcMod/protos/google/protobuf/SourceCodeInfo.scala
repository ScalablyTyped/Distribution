package typings.googleCloudTextToSpeech.buildSrcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.ISourceCodeInfo
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo.ILocation
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourceCodeInfo. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.SourceCodeInfo")
@js.native
/**
  * Constructs a new SourceCodeInfo.
  * @param [properties] Properties to set
  */
open class SourceCodeInfo ()
  extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo {
  def this(properties: ISourceCodeInfo) = this()
}
object SourceCodeInfo {
  
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.SourceCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Location. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.SourceCodeInfo.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  open class Location ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo.Location {
    def this(properties: ILocation) = this()
  }
  object Location {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.SourceCodeInfo.Location")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    /* static member */
    inline def create(): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.std.Location]
    inline def create(properties: ILocation): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.std.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.std.Location]
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    inline def decode(reader: Reader, length: Double): typings.std.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.std.Location]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    
    /**
      * Encodes the specified Location message. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    
    /**
      * Gets the default type url for Location
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.std.Location): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: typings.std.Location, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new SourceCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourceCodeInfo instance
    */
  /* static member */
  inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo]
  inline def create(properties: ISourceCodeInfo): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo]
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo]
  inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo]
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo]
  
  /**
    * Encodes the specified SourceCodeInfo message. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISourceCodeInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISourceCodeInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SourceCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISourceCodeInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISourceCodeInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SourceCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourceCodeInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo]
  
  /**
    * Gets the default type url for SourceCodeInfo
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a SourceCodeInfo message. Also converts values to other types if specified.
    * @param message SourceCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.SourceCodeInfo,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a SourceCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
