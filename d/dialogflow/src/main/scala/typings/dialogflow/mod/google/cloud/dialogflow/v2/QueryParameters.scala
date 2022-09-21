package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a QueryParameters. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryParameters")
@js.native
/**
  * Constructs a new QueryParameters.
  * @param [properties] Properties to set
  */
open class QueryParameters ()
  extends StObject
     with IQueryParameters {
  def this(properties: IQueryParameters) = this()
  
  /** QueryParameters contexts. */
  @JSName("contexts")
  var contexts_QueryParameters: js.Array[IContext] = js.native
  
  /** QueryParameters resetContexts. */
  @JSName("resetContexts")
  var resetContexts_QueryParameters: Boolean = js.native
  
  /** QueryParameters sessionEntityTypes. */
  @JSName("sessionEntityTypes")
  var sessionEntityTypes_QueryParameters: js.Array[ISessionEntityType] = js.native
  
  /** QueryParameters timeZone. */
  @JSName("timeZone")
  var timeZone_QueryParameters: String = js.native
  
  /**
    * Converts this QueryParameters to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object QueryParameters {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.QueryParameters")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new QueryParameters instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryParameters instance
    */
  /* static member */
  inline def create(): QueryParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[QueryParameters]
  inline def create(properties: IQueryParameters): QueryParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[QueryParameters]
  
  inline def decode(reader: js.typedarray.Uint8Array): QueryParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryParameters]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): QueryParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryParameters]
  /**
    * Decodes a QueryParameters message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryParameters
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): QueryParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryParameters]
  inline def decode(reader: Reader, length: Double): QueryParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryParameters]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): QueryParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryParameters]
  /**
    * Decodes a QueryParameters message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryParameters
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): QueryParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryParameters]
  
  /**
    * Encodes the specified QueryParameters message. Does not implicitly {@link google.cloud.dialogflow.v2.QueryParameters.verify|verify} messages.
    * @param message QueryParameters message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IQueryParameters): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IQueryParameters, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified QueryParameters message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.QueryParameters.verify|verify} messages.
    * @param message QueryParameters message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IQueryParameters): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IQueryParameters, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a QueryParameters message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryParameters
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): QueryParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[QueryParameters]
  
  /**
    * Creates a plain object from a QueryParameters message. Also converts values to other types if specified.
    * @param message QueryParameters
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: QueryParameters): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: QueryParameters, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a QueryParameters message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
