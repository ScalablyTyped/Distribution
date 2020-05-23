package typings.dockerfileAst.mod

import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast", "Line")
@js.native
class Line protected ()
  extends typings.dockerfileAst.lineMod.Line {
  def this(document: TextDocument, range: Range) = this()
}

