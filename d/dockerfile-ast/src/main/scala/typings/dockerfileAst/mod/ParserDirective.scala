package typings.dockerfileAst.mod

import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast", "ParserDirective")
@js.native
class ParserDirective protected ()
  extends typings.dockerfileAst.parserDirectiveMod.ParserDirective {
  def this(document: TextDocument, range: Range, nameRange: Range, valueRange: Range) = this()
}

