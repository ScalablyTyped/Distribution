package typings.esFeatureDetection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2015Syntax | es-feature-detection.es-feature-detection.ES2016Syntax | es-feature-detection.es-feature-detection.ES2017Syntax, boolean> & {  es2015 :std.Record<es-feature-detection.es-feature-detection.ES2015Syntax, boolean>,   es2016 :std.Record<es-feature-detection.es-feature-detection.ES2016Syntax, boolean>,   es2017 :std.Record<es-feature-detection.es-feature-detection.ES2017Syntax, boolean>} */
@js.native
trait RecordES2015SyntaxES2016S extends js.Object {
  
  var `Arrow function`: Boolean = js.native
  
  var `Binary literals`: Boolean = js.native
  
  var `Block level function declaration`: Boolean = js.native
  
  var `Computed property`: Boolean = js.native
  
  var `Default parameters`: Boolean = js.native
  
  var Destructuring: Boolean = js.native
  
  var `Exponentiation operator`: Boolean = js.native
  
  var `Generator function`: Boolean = js.native
  
  var `Octal literals`: Boolean = js.native
  
  @JSName("RegExp.prototype.sticky")
  var RegExpDotprototypeDotsticky: Boolean = js.native
  
  @JSName("RegExp.prototype.unicode")
  var RegExpDotprototypeDotunicode: Boolean = js.native
  
  var `Rest destructuring`: Boolean = js.native
  
  var `Rest parameters`: Boolean = js.native
  
  var `Shorthand method`: Boolean = js.native
  
  var `Shorthand property`: Boolean = js.native
  
  var `Spread Array`: Boolean = js.native
  
  var `Spread Function call`: Boolean = js.native
  
  var `Template Strings`: Boolean = js.native
  
  var `Trailing parameter commas`: Boolean = js.native
  
  var __all: Boolean = js.native
  
  @JSName("async/await")
  var asyncSlashawait: Boolean = js.native
  
  var `class`: Boolean = js.native
  
  var const: Boolean = js.native
  
  var es2015: RecordES2015Syntaxboolean = js.native
  
  var es2016: RecordES2016Syntaxboolean = js.native
  
  var es2017: RecordES2017Syntaxboolean = js.native
  
  @JSName("for...of")
  var forDotDotDotof: Boolean = js.native
  
  var let: Boolean = js.native
}
object RecordES2015SyntaxES2016S {
  
