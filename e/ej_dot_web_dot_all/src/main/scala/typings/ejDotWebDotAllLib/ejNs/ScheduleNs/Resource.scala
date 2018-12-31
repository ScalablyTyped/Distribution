package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /** When set to true, allows multiple selection of resource names, thus creating multiple instances of same appointment for the selected resources.
    * @Default {false}
    */
  var allowMultiple: js.UndefOr[scala.Boolean] = js.undefined
  /** It holds the name of the resource field to be bound to the Schedule appointments that contains the resource Id.
    * @Default {null}
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** A unique resource name that is used for differentiating various resource objects while grouping it in various levels.
    * @Default {null}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** It holds the field names of the resources to be bound to the Schedule and also the dataSource.
    */
  var resourceSettings: js.UndefOr[ResourcesResourceSettings] = js.undefined
  /** It holds the title name of the resource field to be displayed on the Schedule appointment window.
    * @Default {null}
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

