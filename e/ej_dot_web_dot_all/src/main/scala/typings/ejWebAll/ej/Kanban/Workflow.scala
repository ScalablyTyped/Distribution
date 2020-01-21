package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workflow extends js.Object {
  /** Gets or sets an object that indicates to render the Kanban with specified workflows allowed Transitions.
    * @Default {null}
    */
  var allowedTransitions: js.UndefOr[String] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified workflows key.
    * @Default {null}
    */
  var key: js.UndefOr[String | Double] = js.undefined
}

object Workflow {
  @scala.inline
  def apply(allowedTransitions: String = null, key: String | Double = null): Workflow = {
    val __obj = js.Dynamic.literal()
    if (allowedTransitions != null) __obj.updateDynamic("allowedTransitions")(allowedTransitions.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workflow]
  }
}

