package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.protobuf.IStruct
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteBatchDmlRequest.IStatement
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.long.mod.^
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExecuteBatchDmlRequest. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.ExecuteBatchDmlRequest")
@js.native
/**
  * Constructs a new ExecuteBatchDmlRequest.
  * @param [properties] Properties to set
  */
open class ExecuteBatchDmlRequest ()
  extends StObject
     with IExecuteBatchDmlRequest {
  def this(properties: IExecuteBatchDmlRequest) = this()
  
  /** ExecuteBatchDmlRequest seqno. */
  @JSName("seqno")
  var seqno_ExecuteBatchDmlRequest: Double | ^ | String = js.native
  
  /** ExecuteBatchDmlRequest session. */
  @JSName("session")
  var session_ExecuteBatchDmlRequest: String = js.native
  
  /** ExecuteBatchDmlRequest statements. */
  @JSName("statements")
  var statements_ExecuteBatchDmlRequest: js.Array[IStatement] = js.native
  
  /**
    * Converts this ExecuteBatchDmlRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ExecuteBatchDmlRequest {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.ExecuteBatchDmlRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Statement. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.ExecuteBatchDmlRequest.Statement")
  @js.native
  /**
    * Constructs a new Statement.
    * @param [properties] Properties to set
    */
  open class Statement ()
    extends StObject
       with IStatement {
    def this(properties: IStatement) = this()
    
    /** Statement paramTypes. */
    @JSName("paramTypes")
    var paramTypes_Statement: StringDictionary[IType] = js.native
    
    /** Statement sql. */
    @JSName("sql")
    var sql_Statement: String = js.native
    
    /**
      * Converts this Statement to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Statement {
    
    @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.ExecuteBatchDmlRequest.Statement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Statement instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Statement instance
      */
    /* static member */
    inline def create(): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Statement]
    inline def create(properties: IStatement): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Statement]
    
    inline def decode(reader: js.typedarray.Uint8Array): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Statement]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Statement]
    /**
      * Decodes a Statement message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Statement
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Statement]
    inline def decode(reader: Reader, length: Double): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Statement]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Statement]
    /**
      * Decodes a Statement message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Statement
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Statement]
    
    /**
      * Encodes the specified Statement message. Does not implicitly {@link google.spanner.v1.ExecuteBatchDmlRequest.Statement.verify|verify} messages.
      * @param message Statement message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IStatement): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IStatement, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Statement message, length delimited. Does not implicitly {@link google.spanner.v1.ExecuteBatchDmlRequest.Statement.verify|verify} messages.
      * @param message Statement message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IStatement): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IStatement, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Statement message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Statement
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Statement]
    
    /**
      * Gets the default type url for Statement
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a Statement message. Also converts values to other types if specified.
      * @param message Statement
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Statement): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Statement, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Statement message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new ExecuteBatchDmlRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExecuteBatchDmlRequest instance
    */
  /* static member */
  inline def create(): ExecuteBatchDmlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ExecuteBatchDmlRequest]
  inline def create(properties: IExecuteBatchDmlRequest): ExecuteBatchDmlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ExecuteBatchDmlRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ExecuteBatchDmlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ExecuteBatchDmlRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ExecuteBatchDmlRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ExecuteBatchDmlRequest]
  /**
    * Decodes an ExecuteBatchDmlRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExecuteBatchDmlRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ExecuteBatchDmlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ExecuteBatchDmlRequest]
  inline def decode(reader: Reader, length: Double): ExecuteBatchDmlRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ExecuteBatchDmlRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ExecuteBatchDmlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ExecuteBatchDmlRequest]
  /**
    * Decodes an ExecuteBatchDmlRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExecuteBatchDmlRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ExecuteBatchDmlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ExecuteBatchDmlRequest]
  
  /**
    * Encodes the specified ExecuteBatchDmlRequest message. Does not implicitly {@link google.spanner.v1.ExecuteBatchDmlRequest.verify|verify} messages.
    * @param message ExecuteBatchDmlRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IExecuteBatchDmlRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IExecuteBatchDmlRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ExecuteBatchDmlRequest message, length delimited. Does not implicitly {@link google.spanner.v1.ExecuteBatchDmlRequest.verify|verify} messages.
    * @param message ExecuteBatchDmlRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IExecuteBatchDmlRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IExecuteBatchDmlRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an ExecuteBatchDmlRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExecuteBatchDmlRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ExecuteBatchDmlRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ExecuteBatchDmlRequest]
  
  /**
    * Gets the default type url for ExecuteBatchDmlRequest
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an ExecuteBatchDmlRequest message. Also converts values to other types if specified.
    * @param message ExecuteBatchDmlRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ExecuteBatchDmlRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ExecuteBatchDmlRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an ExecuteBatchDmlRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a Statement. */
  trait IStatement extends StObject {
    
    /** Statement paramTypes */
    var paramTypes: js.UndefOr[StringDictionary[IType] | Null] = js.undefined
    
    /** Statement params */
    var params: js.UndefOr[IStruct | Null] = js.undefined
    
    /** Statement sql */
    var sql: js.UndefOr[String | Null] = js.undefined
  }
  object IStatement {
    
    inline def apply(): IStatement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStatement]
    }
    
    extension [Self <: IStatement](x: Self) {
      
      inline def setParamTypes(value: StringDictionary[IType]): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
      
      inline def setParamTypesNull: Self = StObject.set(x, "paramTypes", null)
      
      inline def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
      
      inline def setParams(value: IStruct): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsNull: Self = StObject.set(x, "params", null)
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      
      inline def setSqlNull: Self = StObject.set(x, "sql", null)
      
      inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
    }
  }
}
