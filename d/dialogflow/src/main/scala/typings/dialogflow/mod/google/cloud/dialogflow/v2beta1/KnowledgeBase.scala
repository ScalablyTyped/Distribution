package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a KnowledgeBase. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase")
@js.native
/**
  * Constructs a new KnowledgeBase.
  * @param [properties] Properties to set
  */
class KnowledgeBase ()
  extends StObject
     with IKnowledgeBase {
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
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBase")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new KnowledgeBase instance using the specified properties.
    * @param [properties] Properties to set
    * @returns KnowledgeBase instance
    */
  /* static member */
  @scala.inline
  def create(): KnowledgeBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[KnowledgeBase]
  @scala.inline
  def create(properties: IKnowledgeBase): KnowledgeBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[KnowledgeBase]
  
  /**
    * Decodes a KnowledgeBase message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns KnowledgeBase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): KnowledgeBase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[KnowledgeBase]
  @scala.inline
  def decode(reader: Reader, length: Double): KnowledgeBase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[KnowledgeBase]
  @scala.inline
  def decode(reader: Uint8Array): KnowledgeBase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[KnowledgeBase]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): KnowledgeBase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[KnowledgeBase]
  
  /**
    * Decodes a KnowledgeBase message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns KnowledgeBase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): KnowledgeBase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[KnowledgeBase]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): KnowledgeBase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[KnowledgeBase]
  
  /**
    * Encodes the specified KnowledgeBase message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeBase.verify|verify} messages.
    * @param message KnowledgeBase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IKnowledgeBase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IKnowledgeBase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified KnowledgeBase message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeBase.verify|verify} messages.
    * @param message KnowledgeBase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IKnowledgeBase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IKnowledgeBase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a KnowledgeBase message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns KnowledgeBase
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): KnowledgeBase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[KnowledgeBase]
  
  /**
    * Creates a plain object from a KnowledgeBase message. Also converts values to other types if specified.
    * @param message KnowledgeBase
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: KnowledgeBase): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: KnowledgeBase, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a KnowledgeBase message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
