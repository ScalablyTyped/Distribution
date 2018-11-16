package typings
package eonasdanDashBootstrapDashDatetimepickerLib.eonasdanDashBootstrapDashDatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SetOptions extends OptionsBase {
  /**
       * Disables selection of dates in the array, e.g. holidays
       * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
       * For example:
       * disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
       * Default: false
       */
  var disabledDates: js.UndefOr[js.Array[DateComparable] | scala.Boolean] = js.undefined
  /**
       * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
       * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
       * For example:
       * disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
       * Default: false
       */
  var disabledHours: js.UndefOr[js.Array[scala.Double] | scala.Boolean] = js.undefined
  /**
       * Enables selection of dates NOT in the array, e.g. holidays
       * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
       * For example:
       * enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
       * Default: false
       */
  var enabledDates: js.UndefOr[js.Array[DateComparable] | scala.Boolean] = js.undefined
  /**
       * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
       * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
       * For example:
       * enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
       * Default: false
       */
  var enabledHours: js.UndefOr[js.Array[scala.Double] | scala.Boolean] = js.undefined
}

