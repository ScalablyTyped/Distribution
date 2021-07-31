package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an IntentBatch. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.IntentBatch")
@js.native
/**
  * Constructs a new IntentBatch.
  * @param [properties] Properties to set
  */
class IntentBatch ()
  extends StObject
     with IIntentBatch {
  def this(properties: IIntentBatch) = this()
  
  /** IntentBatch intents. */
  @JSName("intents")
  var intents_IntentBatch: js.Array[IIntent] = js.native
  
  /**
    * Converts this IntentBatch to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object IntentBatch {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.IntentBatch")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new IntentBatch instance using the specified properties.
    * @param [properties] Properties to set
    * @returns IntentBatch instance
    */
  /* static member */
  @scala.inline
  def create(): IntentBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IntentBatch]
  @scala.inline
  def create(properties: IIntentBatch): IntentBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[IntentBatch]
  
  /**
    * Decodes an IntentBatch message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns IntentBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): IntentBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[IntentBatch]
  @scala.inline
  def decode(reader: Reader, length: Double): IntentBatch = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[IntentBatch]
  @scala.inline
  def decode(reader: Uint8Array): IntentBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[IntentBatch]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): IntentBatch = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[IntentBatch]
  
  /**
    * Decodes an IntentBatch message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns IntentBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): IntentBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[IntentBatch]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): IntentBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[IntentBatch]
  
  /**
    * Encodes the specified IntentBatch message. Does not implicitly {@link google.cloud.dialogflow.v2.IntentBatch.verify|verify} messages.
    * @param message IntentBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IIntentBatch): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IIntentBatch, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified IntentBatch message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.IntentBatch.verify|verify} messages.
    * @param message IntentBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IIntentBatch): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IIntentBatch, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an IntentBatch message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns IntentBatch
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): IntentBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[IntentBatch]
  
  /**
    * Creates a plain object from an IntentBatch message. Also converts values to other types if specified.
    * @param message IntentBatch
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: IntentBatch): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: IntentBatch, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an IntentBatch message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
