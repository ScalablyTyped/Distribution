package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlExtrudableGeometry extends KmlAltitudeGeometry {
  /**
    * Specifies whether to connect the geometry to the ground.
    */
  def getExtrude(): Boolean = js.native
  /**
    * Specifies whether to allow the geometry to follow the terrain elevation.
    */
  def getTessellate(): Boolean = js.native
  /**
    * Specifies whether to connect the geometry to the ground.
    */
  def setExtrude(extrude: Boolean): Unit = js.native
  /**
    * Specifies whether to allow the geometry to follow the terrain elevation.
    */
  def setTessellate(tessellate: Boolean): Unit = js.native
}

object KmlExtrudableGeometry {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getExtrude: () => Boolean,
    getId: () => String,
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
    setTessellate: Boolean => Unit
  ): KmlExtrudableGeometry = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getExtrude = js.Any.fromFunction0(getExtrude), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getTessellate = js.Any.fromFunction0(getTessellate), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setExtrude = js.Any.fromFunction1(setExtrude), setTessellate = js.Any.fromFunction1(setTessellate))
    __obj.asInstanceOf[KmlExtrudableGeometry]
  }
  @scala.inline
  implicit class KmlExtrudableGeometryOps[Self <: KmlExtrudableGeometry] (val x: Self) extends AnyVal {
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
    def setGetExtrude(value: () => Boolean): Self = this.set("getExtrude", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTessellate(value: () => Boolean): Self = this.set("getTessellate", js.Any.fromFunction0(value))
    @scala.inline
    def setSetExtrude(value: Boolean => Unit): Self = this.set("setExtrude", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTessellate(value: Boolean => Unit): Self = this.set("setTessellate", js.Any.fromFunction1(value))
  }
  
}

