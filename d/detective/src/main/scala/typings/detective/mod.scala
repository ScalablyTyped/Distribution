package typings.detective

import org.scalablytyped.runtime.Shortcut
import typings.detective.detectiveStrings.module
import typings.detective.detectiveStrings.never
import typings.detective.detectiveStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detective", JSImport.Namespace)
  @js.native
  val ^ : Detective = js.native
  
  @js.native
  trait Detective extends StObject {
    
    /**
      * Give some source body src, return an array of all the require() calls with string arguments.
      * The options parameter opts is passed along to detective.find().
      */
    def apply(src: String): js.Array[String] = js.native
    def apply(src: String, opts: Options): js.Array[String] = js.native
    
    /**
      * Give some source body 'src', return 'found' DetectiveResults
      */
    def find(src: String): DetectiveResults = js.native
    def find(src: String, opts: Options): DetectiveResults = js.native
  }
  
  @js.native
  trait DetectiveResults extends StObject {
    
    /**
      * an array of each stringified expression found in a require() call
      */
    var expressions: js.Array[String] = js.native
    
    /**
      * (when opts.nodes === true) - an array of AST nodes for each argument found in a require() call
      */
    var nodes: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * an array of each string found in a require()
      */
    var strings: js.Array[String] = js.native
  }
  object DetectiveResults {
    
    @scala.inline
    def apply(expressions: js.Array[String], strings: js.Array[String]): DetectiveResults = {
      val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectiveResults]
    }
    
    @scala.inline
    implicit class DetectiveResultsMutableBuilder[Self <: DetectiveResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpressions(value: js.Array[String]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionsVarargs(value: String*): Self = StObject.set(x, "expressions", js.Array(value :_*))
      
      @scala.inline
      def setNodes(value: js.Array[_]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      @scala.inline
      def setNodesVarargs(value: js.Any*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * When this is enabled (off by default), if the code starts with the
      * characters #! (as in a shellscript), the first line will be treated as a comment.
      */
    var allowHashBang: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, import and export declarations can only appear at a program's top level.
      * Setting this option to true allows them anywhere where a statement is allowed.
      */
    var allowImportExportEverywhere: js.UndefOr[Boolean] = js.native
    
    /**
      * If false, using a reserved word will generate an error. Defaults to true for ecmaVersion 3,
      * false for higher versions. When given the value "never", reserved words and keywords can
      * also not be used as property names (as in Internet Explorer's old parser).
      */
    var allowReserved: js.UndefOr[Boolean | never] = js.native
    
    /**
      * By default, a return statement at the top level raises an error. Set this to true to accept such code.
      */
    var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates the ECMAScript version to parse. Must be either 3, 5, 6 (2015),
      * 7 (2016), 8 (2017), 9 (2018) or 10 (2019, partial support). This influences
      * support for strict mode, the set of reserved words, and support for new syntax features.
      * Default is 9.
      */
    var ecmaVersion: js.UndefOr[String | Double] = js.native
    
    /**
      * a function returning whether an AST CallExpression node is a require call
      */
    var isRequire: js.UndefOr[js.Function1[/* node */ js.Any, Boolean]] = js.native
    
    /**
      * When true, each node has a loc object attached with start and end subobjects, each of which
      * contains the one-based line and zero-based column numbers in {line, column} form. Default is false.
      */
    var locations: js.UndefOr[Boolean] = js.native
    
    /**
      * when true, populate found.nodes
      */
    var nodes: js.UndefOr[String] = js.native
    
    /**
      * supply options directly to acorn with some support for esprima-style options range and loc
      */
    var parse: js.UndefOr[typings.acorn.mod.Options] = js.native
    
    /**
      * Nodes have their start and end characters offsets recorded in start and end properties
      * (directly on the node, rather than the loc object, which holds line/column data.
      * To also add a semi-standardized range property holding a [start, end] array with
      * the same numbers, set the ranges option to true.
      */
    var ranges: js.UndefOr[String] = js.native
    
    /**
      * Indicate the mode the code should be parsed in. Can be either "script" or "module".
      * This influences global strict mode and parsing of import and export declarations.
      */
    var sourceType: js.UndefOr[script | module] = js.native
    
    /**
      * specify a different function name instead of "require"
      */
    var word: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHashBang(value: Boolean): Self = StObject.set(x, "allowHashBang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHashBangUndefined: Self = StObject.set(x, "allowHashBang", js.undefined)
      
      @scala.inline
      def setAllowImportExportEverywhere(value: Boolean): Self = StObject.set(x, "allowImportExportEverywhere", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowImportExportEverywhereUndefined: Self = StObject.set(x, "allowImportExportEverywhere", js.undefined)
      
      @scala.inline
      def setAllowReserved(value: Boolean | never): Self = StObject.set(x, "allowReserved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReservedUndefined: Self = StObject.set(x, "allowReserved", js.undefined)
      
      @scala.inline
      def setAllowReturnOutsideFunction(value: Boolean): Self = StObject.set(x, "allowReturnOutsideFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReturnOutsideFunctionUndefined: Self = StObject.set(x, "allowReturnOutsideFunction", js.undefined)
      
      @scala.inline
      def setEcmaVersion(value: String | Double): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcmaVersionUndefined: Self = StObject.set(x, "ecmaVersion", js.undefined)
      
      @scala.inline
      def setIsRequire(value: /* node */ js.Any => Boolean): Self = StObject.set(x, "isRequire", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsRequireUndefined: Self = StObject.set(x, "isRequire", js.undefined)
      
      @scala.inline
      def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      @scala.inline
      def setNodes(value: String): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      @scala.inline
      def setParse(value: typings.acorn.mod.Options): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setRanges(value: String): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      @scala.inline
      def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    }
  }
  
  type _To = Detective
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Detective = ^
}
