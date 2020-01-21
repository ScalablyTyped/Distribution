package typings.eslint.mod.Scope

import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeManager extends js.Object {
  var globalScope: typings.eslint.mod.Scope.Scope | Null = js.native
  var scopes: js.Array[typings.eslint.mod.Scope.Scope] = js.native
  def acquire(node: Node): typings.eslint.mod.Scope.Scope | Null = js.native
  def acquire(node: Node, inner: Boolean): typings.eslint.mod.Scope.Scope | Null = js.native
  def getDeclaredVariables(node: Node): js.Array[Variable] = js.native
}

