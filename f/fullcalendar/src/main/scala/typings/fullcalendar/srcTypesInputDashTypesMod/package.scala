package typings.fullcalendar

import typings.moment.momentMod.Duration
import typings.moment.momentMod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcTypesInputDashTypesMod {
  type DurationInput = Duration | js.Object | String | Double
  type EventSourceFunction = js.Function4[
    /* start */ Moment, 
    /* end */ Moment, 
    /* timezone */ String, 
    /* callback */ js.Function1[/* events */ js.Array[EventObjectInput], Unit], 
    Unit
  ]
  type EventSourceInput = EventSourceSimpleInput | EventSourceExtendedInput
  type EventSourceSimpleInput = js.Array[EventObjectInput] | EventSourceFunction | String
  type MomentInput = Moment | Date | js.Object | String | Double
}
