package typings.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
  type DateLimit[D] = D | typings.flatpickr.optionsMod.DateRangeLimit[D] | (js.Function1[/* date */ typings.flatpickr.globalsMod.global.Date, scala.Boolean])
  type DateOption = typings.flatpickr.globalsMod.global.Date | java.lang.String | scala.Double
  type Hook = js.Function4[
    /* dates */ js.Array[typings.flatpickr.globalsMod.global.Date], 
    /* currentDateString */ java.lang.String, 
    /* self */ typings.flatpickr.instanceMod.Instance, 
    /* data */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type Plugin[E] = js.Function1[
    /* fp */ typings.flatpickr.instanceMod.Instance with E, 
    typings.flatpickr.optionsMod.Options
  ]
}
