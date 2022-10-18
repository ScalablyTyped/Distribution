package typings.formatjsIcuMessageformatParser

import typings.formatjsIcuMessageformatParser.errorMod.ParserError
import typings.formatjsIcuMessageformatParser.typesMod.MessageFormatElement
import typings.std.Intl.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@formatjs/icu-messageformat-parser/parser", "Parser")
  @js.native
  open class Parser protected () extends StObject {
    def this(message: String) = this()
    def this(message: String, options: ParserOptions) = this()
    
    /** Bump the parser to the next UTF-16 code unit. */
    /* private */ var bump: Any = js.native
    
    /**
      * If the substring starting at the current position of the parser has
      * the given prefix, then bump the parser to the character immediately
      * following the prefix and return true. Otherwise, don't bump the parser
      * and return false.
      */
    /* private */ var bumpIf: Any = js.native
    
    /** advance the parser through all whitespace to the next non-whitespace code unit. */
    /* private */ var bumpSpace: Any = js.native
    
    /**
      * Bump the parser to the target offset.
      * If target offset is beyond the end of the input, bump the parser to the end of the input.
      */
    /* private */ var bumpTo: Any = js.native
    
    /**
      * Bump the parser until the pattern character is found and return `true`.
      * Otherwise bump to the end of the file and return `false`.
      */
    /* private */ var bumpUntil: Any = js.native
    
    /**
      * Return the code point at the current position of the parser.
      * Throws if the index is out of bound.
      */
    /* private */ var char: Any = js.native
    
    /* private */ var clonePosition: Any = js.native
    
    /* private */ var error: Any = js.native
    
    /* private */ var ignoreTag: Any = js.native
    
    /* private */ var isEOF: Any = js.native
    
    /* private */ var locale: Any = js.native
    
    /* private */ var message: Any = js.native
    
    /* private */ var offset: Any = js.native
    
    def parse(): Result[js.Array[MessageFormatElement], ParserError] = js.native
    
    /* private */ var parseArgument: Any = js.native
    
    /* private */ var parseArgumentOptions: Any = js.native
    
    /**
      * Advance the parser until the end of the identifier, if it is currently on
      * an identifier character. Return an empty string otherwise.
      */
    /* private */ var parseIdentifierIfPossible: Any = js.native
    
    /* private */ var parseLiteral: Any = js.native
    
    /* private */ var parseMessage: Any = js.native
    
    /* private */ var parseNumberSkeletonFromString: Any = js.native
    
    /**
      * See: https://github.com/unicode-org/icu/blob/af7ed1f6d2298013dc303628438ec4abe1f16479/icu4c/source/common/messagepattern.cpp#L659
      */
    /* private */ var parseSimpleArgStyleIfPossible: Any = js.native
    
    /**
      * A tag name must start with an ASCII lower/upper case letter. The grammar is based on the
      * [custom element name][] except that a dash is NOT always mandatory and uppercase letters
      * are accepted:
      *
      * ```
      * tag ::= "<" tagName (whitespace)* "/>" | "<" tagName (whitespace)* ">" message "</" tagName (whitespace)* ">"
      * tagName ::= [a-z] (PENChar)*
      * PENChar ::=
      *     "-" | "." | [0-9] | "_" | [a-z] | [A-Z] | #xB7 | [#xC0-#xD6] | [#xD8-#xF6] | [#xF8-#x37D] |
      *     [#x37F-#x1FFF] | [#x200C-#x200D] | [#x203F-#x2040] | [#x2070-#x218F] | [#x2C00-#x2FEF] |
      *     [#x3001-#xD7FF] | [#xF900-#xFDCF] | [#xFDF0-#xFFFD] | [#x10000-#xEFFFF]
      * ```
      *
      * [custom element name]: https://html.spec.whatwg.org/multipage/custom-elements.html#valid-custom-element-name
      * NOTE: We're a bit more lax here since HTML technically does not allow uppercase HTML element but we do
      * since other tag-based engines like React allow it
      */
    /* private */ var parseTag: Any = js.native
    
    /**
      * This method assumes that the caller has peeked ahead for the first tag character.
      */
    /* private */ var parseTagName: Any = js.native
    
    /**
      * Peek at the *next* Unicode codepoint in the input without advancing the parser.
      * If the input has been exhausted, then this returns null.
      */
    /* private */ var peek: Any = js.native
    
    /* private */ var position: Any = js.native
    
    /* private */ var requiresOtherClause: Any = js.native
    
    /* private */ var shouldParseSkeletons: Any = js.native
    
    /* private */ var tryParseArgumentClose: Any = js.native
    
    /* private */ var tryParseDecimalInteger: Any = js.native
    
    def tryParseLeftAngleBracket(): String | Null = js.native
    
    /**
      * @param nesting_level The current nesting level of messages.
      *     This can be positive when parsing message fragment in select or plural argument options.
      * @param parent_arg_type The parent argument's type.
      * @param parsed_first_identifier If provided, this is the first identifier-like selector of
      *     the argument. It is a by-product of a previous parsing attempt.
      * @param expecting_close_tag If true, this message is directly or indirectly nested inside
      *     between a pair of opening and closing tags. The nested message will not parse beyond
      *     the closing tag boundary.
      */
    /* private */ var tryParsePluralOrSelectOptions: Any = js.native
    
    /**
      * Starting with ICU 4.8, an ASCII apostrophe only starts quoted text if it immediately precedes
      * a character that requires quoting (that is, "only where needed"), and works the same in
      * nested messages as on the top level of the pattern. The new behavior is otherwise compatible.
      */
    /* private */ var tryParseQuote: Any = js.native
    
    /* private */ var tryParseUnquoted: Any = js.native
  }
  
  trait ParserOptions extends StObject {
    
    /**
      * Capture location info in AST
      * Default is false
      */
    var captureLocation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to treat HTML/XML tags as string literal
      * instead of parsing them as tag token.
      * When this is false we only allow simple tags without
      * any attributes
      */
    var ignoreTag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Instance of Intl.Locale to resolve locale-dependent skeleton
      */
    var locale: js.UndefOr[Locale] = js.undefined
    
    /**
      * Should `select`, `selectordinal`, and `plural` arguments always include
      * the `other` case clause.
      */
    var requiresOtherClause: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to parse number/datetime skeleton
      * into Intl.NumberFormatOptions and Intl.DateTimeFormatOptions, respectively.
      */
    var shouldParseSkeletons: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setCaptureLocation(value: Boolean): Self = StObject.set(x, "captureLocation", value.asInstanceOf[js.Any])
      
      inline def setCaptureLocationUndefined: Self = StObject.set(x, "captureLocation", js.undefined)
      
      inline def setIgnoreTag(value: Boolean): Self = StObject.set(x, "ignoreTag", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTagUndefined: Self = StObject.set(x, "ignoreTag", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setRequiresOtherClause(value: Boolean): Self = StObject.set(x, "requiresOtherClause", value.asInstanceOf[js.Any])
      
      inline def setRequiresOtherClauseUndefined: Self = StObject.set(x, "requiresOtherClause", js.undefined)
      
      inline def setShouldParseSkeletons(value: Boolean): Self = StObject.set(x, "shouldParseSkeletons", value.asInstanceOf[js.Any])
      
      inline def setShouldParseSkeletonsUndefined: Self = StObject.set(x, "shouldParseSkeletons", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    /** Column offset in terms of unicode *code point*. */
    var column: Double
    
    var line: Double
    
    /** Offset in terms of UTF-16 *code unit*. */
    var offset: Double
  }
  object Position {
    
    inline def apply(column: Double, line: Double, offset: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsIcuMessageformatParser.anon.Err[T]
    - typings.formatjsIcuMessageformatParser.anon.Val[E]
  */
  trait Result[T, E] extends StObject
  object Result {
    
    inline def Err[T](err: Null, `val`: T): typings.formatjsIcuMessageformatParser.anon.Err[T] = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.anon.Err[T]]
    }
    
    inline def Val[E](err: E, `val`: Null): typings.formatjsIcuMessageformatParser.anon.Val[E] = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.anon.Val[E]]
    }
  }
}
