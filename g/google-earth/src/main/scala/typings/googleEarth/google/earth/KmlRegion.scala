package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlRegion extends KmlObject {
  /**
    * A bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def getLatLonAltBox(): KmlLatLonAltBox
  /**
    * LOD is an abbreviation for Level of Detail.
    * Lod describes the size of the projected region on the screen that is required in order for the region to be considered "active.
    * " Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  def getLod(): KmlLod
  /**
    * Sets the latLonAltBox and lod for the region.
    */
  def set(latLonAltBox: KmlLatLonAltBox, lod: KmlLod): Unit
  /**
    * A bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def setLatLonAltBox(latLonAltBox: KmlLatLonAltBox): Unit
  /**
    * LOD is an abbreviation for Level of Detail.
    * Lod describes the size of the projected region on the screen that is required in order for the region to be considered "active.
    * " Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  def setLod(lod: KmlLod): Unit
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
}

