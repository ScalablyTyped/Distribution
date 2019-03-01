package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workflow extends js.Object {
  /** Gets or sets an object that indicates to render the Kanban with specified workflows allowed Transitions.
    * @Default {null}
    */
  var allowedTransitions: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified workflows key.
    * @Default {null}
    */
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Workflow {
  @scala.inline
  def apply(allowedTransitions: java.lang.String = null, key: java.lang.String | scala.Double = null): Workflow = {
    val __obj = js.Dynamic.literal()
    if (allowedTransitions != null) __obj.updateDynamic("allowedTransitions")(allowedTransitions)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workflow]
  }
}

