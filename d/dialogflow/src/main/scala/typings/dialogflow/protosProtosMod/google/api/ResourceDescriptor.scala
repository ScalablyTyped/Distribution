package typings.dialogflow.protosProtosMod.google.api

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.api.ResourceDescriptor.History
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ResourceDescriptor. */
@JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor")
@js.native
/**
  * Constructs a new ResourceDescriptor.
  * @param [properties] Properties to set
  */
class ResourceDescriptor () extends IResourceDescriptor {
  def this(properties: IResourceDescriptor) = this()
  /** ResourceDescriptor history. */
  @JSName("history")
  var history_ResourceDescriptor: History = js.native
  /** ResourceDescriptor nameField. */
  @JSName("nameField")
  var nameField_ResourceDescriptor: String = js.native
  /** ResourceDescriptor pattern. */
  @JSName("pattern")
  var pattern_ResourceDescriptor: js.Array[String] = js.native
  /** ResourceDescriptor type. */
  @JSName("type")
  var type_ResourceDescriptor: String = js.native
  /**
    * Converts this ResourceDescriptor to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.api.ResourceDescriptor")
@js.native
object ResourceDescriptor extends js.Object {
  @js.native
  sealed trait History extends js.Object
  
  /**
    * Creates a new ResourceDescriptor instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ResourceDescriptor instance
    */
  def create(): ResourceDescriptor = js.native
  def create(properties: IResourceDescriptor): ResourceDescriptor = js.native
  /**
    * Decodes a ResourceDescriptor message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ResourceDescriptor
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ResourceDescriptor = js.native
  def decode(reader: Reader, length: Double): ResourceDescriptor = js.native
  def decode(reader: Uint8Array): ResourceDescriptor = js.native
  def decode(reader: Uint8Array, length: Double): ResourceDescriptor = js.native
  /**
    * Decodes a ResourceDescriptor message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ResourceDescriptor
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ResourceDescriptor = js.native
  def decodeDelimited(reader: Uint8Array): ResourceDescriptor = js.native
  /**
    * Encodes the specified ResourceDescriptor message. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
    * @param message ResourceDescriptor message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IResourceDescriptor): Writer = js.native
  def encode(message: IResourceDescriptor, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ResourceDescriptor message, length delimited. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
    * @param message ResourceDescriptor message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IResourceDescriptor): Writer = js.native
  def encodeDelimited(message: IResourceDescriptor, writer: Writer): Writer = js.native
  /**
    * Creates a ResourceDescriptor message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ResourceDescriptor
    */
  def fromObject(`object`: StringDictionary[js.Any]): ResourceDescriptor = js.native
  /**
    * Creates a plain object from a ResourceDescriptor message. Also converts values to other types if specified.
    * @param message ResourceDescriptor
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ResourceDescriptor): StringDictionary[js.Any] = js.native
  def toObject(message: ResourceDescriptor, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ResourceDescriptor message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** History enum. */
  @js.native
  object History extends js.Object {
    @js.native
    sealed trait FUTURE_MULTI_PATTERN extends History
    
    @js.native
    sealed trait HISTORY_UNSPECIFIED extends History
    
    @js.native
    sealed trait ORIGINALLY_SINGLE_PATTERN extends History
    
    /* 2 */ val FUTURE_MULTI_PATTERN: typings.dialogflow.protosProtosMod.google.api.ResourceDescriptor.History.FUTURE_MULTI_PATTERN with Double = js.native
    /* 0 */ val HISTORY_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.api.ResourceDescriptor.History.HISTORY_UNSPECIFIED with Double = js.native
    /* 1 */ val ORIGINALLY_SINGLE_PATTERN: typings.dialogflow.protosProtosMod.google.api.ResourceDescriptor.History.ORIGINALLY_SINGLE_PATTERN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[History with Double] = js.native
  }
  
}

