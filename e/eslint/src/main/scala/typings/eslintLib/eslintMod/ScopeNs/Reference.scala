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

