package typings.dialogflow.protosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Struct. */
@JSImport("dialogflow/protos/protos", "google.protobuf.Struct")
@js.native
/**
  * Constructs a new Struct.
  * @param [properties] Properties to set
  */
open class Struct ()
  extends StObject
     with IStruct {
  def this(properties: IStruct) = this()
  
  /** Struct fields. */
  @JSName("fields")
  var fields_Struct: StringDictionary[IValue] = js.native
  
  /**
    * Converts this Struct to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object Struct {
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.Struct")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Struct instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Struct instance
    */
  /* static member */
  inline def create(): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Struct]
  inline def create(properties: IStruct): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Struct]
  
  inline def decode(reader: js.typedarray.Uint8Array): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Struct]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Struct = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Struct]
  /**
    * Decodes a Struct message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Struct
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Struct]
  inline def decode(reader: Reader, length: Double): Struct = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Struct]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Struct]
  /**
    * Decodes a Struct message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Struct
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Struct]
  
  /**
    * Encodes the specified Struct message. Does not implicitly {@link google.protobuf.Struct.verify|verify} messages.
    * @param message Struct message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IStruct): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IStruct, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Struct message, length delimited. Does not implicitly {@link google.protobuf.Struct.verify|verify} messages.
    * @param message Struct message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IStruct): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IStruct, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Struct message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Struct
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Struct]
  
  /**
    * Creates a plain object from a Struct message. Also converts values to other types if specified.
    * @param message Struct
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Struct): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: Struct, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /**
    * Verifies a Struct message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[scala.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
