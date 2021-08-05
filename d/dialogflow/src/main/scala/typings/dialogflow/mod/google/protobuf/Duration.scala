package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.long.mod.Long
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Duration. */
@JSImport("dialogflow/protos/protos", "google.protobuf.Duration")
@js.native
/**
  * Constructs a new Duration.
  * @param [properties] Properties to set
  */
class Duration ()
  extends StObject
     with IDuration {
  def this(properties: IDuration) = this()
  
  /** Duration nanos. */
  @JSName("nanos")
  var nanos_Duration: Double = js.native
  
  /** Duration seconds. */
  @JSName("seconds")
  var seconds_Duration: Double | Long | String = js.native
  
  /**
    * Converts this Duration to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Duration {
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.Duration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Duration instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Duration instance
    */
  /* static member */
  inline def create(): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Duration]
  inline def create(properties: IDuration): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  /**
    * Decodes a Duration message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Duration
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Duration]
  inline def decode(reader: Reader, length: Double): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Duration]
  inline def decode(reader: Uint8Array): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Duration]
  inline def decode(reader: Uint8Array, length: Double): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  /**
    * Decodes a Duration message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Duration
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Duration]
  inline def decodeDelimited(reader: Uint8Array): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  /**
    * Encodes the specified Duration message. Does not implicitly {@link google.protobuf.Duration.verify|verify} messages.
    * @param message Duration message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDuration): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDuration, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Duration message, length delimited. Does not implicitly {@link google.protobuf.Duration.verify|verify} messages.
    * @param message Duration message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDuration): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDuration, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Duration message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Duration
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  /**
    * Creates a plain object from a Duration message. Also converts values to other types if specified.
    * @param message Duration
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Duration): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: Duration, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Duration message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
