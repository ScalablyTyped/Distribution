package typings.fileDashPathDashFilter

import typings.fileDashPathDashFilter.libTypesMod.FilterFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/util", JSImport.Namespace)
@js.native
object libUtilMod extends js.Object {
  @js.native
  trait PathFilter extends FilterFunction
  
  val _filters: js.Symbol = js.native
  def isFilterCriterion(value: js.Any): /* is file-path-filter.file-path-filter/lib/types.FilterCriterion */ Boolean = js.native
  def isPathFilter(value: js.Any): /* is file-path-filter.file-path-filter/lib/util.PathFilter */ Boolean = js.native
}

