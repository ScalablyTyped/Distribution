package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.protobuf.IValue
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PartialResultSet. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PartialResultSet")
@js.native
/**
  * Constructs a new PartialResultSet.
  * @param [properties] Properties to set
  */
open class PartialResultSet ()
  extends StObject
     with IPartialResultSet {
  def this(properties: IPartialResultSet) = this()
  
  /** PartialResultSet chunkedValue. */
  @JSName("chunkedValue")
  var chunkedValue_PartialResultSet: Boolean = js.native
  
  /** PartialResultSet resumeToken. */
  @JSName("resumeToken")
  var resumeToken_PartialResultSet: js.typedarray.Uint8Array | String = js.native
  
  /**
    * Converts this PartialResultSet to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** PartialResultSet values. */
  @JSName("values")
  var values_PartialResultSet: js.Array[IValue] = js.native
}
object PartialResultSet {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.PartialResultSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PartialResultSet instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PartialResultSet instance
    */
  /* static member */
  inline def create(): PartialResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PartialResultSet]
  inline def create(properties: IPartialResultSet): PartialResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PartialResultSet]
  
  inline def decode(reader: js.typedarray.Uint8Array): PartialResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PartialResultSet]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): PartialResultSet = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PartialResultSet]
  /**
    * Decodes a PartialResultSet message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PartialResultSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): PartialResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PartialResultSet]
  inline def decode(reader: Reader, length: Double): PartialResultSet = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PartialResultSet]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): PartialResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PartialResultSet]
  /**
    * Decodes a PartialResultSet message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PartialResultSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): PartialResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PartialResultSet]
  
  /**
    * Encodes the specified PartialResultSet message. Does not implicitly {@link google.spanner.v1.PartialResultSet.verify|verify} messages.
    * @param message PartialResultSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPartialResultSet): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPartialResultSet, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PartialResultSet message, length delimited. Does not implicitly {@link google.spanner.v1.PartialResultSet.verify|verify} messages.
    * @param message PartialResultSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPartialResultSet): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPartialResultSet, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PartialResultSet message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PartialResultSet
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): PartialResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PartialResultSet]
  
  /**
    * Gets the default type url for PartialResultSet
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a PartialResultSet message. Also converts values to other types if specified.
    * @param message PartialResultSet
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PartialResultSet): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PartialResultSet, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a PartialResultSet message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
