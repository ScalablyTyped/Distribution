package typings
package flatpickrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesOptionsMod {
  type DateLimit[D] = D | DateRangeLimit[D] | (js.Function1[/* date */ stdLib.Date, scala.Boolean])
  type DateOption = stdLib.Date | java.lang.String | scala.Double
  type Hook = js.Function4[
    /* dates */ js.Array[stdLib.Date], 
    /* currentDateString */ java.lang.String, 
    /* self */ flatpickrLib.distTypesInstanceMod.Instance, 
    /* data */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type HookKey = flatpickrLib.flatpickrLibStrings.onChange | flatpickrLib.flatpickrLibStrings.onClose | flatpickrLib.flatpickrLibStrings.onDayCreate | flatpickrLib.flatpickrLibStrings.onDestroy | flatpickrLib.flatpickrLibStrings.onKeyDown | flatpickrLib.flatpickrLibStrings.onMonthChange | flatpickrLib.flatpickrLibStrings.onOpen | flatpickrLib.flatpickrLibStrings.onParseConfig | flatpickrLib.flatpickrLibStrings.onReady | flatpickrLib.flatpickrLibStrings.onValueUpdate | flatpickrLib.flatpickrLibStrings.onYearChange | flatpickrLib.flatpickrLibStrings.onPreCalendarPosition
  type Options = stdLib.Partial[BaseOptions]
  type Plugin[E] = js.Function1[/* fp */ flatpickrLib.distTypesInstanceMod.Instance with E, Options]
}
