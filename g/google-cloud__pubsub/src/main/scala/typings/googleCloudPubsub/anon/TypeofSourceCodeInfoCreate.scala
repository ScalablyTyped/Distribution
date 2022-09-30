package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.ISourceCodeInfo
import typings.googleGax.iamServiceMod.google.protobuf.SourceCodeInfo
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSourceCodeInfoCreate extends StObject {
  
  /** Represents a Location. */
  var Location: Instantiable0[typings.googleGax.mod.fallback.IamProtos.google.protobuf.SourceCodeInfo.Location] & TypeofLocation_ = js.native
  
  /**
    * Creates a new SourceCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourceCodeInfo instance
    */
  /* static member */
  def create(): SourceCodeInfo = js.native
  def create(properties: ISourceCodeInfo): SourceCodeInfo = js.native
  
  def decode(reader: js.typedarray.Uint8Array): SourceCodeInfo = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): SourceCodeInfo = js.native
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): SourceCodeInfo = js.native
  def decode(reader: Reader, length: Double): SourceCodeInfo = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): SourceCodeInfo = js.native
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): SourceCodeInfo = js.native
  
  /**
    * Encodes the specified SourceCodeInfo message. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: ISourceCodeInfo): Writer = js.native
  def encode(message: ISourceCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SourceCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: ISourceCodeInfo): Writer = js.native
  def encodeDelimited(message: ISourceCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Creates a SourceCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourceCodeInfo
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): SourceCodeInfo = js.native
  
  /**
    * Creates a plain object from a SourceCodeInfo message. Also converts values to other types if specified.
    * @param message SourceCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: SourceCodeInfo): StringDictionary[Any] = js.native
  def toObject(message: SourceCodeInfo, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies a SourceCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
