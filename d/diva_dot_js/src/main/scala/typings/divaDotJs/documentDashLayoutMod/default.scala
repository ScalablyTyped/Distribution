package typings.divaDotJs.documentDashLayoutMod

import typings.divaDotJs.Anon_X
import typings.divaDotJs.interfacesMod.Dimensions
import typings.divaDotJs.interfacesMod.Offset
import typings.divaDotJs.interfacesMod.PageGroup
import typings.divaDotJs.interfacesMod.PageInfo
import typings.divaDotJs.interfacesMod.Region
import typings.divaDotJs.interfacesMod.RendererConfig
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
  override def getPageToViewportCenterOffset(pageIndex: Double, viewport: Region): Anon_X = js.native
}

