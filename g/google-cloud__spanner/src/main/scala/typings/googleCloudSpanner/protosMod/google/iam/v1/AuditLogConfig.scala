package typings.googleCloudSpanner.protosMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig.LogType
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an AuditLogConfig. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.iam.v1.AuditLogConfig")
@js.native
/**
  * Constructs a new AuditLogConfig.
  * @param [properties] Properties to set
  */
open class AuditLogConfig ()
  extends StObject
     with IAuditLogConfig {
  def this(properties: IAuditLogConfig) = this()
  
  /** AuditLogConfig exemptedMembers. */
  @JSName("exemptedMembers")
  var exemptedMembers_AuditLogConfig: js.Array[String] = js.native
  
  /** AuditLogConfig logType. */
  @JSName("logType")
  var logType_AuditLogConfig: LogType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.iam.v1.AuditLogConfig.LogType * / any */ String) = js.native
  
  /**
    * Converts this AuditLogConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object AuditLogConfig {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.iam.v1.AuditLogConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait LogType extends StObject
  /** LogType enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.iam.v1.AuditLogConfig.LogType")
  @js.native
  object LogType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogType & Double] = js.native
    
    @js.native
    sealed trait ADMIN_READ
      extends StObject
         with LogType
    /* 1 */ val ADMIN_READ: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig.LogType.ADMIN_READ & Double = js.native
    
    @js.native
    sealed trait DATA_READ
      extends StObject
         with LogType
    /* 3 */ val DATA_READ: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig.LogType.DATA_READ & Double = js.native
    
    @js.native
    sealed trait DATA_WRITE
      extends StObject
         with LogType
    /* 2 */ val DATA_WRITE: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig.LogType.DATA_WRITE & Double = js.native
    
    @js.native
    sealed trait LOG_TYPE_UNSPECIFIED
      extends StObject
         with LogType
    /* 0 */ val LOG_TYPE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig.LogType.LOG_TYPE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new AuditLogConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AuditLogConfig instance
    */
  /* static member */
  inline def create(): AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AuditLogConfig]
  inline def create(properties: IAuditLogConfig): AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[AuditLogConfig]
  
  inline def decode(reader: js.typedarray.Uint8Array): AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditLogConfig]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): AuditLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AuditLogConfig]
  /**
    * Decodes an AuditLogConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AuditLogConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditLogConfig]
  inline def decode(reader: Reader, length: Double): AuditLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AuditLogConfig]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditLogConfig]
  /**
    * Decodes an AuditLogConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AuditLogConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditLogConfig]
  
  /**
    * Encodes the specified AuditLogConfig message. Does not implicitly {@link google.iam.v1.AuditLogConfig.verify|verify} messages.
    * @param message AuditLogConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IAuditLogConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IAuditLogConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified AuditLogConfig message, length delimited. Does not implicitly {@link google.iam.v1.AuditLogConfig.verify|verify} messages.
    * @param message AuditLogConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IAuditLogConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IAuditLogConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an AuditLogConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns AuditLogConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): AuditLogConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[AuditLogConfig]
  
  /**
    * Gets the default type url for AuditLogConfig
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an AuditLogConfig message. Also converts values to other types if specified.
    * @param message AuditLogConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: AuditLogConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: AuditLogConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an AuditLogConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
