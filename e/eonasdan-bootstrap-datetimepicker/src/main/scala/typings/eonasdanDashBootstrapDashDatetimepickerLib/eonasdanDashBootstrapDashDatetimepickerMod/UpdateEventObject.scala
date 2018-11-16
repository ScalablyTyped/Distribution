package typings
package eonasdanDashBootstrapDashDatetimepickerLib.eonasdanDashBootstrapDashDatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEventObject
  extends jqueryLib.JQueryEventObject {
  /**
       * Change type as a momentjs format token. string e.g. yyyy on year change
       */
  var change: java.lang.String = js.native
  /**
       * New viewDate.
       */
  var viewDate: momentLib.momentMod.momentNs.Moment = js.native
}

