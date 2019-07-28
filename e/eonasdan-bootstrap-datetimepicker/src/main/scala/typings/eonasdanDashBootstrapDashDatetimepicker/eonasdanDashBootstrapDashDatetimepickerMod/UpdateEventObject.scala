package typings.eonasdanDashBootstrapDashDatetimepicker.eonasdanDashBootstrapDashDatetimepickerMod

import typings.jquery.JQueryEventObject
import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEventObject extends JQueryEventObject {
  /**
    * Change type as a momentjs format token. string e.g. yyyy on year change
    */
  var change: String = js.native
  /**
    * New viewDate.
    */
  var viewDate: Moment = js.native
}

