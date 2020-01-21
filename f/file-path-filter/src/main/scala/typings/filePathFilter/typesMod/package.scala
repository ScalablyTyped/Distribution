package typings.filePathFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnyFilter = typings.filePathFilter.typesMod.FilterCriteria | (typings.std.Partial[
    typings.filePathFilter.typesMod.Filters[typings.filePathFilter.typesMod.FilterCriteria]
  ])
  type FilterCriteria = typings.filePathFilter.typesMod.FilterCriterion | js.Array[typings.filePathFilter.typesMod.FilterCriterion]
  type FilterCriterion = scala.Boolean | java.lang.String | typings.std.RegExp | typings.filePathFilter.typesMod.FilterFunction
  type FilterFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type MapFunction = js.Function1[/* repeated */ js.Any, java.lang.String]
}
