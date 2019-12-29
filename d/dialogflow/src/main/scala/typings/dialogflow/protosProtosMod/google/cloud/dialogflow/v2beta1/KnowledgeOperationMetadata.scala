package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a KnowledgeOperationMetadata. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata")
@js.native
/**
  * Constructs a new KnowledgeOperationMetadata.
  * @param [properties] Properties to set
  */
class KnowledgeOperationMetadata () extends IKnowledgeOperationMetadata {
  def this(properties: IKnowledgeOperationMetadata) = this()
  /** KnowledgeOperationMetadata state. */
  @JSName("state")
  var state_KnowledgeOperationMetadata: State = js.native
  /**
    * Converts this KnowledgeOperationMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata")
@js.native
object KnowledgeOperationMetadata extends js.Object {
  @js.native
  sealed trait State extends js.Object
  
  /**
    * Creates a new KnowledgeOperationMetadata instance using the specified properties.
    * @param [properties] Properties to set
    * @returns KnowledgeOperationMetadata instance
    */
  def create(): KnowledgeOperationMetadata = js.native
  def create(properties: IKnowledgeOperationMetadata): KnowledgeOperationMetadata = js.native
  /**
    * Decodes a KnowledgeOperationMetadata message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns KnowledgeOperationMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): KnowledgeOperationMetadata = js.native
  def decode(reader: Reader, length: Double): KnowledgeOperationMetadata = js.native
  def decode(reader: Uint8Array): KnowledgeOperationMetadata = js.native
  def decode(reader: Uint8Array, length: Double): KnowledgeOperationMetadata = js.native
  /**
    * Decodes a KnowledgeOperationMetadata message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns KnowledgeOperationMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): KnowledgeOperationMetadata = js.native
  def decodeDelimited(reader: Uint8Array): KnowledgeOperationMetadata = js.native
  /**
    * Encodes the specified KnowledgeOperationMetadata message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.verify|verify} messages.
    * @param message KnowledgeOperationMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IKnowledgeOperationMetadata): Writer = js.native
  def encode(message: IKnowledgeOperationMetadata, writer: Writer): Writer = js.native
  /**
    * Encodes the specified KnowledgeOperationMetadata message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.verify|verify} messages.
    * @param message KnowledgeOperationMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IKnowledgeOperationMetadata): Writer = js.native
  def encodeDelimited(message: IKnowledgeOperationMetadata, writer: Writer): Writer = js.native
  /**
    * Creates a KnowledgeOperationMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns KnowledgeOperationMetadata
    */
  def fromObject(`object`: StringDictionary[js.Any]): KnowledgeOperationMetadata = js.native
  /**
    * Creates a plain object from a KnowledgeOperationMetadata message. Also converts values to other types if specified.
    * @param message KnowledgeOperationMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: KnowledgeOperationMetadata): StringDictionary[js.Any] = js.native
  def toObject(message: KnowledgeOperationMetadata, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a KnowledgeOperationMetadata message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** State enum. */
  @js.native
  object State extends js.Object {
    @js.native
    sealed trait DONE extends State
    
    @js.native
    sealed trait PENDING extends State
    
    @js.native
    sealed trait RUNNING extends State
    
    @js.native
    sealed trait STATE_UNSPECIFIED extends State
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State with Double] = js.native
    /* 3 */ @js.native
    object DONE extends TopLevel[DONE with Double]
    
    /* 1 */ @js.native
    object PENDING extends TopLevel[PENDING with Double]
    
    /* 2 */ @js.native
    object RUNNING extends TopLevel[RUNNING with Double]
    
    /* 0 */ @js.native
    object STATE_UNSPECIFIED extends TopLevel[STATE_UNSPECIFIED with Double]
    
  }
  
}

