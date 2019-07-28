package typings.eslintDashPluginDashReact.libTypesMod.Global

import typings.eslint.eslintMod.SourceCode
import typings.eslint.eslintMod.SourceCodeNs.CursorWithCountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends SourceCode {
  def getFirstTokens(node: ASTNode): js.Array[typings.eslint.eslintMod.ASTNs.Token] = js.native
  def getFirstTokens(node: ASTNode, options: CursorWithCountOptions): js.Array[typings.eslint.eslintMod.ASTNs.Token] = js.native
}

