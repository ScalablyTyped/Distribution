package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MethodDescriptorProto. */
@JSImport("dialogflow/protos/protos", "google.protobuf.MethodDescriptorProto")
@js.native
/**
  * Constructs a new MethodDescriptorProto.
  * @param [properties] Properties to set
  */
class MethodDescriptorProto ()
  extends StObject
     with IMethodDescriptorProto {
  def this(properties: IMethodDescriptorProto) = this()
  
  /** MethodDescriptorProto clientStreaming. */
  @JSName("clientStreaming")
  var clientStreaming_MethodDescriptorProto: Boolean = js.native
  
  /** MethodDescriptorProto inputType. */
  @JSName("inputType")
  var inputType_MethodDescriptorProto: String = js.native
  
  /** MethodDescriptorProto name. */
  @JSName("name")
  var name_MethodDescriptorProto: String = js.native
  
  /** MethodDescriptorProto outputType. */
  @JSName("outputType")
  var outputType_MethodDescriptorProto: String = js.native
  
  /** MethodDescriptorProto serverStreaming. */
  @JSName("serverStreaming")
  var serverStreaming_MethodDescriptorProto: Boolean = js.native
  
  /**
    * Converts this MethodDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object MethodDescriptorProto {
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.MethodDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new MethodDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MethodDescriptorProto instance
    */
  /* static member */
  inline def create(): MethodDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MethodDescriptorProto]
  inline def create(properties: IMethodDescriptorProto): MethodDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[MethodDescriptorProto]
  
  /**
    * Decodes a MethodDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MethodDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): MethodDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodDescriptorProto]
  inline def decode(reader: Reader, length: Double): MethodDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MethodDescriptorProto]
  inline def decode(reader: Uint8Array): MethodDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodDescriptorProto]
  inline def decode(reader: Uint8Array, length: Double): MethodDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MethodDescriptorProto]
  
  /**
    * Decodes a MethodDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MethodDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): MethodDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodDescriptorProto]
  inline def decodeDelimited(reader: Uint8Array): MethodDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodDescriptorProto]
  
  /**
    * Encodes the specified MethodDescriptorProto message. Does not implicitly {@link google.protobuf.MethodDescriptorProto.verify|verify} messages.
    * @param message MethodDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IMethodDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IMethodDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified MethodDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.MethodDescriptorProto.verify|verify} messages.
    * @param message MethodDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IMethodDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IMethodDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a MethodDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MethodDescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): MethodDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[MethodDescriptorProto]
  
  /**
    * Creates a plain object from a MethodDescriptorProto message. Also converts values to other types if specified.
    * @param message MethodDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: MethodDescriptorProto): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: MethodDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a MethodDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
