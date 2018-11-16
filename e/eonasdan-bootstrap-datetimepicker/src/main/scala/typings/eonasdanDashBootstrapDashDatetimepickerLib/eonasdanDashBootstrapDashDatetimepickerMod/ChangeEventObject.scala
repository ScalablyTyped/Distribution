package typings
package eonasdanDashBootstrapDashDatetimepickerLib.eonasdanDashBootstrapDashDatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventObject
  extends jqueryLib.JQueryEventObject {
  /**
       * Date the picker changed to. Type: moment object (clone)
       */
  var date: momentLib.momentMod.momentNs.Moment = js.native
  /**
       * Previous date. Type: moment object (clone) or false in the event of a null
       */
  var oldDate: momentLib.momentMod.momentNs.Moment | scala.Boolean = js.native
}

