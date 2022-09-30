package typings.googleCloudTextToSpeech.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions.IdempotencyLevel
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MethodOptions. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodOptions")
@js.native
/**
  * Constructs a new MethodOptions.
  * @param [properties] Properties to set
  */
open class MethodOptions ()
  extends StObject
     with IMethodOptions {
  def this(properties: IMethodOptions) = this()
  
  /** MethodOptions deprecated. */
  @JSName("deprecated")
  var deprecated_MethodOptions: Boolean = js.native
  
  /** MethodOptions idempotencyLevel. */
  @JSName("idempotencyLevel")
  var idempotencyLevel_MethodOptions: IdempotencyLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.MethodOptions.IdempotencyLevel * / any */ String) = js.native
  
  /**
    * Converts this MethodOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** MethodOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_MethodOptions: js.Array[IUninterpretedOption] = js.native
}
object MethodOptions {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait IdempotencyLevel extends StObject
  /** IdempotencyLevel enum. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.MethodOptions.IdempotencyLevel")
  @js.native
  object IdempotencyLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IdempotencyLevel & Double] = js.native
    
    @js.native
    sealed trait IDEMPOTENCY_UNKNOWN
      extends StObject
         with IdempotencyLevel
    /* 0 */ val IDEMPOTENCY_UNKNOWN: typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN & Double = js.native
    
    @js.native
    sealed trait IDEMPOTENT
      extends StObject
         with IdempotencyLevel
    /* 2 */ val IDEMPOTENT: typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions.IdempotencyLevel.IDEMPOTENT & Double = js.native
    
    @js.native
    sealed trait NO_SIDE_EFFECTS
      extends StObject
         with IdempotencyLevel
    /* 1 */ val NO_SIDE_EFFECTS: typings.googleCloudTextToSpeech.mod.google.protobuf.MethodOptions.IdempotencyLevel.NO_SIDE_EFFECTS & Double = js.native
  }
  
  /**
    * Creates a new MethodOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MethodOptions instance
    */
  /* static member */
  inline def create(): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MethodOptions]
  inline def create(properties: IMethodOptions): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[MethodOptions]
  
  inline def decode(reader: js.typedarray.Uint8Array): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodOptions]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): MethodOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MethodOptions]
  /**
    * Decodes a MethodOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodOptions]
  inline def decode(reader: Reader, length: Double): MethodOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MethodOptions]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodOptions]
  /**
    * Decodes a MethodOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodOptions]
  
  /**
    * Encodes the specified MethodOptions message. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
    * @param message MethodOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IMethodOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IMethodOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified MethodOptions message, length delimited. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
    * @param message MethodOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IMethodOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IMethodOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a MethodOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MethodOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[MethodOptions]
  
  /**
    * Gets the default type url for MethodOptions
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a MethodOptions message. Also converts values to other types if specified.
    * @param message MethodOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: MethodOptions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: MethodOptions, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a MethodOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
