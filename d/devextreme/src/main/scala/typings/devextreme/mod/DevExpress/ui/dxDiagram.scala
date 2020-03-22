package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.jpg
import typings.devextreme.devextremeStrings.png_
import typings.devextreme.devextremeStrings.svg_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDiagram extends Widget {
  /** Exports the diagram data to a JSON object. */
  def export(): String = js.native
  @JSName("exportTo")
  def exportTo_jpg(format: jpg, callback: js.Function): Unit = js.native
  @JSName("exportTo")
  def exportTo_png(format: png_, callback: js.Function): Unit = js.native
  /** Exports the diagram to an image format. */
  @JSName("exportTo")
  def exportTo_svg(format: svg_, callback: js.Function): Unit = js.native
  /** Imports the diagram data. */
  def `import`(data: String): Unit = js.native
  def `import`(data: String, updateExistingItemsOnly: Boolean): Unit = js.native
}

