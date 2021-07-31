package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.content
import typings.dialogflow.dialogflowStrings.contentUri
import typings.dialogflow.dialogflowStrings.rawContent
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Document.KnowledgeType
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Document. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Document")
@js.native
/**
  * Constructs a new Document.
  * @param [properties] Properties to set
  */
class Document ()
  extends StObject
     with IDocument {
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
  var rawContent_Document: Uint8Array | String = js.native
  
  /** Document source. */
  var source: js.UndefOr[contentUri | content | rawContent] = js.native
  
  /**
    * Converts this Document to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Document {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Document")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait KnowledgeType extends StObject
  /** KnowledgeType enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Document.KnowledgeType")
  @js.native
  object KnowledgeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KnowledgeType & Double] = js.native
    
    @js.native
    sealed trait EXTRACTIVE_QA
      extends StObject
         with KnowledgeType
    /* 2 */ val EXTRACTIVE_QA: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Document.KnowledgeType.EXTRACTIVE_QA & Double = js.native
    
    @js.native
    sealed trait FAQ
      extends StObject
         with KnowledgeType
    /* 1 */ val FAQ: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Document.KnowledgeType.FAQ & Double = js.native
    
    @js.native
    sealed trait KNOWLEDGE_TYPE_UNSPECIFIED
      extends StObject
         with KnowledgeType
    /* 0 */ val KNOWLEDGE_TYPE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Document.KnowledgeType.KNOWLEDGE_TYPE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new Document instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Document instance
    */
  /* static member */
  @scala.inline
  def create(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Document]
  @scala.inline
  def create(properties: IDocument): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  /**
    * Decodes a Document message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Document
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Document]
  @scala.inline
  def decode(reader: Reader, length: Double): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Document]
  @scala.inline
  def decode(reader: Uint8Array): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Document]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  /**
    * Decodes a Document message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Document
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Document]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  /**
    * Encodes the specified Document message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Document.verify|verify} messages.
    * @param message Document message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IDocument): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IDocument, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Document message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Document.verify|verify} messages.
    * @param message Document message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IDocument): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IDocument, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Document message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Document
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  /**
    * Creates a plain object from a Document message. Also converts values to other types if specified.
    * @param message Document
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: Document): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: Document, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Document message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
