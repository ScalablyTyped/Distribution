package typings.dialogflow.protosProtosMod.google.protobuf.GeneratedCodeInfo

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Annotation. */
@JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation")
@js.native
/**
  * Constructs a new Annotation.
  * @param [properties] Properties to set
  */
class Annotation () extends IAnnotation {
  def this(properties: IAnnotation) = this()
  /** Annotation begin. */
  @JSName("begin")
  var begin_Annotation: Double = js.native
  /** Annotation end. */
  @JSName("end")
  var end_Annotation: Double = js.native
  /** Annotation path. */
  @JSName("path")
  var path_Annotation: js.Array[Double] = js.native
  /** Annotation sourceFile. */
  @JSName("sourceFile")
  var sourceFile_Annotation: String = js.native
  /**
    * Converts this Annotation to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo.Annotation")
@js.native
object Annotation extends js.Object {
  /**
    * Creates a new Annotation instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Annotation instance
    */
  def create(): Annotation = js.native
  def create(properties: IAnnotation): Annotation = js.native
  /**
    * Decodes an Annotation message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Annotation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Annotation = js.native
  def decode(reader: Reader, length: Double): Annotation = js.native
  def decode(reader: Uint8Array): Annotation = js.native
  def decode(reader: Uint8Array, length: Double): Annotation = js.native
  /**
    * Decodes an Annotation message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Annotation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Annotation = js.native
  def decodeDelimited(reader: Uint8Array): Annotation = js.native
  /**
    * Encodes the specified Annotation message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
    * @param message Annotation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IAnnotation): Writer = js.native
  def encode(message: IAnnotation, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Annotation message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
    * @param message Annotation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IAnnotation): Writer = js.native
  def encodeDelimited(message: IAnnotation, writer: Writer): Writer = js.native
  /**
    * Creates an Annotation message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Annotation
    */
  def fromObject(`object`: StringDictionary[js.Any]): Annotation = js.native
  /**
    * Creates a plain object from an Annotation message. Also converts values to other types if specified.
    * @param message Annotation
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Annotation): StringDictionary[js.Any] = js.native
  def toObject(message: Annotation, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Annotation message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

