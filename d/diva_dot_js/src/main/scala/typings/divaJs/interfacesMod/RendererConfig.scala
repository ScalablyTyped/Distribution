package typings.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererConfig extends js.Object {
  var maxZoomLevel: Double | Null
  var padding: Offset
  var pageLayouts: js.Object
  var verticallyOriented: Boolean
}

object RendererConfig {
  @scala.inline
  def apply(
    padding: Offset,
    pageLayouts: js.Object,
    verticallyOriented: Boolean,
    maxZoomLevel: Int | Double = null
  ): RendererConfig = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], pageLayouts = pageLayouts.asInstanceOf[js.Any], verticallyOriented = verticallyOriented.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererConfig]
  }
}

