package typings.eslintDashScope.eslintDashScopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "ScopeManager")
@js.native
class ScopeManager ()
  extends typings.eslint.eslintMod.ScopeNs.ScopeManager {
  @JSName("globalScope")
  var globalScope_ScopeManager: Scope = js.native
  @JSName("scopes")
  var scopes_ScopeManager: js.Array[Scope] = js.native
  def acquire(node: js.Object): Scope | Null = js.native
  def acquire(node: js.Object, inner: Boolean): Scope | Null = js.native
  def getDeclaredVariables(node: js.Object): js.Array[Variable] = js.native
}

