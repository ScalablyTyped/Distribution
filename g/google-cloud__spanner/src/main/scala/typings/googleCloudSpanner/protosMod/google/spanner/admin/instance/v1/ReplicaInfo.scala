package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ReplicaInfo. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.ReplicaInfo")
@js.native
/**
  * Constructs a new ReplicaInfo.
  * @param [properties] Properties to set
  */
open class ReplicaInfo ()
  extends StObject
     with IReplicaInfo {
  def this(properties: IReplicaInfo) = this()
  
  /** ReplicaInfo defaultLeaderLocation. */
  @JSName("defaultLeaderLocation")
  var defaultLeaderLocation_ReplicaInfo: Boolean = js.native
  
  /** ReplicaInfo location. */
  @JSName("location")
  var location_ReplicaInfo: String = js.native
  
  /**
    * Converts this ReplicaInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** ReplicaInfo type. */
  @JSName("type")
  var type_ReplicaInfo: ReplicaType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType * / any */ String) = js.native
}
object ReplicaInfo {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.ReplicaInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ReplicaType extends StObject
  /** ReplicaType enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType")
  @js.native
  object ReplicaType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReplicaType & Double] = js.native
    
    @js.native
    sealed trait READ_ONLY
      extends StObject
         with ReplicaType
    /* 2 */ val READ_ONLY: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.READ_ONLY & Double = js.native
    
    @js.native
    sealed trait READ_WRITE
      extends StObject
         with ReplicaType
    /* 1 */ val READ_WRITE: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.READ_WRITE & Double = js.native
    
    @js.native
    sealed trait TYPE_UNSPECIFIED
      extends StObject
         with ReplicaType
    /* 0 */ val TYPE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.TYPE_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait WITNESS
      extends StObject
         with ReplicaType
    /* 3 */ val WITNESS: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.WITNESS & Double = js.native
  }
  
  /**
    * Creates a new ReplicaInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReplicaInfo instance
    */
  /* static member */
  inline def create(): ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ReplicaInfo]
  inline def create(properties: IReplicaInfo): ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ReplicaInfo]
  
  inline def decode(reader: js.typedarray.Uint8Array): ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReplicaInfo]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ReplicaInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReplicaInfo]
  /**
    * Decodes a ReplicaInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReplicaInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReplicaInfo]
  inline def decode(reader: Reader, length: Double): ReplicaInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReplicaInfo]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReplicaInfo]
  /**
    * Decodes a ReplicaInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReplicaInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReplicaInfo]
  
  /**
    * Encodes the specified ReplicaInfo message. Does not implicitly {@link google.spanner.admin.instance.v1.ReplicaInfo.verify|verify} messages.
    * @param message ReplicaInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IReplicaInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IReplicaInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ReplicaInfo message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.ReplicaInfo.verify|verify} messages.
    * @param message ReplicaInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IReplicaInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IReplicaInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ReplicaInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ReplicaInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ReplicaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ReplicaInfo]
  
  /**
    * Gets the default type url for ReplicaInfo
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ReplicaInfo message. Also converts values to other types if specified.
    * @param message ReplicaInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ReplicaInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ReplicaInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ReplicaInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
