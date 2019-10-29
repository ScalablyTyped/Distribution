package typings.fileDashPathDashFilter

import typings.fileDashPathDashFilter.libTypesMod.AnyFilter
import typings.fileDashPathDashFilter.libTypesMod.FilterCriteria
import typings.fileDashPathDashFilter.libTypesMod.FilterCriterion
import typings.fileDashPathDashFilter.libTypesMod.FilterFunction
import typings.fileDashPathDashFilter.libTypesMod.Filters
import typings.fileDashPathDashFilter.libTypesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/create-filter", JSImport.Namespace)
@js.native
object libCreateDashFilterMod extends js.Object {
  def createFilter(options: Options, criteria: FilterCriterion*): FilterFunction = js.native
  def createFilter(options: Options, criteria: AnyFilter): FilterFunction = js.native
  def createFilter(options: Options, filters: Filters[FilterCriteria]): FilterFunction = js.native
}

