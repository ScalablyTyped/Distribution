package typings.entities

import typings.entities.libEsmDecodeMod.DecodingMode
import typings.entities.libEsmDecodeMod.EntityErrorProducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmMod {
  
  @JSImport("entities/lib/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("entities/lib/esm", "DecodingMode")
  @js.native
  object DecodingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.entities.libEsmDecodeMod.DecodingMode & Double] = js.native
    
    /* 2 */ val Attribute: typings.entities.libEsmDecodeMod.DecodingMode.Attribute & Double = js.native
    
    /* 0 */ val Legacy: typings.entities.libEsmDecodeMod.DecodingMode.Legacy & Double = js.native
    
    /* 1 */ val Strict: typings.entities.libEsmDecodeMod.DecodingMode.Strict & Double = js.native
  }
  
  @js.native
  sealed trait EncodingMode extends StObject
  @JSImport("entities/lib/esm", "EncodingMode")
  @js.native
  object EncodingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EncodingMode & Double] = js.native
    
    /**
      * The output consists only of ASCII characters. Characters that need
      * escaping within HTML, and characters that aren't ASCII characters will
      * be escaped.
      */
    @js.native
    sealed trait ASCII
      extends StObject
         with EncodingMode
    /* 1 */ val ASCII: typings.entities.libEsmMod.EncodingMode.ASCII & Double = js.native
    
    /**
      * Encode all characters that have to be escaped in HTML attributes,
      * following {@link https://html.spec.whatwg.org/multipage/parsing.html#escapingString}.
      */
    @js.native
    sealed trait Attribute
      extends StObject
         with EncodingMode
    /* 3 */ val Attribute: typings.entities.libEsmMod.EncodingMode.Attribute & Double = js.native
    
    /**
      * Encode all characters that have an equivalent entity, as well as all
      * characters that are not ASCII characters.
      */
    @js.native
    sealed trait Extensive
      extends StObject
         with EncodingMode
    /* 2 */ val Extensive: typings.entities.libEsmMod.EncodingMode.Extensive & Double = js.native
    
    /**
      * Encode all characters that have to be escaped in HTML text,
      * following {@link https://html.spec.whatwg.org/multipage/parsing.html#escapingString}.
      */
    @js.native
    sealed trait Text
      extends StObject
         with EncodingMode
    /* 4 */ val Text: typings.entities.libEsmMod.EncodingMode.Text & Double = js.native
    
    /**
      * The output is UTF-8 encoded. Only characters that need escaping within
      * XML will be escaped.
      */
    @js.native
    sealed trait UTF8
      extends StObject
         with EncodingMode
    /* 0 */ val UTF8: typings.entities.libEsmMod.EncodingMode.UTF8 & Double = js.native
  }
  
  @JSImport("entities/lib/esm", "EntityDecoder")
  @js.native
  open class EntityDecoder protected ()
    extends typings.entities.libEsmDecodeMod.EntityDecoder {
    def this(
      /** The tree used to decode entities. */
    decodeTree: js.typedarray.Uint16Array,
      /**
      * The function that is called when a codepoint is decoded.
      *
      * For multi-byte named entities, this will be called multiple times,
      * with the second codepoint, and the same `consumed` value.
      *
      * @param codepoint The decoded codepoint.
      * @param consumed The number of bytes consumed by the decoder.
      */
    emitCodePoint: js.Function2[/* cp */ Double, /* consumed */ Double, Unit]
    ) = this()
    def this(
      /** The tree used to decode entities. */
    decodeTree: js.typedarray.Uint16Array,
      /**
      * The function that is called when a codepoint is decoded.
      *
      * For multi-byte named entities, this will be called multiple times,
      * with the second codepoint, and the same `consumed` value.
      *
      * @param codepoint The decoded codepoint.
      * @param consumed The number of bytes consumed by the decoder.
      */
    emitCodePoint: js.Function2[/* cp */ Double, /* consumed */ Double, Unit],
      /** An object that is used to produce errors. */
    errors: EntityErrorProducer
    ) = this()
  }
  
  @js.native
  sealed trait EntityLevel extends StObject
  @JSImport("entities/lib/esm", "EntityLevel")
  @js.native
  object EntityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EntityLevel & Double] = js.native
    
    /** Support HTML entities, which are a superset of XML entities. */
    @js.native
    sealed trait HTML
      extends StObject
         with EntityLevel
    /* 1 */ val HTML: typings.entities.libEsmMod.EntityLevel.HTML & Double = js.native
    
    /** Support only XML entities. */
    @js.native
    sealed trait XML
      extends StObject
         with EntityLevel
    /* 0 */ val XML: typings.entities.libEsmMod.EntityLevel.XML & Double = js.native
  }
  
  inline def decode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decode(data: String, options: DecodingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(data: String, options: EntityLevel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeHTML(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTML")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeHTML(str: String, mode: DecodingMode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTML")(str.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeHTML4(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTML4")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeHTML4(str: String, mode: DecodingMode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTML4")(str.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeHTML4Strict(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTML4Strict")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeHTML5(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTML5")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeHTML5(str: String, mode: DecodingMode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTML5")(str.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeHTML5Strict(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTML5Strict")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeHTMLAttribute(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTMLAttribute")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeHTMLStrict(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHTMLStrict")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeStrict(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeStrict")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeStrict(data: String, options: DecodingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStrict")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decodeStrict(data: String, options: EntityLevel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStrict")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeXML(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeXML")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeXMLStrict(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeXMLStrict")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(data: String, options: EncodingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(data: String, options: EntityLevel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeHTML(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeHTML")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeHTML4(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeHTML4")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeHTML5(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeHTML5")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeNonAsciiHTML(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeNonAsciiHTML")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeXML(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeXML")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("entities/lib/esm", "escape")
  @js.native
  val escape: js.Function1[/* str */ String, String] = js.native
  
  inline def escapeAttribute(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeAttribute")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeText(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeText")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeUTF8(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeUTF8")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait DecodingOptions extends StObject {
    
    /**
      * The level of entities to support.
      * @default {@link EntityLevel.XML}
      */
    var level: js.UndefOr[EntityLevel] = js.undefined
    
    /**
      * Decoding mode. If `Legacy`, will support legacy entities not terminated
      * with a semicolon (`;`).
      *
      * Always `Strict` for XML. For HTML, set this to `true` if you are parsing
      * an attribute value.
      *
      * The deprecated `decodeStrict` function defaults this to `Strict`.
      *
      * @default {@link DecodingMode.Legacy}
      */
    var mode: js.UndefOr[DecodingMode] = js.undefined
  }
  object DecodingOptions {
    
    inline def apply(): DecodingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodingOptions] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: EntityLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMode(value: DecodingMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait EncodingOptions extends StObject {
    
    /**
      * The level of entities to support.
      * @default {@link EntityLevel.XML}
      */
    var level: js.UndefOr[EntityLevel] = js.undefined
    
    /**
      * Output format.
      * @default {@link EncodingMode.Extensive}
      */
    var mode: js.UndefOr[EncodingMode] = js.undefined
  }
  object EncodingOptions {
    
    inline def apply(): EncodingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncodingOptions] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: EntityLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMode(value: EncodingMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
