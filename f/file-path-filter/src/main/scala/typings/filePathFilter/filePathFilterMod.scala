package typings.filePathFilter

import typings.filePathFilter.typesMod.AnyFilter
import typings.filePathFilter.typesMod.FilterCriteria
import typings.filePathFilter.typesMod.FilterCriterion
import typings.filePathFilter.typesMod.FilterFunction
import typings.filePathFilter.typesMod.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/file-path-filter", JSImport.Namespace)
@js.native
object filePathFilterMod extends js.Object {
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}

