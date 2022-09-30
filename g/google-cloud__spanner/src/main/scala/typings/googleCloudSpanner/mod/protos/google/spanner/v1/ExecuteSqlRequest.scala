package typings.googleCloudSpanner.mod.protos.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.IQueryOptions
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IExecuteSqlRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExecuteSqlRequest. */
@JSImport("@google-cloud/spanner", "protos.google.spanner.v1.ExecuteSqlRequest")
@js.native
/**
  * Constructs a new ExecuteSqlRequest.
  * @param [properties] Properties to set
  */
open class ExecuteSqlRequest ()
  extends typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest {
  def this(properties: IExecuteSqlRequest) = this()
}
object ExecuteSqlRequest {
  
  @JSImport("@google-cloud/spanner", "protos.google.spanner.v1.ExecuteSqlRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /** QueryMode enum. */
  @JSImport("@google-cloud/spanner", "protos.google.spanner.v1.ExecuteSqlRequest.QueryMode")
  @js.native
  object QueryMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryMode & Double
      ] = js.native
    
    /* 0 */ val NORMAL: typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryMode.NORMAL & Double = js.native
    
    /* 1 */ val PLAN: typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryMode.PLAN & Double = js.native
    
    /* 2 */ val PROFILE: typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryMode.PROFILE & Double = js.native
  }
  
  /** Represents a QueryOptions. */
  @JSImport("@google-cloud/spanner", "protos.google.spanner.v1.ExecuteSqlRequest.QueryOptions")
  @js.native
  /**
    * Constructs a new QueryOptions.
    * @param [properties] Properties to set
    */
  open class QueryOptions ()
    extends typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions {
    def this(properties: IQueryOptions) = this()
  }
  object QueryOptions {
    
    @JSImport("@google-cloud/spanner", "protos.google.spanner.v1.ExecuteSqlRequest.QueryOptions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new QueryOptions instance using the specified properties.
      * @param [properties] Properties to set
      * @returns QueryOptions instance
      */
    /* static member */
    inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions]
    inline def create(properties: IQueryOptions): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions]
    
    inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions]
    /**
      * Decodes a QueryOptions message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns QueryOptions
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions]
    inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions]
    /**
      * Decodes a QueryOptions message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns QueryOptions
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions]
    
    /**
      * Encodes the specified QueryOptions message. Does not implicitly {@link google.spanner.v1.ExecuteSqlRequest.QueryOptions.verify|verify} messages.
      * @param message QueryOptions message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IQueryOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IQueryOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified QueryOptions message, length delimited. Does not implicitly {@link google.spanner.v1.ExecuteSqlRequest.QueryOptions.verify|verify} messages.
      * @param message QueryOptions message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IQueryOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IQueryOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a QueryOptions message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns QueryOptions
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions]
    
    /**
      * Gets the default type url for QueryOptions
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a QueryOptions message. Also converts values to other types if specified.
      * @param message QueryOptions
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryOptions,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a QueryOptions message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new ExecuteSqlRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExecuteSqlRequest instance
    */
  /* static member */
  inline def create(): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest]
  inline def create(properties: IExecuteSqlRequest): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest]
  /**
    * Decodes an ExecuteSqlRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExecuteSqlRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest]
  inline def decode(reader: Reader, length: Double): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest]
  /**
    * Decodes an ExecuteSqlRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExecuteSqlRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest]
  
  /**
    * Encodes the specified ExecuteSqlRequest message. Does not implicitly {@link google.spanner.v1.ExecuteSqlRequest.verify|verify} messages.
    * @param message ExecuteSqlRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IExecuteSqlRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IExecuteSqlRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ExecuteSqlRequest message, length delimited. Does not implicitly {@link google.spanner.v1.ExecuteSqlRequest.verify|verify} messages.
    * @param message ExecuteSqlRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IExecuteSqlRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IExecuteSqlRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an ExecuteSqlRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExecuteSqlRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest]
  
  /**
    * Gets the default type url for ExecuteSqlRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an ExecuteSqlRequest message. Also converts values to other types if specified.
    * @param message ExecuteSqlRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an ExecuteSqlRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
