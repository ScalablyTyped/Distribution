package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Context. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Context")
@js.native
/**
  * Constructs a new Context.
  * @param [properties] Properties to set
  */
class Context ()
  extends StObject
     with IContext {
  def this(properties: IContext) = this()
  
  /** Context lifespanCount. */
  @JSName("lifespanCount")
  var lifespanCount_Context: Double = js.native
  
  /** Context name. */
  @JSName("name")
  var name_Context: String = js.native
  
  /**
    * Converts this Context to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Context {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Context")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Context instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Context instance
    */
  /* static member */
  inline def create(): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Context]
  inline def create(properties: IContext): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  /**
    * Decodes a Context message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Context
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Context]
  inline def decode(reader: Reader, length: Double): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def decode(reader: Uint8Array): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Context]
  inline def decode(reader: Uint8Array, length: Double): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Context]
  
  /**
    * Decodes a Context message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Context
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Context]
  inline def decodeDelimited(reader: Uint8Array): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  /**
    * Encodes the specified Context message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Context.verify|verify} messages.
    * @param message Context message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IContext): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IContext, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Context message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Context.verify|verify} messages.
    * @param message Context message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IContext): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IContext, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Context message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Context
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  /**
    * Creates a plain object from a Context message. Also converts values to other types if specified.
    * @param message Context
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Context): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: Context, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Context message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
