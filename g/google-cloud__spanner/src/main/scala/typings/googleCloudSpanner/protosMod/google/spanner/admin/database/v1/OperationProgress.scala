package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OperationProgress. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.OperationProgress")
@js.native
/**
  * Constructs a new OperationProgress.
  * @param [properties] Properties to set
  */
open class OperationProgress ()
  extends StObject
     with IOperationProgress {
  def this(properties: IOperationProgress) = this()
  
  /** OperationProgress progressPercent. */
  @JSName("progressPercent")
  var progressPercent_OperationProgress: Double = js.native
  
  /**
    * Converts this OperationProgress to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object OperationProgress {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.OperationProgress")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new OperationProgress instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OperationProgress instance
    */
  /* static member */
  inline def create(): OperationProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[OperationProgress]
  inline def create(properties: IOperationProgress): OperationProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[OperationProgress]
  
  inline def decode(reader: js.typedarray.Uint8Array): OperationProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OperationProgress]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): OperationProgress = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OperationProgress]
  /**
    * Decodes an OperationProgress message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OperationProgress
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): OperationProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OperationProgress]
  inline def decode(reader: Reader, length: Double): OperationProgress = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OperationProgress]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): OperationProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OperationProgress]
  /**
    * Decodes an OperationProgress message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OperationProgress
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): OperationProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OperationProgress]
  
  /**
    * Encodes the specified OperationProgress message. Does not implicitly {@link google.spanner.admin.database.v1.OperationProgress.verify|verify} messages.
    * @param message OperationProgress message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IOperationProgress): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IOperationProgress, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified OperationProgress message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.OperationProgress.verify|verify} messages.
    * @param message OperationProgress message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IOperationProgress): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IOperationProgress, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an OperationProgress message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OperationProgress
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): OperationProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OperationProgress]
  
  /**
    * Gets the default type url for OperationProgress
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an OperationProgress message. Also converts values to other types if specified.
    * @param message OperationProgress
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: OperationProgress): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: OperationProgress, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an OperationProgress message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
