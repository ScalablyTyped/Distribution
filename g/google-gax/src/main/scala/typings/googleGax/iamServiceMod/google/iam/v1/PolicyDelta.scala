package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PolicyDelta. */
@JSImport("google-gax/build/protos/iam_service", "google.iam.v1.PolicyDelta")
@js.native
/**
  * Constructs a new PolicyDelta.
  * @param [properties] Properties to set
  */
class PolicyDelta ()
  extends StObject
     with IPolicyDelta {
  def this(properties: IPolicyDelta) = this()
  
  /** PolicyDelta auditConfigDeltas. */
  @JSName("auditConfigDeltas")
  var auditConfigDeltas_PolicyDelta: js.Array[IAuditConfigDelta] = js.native
  
  /** PolicyDelta bindingDeltas. */
  @JSName("bindingDeltas")
  var bindingDeltas_PolicyDelta: js.Array[IBindingDelta] = js.native
  
  /**
    * Converts this PolicyDelta to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object PolicyDelta {
  
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.PolicyDelta")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PolicyDelta instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PolicyDelta instance
    */
  /* static member */
  @scala.inline
  def create(): PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PolicyDelta]
  @scala.inline
  def create(properties: IPolicyDelta): PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PolicyDelta]
  
  /**
    * Decodes a PolicyDelta message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PolicyDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PolicyDelta]
  @scala.inline
  def decode(reader: Reader, length: Double): PolicyDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PolicyDelta]
  @scala.inline
  def decode(reader: Uint8Array): PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PolicyDelta]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): PolicyDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PolicyDelta]
  
  /**
    * Decodes a PolicyDelta message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PolicyDelta
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PolicyDelta]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PolicyDelta]
  
  /**
    * Encodes the specified PolicyDelta message. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
    * @param message PolicyDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IPolicyDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IPolicyDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PolicyDelta message, length delimited. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
    * @param message PolicyDelta message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IPolicyDelta): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IPolicyDelta, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PolicyDelta message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PolicyDelta
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): PolicyDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PolicyDelta]
  
  /**
    * Creates a plain object from a PolicyDelta message. Also converts values to other types if specified.
    * @param message PolicyDelta
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: PolicyDelta): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: PolicyDelta, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a PolicyDelta message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
