package typings.fileDashPathDashFilter

import typings.fileDashPathDashFilter.libTypesMod.AnyFilter
import typings.fileDashPathDashFilter.libTypesMod.FilterFunction
import typings.fileDashPathDashFilter.libTypesMod.Filters
import typings.fileDashPathDashFilter.libTypesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/normalize", JSImport.Namespace)
@js.native
object libNormalizeMod extends js.Object {
  def normalize(criteria: AnyFilter, opts: Options): Filters[js.Array[FilterFunction]] = js.native
}

