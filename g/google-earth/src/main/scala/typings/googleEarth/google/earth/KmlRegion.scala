package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlRegion extends KmlObject {
  
  /**
    * A bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def getLatLonAltBox(): KmlLatLonAltBox = js.native
  
  /**
    * LOD is an abbreviation for Level of Detail.
    * Lod describes the size of the projected region on the screen that is required in order for the region to be considered "active.
    * " Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  def getLod(): KmlLod = js.native
  
  /**
    * Sets the latLonAltBox and lod for the region.
    */
  def set(latLonAltBox: KmlLatLonAltBox, lod: KmlLod): Unit = js.native
  
  /**
    * A bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def setLatLonAltBox(latLonAltBox: KmlLatLonAltBox): Unit = js.native
  
  /**
    * LOD is an abbreviation for Level of Detail.
    * Lod describes the size of the projected region on the screen that is required in order for the region to be considered "active.
    * " Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  def setLod(lod: KmlLod): Unit = js.native
}
object KmlRegion {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getId: () => String,
    getLatLonAltBox: () => KmlLatLonAltBox,
    getLod: () => KmlLod,
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
    set: (KmlLatLonAltBox, KmlLod) => Unit,
    setLatLonAltBox: KmlLatLonAltBox => Unit,
    setLod: KmlLod => Unit
  ): KmlRegion = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getId = js.Any.fromFunction0(getId), getLatLonAltBox = js.Any.fromFunction0(getLatLonAltBox), getLod = js.Any.fromFunction0(getLod), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), set = js.Any.fromFunction2(set), setLatLonAltBox = js.Any.fromFunction1(setLatLonAltBox), setLod = js.Any.fromFunction1(setLod))
    __obj.asInstanceOf[KmlRegion]
  }
  
  @scala.inline
  implicit class KmlRegionOps[Self <: KmlRegion] (val x: Self) extends AnyVal {
    
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
    def setGetLatLonAltBox(value: () => KmlLatLonAltBox): Self = this.set("getLatLonAltBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLod(value: () => KmlLod): Self = this.set("getLod", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (KmlLatLonAltBox, KmlLod) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLatLonAltBox(value: KmlLatLonAltBox => Unit): Self = this.set("setLatLonAltBox", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLod(value: KmlLod => Unit): Self = this.set("setLod", js.Any.fromFunction1(value))
  }
}
