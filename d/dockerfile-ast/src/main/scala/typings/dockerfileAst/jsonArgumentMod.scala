package typings.dockerfileAst

import typings.dockerfileAst.argumentMod.Argument
import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/jsonArgument", JSImport.Namespace)
@js.native
object jsonArgumentMod extends js.Object {
  @js.native
  class JSONArgument protected () extends Argument {
    def this(value: String, range: Range, jsonRange: Range) = this()
    val jsonRange: js.Any = js.native
    def getJSONRange(): Range = js.native
    def getJSONValue(): String = js.native
  }
  
}

