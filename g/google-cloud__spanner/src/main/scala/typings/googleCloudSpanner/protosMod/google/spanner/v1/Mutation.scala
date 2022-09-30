package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.googleCloudSpannerStrings.delete
import typings.googleCloudSpanner.googleCloudSpannerStrings.insert
import typings.googleCloudSpanner.googleCloudSpannerStrings.insertOrUpdate
import typings.googleCloudSpanner.googleCloudSpannerStrings.replace
import typings.googleCloudSpanner.googleCloudSpannerStrings.update
import typings.googleCloudSpanner.protosMod.google.protobuf.IListValue
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Mutation. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.Mutation")
@js.native
/**
  * Constructs a new Mutation.
  * @param [properties] Properties to set
  */
open class Mutation ()
  extends StObject
     with IMutation {
  def this(properties: IMutation) = this()
  
  /** Mutation operation. */
  var operation: js.UndefOr[insert | update | insertOrUpdate | replace | delete] = js.native
  
  /**
    * Converts this Mutation to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Mutation {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.Mutation")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Delete. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.Mutation.Delete")
  @js.native
  /**
    * Constructs a new Delete.
    * @param [properties] Properties to set
    */
  open class Delete ()
    extends StObject
       with IDelete {
    def this(properties: IDelete) = this()
    
    /** Delete table. */
    @JSName("table")
    var table_Delete: String = js.native
    
    /**
      * Converts this Delete to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Delete {
    
    @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.Mutation.Delete")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Delete instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Delete instance
      */
    /* static member */
    inline def create(): Delete = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Delete]
    inline def create(properties: IDelete): Delete = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Delete]
    
    inline def decode(reader: js.typedarray.Uint8Array): Delete = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Delete]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Delete = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Delete]
    /**
      * Decodes a Delete message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Delete
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Delete = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Delete]
    inline def decode(reader: Reader, length: Double): Delete = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Delete]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Delete = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Delete]
    /**
      * Decodes a Delete message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Delete
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Delete = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Delete]
    
    /**
      * Encodes the specified Delete message. Does not implicitly {@link google.spanner.v1.Mutation.Delete.verify|verify} messages.
      * @param message Delete message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IDelete): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IDelete, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Delete message, length delimited. Does not implicitly {@link google.spanner.v1.Mutation.Delete.verify|verify} messages.
      * @param message Delete message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IDelete): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IDelete, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Delete message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Delete
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Delete = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Delete]
    
    /**
      * Gets the default type url for Delete
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a Delete message. Also converts values to other types if specified.
      * @param message Delete
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Delete): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Delete, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Delete message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Write. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.Mutation.Write")
  @js.native
  /**
    * Constructs a new Write.
    * @param [properties] Properties to set
    */
  open class Write ()
    extends StObject
       with IWrite {
    def this(properties: IWrite) = this()
    
    /** Write columns. */
    @JSName("columns")
    var columns_Write: js.Array[String] = js.native
    
    /** Write table. */
    @JSName("table")
    var table_Write: String = js.native
    
    /**
      * Converts this Write to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** Write values. */
    @JSName("values")
    var values_Write: js.Array[IListValue] = js.native
  }
  object Write {
    
    @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.Mutation.Write")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Write instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Write instance
      */
    /* static member */
    inline def create(): Write = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Write]
    inline def create(properties: IWrite): Write = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Write]
    
    inline def decode(reader: js.typedarray.Uint8Array): Write = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Write]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Write = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Write]
    /**
      * Decodes a Write message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Write
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Write = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Write]
    inline def decode(reader: Reader, length: Double): Write = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Write]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Write = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Write]
    /**
      * Decodes a Write message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Write
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Write = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Write]
    
    /**
      * Encodes the specified Write message. Does not implicitly {@link google.spanner.v1.Mutation.Write.verify|verify} messages.
      * @param message Write message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IWrite): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IWrite, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Write message, length delimited. Does not implicitly {@link google.spanner.v1.Mutation.Write.verify|verify} messages.
      * @param message Write message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IWrite): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IWrite, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Write message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Write
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Write = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Write]
    
    /**
      * Gets the default type url for Write
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a Write message. Also converts values to other types if specified.
      * @param message Write
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Write): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Write, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Write message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new Mutation instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Mutation instance
    */
  /* static member */
  inline def create(): Mutation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Mutation]
  inline def create(properties: IMutation): Mutation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Mutation]
  
  inline def decode(reader: js.typedarray.Uint8Array): Mutation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Mutation]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Mutation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Mutation]
  /**
    * Decodes a Mutation message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Mutation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Mutation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Mutation]
  inline def decode(reader: Reader, length: Double): Mutation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Mutation]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Mutation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Mutation]
  /**
    * Decodes a Mutation message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Mutation
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Mutation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Mutation]
  
  /**
    * Encodes the specified Mutation message. Does not implicitly {@link google.spanner.v1.Mutation.verify|verify} messages.
    * @param message Mutation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IMutation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IMutation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Mutation message, length delimited. Does not implicitly {@link google.spanner.v1.Mutation.verify|verify} messages.
    * @param message Mutation message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IMutation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IMutation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Mutation message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Mutation
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Mutation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Mutation]
  
  /**
    * Gets the default type url for Mutation
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a Mutation message. Also converts values to other types if specified.
    * @param message Mutation
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Mutation): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Mutation, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Mutation message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a Delete. */
  trait IDelete extends StObject {
    
    /** Delete keySet */
    var keySet: js.UndefOr[IKeySet | Null] = js.undefined
    
    /** Delete table */
    var table: js.UndefOr[String | Null] = js.undefined
  }
  object IDelete {
    
    inline def apply(): IDelete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDelete]
    }
    
    extension [Self <: IDelete](x: Self) {
      
      inline def setKeySet(value: IKeySet): Self = StObject.set(x, "keySet", value.asInstanceOf[js.Any])
      
      inline def setKeySetNull: Self = StObject.set(x, "keySet", null)
      
      inline def setKeySetUndefined: Self = StObject.set(x, "keySet", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableNull: Self = StObject.set(x, "table", null)
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  /** Properties of a Write. */
  trait IWrite extends StObject {
    
    /** Write columns */
    var columns: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** Write table */
    var table: js.UndefOr[String | Null] = js.undefined
    
    /** Write values */
    var values: js.UndefOr[js.Array[IListValue] | Null] = js.undefined
  }
  object IWrite {
    
    inline def apply(): IWrite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWrite]
    }
    
    extension [Self <: IWrite](x: Self) {
      
      inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsNull: Self = StObject.set(x, "columns", null)
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableNull: Self = StObject.set(x, "table", null)
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setValues(value: js.Array[IListValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesNull: Self = StObject.set(x, "values", null)
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: IListValue*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
