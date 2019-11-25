package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zoom extends js.Object {
  /** Used to zoom-in or zoom-out the diagram based on the point.
    */
  var focusPoint: js.UndefOr[ConnectorsSourcePoint] = js.undefined
  /** Used to zoom-in or zoom-out the diagram.
    */
  var zoomCommand: js.UndefOr[ZoomCommand] = js.undefined
  /** Used to increase the zoom-in or zoom-out based on the zoom factor value.
    */
  var zoomFactor: js.UndefOr[Double] = js.undefined
}

object Zoom {
  @scala.inline
  def apply(
    focusPoint: ConnectorsSourcePoint = null,
    zoomCommand: ZoomCommand = null,
    zoomFactor: Int | Double = null
  ): Zoom = {
    val __obj = js.Dynamic.literal()
    if (focusPoint != null) __obj.updateDynamic("focusPoint")(focusPoint.asInstanceOf[js.Any])
    if (zoomCommand != null) __obj.updateDynamic("zoomCommand")(zoomCommand.asInstanceOf[js.Any])
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zoom]
  }
}

