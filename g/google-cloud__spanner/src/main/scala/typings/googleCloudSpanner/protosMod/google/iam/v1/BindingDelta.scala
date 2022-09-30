package typings.googleCloudSpanner.protosMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta.Action
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BindingDelta. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.iam.v1.BindingDelta")
@js.native
/**
  * Constructs a new BindingDelta.
  * @param [properties] Properties to set
  */
open class BindingDelta ()
  extends StObject
     with IBindingDelta {
  def this(properties: IBindingDelta) = this()
  
  /** BindingDelta action. */
  @JSName("action")
  var action_BindingDelta: Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.iam.v1.BindingDelta.Action * / any */ String) = js.native
  
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
  def toJSON(): StringDictionary[Any] = js.native
}
object BindingDelta {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.iam.v1.BindingDelta")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Action extends StObject
  /** Action enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.iam.v1.BindingDelta.Action")
  @js.native
  object Action extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Action & Double] = js.native
    
    @js.native
    sealed trait ACTION_UNSPECIFIED
      extends StObject
         with Action
    /* 0 */ val ACTION_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta.Action.ACTION_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait ADD
      extends StObject
         with Action
    /* 1 */ val ADD: typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta.Action.ADD & Double = js.native
    
    @js.native
    sealed trait REMOVE
      extends StObject
         with Action
    /* 2 */ val REMOVE: typings.googleCloudSpanner.protosMod.google.iam.v1.BindingDelta.Action.REMOVE & Double = js.native
  }
  
  /**
    * Creates a new BindingDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BindingDelta instance
    */
  /* static member */
  inline def create(): BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BindingDelta]
  inline def create(properties: IBindingDelta): BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BindingDelta]
  
  inline def decode(reader: js.typedarray.Uint8Array): BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BindingDelta]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BindingDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BindingDelta]
  /**
    * Decodes a BindingDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BindingDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BindingDelta]
  inline def decode(reader: Reader, length: Double): BindingDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BindingDelta]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BindingDelta]
  /**
    * Decodes a BindingDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BindingDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BindingDelta]
  
  /**
    * Encodes the specified BindingDelta message. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
    * @param message BindingDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IBindingDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBindingDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BindingDelta message, length delimited. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
    * @param message BindingDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IBindingDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBindingDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BindingDelta message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BindingDelta
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BindingDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BindingDelta]
  
  /**
    * Gets the default type url for BindingDelta
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a BindingDelta message. Also converts values to other types if specified.
    * @param message BindingDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BindingDelta): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BindingDelta, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BindingDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
