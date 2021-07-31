package typings.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.IMethodOptions
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MethodOptions. */
@JSImport("google-gax", "operationsProtos.google.protobuf.MethodOptions")
@js.native
/**
  * Constructs a new MethodOptions.
  * @param [properties] Properties to set
  */
class MethodOptions ()
  extends typings.googleGax.operationsMod.google.protobuf.MethodOptions {
  def this(properties: IMethodOptions) = this()
}
object MethodOptions {
  
  @JSImport("google-gax", "operationsProtos.google.protobuf.MethodOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /** IdempotencyLevel enum. */
  @JSImport("google-gax", "operationsProtos.google.protobuf.MethodOptions.IdempotencyLevel")
  @js.native
  object IdempotencyLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleGax.operationsMod.google.protobuf.MethodOptions.IdempotencyLevel & Double
      ] = js.native
    
    /* 0 */ val IDEMPOTENCY_UNKNOWN: typings.googleGax.operationsMod.google.protobuf.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN & Double = js.native
    
    /* 2 */ val IDEMPOTENT: typings.googleGax.operationsMod.google.protobuf.MethodOptions.IdempotencyLevel.IDEMPOTENT & Double = js.native
    
    /* 1 */ val NO_SIDE_EFFECTS: typings.googleGax.operationsMod.google.protobuf.MethodOptions.IdempotencyLevel.NO_SIDE_EFFECTS & Double = js.native
  }
  
  /**
    * Creates a new MethodOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MethodOptions instance
    */
  /* static member */
  @scala.inline
  def create(): typings.googleGax.operationsMod.google.protobuf.MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.operationsMod.google.protobuf.MethodOptions]
  @scala.inline
  def create(properties: IMethodOptions): typings.googleGax.operationsMod.google.protobuf.MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.MethodOptions]
  
  /**
    * Decodes a MethodOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.googleGax.operationsMod.google.protobuf.MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.MethodOptions]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.protobuf.MethodOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.MethodOptions]
  @scala.inline
  def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.MethodOptions]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.protobuf.MethodOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.MethodOptions]
  
  /**
    * Decodes a MethodOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MethodOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.protobuf.MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.MethodOptions]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.MethodOptions]
  
  /**
    * Encodes the specified MethodOptions message. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
    * @param message MethodOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IMethodOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IMethodOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified MethodOptions message, length delimited. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
    * @param message MethodOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IMethodOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IMethodOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a MethodOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MethodOptions
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.protobuf.MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsMod.google.protobuf.MethodOptions]
  
  /**
    * Creates a plain object from a MethodOptions message. Also converts values to other types if specified.
    * @param message MethodOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.googleGax.operationsMod.google.protobuf.MethodOptions): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.googleGax.operationsMod.google.protobuf.MethodOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a MethodOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
