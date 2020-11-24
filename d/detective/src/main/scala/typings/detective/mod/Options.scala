package typings.detective.mod

import typings.detective.detectiveStrings.module
import typings.detective.detectiveStrings.never
import typings.detective.detectiveStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowHashBang(value: Boolean): Self = this.set("allowHashBang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHashBang: Self = this.set("allowHashBang", js.undefined)
    
    @scala.inline
    def setAllowImportExportEverywhere(value: Boolean): Self = this.set("allowImportExportEverywhere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowImportExportEverywhere: Self = this.set("allowImportExportEverywhere", js.undefined)
    
    @scala.inline
    def setAllowReserved(value: Boolean | never): Self = this.set("allowReserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReserved: Self = this.set("allowReserved", js.undefined)
    
    @scala.inline
    def setAllowReturnOutsideFunction(value: Boolean): Self = this.set("allowReturnOutsideFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReturnOutsideFunction: Self = this.set("allowReturnOutsideFunction", js.undefined)
    
    @scala.inline
    def setEcmaVersion(value: String | Double): Self = this.set("ecmaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcmaVersion: Self = this.set("ecmaVersion", js.undefined)
    
    @scala.inline
    def setIsRequire(value: /* node */ js.Any => Boolean): Self = this.set("isRequire", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsRequire: Self = this.set("isRequire", js.undefined)
    
    @scala.inline
    def setLocations(value: Boolean): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setNodes(value: String): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    
    @scala.inline
    def setParse(value: typings.acorn.mod.Options): Self = this.set("parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setRanges(value: String): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setSourceType(value: script | module): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    
    @scala.inline
    def setWord(value: String): Self = this.set("word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWord: Self = this.set("word", js.undefined)
  }
}
