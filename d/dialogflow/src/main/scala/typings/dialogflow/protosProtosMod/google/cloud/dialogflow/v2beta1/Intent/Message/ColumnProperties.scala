package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ColumnProperties. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties")
@js.native
/**
  * Constructs a new ColumnProperties.
  * @param [properties] Properties to set
  */
class ColumnProperties () extends IColumnProperties {
  def this(properties: IColumnProperties) = this()
  /** ColumnProperties header. */
  @JSName("header")
  var header_ColumnProperties: String = js.native
  /** ColumnProperties horizontalAlignment. */
  @JSName("horizontalAlignment")
  var horizontalAlignment_ColumnProperties: HorizontalAlignment = js.native
  /**
    * Converts this ColumnProperties to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties")
@js.native
object ColumnProperties extends js.Object {
  @js.native
  sealed trait HorizontalAlignment extends js.Object
  
  /**
    * Creates a new ColumnProperties instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ColumnProperties instance
    */
  def create(): ColumnProperties = js.native
  def create(properties: IColumnProperties): ColumnProperties = js.native
  /**
    * Decodes a ColumnProperties message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ColumnProperties
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ColumnProperties = js.native
  def decode(reader: Reader, length: Double): ColumnProperties = js.native
  def decode(reader: Uint8Array): ColumnProperties = js.native
  def decode(reader: Uint8Array, length: Double): ColumnProperties = js.native
  /**
    * Decodes a ColumnProperties message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ColumnProperties
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ColumnProperties = js.native
  def decodeDelimited(reader: Uint8Array): ColumnProperties = js.native
  /**
    * Encodes the specified ColumnProperties message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.verify|verify} messages.
    * @param message ColumnProperties message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IColumnProperties): Writer = js.native
  def encode(message: IColumnProperties, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ColumnProperties message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.verify|verify} messages.
    * @param message ColumnProperties message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IColumnProperties): Writer = js.native
  def encodeDelimited(message: IColumnProperties, writer: Writer): Writer = js.native
  /**
    * Creates a ColumnProperties message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ColumnProperties
    */
  def fromObject(`object`: StringDictionary[js.Any]): ColumnProperties = js.native
  /**
    * Creates a plain object from a ColumnProperties message. Also converts values to other types if specified.
    * @param message ColumnProperties
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ColumnProperties): StringDictionary[js.Any] = js.native
  def toObject(message: ColumnProperties, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ColumnProperties message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** HorizontalAlignment enum. */
  @js.native
  object HorizontalAlignment extends js.Object {
    @js.native
    sealed trait CENTER extends HorizontalAlignment
    
    @js.native
    sealed trait HORIZONTAL_ALIGNMENT_UNSPECIFIED extends HorizontalAlignment
    
    @js.native
    sealed trait LEADING extends HorizontalAlignment
    
    @js.native
    sealed trait TRAILING extends HorizontalAlignment
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HorizontalAlignment with Double] = js.native
    /* 2 */ @js.native
    object CENTER extends TopLevel[CENTER with Double]
    
    /* 0 */ @js.native
    object HORIZONTAL_ALIGNMENT_UNSPECIFIED extends TopLevel[HORIZONTAL_ALIGNMENT_UNSPECIFIED with Double]
    
    /* 1 */ @js.native
    object LEADING extends TopLevel[LEADING with Double]
    
    /* 3 */ @js.native
    object TRAILING extends TopLevel[TRAILING with Double]
    
  }
  
}

