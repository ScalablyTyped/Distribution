package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.v1.RequestOptions.Priority
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RequestOptions. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.RequestOptions")
@js.native
/**
  * Constructs a new RequestOptions.
  * @param [properties] Properties to set
  */
open class RequestOptions ()
  extends StObject
     with IRequestOptions {
  def this(properties: IRequestOptions) = this()
  
  /** RequestOptions priority. */
  @JSName("priority")
  var priority_RequestOptions: Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.RequestOptions.Priority * / any */ String) = js.native
  
  /** RequestOptions requestTag. */
  @JSName("requestTag")
  var requestTag_RequestOptions: String = js.native
  
  /**
    * Converts this RequestOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** RequestOptions transactionTag. */
  @JSName("transactionTag")
  var transactionTag_RequestOptions: String = js.native
}
object RequestOptions {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.RequestOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Priority extends StObject
  /** Priority enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.RequestOptions.Priority")
  @js.native
  object Priority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Priority & Double] = js.native
    
    @js.native
    sealed trait PRIORITY_HIGH
      extends StObject
         with Priority
    /* 3 */ val PRIORITY_HIGH: typings.googleCloudSpanner.protosMod.google.spanner.v1.RequestOptions.Priority.PRIORITY_HIGH & Double = js.native
    
    @js.native
    sealed trait PRIORITY_LOW
      extends StObject
         with Priority
    /* 1 */ val PRIORITY_LOW: typings.googleCloudSpanner.protosMod.google.spanner.v1.RequestOptions.Priority.PRIORITY_LOW & Double = js.native
    
    @js.native
    sealed trait PRIORITY_MEDIUM
      extends StObject
         with Priority
    /* 2 */ val PRIORITY_MEDIUM: typings.googleCloudSpanner.protosMod.google.spanner.v1.RequestOptions.Priority.PRIORITY_MEDIUM & Double = js.native
    
    @js.native
    sealed trait PRIORITY_UNSPECIFIED
      extends StObject
         with Priority
    /* 0 */ val PRIORITY_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.v1.RequestOptions.Priority.PRIORITY_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new RequestOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RequestOptions instance
    */
  /* static member */
  inline def create(): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RequestOptions]
  inline def create(properties: IRequestOptions): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
  
  inline def decode(reader: js.typedarray.Uint8Array): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  /**
    * Decodes a RequestOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RequestOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
  inline def decode(reader: Reader, length: Double): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
  /**
    * Decodes a RequestOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RequestOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
  
  /**
    * Encodes the specified RequestOptions message. Does not implicitly {@link google.spanner.v1.RequestOptions.verify|verify} messages.
    * @param message RequestOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IRequestOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IRequestOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified RequestOptions message, length delimited. Does not implicitly {@link google.spanner.v1.RequestOptions.verify|verify} messages.
    * @param message RequestOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IRequestOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IRequestOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a RequestOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RequestOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
  
  /**
    * Gets the default type url for RequestOptions
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a RequestOptions message. Also converts values to other types if specified.
    * @param message RequestOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: RequestOptions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: RequestOptions, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a RequestOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
