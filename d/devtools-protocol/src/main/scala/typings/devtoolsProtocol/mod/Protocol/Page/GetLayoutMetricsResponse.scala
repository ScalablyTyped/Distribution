package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLayoutMetricsResponse extends js.Object {
  /**
    * Size of scrollable area.
    */
  var contentSize: Rect = js.native
  /**
    * Metrics relating to the layout viewport.
    */
  var layoutViewport: LayoutViewport = js.native
  /**
    * Metrics relating to the visual viewport.
    */
  var visualViewport: VisualViewport = js.native
}

object GetLayoutMetricsResponse {
  @scala.inline
  def apply(contentSize: Rect, layoutViewport: LayoutViewport, visualViewport: VisualViewport): GetLayoutMetricsResponse = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any], layoutViewport = layoutViewport.asInstanceOf[js.Any], visualViewport = visualViewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayoutMetricsResponse]
  }
  @scala.inline
  implicit class GetLayoutMetricsResponseOps[Self <: GetLayoutMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentSize(value: Rect): Self = this.set("contentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutViewport(value: LayoutViewport): Self = this.set("layoutViewport", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualViewport(value: VisualViewport): Self = this.set("visualViewport", value.asInstanceOf[js.Any])
  }
  
}

