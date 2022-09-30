package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.protobuf.IListValue
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ResultSet. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.ResultSet")
@js.native
/**
  * Constructs a new ResultSet.
  * @param [properties] Properties to set
  */
open class ResultSet ()
  extends StObject
     with IResultSet {
  def this(properties: IResultSet) = this()
  
  /** ResultSet rows. */
  @JSName("rows")
  var rows_ResultSet: js.Array[IListValue] = js.native
  
  /**
    * Converts this ResultSet to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ResultSet {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.ResultSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ResultSet instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ResultSet instance
    */
  /* static member */
  inline def create(): ResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ResultSet]
  inline def create(properties: IResultSet): ResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ResultSet]
  
  inline def decode(reader: js.typedarray.Uint8Array): ResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResultSet]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ResultSet = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResultSet]
  /**
    * Decodes a ResultSet message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ResultSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResultSet]
  inline def decode(reader: Reader, length: Double): ResultSet = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResultSet]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResultSet]
  /**
    * Decodes a ResultSet message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ResultSet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResultSet]
  
  /**
    * Encodes the specified ResultSet message. Does not implicitly {@link google.spanner.v1.ResultSet.verify|verify} messages.
    * @param message ResultSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IResultSet): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IResultSet, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ResultSet message, length delimited. Does not implicitly {@link google.spanner.v1.ResultSet.verify|verify} messages.
    * @param message ResultSet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IResultSet): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IResultSet, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ResultSet message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ResultSet
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ResultSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ResultSet]
  
  /**
    * Gets the default type url for ResultSet
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ResultSet message. Also converts values to other types if specified.
    * @param message ResultSet
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ResultSet): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ResultSet, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ResultSet message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
