package typings.dialogflow.protosProtosMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OperationInfo. */
@JSImport("dialogflow/protos/protos", "google.longrunning.OperationInfo")
@js.native
/**
  * Constructs a new OperationInfo.
  * @param [properties] Properties to set
  */
open class OperationInfo ()
  extends StObject
     with IOperationInfo {
  def this(properties: IOperationInfo) = this()
  
  /** OperationInfo metadataType. */
  @JSName("metadataType")
  var metadataType_OperationInfo: String = js.native
  
  /** OperationInfo responseType. */
  @JSName("responseType")
  var responseType_OperationInfo: String = js.native
  
  /**
    * Converts this OperationInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object OperationInfo {
  
  @JSImport("dialogflow/protos/protos", "google.longrunning.OperationInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new OperationInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OperationInfo instance
    */
  /* static member */
  inline def create(): OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[OperationInfo]
  inline def create(properties: IOperationInfo): OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[OperationInfo]
  
  inline def decode(reader: js.typedarray.Uint8Array): OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OperationInfo]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): OperationInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OperationInfo]
  /**
    * Decodes an OperationInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OperationInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OperationInfo]
  inline def decode(reader: Reader, length: Double): OperationInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OperationInfo]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OperationInfo]
  /**
    * Decodes an OperationInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OperationInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OperationInfo]
  
  /**
    * Encodes the specified OperationInfo message. Does not implicitly {@link google.longrunning.OperationInfo.verify|verify} messages.
    * @param message OperationInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IOperationInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IOperationInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified OperationInfo message, length delimited. Does not implicitly {@link google.longrunning.OperationInfo.verify|verify} messages.
    * @param message OperationInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IOperationInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IOperationInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an OperationInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OperationInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OperationInfo]
  
  /**
    * Creates a plain object from an OperationInfo message. Also converts values to other types if specified.
    * @param message OperationInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: OperationInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: OperationInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an OperationInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
