package typings.divaJs.documentLayoutMod

import typings.divaJs.AnonX
import typings.divaJs.interfacesMod.Dimensions
import typings.divaJs.interfacesMod.Offset
import typings.divaJs.interfacesMod.PageGroup
import typings.divaJs.interfacesMod.PageInfo
import typings.divaJs.interfacesMod.Region
import typings.divaJs.interfacesMod.RendererConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diva.js/document-layout", JSImport.Default)
@js.native
class default protected () extends DocumentLayout {
  def this(config: RendererConfig, zoomLevel: Double) = this()
  /* CompleteClass */
  override var dimensions: Dimensions = js.native
  /* CompleteClass */
  override var pageGroups: js.Array[PageGroup] = js.native
  /* CompleteClass */
  override def getPageDimensions(pageIndex: Double): Dimensions = js.native
  /* CompleteClass */
  override def getPageInfo(pageIndex: Double): PageInfo | Null = js.native
  /* CompleteClass */
  override def getPageOffset(pageIndex: Double, options: js.Object): Offset = js.native
  /* CompleteClass */
  override def getPageRegion(pageIndex: Double, options: js.Object): Offset = js.native
  /* CompleteClass */
  override def getPageToViewportCenterOffset(pageIndex: Double, viewport: Region): AnonX = js.native
}

