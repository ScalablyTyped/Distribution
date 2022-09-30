package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommitResponse. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.CommitResponse")
@js.native
/**
  * Constructs a new CommitResponse.
  * @param [properties] Properties to set
  */
open class CommitResponse ()
  extends StObject
     with ICommitResponse {
  def this(properties: ICommitResponse) = this()
  
  /**
    * Converts this CommitResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CommitResponse {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.CommitResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a CommitStats. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.CommitResponse.CommitStats")
  @js.native
  /**
    * Constructs a new CommitStats.
    * @param [properties] Properties to set
    */
  open class CommitStats ()
    extends StObject
       with ICommitStats {
    def this(properties: ICommitStats) = this()
    
    /** CommitStats mutationCount. */
    @JSName("mutationCount")
    var mutationCount_CommitStats: Double | typings.long.mod.^ | String = js.native
    
    /**
      * Converts this CommitStats to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object CommitStats {
    
    @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.CommitResponse.CommitStats")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new CommitStats instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CommitStats instance
      */
    /* static member */
    inline def create(): CommitStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommitStats]
    inline def create(properties: ICommitStats): CommitStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CommitStats]
    
    inline def decode(reader: js.typedarray.Uint8Array): CommitStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitStats]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): CommitStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommitStats]
    /**
      * Decodes a CommitStats message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CommitStats
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): CommitStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitStats]
    inline def decode(reader: Reader, length: Double): CommitStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommitStats]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): CommitStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitStats]
    /**
      * Decodes a CommitStats message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CommitStats
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): CommitStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitStats]
    
    /**
      * Encodes the specified CommitStats message. Does not implicitly {@link google.spanner.v1.CommitResponse.CommitStats.verify|verify} messages.
      * @param message CommitStats message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ICommitStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ICommitStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified CommitStats message, length delimited. Does not implicitly {@link google.spanner.v1.CommitResponse.CommitStats.verify|verify} messages.
      * @param message CommitStats message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ICommitStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ICommitStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a CommitStats message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CommitStats
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): CommitStats = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommitStats]
    
    /**
      * Gets the default type url for CommitStats
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a CommitStats message. Also converts values to other types if specified.
      * @param message CommitStats
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: CommitStats): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: CommitStats, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a CommitStats message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new CommitResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommitResponse instance
    */
  /* static member */
  inline def create(): CommitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommitResponse]
  inline def create(properties: ICommitResponse): CommitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CommitResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): CommitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CommitResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommitResponse]
  /**
    * Decodes a CommitResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommitResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CommitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitResponse]
  inline def decode(reader: Reader, length: Double): CommitResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CommitResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CommitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitResponse]
  /**
    * Decodes a CommitResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommitResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CommitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CommitResponse]
  
  /**
    * Encodes the specified CommitResponse message. Does not implicitly {@link google.spanner.v1.CommitResponse.verify|verify} messages.
    * @param message CommitResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICommitResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICommitResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CommitResponse message, length delimited. Does not implicitly {@link google.spanner.v1.CommitResponse.verify|verify} messages.
    * @param message CommitResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICommitResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICommitResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CommitResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommitResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CommitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommitResponse]
  
  /**
    * Gets the default type url for CommitResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CommitResponse message. Also converts values to other types if specified.
    * @param message CommitResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CommitResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CommitResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CommitResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a CommitStats. */
  trait ICommitStats extends StObject {
    
    /** CommitStats mutationCount */
    var mutationCount: js.UndefOr[Double | typings.long.mod.^ | String | Null] = js.undefined
  }
  object ICommitStats {
    
    inline def apply(): ICommitStats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICommitStats]
    }
    
    extension [Self <: ICommitStats](x: Self) {
      
      inline def setMutationCount(value: Double | typings.long.mod.^ | String): Self = StObject.set(x, "mutationCount", value.asInstanceOf[js.Any])
      
      inline def setMutationCountNull: Self = StObject.set(x, "mutationCount", null)
      
      inline def setMutationCountUndefined: Self = StObject.set(x, "mutationCount", js.undefined)
    }
  }
}
