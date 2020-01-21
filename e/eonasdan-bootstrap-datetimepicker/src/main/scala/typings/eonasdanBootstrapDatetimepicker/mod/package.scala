package typings.eonasdanBootstrapDatetimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DateComparable = java.lang.String | typings.std.Date | typings.moment.mod.Moment
  type FromTo = js.Tuple2[typings.moment.mod.Moment, typings.moment.mod.Moment]
  type IndexedDates = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type IndexedHours = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type ParseInputDateFunction = js.Function1[/* inputDate */ java.lang.String, typings.moment.mod.Moment]
}
