package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a KnowledgeOperationMetadata. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata")
@js.native
/**
  * Constructs a new KnowledgeOperationMetadata.
  * @param [properties] Properties to set
  */
open class KnowledgeOperationMetadata ()
  extends StObject
     with IKnowledgeOperationMetadata {
  def this(properties: IKnowledgeOperationMetadata) = this()
  
  /** KnowledgeOperationMetadata state. */
  @JSName("state")
  var state_KnowledgeOperationMetadata: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State * / any */ String) = js.native
  
  /**
    * Converts this KnowledgeOperationMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object KnowledgeOperationMetadata {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait State extends StObject
  /** State enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State & Double] = js.native
    
    @js.native
    sealed trait DONE
      extends StObject
         with State
    /* 3 */ val DONE: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.DONE & Double = js.native
    
    @js.native
    sealed trait PENDING
      extends StObject
         with State
    /* 1 */ val PENDING: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.PENDING & Double = js.native
    
    @js.native
    sealed trait RUNNING
      extends StObject
         with State
    /* 2 */ val RUNNING: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.RUNNING & Double = js.native
    
    @js.native
    sealed trait STATE_UNSPECIFIED
      extends StObject
         with State
    /* 0 */ val STATE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State.STATE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new KnowledgeOperationMetadata instance using the specified properties.
    * @param [properties] Properties to set
    * @returns KnowledgeOperationMetadata instance
    */
  /* static member */
  inline def create(): KnowledgeOperationMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[KnowledgeOperationMetadata]
  inline def create(properties: IKnowledgeOperationMetadata): KnowledgeOperationMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[KnowledgeOperationMetadata]
  
  inline def decode(reader: js.typedarray.Uint8Array): KnowledgeOperationMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[KnowledgeOperationMetadata]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): KnowledgeOperationMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[KnowledgeOperationMetadata]
  /**
    * Decodes a KnowledgeOperationMetadata message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns KnowledgeOperationMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): KnowledgeOperationMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[KnowledgeOperationMetadata]
  inline def decode(reader: Reader, length: Double): KnowledgeOperationMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[KnowledgeOperationMetadata]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): KnowledgeOperationMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[KnowledgeOperationMetadata]
  /**
    * Decodes a KnowledgeOperationMetadata message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns KnowledgeOperationMetadata
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): KnowledgeOperationMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[KnowledgeOperationMetadata]
  
  /**
    * Encodes the specified KnowledgeOperationMetadata message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.verify|verify} messages.
    * @param message KnowledgeOperationMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IKnowledgeOperationMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IKnowledgeOperationMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified KnowledgeOperationMetadata message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.verify|verify} messages.
    * @param message KnowledgeOperationMetadata message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IKnowledgeOperationMetadata): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IKnowledgeOperationMetadata, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a KnowledgeOperationMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns KnowledgeOperationMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): KnowledgeOperationMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[KnowledgeOperationMetadata]
  
  /**
    * Creates a plain object from a KnowledgeOperationMetadata message. Also converts values to other types if specified.
    * @param message KnowledgeOperationMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: KnowledgeOperationMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: KnowledgeOperationMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a KnowledgeOperationMetadata message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
