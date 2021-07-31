package typings.googleGax.iamServiceMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ServiceOptions. */
@JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceOptions")
@js.native
/**
  * Constructs a new ServiceOptions.
  * @param [properties] Properties to set
  */
class ServiceOptions ()
  extends StObject
     with IServiceOptions {
  def this(properties: IServiceOptions) = this()
  
  /** ServiceOptions deprecated. */
  @JSName("deprecated")
  var deprecated_ServiceOptions: Boolean = js.native
  
  /**
    * Converts this ServiceOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ServiceOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_ServiceOptions: js.Array[IUninterpretedOption] = js.native
}
object ServiceOptions {
  
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.ServiceOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ServiceOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ServiceOptions instance
    */
  /* static member */
  @scala.inline
  def create(): ServiceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ServiceOptions]
  @scala.inline
  def create(properties: IServiceOptions): ServiceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ServiceOptions]
  
  /**
    * Decodes a ServiceOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ServiceOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): ServiceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ServiceOptions]
  @scala.inline
  def decode(reader: Reader, length: Double): ServiceOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ServiceOptions]
  @scala.inline
  def decode(reader: Uint8Array): ServiceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ServiceOptions]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ServiceOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ServiceOptions]
  
  /**
    * Decodes a ServiceOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ServiceOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): ServiceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ServiceOptions]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ServiceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ServiceOptions]
  
  /**
    * Encodes the specified ServiceOptions message. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
    * @param message ServiceOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IServiceOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IServiceOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ServiceOptions message, length delimited. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
    * @param message ServiceOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IServiceOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IServiceOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ServiceOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ServiceOptions
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ServiceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ServiceOptions]
  
  /**
    * Creates a plain object from a ServiceOptions message. Also converts values to other types if specified.
    * @param message ServiceOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: ServiceOptions): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ServiceOptions, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ServiceOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
