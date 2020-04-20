package typings.divaJs.documentLayoutMod

import typings.divaJs.AnonX
import typings.divaJs.interfacesMod.Dimensions
import typings.divaJs.interfacesMod.Offset
import typings.divaJs.interfacesMod.PageGroup
import typings.divaJs.interfacesMod.PageInfo
import typings.divaJs.interfacesMod.Region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLayout extends js.Object {
  var dimensions: Dimensions
  var pageGroups: js.Array[PageGroup]
  def getPageDimensions(pageIndex: Double): Dimensions
  def getPageInfo(pageIndex: Double): PageInfo | Null
  def getPageOffset(pageIndex: Double, options: js.Object): Offset
  def getPageRegion(pageIndex: Double, options: js.Object): Offset
  def getPageToViewportCenterOffset(pageIndex: Double, viewport: Region): AnonX
}

object DocumentLayout {
  @scala.inline
  def apply(
    dimensions: Dimensions,
    getPageDimensions: Double => Dimensions,
    getPageInfo: Double => PageInfo | Null,
    getPageOffset: (Double, js.Object) => Offset,
    getPageRegion: (Double, js.Object) => Offset,
    getPageToViewportCenterOffset: (Double, Region) => AnonX,
    pageGroups: js.Array[PageGroup]
  ): DocumentLayout = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], getPageDimensions = js.Any.fromFunction1(getPageDimensions), getPageInfo = js.Any.fromFunction1(getPageInfo), getPageOffset = js.Any.fromFunction2(getPageOffset), getPageRegion = js.Any.fromFunction2(getPageRegion), getPageToViewportCenterOffset = js.Any.fromFunction2(getPageToViewportCenterOffset), pageGroups = pageGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLayout]
  }
}

