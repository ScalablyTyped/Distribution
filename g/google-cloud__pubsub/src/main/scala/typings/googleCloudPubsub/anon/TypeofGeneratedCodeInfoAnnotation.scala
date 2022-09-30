package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.GeneratedCodeInfo
import typings.googleGax.iamServiceMod.google.protobuf.IGeneratedCodeInfo
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGeneratedCodeInfoAnnotation extends StObject {
  
  /** Represents an Annotation. */
  var Annotation: (Instantiable0[
    typings.googleGax.mod.fallback.IamProtos.google.protobuf.GeneratedCodeInfo.Annotation
  ]) & TypeofAnnotation = js.native
  
  /**
    * Creates a new GeneratedCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GeneratedCodeInfo instance
    */
  /* static member */
  def create(): GeneratedCodeInfo = js.native
  def create(properties: IGeneratedCodeInfo): GeneratedCodeInfo = js.native
  
  def decode(reader: js.typedarray.Uint8Array): GeneratedCodeInfo = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): GeneratedCodeInfo = js.native
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): GeneratedCodeInfo = js.native
  def decode(reader: Reader, length: Double): GeneratedCodeInfo = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): GeneratedCodeInfo = js.native
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): GeneratedCodeInfo = js.native
  
  /**
    * Encodes the specified GeneratedCodeInfo message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IGeneratedCodeInfo): Writer = js.native
  def encode(message: IGeneratedCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GeneratedCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IGeneratedCodeInfo): Writer = js.native
  def encodeDelimited(message: IGeneratedCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Creates a GeneratedCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GeneratedCodeInfo
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): GeneratedCodeInfo = js.native
  
  /**
    * Creates a plain object from a GeneratedCodeInfo message. Also converts values to other types if specified.
    * @param message GeneratedCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: GeneratedCodeInfo): StringDictionary[Any] = js.native
  def toObject(message: GeneratedCodeInfo, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a GeneratedCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
