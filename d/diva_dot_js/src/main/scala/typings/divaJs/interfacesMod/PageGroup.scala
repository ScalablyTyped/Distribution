package typings.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageGroup extends js.Object {
  var dimensions: Dimensions
  var index: Double
  var padding: Offset
  var pages: js.Array[Double]
  var region: Region
}

object PageGroup {
  @scala.inline
  def apply(dimensions: Dimensions, index: Double, padding: Offset, pages: js.Array[Double], region: Region): PageGroup = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PageGroup]
  }
}

