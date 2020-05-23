package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlPolygon extends KmlExtrudableGeometry {
  /**
    * Contains a LinearRing element.
    * You can specify multiple innerBoundary properties, which create multiple cut-outs inside the Polygon.
    */
  def getInnerBoundaries(): GELinearRingContainer
  /**
    * Contains a LinearRing element.
    */
  def getOuterBoundary(): KmlLinearRing
  /**
    * Contains a LinearRing element.
    */
  def setOuterBoundary(outerBoundary: KmlLinearRing): Unit
}

object KmlPolygon {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getExtrude: () => Boolean,
    getId: () => String,
    getInnerBoundaries: () => GELinearRingContainer,
    getOuterBoundary: () => KmlLinearRing,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getTessellate: () => Boolean,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAltitudeMode: KmlAltitudeModeEnum => Unit,
    setExtrude: Boolean => Unit,
    setOuterBoundary: KmlLinearRing => Unit,
    setTessellate: Boolean => Unit
  ): KmlPolygon = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getExtrude = js.Any.fromFunction0(getExtrude), getId = js.Any.fromFunction0(getId), getInnerBoundaries = js.Any.fromFunction0(getInnerBoundaries), getOuterBoundary = js.Any.fromFunction0(getOuterBoundary), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getTessellate = js.Any.fromFunction0(getTessellate), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setExtrude = js.Any.fromFunction1(setExtrude), setOuterBoundary = js.Any.fromFunction1(setOuterBoundary), setTessellate = js.Any.fromFunction1(setTessellate))
    __obj.asInstanceOf[KmlPolygon]
  }
}

