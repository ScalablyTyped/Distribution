package typings.eslintDashScope.eslintDashScopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "ScopeManager")
@js.native
class ScopeManager ()
  extends typings.eslint.eslintMod.Scope.ScopeManager {
  def acquire(node: js.Object): Scope | Null = js.native
  def acquire(node: js.Object, inner: Boolean): Scope | Null = js.native
  def getDeclaredVariables(node: js.Object): js.Array[Variable] = js.native
}

