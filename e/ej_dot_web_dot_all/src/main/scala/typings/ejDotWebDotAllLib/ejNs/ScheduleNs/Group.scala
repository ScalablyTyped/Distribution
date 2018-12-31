package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /** When set to true, allows performing CRUD actions simultaneously on all the grouped appointments of multiple resources.
    * @Default {false}
    */
  var allowGroupEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** Holds the array of resource names to be grouped on the Schedule.
    */
  var resources: js.UndefOr[js.Array[_]] = js.undefined
}

