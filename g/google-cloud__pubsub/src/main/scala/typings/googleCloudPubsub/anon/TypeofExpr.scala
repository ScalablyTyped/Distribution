package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.`type`.Expr
import typings.googleGax.iamServiceMod.google.`type`.IExpr
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofExpr extends StObject {
  
  /**
    * Creates a new Expr instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Expr instance
    */
  /* static member */
  def create(): Expr = js.native
  def create(properties: IExpr): Expr = js.native
  
  def decode(reader: js.typedarray.Uint8Array): Expr = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): Expr = js.native
  /**
    * Decodes an Expr message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Expr
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decode(reader: Reader): Expr = js.native
  def decode(reader: Reader, length: Double): Expr = js.native
  
  def decodeDelimited(reader: js.typedarray.Uint8Array): Expr = js.native
  /**
    * Decodes an Expr message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Expr
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  def decodeDelimited(reader: Reader): Expr = js.native
  
  /**
    * Encodes the specified Expr message. Does not implicitly {@link google.type.Expr.verify|verify} messages.
    * @param message Expr message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encode(message: IExpr): Writer = js.native
  def encode(message: IExpr, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Expr message, length delimited. Does not implicitly {@link google.type.Expr.verify|verify} messages.
    * @param message Expr message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  def encodeDelimited(message: IExpr): Writer = js.native
  def encodeDelimited(message: IExpr, writer: Writer): Writer = js.native
  
  /**
    * Creates an Expr message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Expr
    */
  /* static member */
  def fromObject(`object`: StringDictionary[Any]): Expr = js.native
  
  /**
    * Creates a plain object from an Expr message. Also converts values to other types if specified.
    * @param message Expr
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  def toObject(message: Expr): StringDictionary[Any] = js.native
  def toObject(message: Expr, options: IConversionOptions): StringDictionary[Any] = js.native
  
  /**
    * Verifies an Expr message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  def verify(message: StringDictionary[Any]): String | Null = js.native
}
