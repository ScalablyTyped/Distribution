package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GcsSource. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GcsSource")
@js.native
/**
  * Constructs a new GcsSource.
  * @param [properties] Properties to set
  */
open class GcsSource ()
  extends StObject
     with IGcsSource {
  def this(properties: IGcsSource) = this()
  
  /**
    * Converts this GcsSource to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** GcsSource uri. */
  @JSName("uri")
  var uri_GcsSource: String = js.native
}
object GcsSource {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.GcsSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GcsSource instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GcsSource instance
    */
  /* static member */
  inline def create(): GcsSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GcsSource]
  inline def create(properties: IGcsSource): GcsSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GcsSource]
  
  inline def decode(reader: js.typedarray.Uint8Array): GcsSource = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GcsSource]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GcsSource = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GcsSource]
  /**
    * Decodes a GcsSource message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GcsSource
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GcsSource = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GcsSource]
  inline def decode(reader: Reader, length: Double): GcsSource = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GcsSource]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GcsSource = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GcsSource]
  /**
    * Decodes a GcsSource message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GcsSource
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GcsSource = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GcsSource]
  
  /**
    * Encodes the specified GcsSource message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GcsSource.verify|verify} messages.
    * @param message GcsSource message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGcsSource): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGcsSource, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GcsSource message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.GcsSource.verify|verify} messages.
    * @param message GcsSource message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGcsSource): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGcsSource, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GcsSource message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GcsSource
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GcsSource = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GcsSource]
  
  /**
    * Creates a plain object from a GcsSource message. Also converts values to other types if specified.
    * @param message GcsSource
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GcsSource): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GcsSource, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GcsSource message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
