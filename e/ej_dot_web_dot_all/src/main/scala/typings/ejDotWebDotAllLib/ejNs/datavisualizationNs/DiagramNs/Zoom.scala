package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  var zoomFactor: js.UndefOr[scala.Double] = js.undefined
}

