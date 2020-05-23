package typings.dockerfileAst

import typings.dockerfileAst.argumentMod.Argument
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/property", JSImport.Namespace)
@js.native
object propertyMod extends js.Object {
  @js.native
  class Property protected () extends js.Object {
    def this(document: TextDocument, escapeChar: String, arg: Argument) = this()
    def this(document: TextDocument, escapeChar: String, arg: Argument, arg2: Argument) = this()
    var document: js.Any = js.native
    var escapeChar: js.Any = js.native
    val name: js.Any = js.native
    val nameRange: js.Any = js.native
    val range: js.Any = js.native
    val value: js.Any = js.native
    val valueRange: js.Any = js.native
    def getName(): String = js.native
    def getNameRange(): Range = js.native
    def getRange(): Range = js.native
    /**
      * Returns the value of this property including any enclosing
      * single or double quotes and relevant escape characters.
      * Escaped newlines and its associated contiguous whitespace
      * characters however will not be returned as they are deemed to
      * be uninteresting to clients trying to return a Dockerfile.
      *
      * @return the unescaped value of this property or null if this
      *         property has no associated value
      */
    def getUnescapedValue(): String | Null = js.native
    def getValue(): String | Null = js.native
    def getValueRange(): Range | Null = js.native
  }
  
  /* static members */
  @js.native
  object Property extends js.Object {
    var getNameRange: js.Any = js.native
    /**
      * Returns the actual value of this instruction's declared
      * variable. The value will have its escape characters removed if
      * applicable. If the value spans multiple lines and there are
      * comments nested within the lines, they too will be removed.
      *
      * @return the value that this ARG instruction's declared
      *         variable will resolve to, may be null if no value is
      *         defined, may be the empty string if the value only
      *         consists of whitespace
      */
    var getValue: js.Any = js.native
    var getValueRange: js.Any = js.native
  }
  
}

