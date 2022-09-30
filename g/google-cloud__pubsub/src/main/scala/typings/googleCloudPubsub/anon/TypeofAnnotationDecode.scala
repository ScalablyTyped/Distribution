package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo.Annotation
import typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo.IAnnotation
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnnotationDecode extends StObject {
  
  /**
    * Creates a new Annotation instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Annotation instance
    */
  /* static member */
  def create(): Annotation = js.native
  def create(properties: IAnnotation): Annotation = js.native
  
  def decode(reader: js.typedarray.Uint8Array): Annotation = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Annotation = js.native
  /**
    * Decodes an Annotation message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Annotation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): Annotation = js.native
  def decode(reader: Reader, length: Double): Annotation = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): Annotation = js.native
  /**
    * Decodes an Annotation message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Annotation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): Annotation = js.native
  
  /**
    * Encodes the specified Annotation message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
    * @param message Annotation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IAnnotation): Writer = js.native
  def encode(message: IAnnotation, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Annotation message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
    * @param message Annotation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IAnnotation): Writer = js.native
  def encodeDelimited(message: IAnnotation, writer: Writer): Writer = js.native
  
  /**
    * Creates an Annotation message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Annotation
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): Annotation = js.native
  
  /**
    * Creates a plain object from an Annotation message. Also converts values to other types if specified.
    * @param message Annotation
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: Annotation): StringDictionary[Any] = js.native
  def toObject(message: Annotation, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an Annotation message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
