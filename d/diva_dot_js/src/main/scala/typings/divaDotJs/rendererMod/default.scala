package typings.divaDotJs.rendererMod

import typings.divaDotJs.interfacesMod.RendererConfig
import typings.divaDotJs.interfacesMod.SourceProvider
import typings.divaDotJs.interfacesMod.ViewportPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diva.js/renderer", JSImport.Default)
@js.native
class default protected () extends Renderer {
  def this(options: RendererConfig, hooks: js.Object) = this()
  /* CompleteClass */
  override var layout: typings.divaDotJs.documentDashLayoutMod.default | Null = js.native
  /* CompleteClass */
  override def adjust(): Unit = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def getRenderedPages(): js.Any = js.native
  /* CompleteClass */
  override def goto(pageIndex: Double, verticalOffset: Double, horizontalOffset: Double): Unit = js.native
  /* CompleteClass */
  override def isPageVisible(pageIndex: Double): Boolean = js.native
  /* CompleteClass */
  override def load(config: js.Object, viewportPosition: ViewportPosition, sourceResolver: SourceProvider): Unit = js.native
  /* CompleteClass */
  override def transitionViewportPosition(options: js.Object): Unit = js.native
}

/* static members */
@JSImport("diva.js/renderer", JSImport.Default)
@js.native
object default extends js.Object {
  def getCompatibilityErrors(): String | Null = js.native
}

