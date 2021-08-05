package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an AuditConfigDelta. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta")
@js.native
/**
  * Constructs a new AuditConfigDelta.
  * @param [properties] Properties to set
  */
class AuditConfigDelta ()
  extends StObject
     with IAuditConfigDelta {
  def this(properties: IAuditConfigDelta) = this()
  
  /** AuditConfigDelta action. */
  @JSName("action")
  var action_AuditConfigDelta: Action = js.native
  
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
  def toJSON(): StringDictionary[js.Any] = js.native
}
object AuditConfigDelta {
  
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Action extends StObject
  /** Action enum. */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.Action")
  @js.native
  object Action extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Action & Double] = js.native
    
    @js.native
    sealed trait ACTION_UNSPECIFIED
      extends StObject
         with Action
    /* 0 */ val ACTION_UNSPECIFIED: typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action.ACTION_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait ADD
      extends StObject
         with Action
    /* 1 */ val ADD: typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action.ADD & Double = js.native
    
    @js.native
    sealed trait REMOVE
      extends StObject
         with Action
    /* 2 */ val REMOVE: typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action.REMOVE & Double = js.native
  }
  
  /**
    * Creates a new AuditConfigDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AuditConfigDelta instance
    */
  /* static member */
  inline def create(): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AuditConfigDelta]
  inline def create(properties: IAuditConfigDelta): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[AuditConfigDelta]
  
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
  inline def decode(reader: Uint8Array): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditConfigDelta]
  inline def decode(reader: Uint8Array, length: Double): AuditConfigDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AuditConfigDelta]
  
  /**
    * Decodes an AuditConfigDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AuditConfigDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditConfigDelta]
  inline def decodeDelimited(reader: Uint8Array): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditConfigDelta]
  
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
  inline def fromObject(`object`: StringDictionary[js.Any]): AuditConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[AuditConfigDelta]
  
  /**
    * Creates a plain object from an AuditConfigDelta message. Also converts values to other types if specified.
    * @param message AuditConfigDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: AuditConfigDelta): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: AuditConfigDelta, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an AuditConfigDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
