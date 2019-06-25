package typings
package eslintDashPluginDashReactLib.libTypesMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context
  extends eslintLib.eslintMod.SourceCode {
  def getFirstTokens(node: ASTNode): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokens(node: ASTNode, options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
}

