package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Timepoint. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint")
@js.native
/**
  * Constructs a new Timepoint.
  * @param [properties] Properties to set
  */
class Timepoint ()
  extends StObject
     with ITimepoint {
  def this(properties: ITimepoint) = this()
  
  /** Timepoint markName. */
  @JSName("markName")
  var markName_Timepoint: String = js.native
  
  /** Timepoint timeSeconds. */
  @JSName("timeSeconds")
  var timeSeconds_Timepoint: Double = js.native
  
  /**
    * Converts this Timepoint to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Timepoint {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Timepoint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Timepoint instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Timepoint instance
    */
  /* static member */
  inline def create(): Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Timepoint]
  inline def create(properties: ITimepoint): Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Timepoint]
  
  /**
    * Decodes a Timepoint message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Timepoint
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Timepoint]
  inline def decode(reader: Reader, length: Double): Timepoint = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Timepoint]
  inline def decode(reader: Uint8Array): Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Timepoint]
  inline def decode(reader: Uint8Array, length: Double): Timepoint = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Timepoint]
  
  /**
    * Decodes a Timepoint message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Timepoint
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Timepoint]
  inline def decodeDelimited(reader: Uint8Array): Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Timepoint]
  
  /**
    * Encodes the specified Timepoint message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Timepoint.verify|verify} messages.
    * @param message Timepoint message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITimepoint): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITimepoint, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Timepoint message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Timepoint.verify|verify} messages.
    * @param message Timepoint message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITimepoint): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITimepoint, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Timepoint message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Timepoint
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): Timepoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Timepoint]
  
  /**
    * Creates a plain object from a Timepoint message. Also converts values to other types if specified.
    * @param message Timepoint
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Timepoint): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: Timepoint, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Timepoint message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
