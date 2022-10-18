package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EntityTypeBatch. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityTypeBatch")
@js.native
/**
  * Constructs a new EntityTypeBatch.
  * @param [properties] Properties to set
  */
open class EntityTypeBatch ()
  extends StObject
     with IEntityTypeBatch {
  def this(properties: IEntityTypeBatch) = this()
  
  /** EntityTypeBatch entityTypes. */
  @JSName("entityTypes")
  var entityTypes_EntityTypeBatch: js.Array[IEntityType] = js.native
  
  /**
    * Converts this EntityTypeBatch to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object EntityTypeBatch {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityTypeBatch")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new EntityTypeBatch instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EntityTypeBatch instance
    */
  /* static member */
  inline def create(): EntityTypeBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EntityTypeBatch]
  inline def create(properties: IEntityTypeBatch): EntityTypeBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[EntityTypeBatch]
  
  inline def decode(reader: js.typedarray.Uint8Array): EntityTypeBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EntityTypeBatch]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): EntityTypeBatch = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EntityTypeBatch]
  /**
    * Decodes an EntityTypeBatch message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EntityTypeBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): EntityTypeBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EntityTypeBatch]
  inline def decode(reader: Reader, length: Double): EntityTypeBatch = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EntityTypeBatch]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): EntityTypeBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EntityTypeBatch]
  /**
    * Decodes an EntityTypeBatch message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EntityTypeBatch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): EntityTypeBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EntityTypeBatch]
  
  /**
    * Encodes the specified EntityTypeBatch message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EntityTypeBatch.verify|verify} messages.
    * @param message EntityTypeBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IEntityTypeBatch): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IEntityTypeBatch, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EntityTypeBatch message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.EntityTypeBatch.verify|verify} messages.
    * @param message EntityTypeBatch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IEntityTypeBatch): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IEntityTypeBatch, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EntityTypeBatch message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EntityTypeBatch
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): EntityTypeBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EntityTypeBatch]
  
  /**
    * Creates a plain object from an EntityTypeBatch message. Also converts values to other types if specified.
    * @param message EntityTypeBatch
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: EntityTypeBatch): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: EntityTypeBatch, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an EntityTypeBatch message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
