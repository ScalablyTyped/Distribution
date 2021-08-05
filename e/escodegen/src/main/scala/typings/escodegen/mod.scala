package typings.escodegen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("escodegen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Precedence extends StObject
  @JSImport("escodegen", "Precedence")
  @js.native
  object Precedence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Precedence & Double] = js.native
    
    @js.native
    sealed trait Additive
      extends StObject
         with Precedence
    /* 14 */ val Additive: typings.escodegen.mod.Precedence.Additive & Double = js.native
    
    @js.native
    sealed trait ArrowFunction
      extends StObject
         with Precedence
    /* 5 */ val ArrowFunction: typings.escodegen.mod.Precedence.ArrowFunction & Double = js.native
    
    @js.native
    sealed trait Assignment
      extends StObject
         with Precedence
    /* 3 */ val Assignment: typings.escodegen.mod.Precedence.Assignment & Double = js.native
    
    @js.native
    sealed trait Await
      extends StObject
         with Precedence
    /* 2 */ val Await: typings.escodegen.mod.Precedence.Await & Double = js.native
    
    @js.native
    sealed trait BitwiseAND
      extends StObject
         with Precedence
    /* 10 */ val BitwiseAND: typings.escodegen.mod.Precedence.BitwiseAND & Double = js.native
    
    @js.native
    sealed trait BitwiseOR
      extends StObject
         with Precedence
    /* 8 */ val BitwiseOR: typings.escodegen.mod.Precedence.BitwiseOR & Double = js.native
    
    @js.native
    sealed trait BitwiseSHIFT
      extends StObject
         with Precedence
    /* 13 */ val BitwiseSHIFT: typings.escodegen.mod.Precedence.BitwiseSHIFT & Double = js.native
    
    @js.native
    sealed trait BitwiseXOR
      extends StObject
         with Precedence
    /* 9 */ val BitwiseXOR: typings.escodegen.mod.Precedence.BitwiseXOR & Double = js.native
    
    @js.native
    sealed trait Call
      extends StObject
         with Precedence
    /* 18 */ val Call: typings.escodegen.mod.Precedence.Call & Double = js.native
    
    @js.native
    sealed trait Conditional
      extends StObject
         with Precedence
    /* 4 */ val Conditional: typings.escodegen.mod.Precedence.Conditional & Double = js.native
    
    @js.native
    sealed trait Equality
      extends StObject
         with Precedence
    /* 11 */ val Equality: typings.escodegen.mod.Precedence.Equality & Double = js.native
    
    @js.native
    sealed trait LogicalAND
      extends StObject
         with Precedence
    /* 7 */ val LogicalAND: typings.escodegen.mod.Precedence.LogicalAND & Double = js.native
    
    @js.native
    sealed trait LogicalOR
      extends StObject
         with Precedence
    /* 6 */ val LogicalOR: typings.escodegen.mod.Precedence.LogicalOR & Double = js.native
    
    @js.native
    sealed trait Member
      extends StObject
         with Precedence
    /* 21 */ val Member: typings.escodegen.mod.Precedence.Member & Double = js.native
    
    @js.native
    sealed trait Multiplicative
      extends StObject
         with Precedence
    /* 15 */ val Multiplicative: typings.escodegen.mod.Precedence.Multiplicative & Double = js.native
    
    @js.native
    sealed trait New
      extends StObject
         with Precedence
    /* 19 */ val New: typings.escodegen.mod.Precedence.New & Double = js.native
    
    @js.native
    sealed trait Postfix
      extends StObject
         with Precedence
    /* 17 */ val Postfix: typings.escodegen.mod.Precedence.Postfix & Double = js.native
    
    @js.native
    sealed trait Primary
      extends StObject
         with Precedence
    /* 22 */ val Primary: typings.escodegen.mod.Precedence.Primary & Double = js.native
    
    @js.native
    sealed trait Relational
      extends StObject
         with Precedence
    /* 12 */ val Relational: typings.escodegen.mod.Precedence.Relational & Double = js.native
    
    @js.native
    sealed trait Sequence
      extends StObject
         with Precedence
    /* 0 */ val Sequence: typings.escodegen.mod.Precedence.Sequence & Double = js.native
    
    @js.native
    sealed trait TaggedTemplate
      extends StObject
         with Precedence
    /* 20 */ val TaggedTemplate: typings.escodegen.mod.Precedence.TaggedTemplate & Double = js.native
    
    @js.native
    sealed trait Unary
      extends StObject
         with Precedence
    /* 16 */ val Unary: typings.escodegen.mod.Precedence.Unary & Double = js.native
    
    @js.native
    sealed trait Yield
      extends StObject
         with Precedence
    /* 1 */ val Yield: typings.escodegen.mod.Precedence.Yield & Double = js.native
  }
  
  inline def attachComments(ast: js.Any, comments: js.Any, tokens: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComments")(ast.asInstanceOf[js.Any], comments.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def generate(ast: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generate(ast: js.Any, options: GenerateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait FormatOptions extends StObject {
    
    /**
      * Do not include superfluous whitespace characters and line terminators. Default is false.
      */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Escape as few characters in string literals as necessary. Default is false.
      */
    var escapeless: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Generate hexadecimal a numeric literal if it is shorter than its equivalents. Requires option.format.renumber. Default is false.
      */
    var hexadecimal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The indent options
      */
    var indent: js.UndefOr[IndentOptions] = js.undefined
    
    /**
      * Enforce JSON format of numeric and string literals. This option takes precedence over option.format.hexadecimal and option.format.quotes. Default is false.
      */
    var json: js.UndefOr[Boolean] = js.undefined
    
    /**
      * New line string. Default is '\n'.
      */
    var newline: js.UndefOr[String] = js.undefined
    
    /**
      * Preserve parentheses in new expressions that have no arguments. Default is true.
      */
    var parentheses: js.UndefOr[Boolean] = js.undefined
    
    var preserveBlankLines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Delimiter to use for string literals. Accepted values are: 'single', 'double', and 'auto'. When 'auto' is specified, escodegen selects a delimiter that results in a shorter literal. Default is 'single'.
      */
    var quotes: js.UndefOr[String] = js.undefined
    
    /**
      * Try to generate shorter numeric literals than toString() (9.8.1). Default is false.
      */
    var renumber: js.UndefOr[Boolean] = js.undefined
    
    var safeConcatenation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preserve semicolons at the end of blocks and programs. Default is true.
      */
    var semicolons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * White space string. Default is standard ' ' (\x20).
      */
    var space: js.UndefOr[String] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setEscapeless(value: Boolean): Self = StObject.set(x, "escapeless", value.asInstanceOf[js.Any])
      
      inline def setEscapelessUndefined: Self = StObject.set(x, "escapeless", js.undefined)
      
      inline def setHexadecimal(value: Boolean): Self = StObject.set(x, "hexadecimal", value.asInstanceOf[js.Any])
      
      inline def setHexadecimalUndefined: Self = StObject.set(x, "hexadecimal", js.undefined)
      
      inline def setIndent(value: IndentOptions): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setParentheses(value: Boolean): Self = StObject.set(x, "parentheses", value.asInstanceOf[js.Any])
      
      inline def setParenthesesUndefined: Self = StObject.set(x, "parentheses", js.undefined)
      
      inline def setPreserveBlankLines(value: Boolean): Self = StObject.set(x, "preserveBlankLines", value.asInstanceOf[js.Any])
      
      inline def setPreserveBlankLinesUndefined: Self = StObject.set(x, "preserveBlankLines", js.undefined)
      
      inline def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setRenumber(value: Boolean): Self = StObject.set(x, "renumber", value.asInstanceOf[js.Any])
      
      inline def setRenumberUndefined: Self = StObject.set(x, "renumber", js.undefined)
      
      inline def setSafeConcatenation(value: Boolean): Self = StObject.set(x, "safeConcatenation", value.asInstanceOf[js.Any])
      
      inline def setSafeConcatenationUndefined: Self = StObject.set(x, "safeConcatenation", js.undefined)
      
      inline def setSemicolons(value: Boolean): Self = StObject.set(x, "semicolons", value.asInstanceOf[js.Any])
      
      inline def setSemicolonsUndefined: Self = StObject.set(x, "semicolons", js.undefined)
      
      inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  trait GenerateOptions extends StObject {
    
    /**
      * If comments are attached to AST, escodegen is going to emit comments to output code. Default is false.
      */
    var comment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Recognize DirectiveStatement and distinguish it from ExpressionStatement. Default: false
      */
    var directive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If file is provided, it will be used as file property of generated source map.
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * The format options
      */
    var format: js.UndefOr[FormatOptions] = js.undefined
    
    var moz: js.UndefOr[MozillaOptions] = js.undefined
    
    /**
      * Mozilla Parser API compatible parse function, e.g., the parse function exported by esprima. If it is provided, generator tries to use the 'raw' representation. See esprima raw information. Default is null.
      */
    var parse: js.UndefOr[js.Function] = js.undefined
    
    var sourceCode: js.UndefOr[String] = js.undefined
    
    /**
      * Optionally option.sourceContent string can be passed (which represents original source of the file, for example it could be a source of coffeescript from which JS is being generated), if provided generated source map will have original source embedded in it.
      */
    var sourceContent: js.UndefOr[String] = js.undefined
    
    /**
      * sourceMap is the source maps's source filename, that's a name that will show up in the browser debugger for the generated source (if source-maps is enabled).
      * If a non-empty string value is provided, generate a source map.
      */
    var sourceMap: js.UndefOr[String] = js.undefined
    
    /**
      * Optionally option.sourceMapRoot can be provided, in which case option.sourceMap will be treated as relative to it. For more information about source map itself, see source map library document, V3 draft and HTML5Rocks introduction. Default is undefined
      * sourceMapRoot is the source root for the source map (see the Mozilla documentation). If sourceMapWithCode is truthy, an object is returned from generate() of the form: { code: .. , map: .. }. If file is provided, it will be used as file property of generated source map.
      */
    var sourceMapRoot: js.UndefOr[String] = js.undefined
    
    /**
      * . If sourceMapWithCode is true generator returns output hash, where output.map is a source-map representation, which can be serialized as output.map.toString(). output.code is a string with generated JS code (note that it's not going to have //@ sourceMappingURL comment in it).
      */
    var sourceMapWithCode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Providing verbatim code generation option to Expression nodes.
      * verbatim option is provided by user as string. When generating Expression code,
      * looking up node[option.verbatim] value and dump it instead of normal code generation.
      *
      * @example
      *
      */
    var verbatim: js.UndefOr[String] = js.undefined
  }
  object GenerateOptions {
    
    inline def apply(): GenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateOptions]
    }
    
    extension [Self <: GenerateOptions](x: Self) {
      
      inline def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDirective(value: Boolean): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
      
      inline def setDirectiveUndefined: Self = StObject.set(x, "directive", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFormat(value: FormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMoz(value: MozillaOptions): Self = StObject.set(x, "moz", value.asInstanceOf[js.Any])
      
      inline def setMozUndefined: Self = StObject.set(x, "moz", js.undefined)
      
      inline def setParse(value: js.Function): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setSourceCode(value: String): Self = StObject.set(x, "sourceCode", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeUndefined: Self = StObject.set(x, "sourceCode", js.undefined)
      
      inline def setSourceContent(value: String): Self = StObject.set(x, "sourceContent", value.asInstanceOf[js.Any])
      
      inline def setSourceContentUndefined: Self = StObject.set(x, "sourceContent", js.undefined)
      
      inline def setSourceMap(value: String): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapRoot(value: String): Self = StObject.set(x, "sourceMapRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceMapRootUndefined: Self = StObject.set(x, "sourceMapRoot", js.undefined)
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setSourceMapWithCode(value: Boolean): Self = StObject.set(x, "sourceMapWithCode", value.asInstanceOf[js.Any])
      
      inline def setSourceMapWithCodeUndefined: Self = StObject.set(x, "sourceMapWithCode", js.undefined)
      
      inline def setVerbatim(value: String): Self = StObject.set(x, "verbatim", value.asInstanceOf[js.Any])
      
      inline def setVerbatimUndefined: Self = StObject.set(x, "verbatim", js.undefined)
    }
  }
  
  trait IndentOptions extends StObject {
    
    /**
      * Adjust the indentation of multiline comments to keep asterisks vertically aligned. Default is false.
      */
    var adjustMultilineComment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Base indent level. Default is 0.
      */
    var base: js.UndefOr[Double] = js.undefined
    
    /**
      * Indent string. Default is 4 spaces ('    ').
      */
    var style: js.UndefOr[String] = js.undefined
  }
  object IndentOptions {
    
    inline def apply(): IndentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndentOptions]
    }
    
    extension [Self <: IndentOptions](x: Self) {
      
      inline def setAdjustMultilineComment(value: Boolean): Self = StObject.set(x, "adjustMultilineComment", value.asInstanceOf[js.Any])
      
      inline def setAdjustMultilineCommentUndefined: Self = StObject.set(x, "adjustMultilineComment", js.undefined)
      
      inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait MozillaOptions extends StObject {
    
    /**
      * Default: false
      */
    var comprehensionExpressionStartsWithAssignment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: false
      */
    var parenthesizedComprehensionBlock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: false
      */
    var starlessGenerator: js.UndefOr[Boolean] = js.undefined
  }
  object MozillaOptions {
    
    inline def apply(): MozillaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MozillaOptions]
    }
    
    extension [Self <: MozillaOptions](x: Self) {
      
      inline def setComprehensionExpressionStartsWithAssignment(value: Boolean): Self = StObject.set(x, "comprehensionExpressionStartsWithAssignment", value.asInstanceOf[js.Any])
      
      inline def setComprehensionExpressionStartsWithAssignmentUndefined: Self = StObject.set(x, "comprehensionExpressionStartsWithAssignment", js.undefined)
      
      inline def setParenthesizedComprehensionBlock(value: Boolean): Self = StObject.set(x, "parenthesizedComprehensionBlock", value.asInstanceOf[js.Any])
      
      inline def setParenthesizedComprehensionBlockUndefined: Self = StObject.set(x, "parenthesizedComprehensionBlock", js.undefined)
      
      inline def setStarlessGenerator(value: Boolean): Self = StObject.set(x, "starlessGenerator", value.asInstanceOf[js.Any])
      
      inline def setStarlessGeneratorUndefined: Self = StObject.set(x, "starlessGenerator", js.undefined)
    }
  }
}
