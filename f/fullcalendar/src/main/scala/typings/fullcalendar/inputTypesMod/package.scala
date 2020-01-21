package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputTypesMod {
  type DurationInput = typings.moment.mod.Duration_ | js.Object | java.lang.String | scala.Double
  type EventSourceFunction = js.Function4[
    /* start */ typings.moment.mod.Moment, 
    /* end */ typings.moment.mod.Moment, 
    /* timezone */ java.lang.String, 
    /* callback */ js.Function1[
      /* events */ js.Array[typings.fullcalendar.inputTypesMod.EventObjectInput], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type EventSourceInput = typings.fullcalendar.inputTypesMod.EventSourceSimpleInput | typings.fullcalendar.inputTypesMod.EventSourceExtendedInput
  type EventSourceSimpleInput = js.Array[typings.fullcalendar.inputTypesMod.EventObjectInput] | typings.fullcalendar.inputTypesMod.EventSourceFunction | java.lang.String
  type MomentInput = typings.moment.mod.Moment | typings.std.Date | js.Object | java.lang.String | scala.Double
}
