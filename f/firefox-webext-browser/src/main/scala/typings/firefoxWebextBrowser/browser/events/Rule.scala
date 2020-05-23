package typings.firefoxWebextBrowser.browser.events

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
    priority: js.UndefOr[Double] = js.undefined,
    tags: js.Array[String] = null
  ): Rule = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

