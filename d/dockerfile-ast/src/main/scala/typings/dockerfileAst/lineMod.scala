package typings.dockerfileAst

import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/line", JSImport.Namespace)
@js.native
object lineMod extends js.Object {
  @js.native
  class Line protected () extends js.Object {
    def this(document: TextDocument, range: Range) = this()
    val document: TextDocument = js.native
    val range: js.Any = js.native
    def getRange(): Range = js.native
    def getTextContent(): String = js.native
    def isAfter(line: Line): Boolean = js.native
    def isBefore(line: Double): Boolean = js.native
  }
  
}

