package typings.esquery.esqueryMod

import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matches extends MultiSelector {
  @JSName("type")
  var type_Matches: typings.esquery.esqueryStrings.matches
}

object Matches {
  @scala.inline
  def apply(
    selectors: js.Array[Selector],
    `type`: typings.esquery.esqueryStrings.matches,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Matches = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches]
  }
}

@JSImport("esquery", "matches")
@js.native
object matches extends js.Object {
  /** Given a `node` and its ancestors, determine if `node` is matched by `selector`. */
  def apply(node: Node, selector: Selector, ancestry: js.Array[Node]): Boolean = js.native
}

