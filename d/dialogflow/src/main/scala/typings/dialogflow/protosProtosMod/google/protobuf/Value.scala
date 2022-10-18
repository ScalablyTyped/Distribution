package typings.dialogflow.protosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.boolValue
import typings.dialogflow.dialogflowStrings.listValue
import typings.dialogflow.dialogflowStrings.nullValue
import typings.dialogflow.dialogflowStrings.numberValue
import typings.dialogflow.dialogflowStrings.stringValue
import typings.dialogflow.dialogflowStrings.structValue
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Value. */
@JSImport("dialogflow/protos/protos", "google.protobuf.Value")
@js.native
/**
  * Constructs a new Value.
  * @param [properties] Properties to set
  */
open class Value ()
  extends StObject
     with IValue {
  def this(properties: IValue) = this()
  
  /** Value boolValue. */
  @JSName("boolValue")
  var boolValue_Value: Boolean = js.native
  
  /** Value kind. */
  var kind: js.UndefOr[nullValue | numberValue | stringValue | boolValue | structValue | listValue] = js.native
  
  /** Value nullValue. */
  @JSName("nullValue")
  var nullValue_Value: NullValue | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.NullValue * / any */ String) = js.native
  
  /** Value numberValue. */
  @JSName("numberValue")
  var numberValue_Value: Double = js.native
  
  /** Value stringValue. */
  @JSName("stringValue")
  var stringValue_Value: String = js.native
  
  /**
    * Converts this Value to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object Value {
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.Value")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Value instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Value instance
    */
  /* static member */
  inline def create(): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Value]
  inline def create(properties: IValue): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  inline def decode(reader: js.typedarray.Uint8Array): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Value]
  /**
    * Decodes a Value message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Value
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def decode(reader: Reader, length: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Value]
  /**
    * Decodes a Value message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Value
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  /**
    * Encodes the specified Value message. Does not implicitly {@link google.protobuf.Value.verify|verify} messages.
    * @param message Value message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IValue): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IValue, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Value message, length delimited. Does not implicitly {@link google.protobuf.Value.verify|verify} messages.
    * @param message Value message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IValue): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IValue, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Value message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Value
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  /**
    * Creates a plain object from a Value message. Also converts values to other types if specified.
    * @param message Value
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Value): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: Value, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /**
    * Verifies a Value message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[scala.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
