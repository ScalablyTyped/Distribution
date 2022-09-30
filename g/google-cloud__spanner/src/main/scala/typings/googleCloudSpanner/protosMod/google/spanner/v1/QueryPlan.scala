package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a QueryPlan. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.QueryPlan")
@js.native
/**
  * Constructs a new QueryPlan.
  * @param [properties] Properties to set
  */
open class QueryPlan ()
  extends StObject
     with IQueryPlan {
  def this(properties: IQueryPlan) = this()
  
  /** QueryPlan planNodes. */
  @JSName("planNodes")
  var planNodes_QueryPlan: js.Array[IPlanNode] = js.native
  
  /**
    * Converts this QueryPlan to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object QueryPlan {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.QueryPlan")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new QueryPlan instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryPlan instance
    */
  /* static member */
  inline def create(): QueryPlan = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[QueryPlan]
  inline def create(properties: IQueryPlan): QueryPlan = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[QueryPlan]
  
  inline def decode(reader: js.typedarray.Uint8Array): QueryPlan = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryPlan]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): QueryPlan = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryPlan]
  /**
    * Decodes a QueryPlan message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryPlan
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): QueryPlan = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryPlan]
  inline def decode(reader: Reader, length: Double): QueryPlan = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryPlan]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): QueryPlan = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryPlan]
  /**
    * Decodes a QueryPlan message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryPlan
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): QueryPlan = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryPlan]
  
  /**
    * Encodes the specified QueryPlan message. Does not implicitly {@link google.spanner.v1.QueryPlan.verify|verify} messages.
    * @param message QueryPlan message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IQueryPlan): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IQueryPlan, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified QueryPlan message, length delimited. Does not implicitly {@link google.spanner.v1.QueryPlan.verify|verify} messages.
    * @param message QueryPlan message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IQueryPlan): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IQueryPlan, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a QueryPlan message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryPlan
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): QueryPlan = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[QueryPlan]
  
  /**
    * Gets the default type url for QueryPlan
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a QueryPlan message. Also converts values to other types if specified.
    * @param message QueryPlan
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: QueryPlan): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: QueryPlan, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a QueryPlan message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
