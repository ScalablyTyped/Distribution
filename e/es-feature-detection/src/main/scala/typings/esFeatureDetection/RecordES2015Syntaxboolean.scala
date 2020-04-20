package typings.esFeatureDetection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2015Syntax, boolean> */
trait RecordES2015Syntaxboolean extends js.Object {
  var `Arrow function`: Boolean
  var `Binary literals`: Boolean
  var `Block level function declaration`: Boolean
  var `Computed property`: Boolean
  var `Default parameters`: Boolean
  var Destructuring: Boolean
  var `Generator function`: Boolean
  var `Octal literals`: Boolean
  @JSName("RegExp.prototype.sticky")
  var RegExpDotprototypeDotsticky: Boolean
  @JSName("RegExp.prototype.unicode")
  var RegExpDotprototypeDotunicode: Boolean
  var `Rest parameters`: Boolean
  var `Shorthand method`: Boolean
  var `Shorthand property`: Boolean
  var `Spread Array`: Boolean
  var `Spread Function call`: Boolean
  var `Template Strings`: Boolean
  var __all: Boolean
  var `class`: Boolean
  var const: Boolean
  @JSName("for...of")
  var forDotDotDotof: Boolean
  var let: Boolean
}

object RecordES2015Syntaxboolean {
  @scala.inline
  def apply(
    `Arrow function`: Boolean,
    `Binary literals`: Boolean,
    `Block level function declaration`: Boolean,
    `Computed property`: Boolean,
    `Default parameters`: Boolean,
    Destructuring: Boolean,
    `Generator function`: Boolean,
    `Octal literals`: Boolean,
    RegExpDotprototypeDotsticky: Boolean,
    RegExpDotprototypeDotunicode: Boolean,
    `Rest parameters`: Boolean,
    `Shorthand method`: Boolean,
    `Shorthand property`: Boolean,
    `Spread Array`: Boolean,
    `Spread Function call`: Boolean,
    `Template Strings`: Boolean,
    __all: Boolean,
    `class`: Boolean,
    const: Boolean,
    forDotDotDotof: Boolean,
    let: Boolean
  ): RecordES2015Syntaxboolean = {
    val __obj = js.Dynamic.literal(Destructuring = Destructuring.asInstanceOf[js.Any], __all = __all.asInstanceOf[js.Any], const = const.asInstanceOf[js.Any], let = let.asInstanceOf[js.Any])
    __obj.updateDynamic("Arrow function")((`Arrow function`).asInstanceOf[js.Any])
    __obj.updateDynamic("Binary literals")((`Binary literals`).asInstanceOf[js.Any])
    __obj.updateDynamic("Block level function declaration")((`Block level function declaration`).asInstanceOf[js.Any])
    __obj.updateDynamic("Computed property")((`Computed property`).asInstanceOf[js.Any])
    __obj.updateDynamic("Default parameters")((`Default parameters`).asInstanceOf[js.Any])
    __obj.updateDynamic("Generator function")((`Generator function`).asInstanceOf[js.Any])
    __obj.updateDynamic("Octal literals")((`Octal literals`).asInstanceOf[js.Any])
    __obj.updateDynamic("RegExp.prototype.sticky")(RegExpDotprototypeDotsticky.asInstanceOf[js.Any])
    __obj.updateDynamic("RegExp.prototype.unicode")(RegExpDotprototypeDotunicode.asInstanceOf[js.Any])
    __obj.updateDynamic("Rest parameters")((`Rest parameters`).asInstanceOf[js.Any])
    __obj.updateDynamic("Shorthand method")((`Shorthand method`).asInstanceOf[js.Any])
    __obj.updateDynamic("Shorthand property")((`Shorthand property`).asInstanceOf[js.Any])
    __obj.updateDynamic("Spread Array")((`Spread Array`).asInstanceOf[js.Any])
    __obj.updateDynamic("Spread Function call")((`Spread Function call`).asInstanceOf[js.Any])
    __obj.updateDynamic("Template Strings")((`Template Strings`).asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.updateDynamic("for...of")(forDotDotDotof.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2015Syntaxboolean]
  }
}

