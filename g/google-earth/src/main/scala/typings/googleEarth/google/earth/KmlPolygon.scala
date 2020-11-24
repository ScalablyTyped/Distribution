package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlPolygon extends KmlExtrudableGeometry {
  
  /**
    * Contains a LinearRing element.
    * You can specify multiple innerBoundary properties, which create multiple cut-outs inside the Polygon.
    */
  def getInnerBoundaries(): GELinearRingContainer = js.native
  
  /**
    * Contains a LinearRing element.
    */
  def getOuterBoundary(): KmlLinearRing = js.native
  
  /**
    * Contains a LinearRing element.
    */
  def setOuterBoundary(outerBoundary: KmlLinearRing): Unit = js.native
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
  
  @scala.inline
  implicit class KmlPolygonOps[Self <: KmlPolygon] (val x: Self) extends AnyVal {
    
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
    def setGetInnerBoundaries(value: () => GELinearRingContainer): Self = this.set("getInnerBoundaries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOuterBoundary(value: () => KmlLinearRing): Self = this.set("getOuterBoundary", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetOuterBoundary(value: KmlLinearRing => Unit): Self = this.set("setOuterBoundary", js.Any.fromFunction1(value))
  }
}
