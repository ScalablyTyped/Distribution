package typings.googleCloudSpanner.protosMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta.Action
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an AuditConfigDelta. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.iam.v1.AuditConfigDelta")
@js.native
/**
  * Constructs a new AuditConfigDelta.
  * @param [properties] Properties to set
  */
open class AuditConfigDelta ()
  extends StObject
     with IAuditConfigDelta {
  def this(properties: IAuditConfigDelta) = this()
  
  /** AuditConfigDelta action. */
  @JSName("action")
  var action_AuditConfigDelta: Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.iam.v1.AuditConfigDelta.Action * / any */ String) = js.native
  
  /** AuditConfigDelta exemptedMember. */
  @JSName("exemptedMember")
  var exemptedMember_AuditConfigDelta: String = js.native
  
  /** AuditConfigDelta logType. */
  @JSName("logType")
  var logType_AuditConfigDelta: String = js.native
  
  /** AuditConfigDelta service. */
  @JSName("service")
  var service_AuditConfigDelta: String = js.native
  
  /**
    * Converts this AuditConfigDelta to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object AuditConfigDelta {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.iam.v1.AuditConfigDelta")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Action extends StObject
  /** Action enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.iam.v1.AuditConfigDelta.Action")
  @js.native
  object Action extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Action & Double] = js.native
    
    @js.native
    sealed trait ACTION_UNSPECIFIED
      extends StObject
         with Action
    /* 0 */ val ACTION_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta.Action.ACTION_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait ADD
      extends StObject
         with Action
    /* 1 */ val ADD: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta.Action.ADD & Double = js.native
    
    @js.native
    sealed trait REMOVE
      extends StObject
         with Action
    /* 2 */ val REMOVE: typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta.Action.REMOVE & Double = js.native
  }
  
  /**
    * Creates a new AuditConfigDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AuditConfigDelta instance
    */
  /* static member */
  inline def create(): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AuditConfigDelta]
  inline def create(properties: IAuditConfigDelta): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[AuditConfigDelta]
  
  inline def decode(reader: js.typedarray.Uint8Array): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditConfigDelta]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): AuditConfigDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AuditConfigDelta]
  /**
    * Decodes an AuditConfigDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AuditConfigDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditConfigDelta]
  inline def decode(reader: Reader, length: Double): AuditConfigDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AuditConfigDelta]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditConfigDelta]
  /**
    * Decodes an AuditConfigDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AuditConfigDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditConfigDelta]
  
  /**
    * Encodes the specified AuditConfigDelta message. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
    * @param message AuditConfigDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IAuditConfigDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IAuditConfigDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified AuditConfigDelta message, length delimited. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
    * @param message AuditConfigDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IAuditConfigDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IAuditConfigDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an AuditConfigDelta message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns AuditConfigDelta
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[AuditConfigDelta]
  
  /**
    * Gets the default type url for AuditConfigDelta
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an AuditConfigDelta message. Also converts values to other types if specified.
    * @param message AuditConfigDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: AuditConfigDelta): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: AuditConfigDelta, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an AuditConfigDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
