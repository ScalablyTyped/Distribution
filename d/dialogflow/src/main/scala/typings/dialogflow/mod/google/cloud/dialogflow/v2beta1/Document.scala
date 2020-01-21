package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.dialogflowStrings.content
import typings.dialogflow.dialogflowStrings.contentUri
import typings.dialogflow.dialogflowStrings.rawContent
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Document.KnowledgeType
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Document. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Document")
@js.native
/**
  * Constructs a new Document.
  * @param [properties] Properties to set
  */
class Document () extends IDocument {
  def this(properties: IDocument) = this()
  /** Document contentUri. */
  @JSName("contentUri")
  var contentUri_Document: String = js.native
  /** Document content. */
  @JSName("content")
  var content_Document: String = js.native
  /** Document displayName. */
  @JSName("displayName")
  var displayName_Document: String = js.native
  /** Document knowledgeTypes. */
  @JSName("knowledgeTypes")
  var knowledgeTypes_Document: js.Array[KnowledgeType] = js.native
  /** Document mimeType. */
  @JSName("mimeType")
  var mimeType_Document: String = js.native
  /** Document name. */
  @JSName("name")
  var name_Document: String = js.native
  /** Document rawContent. */
  @JSName("rawContent")
  var rawContent_Document: Uint8Array = js.native
  /** Document source. */
  var source: js.UndefOr[contentUri | content | rawContent] = js.native
  /**
    * Converts this Document to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Document")
@js.native
object Document extends js.Object {
  @js.native
  sealed trait KnowledgeType extends js.Object
  
  /**
    * Creates a new Document instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Document instance
    */
  def create(): Document = js.native
  def create(properties: IDocument): Document = js.native
  /**
    * Decodes a Document message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Document
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Document = js.native
  def decode(reader: Reader, length: Double): Document = js.native
  def decode(reader: Uint8Array): Document = js.native
  def decode(reader: Uint8Array, length: Double): Document = js.native
  /**
    * Decodes a Document message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Document
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Document = js.native
  def decodeDelimited(reader: Uint8Array): Document = js.native
  /**
    * Encodes the specified Document message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Document.verify|verify} messages.
    * @param message Document message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDocument): Writer = js.native
  def encode(message: IDocument, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Document message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Document.verify|verify} messages.
    * @param message Document message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDocument): Writer = js.native
  def encodeDelimited(message: IDocument, writer: Writer): Writer = js.native
  /**
    * Creates a Document message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Document
    */
  def fromObject(`object`: StringDictionary[js.Any]): Document = js.native
  /**
    * Creates a plain object from a Document message. Also converts values to other types if specified.
    * @param message Document
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Document): StringDictionary[js.Any] = js.native
  def toObject(message: Document, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Document message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** KnowledgeType enum. */
  @js.native
  object KnowledgeType extends js.Object {
    @js.native
    sealed trait EXTRACTIVE_QA extends KnowledgeType
    
    @js.native
    sealed trait FAQ extends KnowledgeType
    
    @js.native
    sealed trait KNOWLEDGE_TYPE_UNSPECIFIED extends KnowledgeType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KnowledgeType with Double] = js.native
    /* 2 */ @js.native
    object EXTRACTIVE_QA extends TopLevel[EXTRACTIVE_QA with Double]
    
    /* 1 */ @js.native
    object FAQ extends TopLevel[FAQ with Double]
    
    /* 0 */ @js.native
    object KNOWLEDGE_TYPE_UNSPECIFIED extends TopLevel[KNOWLEDGE_TYPE_UNSPECIFIED with Double]
    
  }
  
}

