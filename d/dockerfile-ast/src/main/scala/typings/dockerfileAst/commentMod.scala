package typings.dockerfileAst

import typings.dockerfileAst.lineMod.Line
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/comment", JSImport.Namespace)
@js.native
object commentMod extends js.Object {
  @js.native
  class Comment protected () extends Line {
    def this(document: TextDocument, range: Range) = this()
    /**
      * Returns the content of this comment. This excludes leading and
      * trailing whitespace as well as the # symbol. If the comment only
      * consists of whitespace, the empty string will be returned.
      */
    def getContent(): String = js.native
    /**
      * Returns a range that includes the content of the comment
      * excluding any leading and trailing whitespace as well as the #
      * symbol. May return null if the comment only consists of whitespace
      * characters.
      */
    def getContentRange(): Range | Null = js.native
  }
  
}

