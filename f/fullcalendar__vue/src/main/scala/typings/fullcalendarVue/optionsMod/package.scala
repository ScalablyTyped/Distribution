package typings.fullcalendarVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
  type AllowFunc = js.Function2[/* span */ js.Any, /* movingEvent */ js.Any, scala.Boolean]
  type CustomButtons = org.scalablytyped.runtime.StringDictionary[typings.fullcalendarVue.optionsMod.CustomButton]
  type DateInput = typings.std.Date | java.lang.String | scala.Double | js.Array[scala.Double]
  type DurationInput = typings.fullcalendarVue.optionsMod.DurationObjectInput | java.lang.String | scala.Double
  type FormatterInput = js.Object | java.lang.String | typings.fullcalendarVue.optionsMod.FuncFormatterFunc
  type FuncFormatterFunc = js.Function1[/* arg */ js.Any, java.lang.String]
  type LocaleCodeArg = java.lang.String | js.Array[java.lang.String]
  type LocaleSingularArg = typings.fullcalendarVue.optionsMod.LocaleCodeArg | typings.fullcalendarVue.optionsMod.RawLocale
  type OverlapFunc = js.Function2[/* stillEvent */ js.Any, /* movingEvent */ js.Any, scala.Boolean]
}
