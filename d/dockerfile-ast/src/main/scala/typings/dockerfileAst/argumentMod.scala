package typings.dockerfileAst

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/argument", JSImport.Namespace)
@js.native
object argumentMod extends js.Object {
  @js.native
  class Argument protected () extends js.Object {
    def this(value: String, range: Range) = this()
    val range: js.Any = js.native
    val value: js.Any = js.native
    def getRange(): Range = js.native
    def getValue(): String = js.native
    def isAfter(position: Position): Boolean = js.native
    def isBefore(position: Position): Boolean = js.native
  }
  
}

