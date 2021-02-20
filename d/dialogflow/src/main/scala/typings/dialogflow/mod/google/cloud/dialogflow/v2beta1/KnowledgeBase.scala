package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a KnowledgeBase. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase")
@js.native
/**
  * Constructs a new KnowledgeBase.
  * @param [properties] Properties to set
  */
class KnowledgeBase () extends IKnowledgeBase {
  def this(properties: IKnowledgeBase) = this()
  
  /** KnowledgeBase displayName. */
  @JSName("displayName")
  var displayName_KnowledgeBase: String = js.native
  
  /** KnowledgeBase languageCode. */
  @JSName("languageCode")
  var languageCode_KnowledgeBase: String = js.native
  
  /** KnowledgeBase name. */
  @JSName("name")
  var name_KnowledgeBase: String = js.native
  
  /**
    * Converts this KnowledgeBase to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object KnowledgeBase {
  
  /**
    * Creates a new KnowledgeBase instance using the specified properties.
    * @param [properties] Properties to set
    * @returns KnowledgeBase instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.create")
  @js.native
  def create(): KnowledgeBase = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.create")
  @js.native
  def create(properties: IKnowledgeBase): KnowledgeBase = js.native
  
  /**
    * Decodes a KnowledgeBase message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns KnowledgeBase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.decode")
  @js.native
  def decode(reader: Reader): KnowledgeBase = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.decode")
  @js.native
  def decode(reader: Reader, length: Double): KnowledgeBase = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.decode")
  @js.native
  def decode(reader: Uint8Array): KnowledgeBase = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): KnowledgeBase = js.native
  
  /**
    * Decodes a KnowledgeBase message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns KnowledgeBase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): KnowledgeBase = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): KnowledgeBase = js.native
  
  /**
    * Encodes the specified KnowledgeBase message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeBase.verify|verify} messages.
    * @param message KnowledgeBase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.encode")
  @js.native
  def encode(message: IKnowledgeBase): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.encode")
  @js.native
  def encode(message: IKnowledgeBase, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified KnowledgeBase message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeBase.verify|verify} messages.
    * @param message KnowledgeBase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.encodeDelimited")
  @js.native
  def encodeDelimited(message: IKnowledgeBase): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.encodeDelimited")
  @js.native
  def encodeDelimited(message: IKnowledgeBase, writer: Writer): Writer = js.native
  
  /**
    * Creates a KnowledgeBase message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns KnowledgeBase
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): KnowledgeBase = js.native
  
  /**
    * Creates a plain object from a KnowledgeBase message. Also converts values to other types if specified.
    * @param message KnowledgeBase
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.toObject")
  @js.native
  def toObject(message: KnowledgeBase): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.toObject")
  @js.native
  def toObject(message: KnowledgeBase, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a KnowledgeBase message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
