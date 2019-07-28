package typings.eonasdanDashBootstrapDashDatetimepicker.eonasdanDashBootstrapDashDatetimepickerMod

import typings.jquery.JQueryEventObject
import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventObject extends JQueryEventObject {
  /**
    * Date the picker changed to. Type: moment object (clone)
    */
  var date: Moment = js.native
  /**
    * Previous date. Type: moment object (clone) or false in the event of a null
    */
  var oldDate: Moment | Boolean = js.native
}

