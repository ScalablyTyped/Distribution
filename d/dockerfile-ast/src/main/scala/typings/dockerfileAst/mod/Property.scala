package typings.dockerfileAst.mod

import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast", "Property")
@js.native
class Property protected ()
  extends typings.dockerfileAst.propertyMod.Property {
  def this(document: TextDocument, escapeChar: String, arg: typings.dockerfileAst.argumentMod.Argument) = this()
  def this(
    document: TextDocument,
    escapeChar: String,
    arg: typings.dockerfileAst.argumentMod.Argument,
    arg2: typings.dockerfileAst.argumentMod.Argument
  ) = this()
}

/* static members */
@JSImport("dockerfile-ast", "Property")
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

