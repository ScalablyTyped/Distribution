package typings.ejDotWebDotAll.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /** When set to true, allows multiple selection of resource names, thus creating multiple instances of same appointment for the selected resources.
    * @Default {false}
    */
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  /** It holds the name of the resource field to be bound to the Schedule appointments that contains the resource Id.
    * @Default {null}
    */
  var field: js.UndefOr[String] = js.undefined
  /** A unique resource name that is used for differentiating various resource objects while grouping it in various levels.
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.undefined
  /** It holds the field names of the resources to be bound to the Schedule and also the dataSource.
    */
  var resourceSettings: js.UndefOr[ResourcesResourceSettings] = js.undefined
  /** It holds the title name of the resource field to be displayed on the Schedule appointment window.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.undefined
}

object Resource {
  @scala.inline
  def apply(
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    name: String = null,
    resourceSettings: ResourcesResourceSettings = null,
    title: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple)
    if (field != null) __obj.updateDynamic("field")(field)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceSettings != null) __obj.updateDynamic("resourceSettings")(resourceSettings)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Resource]
  }
}

