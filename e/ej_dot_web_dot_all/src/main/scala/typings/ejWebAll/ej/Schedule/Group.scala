package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /** When set to true, allows performing CRUD actions simultaneously on all the grouped appointments of multiple resources.
    * @Default {false}
    */
  var allowGroupEditing: js.UndefOr[Boolean] = js.undefined
  /** Holds the array of resource names to be grouped on the Schedule.
    */
  var resources: js.UndefOr[js.Array[_]] = js.undefined
}

object Group {
  @scala.inline
  def apply(allowGroupEditing: js.UndefOr[Boolean] = js.undefined, resources: js.Array[_] = null): Group = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowGroupEditing)) __obj.updateDynamic("allowGroupEditing")(allowGroupEditing.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

