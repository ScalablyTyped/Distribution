package typings.eslintDashScope.eslintDashScopeMod

import typings.estree.estreeMod.Identifier
import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "Reference")
@js.native
class Reference ()
  extends typings.eslint.eslintMod.Scope.Reference {
  /* CompleteClass */
  override var from: typings.eslint.eslintMod.Scope.Scope = js.native
  @JSName("from")
  var from_Reference: Scope = js.native
  /* CompleteClass */
  override var identifier: Identifier = js.native
  /* CompleteClass */
  override var init: Boolean = js.native
  /* CompleteClass */
  override var resolved: typings.eslint.eslintMod.Scope.Variable | Null = js.native
  @JSName("resolved")
  var resolved_Reference: Variable | Null = js.native
  /* CompleteClass */
  override var writeExpr: Node | Null = js.native
  /* CompleteClass */
  override def isRead(): Boolean = js.native
  /* CompleteClass */
  override def isReadOnly(): Boolean = js.native
  /* CompleteClass */
  override def isReadWrite(): Boolean = js.native
  /* CompleteClass */
  override def isWrite(): Boolean = js.native
  /* CompleteClass */
  override def isWriteOnly(): Boolean = js.native
}

