package typings.filePathFilter

import typings.filePathFilter.typesMod.AnyFilter
import typings.filePathFilter.typesMod.FilterFunction
import typings.filePathFilter.typesMod.Filters
import typings.filePathFilter.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-path-filter/lib/normalize", JSImport.Namespace)
@js.native
object normalizeMod extends js.Object {
  def normalize(criteria: AnyFilter, opts: Options): Filters[js.Array[FilterFunction]] = js.native
}

