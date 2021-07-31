package typings.googleGax.iamServiceMod.google

import org.scalablytyped.runtime.StringDictionary
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
  @JSImport("google-gax/build/protos/iam_service", "google.type.Expr")
  @js.native
  /**
    * Constructs a new Expr.
    * @param [properties] Properties to set
    */
  class Expr ()
    extends StObject
       with IExpr {
    def this(properties: IExpr) = this()
    
    /** Expr description. */
    @JSName("description")
    var description_Expr: String = js.native
    
    /** Expr expression. */
    @JSName("expression")
    var expression_Expr: String = js.native
    
    /** Expr location. */
    @JSName("location")
    var location_Expr: String = js.native
    
    /** Expr title. */
    @JSName("title")
    var title_Expr: String = js.native
    
    /**
      * Converts this Expr to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Expr {
    
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Expr instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Expr instance
      */
    /* static member */
    @scala.inline
    def create(): Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Expr]
    @scala.inline
    def create(properties: IExpr): Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Expr]
    
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
    def decode(reader: Reader): Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Expr]
    @scala.inline
    def decode(reader: Reader, length: Double): Expr = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Expr]
    @scala.inline
    def decode(reader: Uint8Array): Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Expr]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): Expr = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Expr]
    
    /**
      * Decodes an Expr message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Expr
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Expr]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Expr]
    
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
    def fromObject(`object`: StringDictionary[js.Any]): Expr = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Expr]
    
    /**
      * Creates a plain object from an Expr message. Also converts values to other types if specified.
      * @param message Expr
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: Expr): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: Expr, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an Expr message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Properties of an Expr. */
  trait IExpr extends StObject {
    
    /** Expr description */
    var description: js.UndefOr[String | Null] = js.undefined
    
    /** Expr expression */
    var expression: js.UndefOr[String | Null] = js.undefined
    
    /** Expr location */
    var location: js.UndefOr[String | Null] = js.undefined
    
    /** Expr title */
    var title: js.UndefOr[String | Null] = js.undefined
  }
  object IExpr {
    
    @scala.inline
    def apply(): IExpr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExpr]
    }
    
    @scala.inline
    implicit class IExprMutableBuilder[Self <: IExpr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionNull: Self = StObject.set(x, "expression", null)
      
      @scala.inline
      def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
