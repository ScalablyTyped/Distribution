package typings.fileDashPathDashFilter

import typings.fileDashPathDashFilter.libTypesMod.AnyFilter
import typings.fileDashPathDashFilter.libTypesMod.FilterCriteria
import typings.fileDashPathDashFilter.libTypesMod.FilterCriterion
import typings.fileDashPathDashFilter.libTypesMod.FilterFunction
import typings.fileDashPathDashFilter.libTypesMod.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/file-path-filter", JSImport.Namespace)
@js.native
object libFileDashPathDashFilterMod extends js.Object {
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}

