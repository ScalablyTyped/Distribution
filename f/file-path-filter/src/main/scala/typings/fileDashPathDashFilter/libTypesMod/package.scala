package typings.fileDashPathDashFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typings.std.Partial
  import typings.std.RegExp

  type AnyFilter = FilterCriteria | Partial[Filters[FilterCriteria]]
  type FilterCriteria = FilterCriterion | js.Array[FilterCriterion]
  type FilterCriterion = Boolean | String | RegExp | FilterFunction
  type FilterFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type MapFunction = js.Function1[/* repeated */ js.Any, String]
}
