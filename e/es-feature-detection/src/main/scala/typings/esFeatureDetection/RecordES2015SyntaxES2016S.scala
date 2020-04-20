package typings.esFeatureDetection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2015Syntax | es-feature-detection.es-feature-detection.ES2016Syntax | es-feature-detection.es-feature-detection.ES2017Syntax, boolean> & {  es2015  :std.Record<es-feature-detection.es-feature-detection.ES2015Syntax, boolean>,   es2016  :std.Record<es-feature-detection.es-feature-detection.ES2016Syntax, boolean>,   es2017  :std.Record<es-feature-detection.es-feature-detection.ES2017Syntax, boolean>} */
trait RecordES2015SyntaxES2016S extends js.Object {
  var `Arrow function`: Boolean
  var `Binary literals`: Boolean
  var `Block level function declaration`: Boolean
  var `Computed property`: Boolean
  var `Default parameters`: Boolean
  var Destructuring: Boolean
  var `Exponentiation operator`: Boolean
  var `Generator function`: Boolean
  var `Octal literals`: Boolean
  @JSName("RegExp.prototype.sticky")
  var RegExpDotprototypeDotsticky: Boolean
  @JSName("RegExp.prototype.unicode")
  var RegExpDotprototypeDotunicode: Boolean
  var `Rest destructuring`: Boolean
  var `Rest parameters`: Boolean
  var `Shorthand method`: Boolean
  var `Shorthand property`: Boolean
  var `Spread Array`: Boolean
  var `Spread Function call`: Boolean
  var `Template Strings`: Boolean
  var `Trailing parameter commas`: Boolean
  var __all: Boolean
  @JSName("async/await")
  var asyncSlashawait: Boolean
  var `class`: Boolean
  var const: Boolean
  var es2015: RecordES2015Syntaxboolean
  var es2016: RecordES2016Syntaxboolean
  var es2017: RecordES2017Syntaxboolean
  @JSName("for...of")
  var forDotDotDotof: Boolean
  var let: Boolean
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
}

