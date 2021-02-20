package typings.escodegen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait Precedence extends StObject
  @JSImport("escodegen", "Precedence")
  @js.native
  object Precedence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Precedence with Double] = js.native
    
    @js.native
    sealed trait Additive extends Precedence
    /* 14 */ val Additive: typings.escodegen.mod.Precedence.Additive with Double = js.native
    
    @js.native
    sealed trait ArrowFunction extends Precedence
    /* 5 */ val ArrowFunction: typings.escodegen.mod.Precedence.ArrowFunction with Double = js.native
    
    @js.native
    sealed trait Assignment extends Precedence
    /* 3 */ val Assignment: typings.escodegen.mod.Precedence.Assignment with Double = js.native
    
    @js.native
    sealed trait Await extends Precedence
    /* 2 */ val Await: typings.escodegen.mod.Precedence.Await with Double = js.native
    
    @js.native
    sealed trait BitwiseAND extends Precedence
    /* 10 */ val BitwiseAND: typings.escodegen.mod.Precedence.BitwiseAND with Double = js.native
    
    @js.native
    sealed trait BitwiseOR extends Precedence
    /* 8 */ val BitwiseOR: typings.escodegen.mod.Precedence.BitwiseOR with Double = js.native
    
    @js.native
    sealed trait BitwiseSHIFT extends Precedence
    /* 13 */ val BitwiseSHIFT: typings.escodegen.mod.Precedence.BitwiseSHIFT with Double = js.native
    
    @js.native
    sealed trait BitwiseXOR extends Precedence
    /* 9 */ val BitwiseXOR: typings.escodegen.mod.Precedence.BitwiseXOR with Double = js.native
    
    @js.native
    sealed trait Call extends Precedence
    /* 18 */ val Call: typings.escodegen.mod.Precedence.Call with Double = js.native
    
    @js.native
    sealed trait Conditional extends Precedence
    /* 4 */ val Conditional: typings.escodegen.mod.Precedence.Conditional with Double = js.native
    
    @js.native
    sealed trait Equality extends Precedence
    /* 11 */ val Equality: typings.escodegen.mod.Precedence.Equality with Double = js.native
    
    @js.native
    sealed trait LogicalAND extends Precedence
    /* 7 */ val LogicalAND: typings.escodegen.mod.Precedence.LogicalAND with Double = js.native
    
    @js.native
    sealed trait LogicalOR extends Precedence
    /* 6 */ val LogicalOR: typings.escodegen.mod.Precedence.LogicalOR with Double = js.native
    
    @js.native
    sealed trait Member extends Precedence
    /* 21 */ val Member: typings.escodegen.mod.Precedence.Member with Double = js.native
    
    @js.native
    sealed trait Multiplicative extends Precedence
    /* 15 */ val Multiplicative: typings.escodegen.mod.Precedence.Multiplicative with Double = js.native
    
    @js.native
    sealed trait New extends Precedence
    /* 19 */ val New: typings.escodegen.mod.Precedence.New with Double = js.native
    
    @js.native
    sealed trait Postfix extends Precedence
    /* 17 */ val Postfix: typings.escodegen.mod.Precedence.Postfix with Double = js.native
    
    @js.native
    sealed trait Primary extends Precedence
    /* 22 */ val Primary: typings.escodegen.mod.Precedence.Primary with Double = js.native
    
    @js.native
    sealed trait Relational extends Precedence
    /* 12 */ val Relational: typings.escodegen.mod.Precedence.Relational with Double = js.native
    
    @js.native
    sealed trait Sequence extends Precedence
    /* 0 */ val Sequence: typings.escodegen.mod.Precedence.Sequence with Double = js.native
    
    @js.native
    sealed trait TaggedTemplate extends Precedence
    /* 20 */ val TaggedTemplate: typings.escodegen.mod.Precedence.TaggedTemplate with Double = js.native
    
    @js.native
    sealed trait Unary extends Precedence
    /* 16 */ val Unary: typings.escodegen.mod.Precedence.Unary with Double = js.native
    
    @js.native
    sealed trait Yield extends Precedence
    /* 1 */ val Yield: typings.escodegen.mod.Precedence.Yield with Double = js.native
  }
  
  @JSImport("escodegen", "attachComments")
  @js.native
  def attachComments(ast: js.Any, comments: js.Any, tokens: js.Any): js.Any = js.native
  
  @JSImport("escodegen", "generate")
  @js.native
  def generate(ast: js.Any): String = js.native
  @JSImport("escodegen", "generate")
  @js.native
  def generate(ast: js.Any, options: GenerateOptions): String = js.native
  
  @js.native
  trait FormatOptions extends StObject {
    
    /**
      * Do not include superfluous whitespace characters and line terminators. Default is false.
      */
    var compact: js.UndefOr[Boolean] = js.native
    
    /**
      * Escape as few characters in string literals as necessary. Default is false.
      */
    var escapeless: js.UndefOr[Boolean] = js.native
    
    /**
      * Generate hexadecimal a numeric literal if it is shorter than its equivalents. Requires option.format.renumber. Default is false.
      */
    var hexadecimal: js.UndefOr[Boolean] = js.native
    
    /**
      * The indent options
      */
    var indent: js.UndefOr[IndentOptions] = js.native
    
    /**
      * Enforce JSON format of numeric and string literals. This option takes precedence over option.format.hexadecimal and option.format.quotes. Default is false.
      */
    var json: js.UndefOr[Boolean] = js.native
    
    /**
      * New line string. Default is '\n'.
      */
    var newline: js.UndefOr[String] = js.native
    
    /**
      * Preserve parentheses in new expressions that have no arguments. Default is true.
      */
    var parentheses: js.UndefOr[Boolean] = js.native
    
    var preserveBlankLines: js.UndefOr[Boolean] = js.native
    
    /**
      * Delimiter to use for string literals. Accepted values are: 'single', 'double', and 'auto'. When 'auto' is specified, escodegen selects a delimiter that results in a shorter literal. Default is 'single'.
      */
    var quotes: js.UndefOr[String] = js.native
    
    /**
      * Try to generate shorter numeric literals than toString() (9.8.1). Default is false.
      */
    var renumber: js.UndefOr[Boolean] = js.native
    
    var safeConcatenation: js.UndefOr[Boolean] = js.native
    
    /**
      * Preserve semicolons at the end of blocks and programs. Default is true.
      */
    var semicolons: js.UndefOr[Boolean] = js.native
    
    /**
      * White space string. Default is standard ' ' (\x20).
      */
    var space: js.UndefOr[String] = js.native
  }
  object FormatOptions {
    
    @scala.inline
    def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit class FormatOptionsMutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setEscapeless(value: Boolean): Self = StObject.set(x, "escapeless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapelessUndefined: Self = StObject.set(x, "escapeless", js.undefined)
      
      @scala.inline
      def setHexadecimal(value: Boolean): Self = StObject.set(x, "hexadecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHexadecimalUndefined: Self = StObject.set(x, "hexadecimal", js.undefined)
      
      @scala.inline
      def setIndent(value: IndentOptions): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      @scala.inline
      def setParentheses(value: Boolean): Self = StObject.set(x, "parentheses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParenthesesUndefined: Self = StObject.set(x, "parentheses", js.undefined)
      
      @scala.inline
      def setPreserveBlankLines(value: Boolean): Self = StObject.set(x, "preserveBlankLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveBlankLinesUndefined: Self = StObject.set(x, "preserveBlankLines", js.undefined)
      
      @scala.inline
      def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      @scala.inline
      def setRenumber(value: Boolean): Self = StObject.set(x, "renumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenumberUndefined: Self = StObject.set(x, "renumber", js.undefined)
      
      @scala.inline
      def setSafeConcatenation(value: Boolean): Self = StObject.set(x, "safeConcatenation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeConcatenationUndefined: Self = StObject.set(x, "safeConcatenation", js.undefined)
      
      @scala.inline
      def setSemicolons(value: Boolean): Self = StObject.set(x, "semicolons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemicolonsUndefined: Self = StObject.set(x, "semicolons", js.undefined)
      
      @scala.inline
      def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  @js.native
  trait GenerateOptions extends StObject {
    
    /**
      * If comments are attached to AST, escodegen is going to emit comments to output code. Default is false.
      */
    var comment: js.UndefOr[Boolean] = js.native
    
    /**
      * Recognize DirectiveStatement and distinguish it from ExpressionStatement. Default: false
      */
    var directive: js.UndefOr[Boolean] = js.native
    
    /**
      * If file is provided, it will be used as file property of generated source map.
      */
    var file: js.UndefOr[String] = js.native
    
    /**
      * The format options
      */
    var format: js.UndefOr[FormatOptions] = js.native
    
    var moz: js.UndefOr[MozillaOptions] = js.native
    
    /**
      * Mozilla Parser API compatible parse function, e.g., the parse function exported by esprima. If it is provided, generator tries to use the 'raw' representation. See esprima raw information. Default is null.
      */
    var parse: js.UndefOr[js.Function] = js.native
    
    var sourceCode: js.UndefOr[String] = js.native
    
    /**
      * Optionally option.sourceContent string can be passed (which represents original source of the file, for example it could be a source of coffeescript from which JS is being generated), if provided generated source map will have original source embedded in it.
      */
    var sourceContent: js.UndefOr[String] = js.native
    
    /**
      * sourceMap is the source maps's source filename, that's a name that will show up in the browser debugger for the generated source (if source-maps is enabled).
      * If a non-empty string value is provided, generate a source map.
      */
    var sourceMap: js.UndefOr[String] = js.native
    
    /**
      * Optionally option.sourceMapRoot can be provided, in which case option.sourceMap will be treated as relative to it. For more information about source map itself, see source map library document, V3 draft and HTML5Rocks introduction. Default is undefined
      * sourceMapRoot is the source root for the source map (see the Mozilla documentation). If sourceMapWithCode is truthy, an object is returned from generate() of the form: { code: .. , map: .. }. If file is provided, it will be used as file property of generated source map.
      */
    var sourceMapRoot: js.UndefOr[String] = js.native
    
    /**
      * . If sourceMapWithCode is true generator returns output hash, where output.map is a source-map representation, which can be serialized as output.map.toString(). output.code is a string with generated JS code (note that it's not going to have //@ sourceMappingURL comment in it).
      */
    var sourceMapWithCode: js.UndefOr[Boolean] = js.native
    
    /**
      * Providing verbatim code generation option to Expression nodes.
      * verbatim option is provided by user as string. When generating Expression code,
      * looking up node[option.verbatim] value and dump it instead of normal code generation.
      *
      * @example
      *
      */
    var verbatim: js.UndefOr[String] = js.native
  }
  object GenerateOptions {
    
    @scala.inline
    def apply(): GenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateOptions]
    }
    
    @scala.inline
    implicit class GenerateOptionsMutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDirective(value: Boolean): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectiveUndefined: Self = StObject.set(x, "directive", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFormat(value: FormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMoz(value: MozillaOptions): Self = StObject.set(x, "moz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozUndefined: Self = StObject.set(x, "moz", js.undefined)
      
      @scala.inline
      def setParse(value: js.Function): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setSourceCode(value: String): Self = StObject.set(x, "sourceCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeUndefined: Self = StObject.set(x, "sourceCode", js.undefined)
      
      @scala.inline
      def setSourceContent(value: String): Self = StObject.set(x, "sourceContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceContentUndefined: Self = StObject.set(x, "sourceContent", js.undefined)
      
      @scala.inline
      def setSourceMap(value: String): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapRoot(value: String): Self = StObject.set(x, "sourceMapRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapRootUndefined: Self = StObject.set(x, "sourceMapRoot", js.undefined)
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setSourceMapWithCode(value: Boolean): Self = StObject.set(x, "sourceMapWithCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapWithCodeUndefined: Self = StObject.set(x, "sourceMapWithCode", js.undefined)
      
      @scala.inline
      def setVerbatim(value: String): Self = StObject.set(x, "verbatim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbatimUndefined: Self = StObject.set(x, "verbatim", js.undefined)
    }
  }
  
  @js.native
  trait IndentOptions extends StObject {
    
    /**
      * Adjust the indentation of multiline comments to keep asterisks vertically aligned. Default is false.
      */
    var adjustMultilineComment: js.UndefOr[Boolean] = js.native
    
    /**
      * Base indent level. Default is 0.
      */
    var base: js.UndefOr[Double] = js.native
    
    /**
      * Indent string. Default is 4 spaces ('    ').
      */
    var style: js.UndefOr[String] = js.native
  }
  object IndentOptions {
    
    @scala.inline
    def apply(): IndentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndentOptions]
    }
    
    @scala.inline
    implicit class IndentOptionsMutableBuilder[Self <: IndentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustMultilineComment(value: Boolean): Self = StObject.set(x, "adjustMultilineComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustMultilineCommentUndefined: Self = StObject.set(x, "adjustMultilineComment", js.undefined)
      
      @scala.inline
      def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait MozillaOptions extends StObject {
    
    /**
      * Default: false
      */
    var comprehensionExpressionStartsWithAssignment: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      */
    var parenthesizedComprehensionBlock: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      */
    var starlessGenerator: js.UndefOr[Boolean] = js.native
  }
  object MozillaOptions {
    
    @scala.inline
    def apply(): MozillaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MozillaOptions]
    }
    
    @scala.inline
    implicit class MozillaOptionsMutableBuilder[Self <: MozillaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComprehensionExpressionStartsWithAssignment(value: Boolean): Self = StObject.set(x, "comprehensionExpressionStartsWithAssignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComprehensionExpressionStartsWithAssignmentUndefined: Self = StObject.set(x, "comprehensionExpressionStartsWithAssignment", js.undefined)
      
      @scala.inline
      def setParenthesizedComprehensionBlock(value: Boolean): Self = StObject.set(x, "parenthesizedComprehensionBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParenthesizedComprehensionBlockUndefined: Self = StObject.set(x, "parenthesizedComprehensionBlock", js.undefined)
      
      @scala.inline
      def setStarlessGenerator(value: Boolean): Self = StObject.set(x, "starlessGenerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarlessGeneratorUndefined: Self = StObject.set(x, "starlessGenerator", js.undefined)
    }
  }
}
