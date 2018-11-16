package typings
package eslintDashScopeLib.eslintDashScopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "Reference")
@js.native
class Reference ()
  extends eslintLib.eslintMod.ScopeNs.Reference {
  /* CompleteClass */
  override var from: eslintLib.eslintMod.ScopeNs.Scope = js.native
  @JSName("from")
  var from_Reference: Scope = js.native
  /* CompleteClass */
  override var identifier: estreeLib.estreeMod.Identifier = js.native
  /* CompleteClass */
  override var init: scala.Boolean = js.native
  /* CompleteClass */
  override var resolved: eslintLib.eslintMod.ScopeNs.Variable | scala.Null = js.native
  @JSName("resolved")
  var resolved_Reference: Variable | scala.Null = js.native
  /* CompleteClass */
  override var writeExpr: estreeLib.estreeMod.Node | scala.Null = js.native
  /* CompleteClass */
  override def isRead(): scala.Boolean = js.native
  /* CompleteClass */
  override def isReadOnly(): scala.Boolean = js.native
  /* CompleteClass */
  override def isReadWrite(): scala.Boolean = js.native
  /* CompleteClass */
  override def isWrite(): scala.Boolean = js.native
  /* CompleteClass */
  override def isWriteOnly(): scala.Boolean = js.native
}

