package typings.firefoxDashWebextDashBrowser.browserNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* events types */
/** Description of a declarative rule for handling events. */
trait Rule extends js.Object {
  /** List of actions that are triggered if one of the condtions is fulfilled. */
  var actions: js.Array[_]
  /** List of conditions that can trigger the actions. */
  var conditions: js.Array[_]
  /** Optional identifier that allows referencing this rule. */
  var id: js.UndefOr[String] = js.undefined
  /** Optional priority of this rule. Defaults to 100. */
  var priority: js.UndefOr[Double] = js.undefined
  /** Tags can be used to annotate rules and perform operations on sets of rules. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    actions: js.Array[_],
    conditions: js.Array[_],
    id: String = null,
    priority: Int | Double = null,
    tags: js.Array[String] = null
  ): Rule = {
    val __obj = js.Dynamic.literal(actions = actions, conditions = conditions)
    if (id != null) __obj.updateDynamic("id")(id)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Rule]
  }
}

