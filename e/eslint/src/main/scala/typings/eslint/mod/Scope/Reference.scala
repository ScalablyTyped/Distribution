package typings.eslint.mod.Scope

import typings.estree.mod.Identifier
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var from: typings.eslint.mod.Scope.Scope
  var identifier: Identifier
  var init: Boolean
  var resolved: Variable | Null
  var writeExpr: Node | Null
  def isRead(): Boolean
  def isReadOnly(): Boolean
  def isReadWrite(): Boolean
  def isWrite(): Boolean
  def isWriteOnly(): Boolean
}

object Reference {
  @scala.inline
  def apply(
    from: typings.eslint.mod.Scope.Scope,
    identifier: Identifier,
    init: Boolean,
    isRead: () => Boolean,
    isReadOnly: () => Boolean,
    isReadWrite: () => Boolean,
    isWrite: () => Boolean,
    isWriteOnly: () => Boolean,
    resolved: Variable = null,
    writeExpr: Node = null
  ): Reference = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], isRead = js.Any.fromFunction0(isRead), isReadOnly = js.Any.fromFunction0(isReadOnly), isReadWrite = js.Any.fromFunction0(isReadWrite), isWrite = js.Any.fromFunction0(isWrite), isWriteOnly = js.Any.fromFunction0(isWriteOnly), resolved = resolved.asInstanceOf[js.Any], writeExpr = writeExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

