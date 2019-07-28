package typings.eslint.eslintMod.ScopeNs

import typings.estree.estreeMod.Identifier
import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var from: Scope
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
    from: Scope,
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
    val __obj = js.Dynamic.literal(from = from, identifier = identifier, init = init, isRead = js.Any.fromFunction0(isRead), isReadOnly = js.Any.fromFunction0(isReadOnly), isReadWrite = js.Any.fromFunction0(isReadWrite), isWrite = js.Any.fromFunction0(isWrite), isWriteOnly = js.Any.fromFunction0(isWriteOnly))
    if (resolved != null) __obj.updateDynamic("resolved")(resolved)
    if (writeExpr != null) __obj.updateDynamic("writeExpr")(writeExpr)
    __obj.asInstanceOf[Reference]
  }
}

