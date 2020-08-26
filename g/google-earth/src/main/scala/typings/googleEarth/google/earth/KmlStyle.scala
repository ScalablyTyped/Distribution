package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlStyle extends KmlObject {
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

object KmlStyle {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getBalloonStyle: () => KmlBalloonStyle,
    getIconStyle: () => KmlIconStyle,
    getId: () => String,
    getLabelStyle: () => KmlLabelStyle,
    getLineStyle: () => KmlLineStyle,
    getListStyle: () => KmlListStyle,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getPolyStyle: () => KmlPolyStyle,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit
  ): KmlStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getBalloonStyle = js.Any.fromFunction0(getBalloonStyle), getIconStyle = js.Any.fromFunction0(getIconStyle), getId = js.Any.fromFunction0(getId), getLabelStyle = js.Any.fromFunction0(getLabelStyle), getLineStyle = js.Any.fromFunction0(getLineStyle), getListStyle = js.Any.fromFunction0(getListStyle), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPolyStyle = js.Any.fromFunction0(getPolyStyle), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[KmlStyle]
  }
  @scala.inline
  implicit class KmlStyleOps[Self <: KmlStyle] (val x: Self) extends AnyVal {
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
    def setGetBalloonStyle(value: () => KmlBalloonStyle): Self = this.set("getBalloonStyle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIconStyle(value: () => KmlIconStyle): Self = this.set("getIconStyle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLabelStyle(value: () => KmlLabelStyle): Self = this.set("getLabelStyle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLineStyle(value: () => KmlLineStyle): Self = this.set("getLineStyle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetListStyle(value: () => KmlListStyle): Self = this.set("getListStyle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPolyStyle(value: () => KmlPolyStyle): Self = this.set("getPolyStyle", js.Any.fromFunction0(value))
  }
  
}

