package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlAltitudeGeometry extends KmlObject {
  /**
    * Specifies how altitude components in the geometry coordinates are interpreted.
    */
  def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  /**
    * Specifies how altitude components in the geometry coordinates are interpreted.
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
}

object KmlAltitudeGeometry {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAltitudeMode: KmlAltitudeModeEnum => Unit
  ): KmlAltitudeGeometry = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode))
    __obj.asInstanceOf[KmlAltitudeGeometry]
  }
  @scala.inline
  implicit class KmlAltitudeGeometryOps[Self <: KmlAltitudeGeometry] (val x: Self) extends AnyVal {
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
    def setGetAltitudeMode(value: () => KmlAltitudeModeEnum): Self = this.set("getAltitudeMode", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAltitudeMode(value: KmlAltitudeModeEnum => Unit): Self = this.set("setAltitudeMode", js.Any.fromFunction1(value))
  }
  
}

