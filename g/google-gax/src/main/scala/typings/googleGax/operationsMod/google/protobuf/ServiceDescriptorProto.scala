package typings.googleGax.operationsMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ServiceDescriptorProto. */
@JSImport("google-gax/build/protos/operations", "google.protobuf.ServiceDescriptorProto")
@js.native
/**
  * Constructs a new ServiceDescriptorProto.
  * @param [properties] Properties to set
  */
class ServiceDescriptorProto ()
  extends StObject
     with IServiceDescriptorProto {
  def this(properties: IServiceDescriptorProto) = this()
  
  /** ServiceDescriptorProto method. */
  @JSName("method")
  var method_ServiceDescriptorProto: js.Array[IMethodDescriptorProto] = js.native
  
  /** ServiceDescriptorProto name. */
  @JSName("name")
  var name_ServiceDescriptorProto: String = js.native
  
  /**
    * Converts this ServiceDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ServiceDescriptorProto {
  
  @JSImport("google-gax/build/protos/operations", "google.protobuf.ServiceDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ServiceDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ServiceDescriptorProto instance
    */
  /* static member */
  inline def create(): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ServiceDescriptorProto]
  inline def create(properties: IServiceDescriptorProto): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  
  /**
    * Decodes a ServiceDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ServiceDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  inline def decode(reader: Reader, length: Double): ServiceDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ServiceDescriptorProto]
  inline def decode(reader: Uint8Array): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  inline def decode(reader: Uint8Array, length: Double): ServiceDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ServiceDescriptorProto]
  
  /**
    * Decodes a ServiceDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ServiceDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  inline def decodeDelimited(reader: Uint8Array): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  
  /**
    * Encodes the specified ServiceDescriptorProto message. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
    * @param message ServiceDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IServiceDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IServiceDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ServiceDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
    * @param message ServiceDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IServiceDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IServiceDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ServiceDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ServiceDescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  
  /**
    * Creates a plain object from a ServiceDescriptorProto message. Also converts values to other types if specified.
    * @param message ServiceDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ServiceDescriptorProto): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ServiceDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ServiceDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
