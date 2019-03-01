package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcTypesInputDashTypesMod {
  type DurationInput = momentLib.momentMod.momentNs.Duration | js.Object | java.lang.String | scala.Double
  type EventSourceFunction = js.Function4[
    /* start */ momentLib.momentMod.momentNs.Moment, 
    /* end */ momentLib.momentMod.momentNs.Moment, 
    /* timezone */ java.lang.String, 
    /* callback */ js.Function1[/* events */ js.Array[EventObjectInput], scala.Unit], 
    scala.Unit
  ]
  type EventSourceInput = EventSourceSimpleInput | EventSourceExtendedInput
  type EventSourceSimpleInput = js.Array[EventObjectInput] | EventSourceFunction | java.lang.String
  type MomentInput = momentLib.momentMod.momentNs.Moment | stdLib.Date | js.Object | java.lang.String | scala.Double
}
