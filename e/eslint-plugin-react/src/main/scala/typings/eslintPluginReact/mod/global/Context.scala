package typings.eslintPluginReact.mod.global

import typings.eslint.mod.SourceCode
import typings.eslint.mod.SourceCode.CursorWithCountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends SourceCode {
  def getFirstTokens(node: ASTNode): js.Array[typings.eslint.mod.AST.Token] = js.native
  def getFirstTokens(node: ASTNode, options: CursorWithCountOptions): js.Array[typings.eslint.mod.AST.Token] = js.native
}

