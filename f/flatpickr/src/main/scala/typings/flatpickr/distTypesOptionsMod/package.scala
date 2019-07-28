package typings.flatpickr

import typings.flatpickr.distTypesInstanceMod.Instance
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesOptionsMod {
  type DateLimit[D] = D | DateRangeLimit[D] | (js.Function1[/* date */ Date, Boolean])
  type DateOption = Date | String | Double
  type Hook = js.Function4[
    /* dates */ js.Array[Date], 
    /* currentDateString */ String, 
    /* self */ Instance, 
    /* data */ js.UndefOr[js.Any], 
    Unit
  ]
  type Options = Partial[BaseOptions]
  type Plugin[E] = js.Function1[/* fp */ Instance with E, Options]
}
