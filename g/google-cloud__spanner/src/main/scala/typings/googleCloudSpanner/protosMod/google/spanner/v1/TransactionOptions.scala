package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.googleCloudSpannerStrings.exactStaleness
import typings.googleCloudSpanner.googleCloudSpannerStrings.maxStaleness
import typings.googleCloudSpanner.googleCloudSpannerStrings.minReadTimestamp
import typings.googleCloudSpanner.googleCloudSpannerStrings.partitionedDml
import typings.googleCloudSpanner.googleCloudSpannerStrings.readOnly
import typings.googleCloudSpanner.googleCloudSpannerStrings.readTimestamp
import typings.googleCloudSpanner.googleCloudSpannerStrings.readWrite
import typings.googleCloudSpanner.googleCloudSpannerStrings.strong
import typings.googleCloudSpanner.protosMod.google.protobuf.IDuration
import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TransactionOptions. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TransactionOptions")
@js.native
/**
  * Constructs a new TransactionOptions.
  * @param [properties] Properties to set
  */
open class TransactionOptions ()
  extends StObject
     with ITransactionOptions {
  def this(properties: ITransactionOptions) = this()
  
  /** TransactionOptions mode. */
  var mode: js.UndefOr[readWrite | partitionedDml | readOnly] = js.native
  
  /**
    * Converts this TransactionOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object TransactionOptions {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TransactionOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a PartitionedDml. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TransactionOptions.PartitionedDml")
  @js.native
  /**
    * Constructs a new PartitionedDml.
    * @param [properties] Properties to set
    */
  open class PartitionedDml ()
    extends StObject
       with IPartitionedDml {
    def this(properties: IPartitionedDml) = this()
    
    /**
      * Converts this PartitionedDml to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object PartitionedDml {
    
    @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TransactionOptions.PartitionedDml")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PartitionedDml instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PartitionedDml instance
      */
    /* static member */
    inline def create(): PartitionedDml = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PartitionedDml]
    inline def create(properties: IPartitionedDml): PartitionedDml = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PartitionedDml]
    
    inline def decode(reader: js.typedarray.Uint8Array): PartitionedDml = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionedDml]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): PartitionedDml = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PartitionedDml]
    /**
      * Decodes a PartitionedDml message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PartitionedDml
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): PartitionedDml = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionedDml]
    inline def decode(reader: Reader, length: Double): PartitionedDml = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PartitionedDml]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): PartitionedDml = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionedDml]
    /**
      * Decodes a PartitionedDml message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PartitionedDml
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): PartitionedDml = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PartitionedDml]
    
    /**
      * Encodes the specified PartitionedDml message. Does not implicitly {@link google.spanner.v1.TransactionOptions.PartitionedDml.verify|verify} messages.
      * @param message PartitionedDml message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IPartitionedDml): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IPartitionedDml, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified PartitionedDml message, length delimited. Does not implicitly {@link google.spanner.v1.TransactionOptions.PartitionedDml.verify|verify} messages.
      * @param message PartitionedDml message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IPartitionedDml): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IPartitionedDml, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a PartitionedDml message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PartitionedDml
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): PartitionedDml = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PartitionedDml]
    
    /**
      * Gets the default type url for PartitionedDml
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a PartitionedDml message. Also converts values to other types if specified.
      * @param message PartitionedDml
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: PartitionedDml): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: PartitionedDml, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a PartitionedDml message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ReadOnly. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TransactionOptions.ReadOnly")
  @js.native
  /**
    * Constructs a new ReadOnly.
    * @param [properties] Properties to set
    */
  open class ReadOnly ()
    extends StObject
       with IReadOnly {
    def this(properties: IReadOnly) = this()
    
    /** ReadOnly returnReadTimestamp. */
    @JSName("returnReadTimestamp")
    var returnReadTimestamp_ReadOnly: Boolean = js.native
    
    /** ReadOnly timestampBound. */
    var timestampBound: js.UndefOr[strong | minReadTimestamp | maxStaleness | readTimestamp | exactStaleness] = js.native
    
    /**
      * Converts this ReadOnly to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ReadOnly {
    
    @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TransactionOptions.ReadOnly")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ReadOnly instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ReadOnly instance
      */
    /* static member */
    inline def create(): ReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ReadOnly]
    inline def create(properties: IReadOnly): ReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ReadOnly]
    
    inline def decode(reader: js.typedarray.Uint8Array): ReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReadOnly]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): ReadOnly = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReadOnly]
    /**
      * Decodes a ReadOnly message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ReadOnly
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): ReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReadOnly]
    inline def decode(reader: Reader, length: Double): ReadOnly = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReadOnly]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): ReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReadOnly]
    /**
      * Decodes a ReadOnly message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ReadOnly
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): ReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReadOnly]
    
    /**
      * Encodes the specified ReadOnly message. Does not implicitly {@link google.spanner.v1.TransactionOptions.ReadOnly.verify|verify} messages.
      * @param message ReadOnly message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IReadOnly): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IReadOnly, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ReadOnly message, length delimited. Does not implicitly {@link google.spanner.v1.TransactionOptions.ReadOnly.verify|verify} messages.
      * @param message ReadOnly message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IReadOnly): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IReadOnly, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ReadOnly message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ReadOnly
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ReadOnly]
    
    /**
      * Gets the default type url for ReadOnly
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a ReadOnly message. Also converts values to other types if specified.
      * @param message ReadOnly
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ReadOnly): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ReadOnly, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ReadOnly message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ReadWrite. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TransactionOptions.ReadWrite")
  @js.native
  /**
    * Constructs a new ReadWrite.
    * @param [properties] Properties to set
    */
  open class ReadWrite ()
    extends StObject
       with IReadWrite {
    def this(properties: IReadWrite) = this()
    
    /**
      * Converts this ReadWrite to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ReadWrite {
    
    @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TransactionOptions.ReadWrite")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ReadWrite instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ReadWrite instance
      */
    /* static member */
    inline def create(): ReadWrite = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ReadWrite]
    inline def create(properties: IReadWrite): ReadWrite = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ReadWrite]
    
    inline def decode(reader: js.typedarray.Uint8Array): ReadWrite = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReadWrite]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): ReadWrite = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReadWrite]
    /**
      * Decodes a ReadWrite message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ReadWrite
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): ReadWrite = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReadWrite]
    inline def decode(reader: Reader, length: Double): ReadWrite = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReadWrite]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): ReadWrite = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReadWrite]
    /**
      * Decodes a ReadWrite message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ReadWrite
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): ReadWrite = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReadWrite]
    
    /**
      * Encodes the specified ReadWrite message. Does not implicitly {@link google.spanner.v1.TransactionOptions.ReadWrite.verify|verify} messages.
      * @param message ReadWrite message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IReadWrite): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IReadWrite, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ReadWrite message, length delimited. Does not implicitly {@link google.spanner.v1.TransactionOptions.ReadWrite.verify|verify} messages.
      * @param message ReadWrite message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IReadWrite): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IReadWrite, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ReadWrite message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ReadWrite
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ReadWrite = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ReadWrite]
    
    /**
      * Gets the default type url for ReadWrite
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a ReadWrite message. Also converts values to other types if specified.
      * @param message ReadWrite
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ReadWrite): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ReadWrite, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a ReadWrite message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new TransactionOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TransactionOptions instance
    */
  /* static member */
  inline def create(): TransactionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TransactionOptions]
  inline def create(properties: ITransactionOptions): TransactionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TransactionOptions]
  
  inline def decode(reader: js.typedarray.Uint8Array): TransactionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionOptions]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): TransactionOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TransactionOptions]
  /**
    * Decodes a TransactionOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TransactionOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): TransactionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionOptions]
  inline def decode(reader: Reader, length: Double): TransactionOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TransactionOptions]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): TransactionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionOptions]
  /**
    * Decodes a TransactionOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TransactionOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): TransactionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionOptions]
  
  /**
    * Encodes the specified TransactionOptions message. Does not implicitly {@link google.spanner.v1.TransactionOptions.verify|verify} messages.
    * @param message TransactionOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITransactionOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITransactionOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TransactionOptions message, length delimited. Does not implicitly {@link google.spanner.v1.TransactionOptions.verify|verify} messages.
    * @param message TransactionOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITransactionOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITransactionOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TransactionOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): TransactionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TransactionOptions]
  
  /**
    * Gets the default type url for TransactionOptions
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a TransactionOptions message. Also converts values to other types if specified.
    * @param message TransactionOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: TransactionOptions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: TransactionOptions, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TransactionOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a PartitionedDml. */
  trait IPartitionedDml extends StObject
  
  /** Properties of a ReadOnly. */
  trait IReadOnly extends StObject {
    
    /** ReadOnly exactStaleness */
    var exactStaleness: js.UndefOr[IDuration | Null] = js.undefined
    
    /** ReadOnly maxStaleness */
    var maxStaleness: js.UndefOr[IDuration | Null] = js.undefined
    
    /** ReadOnly minReadTimestamp */
    var minReadTimestamp: js.UndefOr[ITimestamp | Null] = js.undefined
    
    /** ReadOnly readTimestamp */
    var readTimestamp: js.UndefOr[ITimestamp | Null] = js.undefined
    
    /** ReadOnly returnReadTimestamp */
    var returnReadTimestamp: js.UndefOr[Boolean | Null] = js.undefined
    
    /** ReadOnly strong */
    var strong: js.UndefOr[Boolean | Null] = js.undefined
  }
  object IReadOnly {
    
    inline def apply(): IReadOnly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReadOnly]
    }
    
    extension [Self <: IReadOnly](x: Self) {
      
      inline def setExactStaleness(value: IDuration): Self = StObject.set(x, "exactStaleness", value.asInstanceOf[js.Any])
      
      inline def setExactStalenessNull: Self = StObject.set(x, "exactStaleness", null)
      
      inline def setExactStalenessUndefined: Self = StObject.set(x, "exactStaleness", js.undefined)
      
      inline def setMaxStaleness(value: IDuration): Self = StObject.set(x, "maxStaleness", value.asInstanceOf[js.Any])
      
      inline def setMaxStalenessNull: Self = StObject.set(x, "maxStaleness", null)
      
      inline def setMaxStalenessUndefined: Self = StObject.set(x, "maxStaleness", js.undefined)
      
      inline def setMinReadTimestamp(value: ITimestamp): Self = StObject.set(x, "minReadTimestamp", value.asInstanceOf[js.Any])
      
      inline def setMinReadTimestampNull: Self = StObject.set(x, "minReadTimestamp", null)
      
      inline def setMinReadTimestampUndefined: Self = StObject.set(x, "minReadTimestamp", js.undefined)
      
      inline def setReadTimestamp(value: ITimestamp): Self = StObject.set(x, "readTimestamp", value.asInstanceOf[js.Any])
      
      inline def setReadTimestampNull: Self = StObject.set(x, "readTimestamp", null)
      
      inline def setReadTimestampUndefined: Self = StObject.set(x, "readTimestamp", js.undefined)
      
      inline def setReturnReadTimestamp(value: Boolean): Self = StObject.set(x, "returnReadTimestamp", value.asInstanceOf[js.Any])
      
      inline def setReturnReadTimestampNull: Self = StObject.set(x, "returnReadTimestamp", null)
      
      inline def setReturnReadTimestampUndefined: Self = StObject.set(x, "returnReadTimestamp", js.undefined)
      
      inline def setStrong(value: Boolean): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongNull: Self = StObject.set(x, "strong", null)
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
    }
  }
  
  /** Properties of a ReadWrite. */
  trait IReadWrite extends StObject
}
