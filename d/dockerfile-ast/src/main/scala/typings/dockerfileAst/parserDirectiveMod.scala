package typings.dockerfileAst

import typings.dockerfileAst.lineMod.Line
import typings.dockerfileAst.mod.Directive
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/parserDirective", JSImport.Namespace)
@js.native
object parserDirectiveMod extends js.Object {
  @js.native
  class ParserDirective protected () extends Line {
    def this(document: TextDocument, range: Range, nameRange: Range, valueRange: Range) = this()
    val nameRange: js.Any = js.native
    val valueRange: js.Any = js.native
    def getDirective(): Directive = js.native
    def getName(): String = js.native
    def getNameRange(): Range = js.native
    def getValue(): String = js.native
    def getValueRange(): Range = js.native
  }
  
}

