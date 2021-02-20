package typings.googleGax.iamServiceMod.google

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  class Expr () extends IExpr {
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
    
    /**
      * Creates a new Expr instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Expr instance
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.create")
    @js.native
    def create(): Expr = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.create")
    @js.native
    def create(properties: IExpr): Expr = js.native
    
    /**
      * Decodes an Expr message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Expr
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.decode")
    @js.native
    def decode(reader: Reader): Expr = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.decode")
    @js.native
    def decode(reader: Reader, length: Double): Expr = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.decode")
    @js.native
    def decode(reader: Uint8Array): Expr = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Expr = js.native
    
    /**
      * Decodes an Expr message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Expr
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Expr = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Expr = js.native
    
    /**
      * Encodes the specified Expr message. Does not implicitly {@link google.type.Expr.verify|verify} messages.
      * @param message Expr message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.encode")
    @js.native
    def encode(message: IExpr): Writer = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.encode")
    @js.native
    def encode(message: IExpr, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Expr message, length delimited. Does not implicitly {@link google.type.Expr.verify|verify} messages.
      * @param message Expr message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.encodeDelimited")
    @js.native
    def encodeDelimited(message: IExpr): Writer = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.encodeDelimited")
    @js.native
    def encodeDelimited(message: IExpr, writer: Writer): Writer = js.native
    
    /**
      * Creates an Expr message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Expr
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Expr = js.native
    
    /**
      * Creates a plain object from an Expr message. Also converts values to other types if specified.
      * @param message Expr
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.toObject")
    @js.native
    def toObject(message: Expr): StringDictionary[js.Any] = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.toObject")
    @js.native
    def toObject(message: Expr, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Expr message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.type.Expr.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Properties of an Expr. */
  @js.native
  trait IExpr extends StObject {
    
    /** Expr description */
    var description: js.UndefOr[String | Null] = js.native
    
    /** Expr expression */
    var expression: js.UndefOr[String | Null] = js.native
    
    /** Expr location */
    var location: js.UndefOr[String | Null] = js.native
    
    /** Expr title */
    var title: js.UndefOr[String | Null] = js.native
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
