package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlStyle")
@js.native
class KmlStyle () extends KmlStyleSelector {
  /**
    * Specifies the drawing style for balloons.
    */
  def getBalloonStyle(): KmlBalloonStyle = js.native
  /**
    * Specifies how icons for point placemarks are drawn in Google Earth.
    */
  def getIconStyle(): KmlIconStyle = js.native
  /**
    * Specifies how the name of a feature is drawn in the 3D viewer.
    * A custom color, color mode, and scale for the label (name) can be specified.
    */
  def getLabelStyle(): KmlLabelStyle = js.native
  /**
    * Specifies the drawing style (color, color mode, and line width) for line geometry.
    * Line geometry includes the outlines of outlined polygons and the extruded tether of Placemark icons (if extrusion is enabled).
    */
  def getLineStyle(): KmlLineStyle = js.native
  /**
    * Specifies the style for list geometry.
    */
  def getListStyle(): KmlListStyle = js.native
  /**
    * Specifies the drawing style for polygons, including polygon extrusions (which look like the walls of buildings) and line extrusions (which look like solid fences).
    */
  def getPolyStyle(): KmlPolyStyle = js.native
}

