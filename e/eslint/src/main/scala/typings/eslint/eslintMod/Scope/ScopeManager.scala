package typings.eslint.eslintMod.Scope

import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeManager extends js.Object {
  var globalScope: typings.eslint.eslintMod.Scope.Scope | Null = js.native
  var scopes: js.Array[typings.eslint.eslintMod.Scope.Scope] = js.native
  def acquire(node: Node): typings.eslint.eslintMod.Scope.Scope | Null = js.native
  def acquire(node: Node, inner: Boolean): typings.eslint.eslintMod.Scope.Scope | Null = js.native
  def getDeclaredVariables(node: Node): js.Array[Variable] = js.native
}

