package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.matches
import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matches extends MultiSelector {
  @JSName("type")
  var type_Matches: matches
}

object Matches {
  @scala.inline
  def apply(selectors: js.Array[Selector], `type`: matches, subject: js.UndefOr[Boolean] = js.undefined): Matches = {
    val __obj = js.Dynamic.literal(selectors = selectors)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Matches]
  }
}

@JSImport("esquery", "matches")
@js.native
object matches extends js.Object {
  /** Given a `node` and its ancestors, determine if `node` is matched by `selector`. */
  def apply(node: Node, selector: Selector, ancestry: js.Array[Node]): Boolean = js.native
}

