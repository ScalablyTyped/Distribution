package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeParent
  extends eslintLib.eslintMod.ScopeNs.DefinitionType {
  var node: js.Any
  var parent: scala.Null
  var `type`: eslintLib.eslintLibStrings.TDZ
}

object Anon_NodeParent {
  @scala.inline
  def apply(node: js.Any, parent: scala.Null, `type`: eslintLib.eslintLibStrings.TDZ): Anon_NodeParent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_NodeParent]
  }
}

