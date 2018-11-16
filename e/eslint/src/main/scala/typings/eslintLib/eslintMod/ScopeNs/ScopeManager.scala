package typings
package eslintLib.eslintMod.ScopeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeManager extends js.Object {
  var globalScope: Scope | scala.Null = js.native
  var scopes: js.Array[Scope] = js.native
  def acquire(node: estreeLib.estreeMod.Node): Scope | scala.Null = js.native
  def acquire(node: estreeLib.estreeMod.Node, inner: scala.Boolean): Scope | scala.Null = js.native
  def getDeclaredVariables(node: estreeLib.estreeMod.Node): js.Array[Variable] = js.native
}

