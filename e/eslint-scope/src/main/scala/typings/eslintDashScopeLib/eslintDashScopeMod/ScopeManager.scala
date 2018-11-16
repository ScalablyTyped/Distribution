package typings
package eslintDashScopeLib.eslintDashScopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "ScopeManager")
@js.native
class ScopeManager ()
  extends eslintLib.eslintMod.ScopeNs.ScopeManager {
  @JSName("globalScope")
  var globalScope_ScopeManager: Scope = js.native
  @JSName("scopes")
  var scopes_ScopeManager: js.Array[Scope] = js.native
  def acquire(node: js.Object): Scope | scala.Null = js.native
  def acquire(node: js.Object, inner: scala.Boolean): Scope | scala.Null = js.native
  def getDeclaredVariables(node: js.Object): js.Array[Variable] = js.native
}

