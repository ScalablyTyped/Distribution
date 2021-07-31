package typings.googleGax.mod.IamProtos.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.`type`.IExpr
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace type. */
object `type` {
  
  /** Represents an Expr. */
  @JSImport("google-gax", "IamProtos.google.type.Expr")
  @js.native
  /**
    * Constructs a new Expr.
    * @param [properties] Properties to set
    */
  class Expr ()
    extends typings.googleGax.iamServiceMod.google.`type`.Expr {
    def this(properties: IExpr) = this()
  }
  object Expr {
    
    @JSImport("google-gax", "IamProtos.google.type.Expr")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Expr instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Expr instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleGax.iamServiceMod.google.`type`.Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.`type`.Expr]
    @scala.inline
    def create(properties: IExpr): typings.googleGax.iamServiceMod.google.`type`.Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.`type`.Expr]
    
    /**
      * Decodes an Expr message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Expr
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleGax.iamServiceMod.google.`type`.Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.`type`.Expr]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.`type`.Expr = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.`type`.Expr]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.`type`.Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.`type`.Expr]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.`type`.Expr = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.`type`.Expr]
    
    /**
      * Decodes an Expr message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Expr
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.`type`.Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.`type`.Expr]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.`type`.Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.`type`.Expr]
    
    /**
      * Encodes the specified Expr message. Does not implicitly {@link google.type.Expr.verify|verify} messages.
      * @param message Expr message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IExpr): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IExpr, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Expr message, length delimited. Does not implicitly {@link google.type.Expr.verify|verify} messages.
      * @param message Expr message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IExpr): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IExpr, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an Expr message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Expr
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.`type`.Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.`type`.Expr]
    
    /**
      * Creates a plain object from an Expr message. Also converts values to other types if specified.
      * @param message Expr
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleGax.iamServiceMod.google.`type`.Expr): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: typings.googleGax.iamServiceMod.google.`type`.Expr, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an Expr message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
}
