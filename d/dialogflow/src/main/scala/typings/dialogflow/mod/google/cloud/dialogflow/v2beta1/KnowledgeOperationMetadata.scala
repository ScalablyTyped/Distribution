package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var state_KnowledgeOperationMetadata: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State * / any */ String) = js.native
  
  /**
    * Converts this KnowledgeOperationMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object KnowledgeOperationMetadata {
  
  @js.native
  sealed trait State extends StObject
  /** State enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State with Double] = js.native
    
    @js.native
    sealed trait DONE extends State
    /* 3 */ val DONE: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.DONE with Double = js.native
    
    @js.native
    sealed trait PENDING extends State
    /* 1 */ val PENDING: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.PENDING with Double = js.native
    
    @js.native
    sealed trait RUNNING extends State
    /* 2 */ val RUNNING: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.RUNNING with Double = js.native
    
    @js.native
    sealed trait STATE_UNSPECIFIED extends State
    /* 0 */ val STATE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.STATE_UNSPECIFIED with Double = js.native
  }
  
  /**
    * Creates a new KnowledgeOperationMetadata instance using the specified properties.
    * @param [properties] Properties to set
    * @returns KnowledgeOperationMetadata instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.create")
  @js.native
  def create(): KnowledgeOperationMetadata = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.create")
  @js.native
  def create(properties: IKnowledgeOperationMetadata): KnowledgeOperationMetadata = js.native
  
  /**
    * Decodes a KnowledgeOperationMetadata message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns KnowledgeOperationMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.decode")
  @js.native
  def decode(reader: Reader): KnowledgeOperationMetadata = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.decode")
  @js.native
  def decode(reader: Reader, length: Double): KnowledgeOperationMetadata = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.decode")
  @js.native
  def decode(reader: Uint8Array): KnowledgeOperationMetadata = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): KnowledgeOperationMetadata = js.native
  
  /**
    * Decodes a KnowledgeOperationMetadata message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns KnowledgeOperationMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): KnowledgeOperationMetadata = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): KnowledgeOperationMetadata = js.native
  
  /**
    * Encodes the specified KnowledgeOperationMetadata message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.verify|verify} messages.
    * @param message KnowledgeOperationMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.encode")
  @js.native
  def encode(message: IKnowledgeOperationMetadata): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.encode")
  @js.native
  def encode(message: IKnowledgeOperationMetadata, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified KnowledgeOperationMetadata message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.verify|verify} messages.
    * @param message KnowledgeOperationMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.encodeDelimited")
  @js.native
  def encodeDelimited(message: IKnowledgeOperationMetadata): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.encodeDelimited")
  @js.native
  def encodeDelimited(message: IKnowledgeOperationMetadata, writer: Writer): Writer = js.native
  
  /**
    * Creates a KnowledgeOperationMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns KnowledgeOperationMetadata
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): KnowledgeOperationMetadata = js.native
  
  /**
    * Creates a plain object from a KnowledgeOperationMetadata message. Also converts values to other types if specified.
    * @param message KnowledgeOperationMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.toObject")
  @js.native
  def toObject(message: KnowledgeOperationMetadata): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.toObject")
  @js.native
  def toObject(message: KnowledgeOperationMetadata, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a KnowledgeOperationMetadata message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
