package typings.googleCloudTextToSpeech.buildSrcMod.protos.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.IStatus
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace rpc. */
object rpc {
  
  /** Represents a Status. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.rpc.Status")
  @js.native
  /**
    * Constructs a new Status.
    * @param [properties] Properties to set
    */
  open class Status ()
    extends typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status {
    def this(properties: IStatus) = this()
  }
  object Status {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.rpc.Status")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Status instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Status instance
      */
    /* static member */
    inline def create(): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status]
    inline def create(properties: IStatus): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status]
    /**
      * Decodes a Status message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Status
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status]
    inline def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status]
    /**
      * Decodes a Status message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Status
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status]
    
    /**
      * Encodes the specified Status message. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
      * @param message Status message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IStatus): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IStatus, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Status message, length delimited. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
      * @param message Status message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IStatus): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IStatus, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Status message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Status
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status]
    
    /**
      * Gets the default type url for Status
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a Status message. Also converts values to other types if specified.
      * @param message Status
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.rpc.Status,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Status message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
}
