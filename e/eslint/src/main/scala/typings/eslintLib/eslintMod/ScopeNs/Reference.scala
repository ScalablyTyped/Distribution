package typings
package eslintLib.eslintMod.ScopeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var from: Scope
  var identifier: estreeLib.estreeMod.Identifier
  var init: scala.Boolean
  var resolved: Variable | scala.Null
  var writeExpr: estreeLib.estreeMod.Node | scala.Null
  def isRead(): scala.Boolean
  def isReadOnly(): scala.Boolean
  def isReadWrite(): scala.Boolean
  def isWrite(): scala.Boolean
  def isWriteOnly(): scala.Boolean
}

object Reference {
  @scala.inline
  def apply(
    from: Scope,
    identifier: estreeLib.estreeMod.Identifier,
    init: scala.Boolean,
    isRead: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    isReadWrite: js.Function0[scala.Boolean],
    isWrite: js.Function0[scala.Boolean],
    isWriteOnly: js.Function0[scala.Boolean],
    resolved: Variable = null,
    writeExpr: estreeLib.estreeMod.Node = null
  ): Reference = {
    val __obj = js.Dynamic.literal(from = from, identifier = identifier, init = init, isRead = isRead, isReadOnly = isReadOnly, isReadWrite = isReadWrite, isWrite = isWrite, isWriteOnly = isWriteOnly)
    if (resolved != null) __obj.updateDynamic("resolved")(resolved)
    if (writeExpr != null) __obj.updateDynamic("writeExpr")(writeExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

