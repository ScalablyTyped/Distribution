package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta.Action
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BindingDelta. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta")
@js.native
/**
  * Constructs a new BindingDelta.
  * @param [properties] Properties to set
  */
class BindingDelta () extends IBindingDelta {
  def this(properties: IBindingDelta) = this()
  
  /** BindingDelta action. */
  @JSName("action")
  var action_BindingDelta: Action = js.native
  
  /** BindingDelta member. */
  @JSName("member")
  var member_BindingDelta: String = js.native
  
  /** BindingDelta role. */
  @JSName("role")
  var role_BindingDelta: String = js.native
  
  /**
    * Converts this BindingDelta to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object BindingDelta {
  
  @js.native
  sealed trait Action extends StObject
  /** Action enum. */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.Action")
  @js.native
  object Action extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Action with Double] = js.native
    
    @js.native
    sealed trait ACTION_UNSPECIFIED extends Action
    /* 0 */ val ACTION_UNSPECIFIED: typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta.Action.ACTION_UNSPECIFIED with Double = js.native
    
    @js.native
    sealed trait ADD extends Action
    /* 1 */ val ADD: typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta.Action.ADD with Double = js.native
    
    @js.native
    sealed trait REMOVE extends Action
    /* 2 */ val REMOVE: typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta.Action.REMOVE with Double = js.native
  }
  
  /**
    * Creates a new BindingDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BindingDelta instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.create")
  @js.native
  def create(): BindingDelta = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.create")
  @js.native
  def create(properties: IBindingDelta): BindingDelta = js.native
  
  /**
    * Decodes a BindingDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BindingDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.decode")
  @js.native
  def decode(reader: Reader): BindingDelta = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.decode")
  @js.native
  def decode(reader: Reader, length: Double): BindingDelta = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.decode")
  @js.native
  def decode(reader: Uint8Array): BindingDelta = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): BindingDelta = js.native
  
  /**
    * Decodes a BindingDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BindingDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): BindingDelta = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): BindingDelta = js.native
  
  /**
    * Encodes the specified BindingDelta message. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
    * @param message BindingDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.encode")
  @js.native
  def encode(message: IBindingDelta): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.encode")
  @js.native
  def encode(message: IBindingDelta, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified BindingDelta message, length delimited. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
    * @param message BindingDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBindingDelta): Writer = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.encodeDelimited")
  @js.native
  def encodeDelimited(message: IBindingDelta, writer: Writer): Writer = js.native
  
  /**
    * Creates a BindingDelta message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BindingDelta
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): BindingDelta = js.native
  
  /**
    * Creates a plain object from a BindingDelta message. Also converts values to other types if specified.
    * @param message BindingDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.toObject")
  @js.native
  def toObject(message: BindingDelta): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.toObject")
  @js.native
  def toObject(message: BindingDelta, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a BindingDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.BindingDelta.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
