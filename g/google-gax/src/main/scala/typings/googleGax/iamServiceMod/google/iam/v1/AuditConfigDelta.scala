package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an AuditConfigDelta. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta")
@js.native
/**
  * Constructs a new AuditConfigDelta.
  * @param [properties] Properties to set
  */
class AuditConfigDelta () extends IAuditConfigDelta {
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
  
  @js.native
  sealed trait Action extends StObject
  /** Action enum. */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.Action")
  @js.native
  object Action extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Action with Double] = js.native
    
    @js.native
    sealed trait ACTION_UNSPECIFIED extends Action
    /* 0 */ val ACTION_UNSPECIFIED: typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action.ACTION_UNSPECIFIED with Double = js.native
    
    @js.native
    sealed trait ADD extends Action
    /* 1 */ val ADD: typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action.ADD with Double = js.native
    
    @js.native
    sealed trait REMOVE extends Action
    /* 2 */ val REMOVE: typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action.REMOVE with Double = js.native
  }
  
  /**
    * Creates a new AuditConfigDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AuditConfigDelta instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.create")
  @js.native
  def create(): AuditConfigDelta = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.create")
  @js.native
  def create(properties: IAuditConfigDelta): AuditConfigDelta = js.native
  
  /**
    * Decodes an AuditConfigDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AuditConfigDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.decode")
  @js.native
  def decode(reader: Reader): AuditConfigDelta = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.decode")
  @js.native
  def decode(reader: Reader, length: Double): AuditConfigDelta = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.decode")
  @js.native
  def decode(reader: Uint8Array): AuditConfigDelta = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): AuditConfigDelta = js.native
  
  /**
    * Decodes an AuditConfigDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AuditConfigDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): AuditConfigDelta = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): AuditConfigDelta = js.native
  
  /**
    * Encodes the specified AuditConfigDelta message. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
    * @param message AuditConfigDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.encode")
  @js.native
  def encode(message: IAuditConfigDelta): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.encode")
  @js.native
  def encode(message: IAuditConfigDelta, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified AuditConfigDelta message, length delimited. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
    * @param message AuditConfigDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAuditConfigDelta): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAuditConfigDelta, writer: Writer): Writer = js.native
  
  /**
    * Creates an AuditConfigDelta message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns AuditConfigDelta
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): AuditConfigDelta = js.native
  
  /**
    * Creates a plain object from an AuditConfigDelta message. Also converts values to other types if specified.
    * @param message AuditConfigDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.toObject")
  @js.native
  def toObject(message: AuditConfigDelta): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.toObject")
  @js.native
  def toObject(message: AuditConfigDelta, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an AuditConfigDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.AuditConfigDelta.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