  @scala.inline
  def apply(
    `Arrow function`: Boolean,
    `Binary literals`: Boolean,
    `Block level function declaration`: Boolean,
    `Computed property`: Boolean,
    `Default parameters`: Boolean,
    Destructuring: Boolean,
    `Exponentiation operator`: Boolean,
    `Generator function`: Boolean,
    `Octal literals`: Boolean,
    RegExpDotprototypeDotsticky: Boolean,
    RegExpDotprototypeDotunicode: Boolean,
    `Rest destructuring`: Boolean,
    `Rest parameters`: Boolean,
    `Shorthand method`: Boolean,
    `Shorthand property`: Boolean,
    `Spread Array`: Boolean,
    `Spread Function call`: Boolean,
    `Template Strings`: Boolean,
    `Trailing parameter commas`: Boolean,
    __all: Boolean,
    asyncSlashawait: Boolean,
    `class`: Boolean,
    const: Boolean,
    es2015: RecordES2015Syntaxboolean,
    es2016: RecordES2016Syntaxboolean,
    es2017: RecordES2017Syntaxboolean,
    forDotDotDotof: Boolean,
    let: Boolean
  ): RecordES2015SyntaxES2016S = {
    val __obj = js.Dynamic.literal(Destructuring = Destructuring.asInstanceOf[js.Any], __all = __all.asInstanceOf[js.Any], const = const.asInstanceOf[js.Any], es2015 = es2015.asInstanceOf[js.Any], es2016 = es2016.asInstanceOf[js.Any], es2017 = es2017.asInstanceOf[js.Any], let = let.asInstanceOf[js.Any])
    __obj.updateDynamic("Arrow function")((`Arrow function`).asInstanceOf[js.Any])
    __obj.updateDynamic("Binary literals")((`Binary literals`).asInstanceOf[js.Any])
    __obj.updateDynamic("Block level function declaration")((`Block level function declaration`).asInstanceOf[js.Any])
    __obj.updateDynamic("Computed property")((`Computed property`).asInstanceOf[js.Any])
    __obj.updateDynamic("Default parameters")((`Default parameters`).asInstanceOf[js.Any])
    __obj.updateDynamic("Exponentiation operator")((`Exponentiation operator`).asInstanceOf[js.Any])
    __obj.updateDynamic("Generator function")((`Generator function`).asInstanceOf[js.Any])
    __obj.updateDynamic("Octal literals")((`Octal literals`).asInstanceOf[js.Any])
    __obj.updateDynamic("RegExp.prototype.sticky")(RegExpDotprototypeDotsticky.asInstanceOf[js.Any])
    __obj.updateDynamic("RegExp.prototype.unicode")(RegExpDotprototypeDotunicode.asInstanceOf[js.Any])
    __obj.updateDynamic("Rest destructuring")((`Rest destructuring`).asInstanceOf[js.Any])
    __obj.updateDynamic("Rest parameters")((`Rest parameters`).asInstanceOf[js.Any])
    __obj.updateDynamic("Shorthand method")((`Shorthand method`).asInstanceOf[js.Any])
    __obj.updateDynamic("Shorthand property")((`Shorthand property`).asInstanceOf[js.Any])
    __obj.updateDynamic("Spread Array")((`Spread Array`).asInstanceOf[js.Any])
    __obj.updateDynamic("Spread Function call")((`Spread Function call`).asInstanceOf[js.Any])
    __obj.updateDynamic("Template Strings")((`Template Strings`).asInstanceOf[js.Any])
    __obj.updateDynamic("Trailing parameter commas")((`Trailing parameter commas`).asInstanceOf[js.Any])
    __obj.updateDynamic("async/await")(asyncSlashawait.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.updateDynamic("for...of")(forDotDotDotof.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2015SyntaxES2016S]
  }
  
  @scala.inline
  implicit class RecordES2015SyntaxES2016SOps[Self <: RecordES2015SyntaxES2016S] (val x: Self) extends AnyVal {
    
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
    def `setArrow function`(value: Boolean): Self = this.set("Arrow function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBinary literals`(value: Boolean): Self = this.set("Binary literals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlock level function declaration`(value: Boolean): Self = this.set("Block level function declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setComputed property`(value: Boolean): Self = this.set("Computed property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDefault parameters`(value: Boolean): Self = this.set("Default parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestructuring(value: Boolean): Self = this.set("Destructuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExponentiation operator`(value: Boolean): Self = this.set("Exponentiation operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGenerator function`(value: Boolean): Self = this.set("Generator function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOctal literals`(value: Boolean): Self = this.set("Octal literals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExpDotprototypeDotsticky(value: Boolean): Self = this.set("RegExp.prototype.sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExpDotprototypeDotunicode(value: Boolean): Self = this.set("RegExp.prototype.unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRest destructuring`(value: Boolean): Self = this.set("Rest destructuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRest parameters`(value: Boolean): Self = this.set("Rest parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShorthand method`(value: Boolean): Self = this.set("Shorthand method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShorthand property`(value: Boolean): Self = this.set("Shorthand property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSpread Array`(value: Boolean): Self = this.set("Spread Array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSpread Function call`(value: Boolean): Self = this.set("Spread Function call", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTemplate Strings`(value: Boolean): Self = this.set("Template Strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTrailing parameter commas`(value: Boolean): Self = this.set("Trailing parameter commas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__all(value: Boolean): Self = this.set("__all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncSlashawait(value: Boolean): Self = this.set("async/await", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: Boolean): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConst(value: Boolean): Self = this.set("const", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEs2015(value: RecordES2015Syntaxboolean): Self = this.set("es2015", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEs2016(value: RecordES2016Syntaxboolean): Self = this.set("es2016", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEs2017(value: RecordES2017Syntaxboolean): Self = this.set("es2017", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForDotDotDotof(value: Boolean): Self = this.set("for...of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLet(value: Boolean): Self = this.set("let", value.asInstanceOf[js.Any])
  }
}
