package typings.dockerfileAst

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  @js.native
  class Util () extends js.Object
  
  /* static members */
  @js.native
  object Util extends js.Object {
    def findLeadingNonWhitespace(content: String, escapeChar: String): Double = js.native
    /**
      * Determines if the given position is contained within the given range.
      *
      * @param position the position to check
      * @param range the range to see if the position is inside of
      */
    def isInsideRange(position: Position, range: Range): Boolean = js.native
    def isNewline(char: String): Boolean = js.native
    def isWhitespace(char: String): Boolean = js.native
  }
  
}

