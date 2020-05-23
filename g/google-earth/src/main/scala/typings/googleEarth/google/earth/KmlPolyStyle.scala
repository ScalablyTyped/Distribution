package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlPolyStyle extends KmlColorStyle {
  /**
    * Specifies whether or not to fill the polygon. Possible values 1 (fill) and 0 (no fill).
    */
  def getFill(): Boolean
  /**
    * Specifies whether to outline the polygon. Polygon outlines use the current KmlLineStyle.
    */
  def getOutline(): Boolean
  /**
    * Specifies whether or not to fill the polygon. Possible values 1 (fill) and 0 (no fill).
    */
  def setFill(fill: Boolean): Unit
  /**
    * Specifies whether to outline the polygon. Polygon outlines use the current KmlLineStyle.
    */
  def setOutline(outline: Boolean): Unit
}

object KmlPolyStyle {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getColor: () => KmlColor,
    getColorMode: () => KmlColorModeEnum,
    getFill: () => Boolean,
    getId: () => String,
    getOutline: () => Boolean,
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
    setColorMode: KmlColorModeEnum => Unit,
    setFill: Boolean => Unit,
    setOutline: Boolean => Unit
  ): KmlPolyStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getColor = js.Any.fromFunction0(getColor), getColorMode = js.Any.fromFunction0(getColorMode), getFill = js.Any.fromFunction0(getFill), getId = js.Any.fromFunction0(getId), getOutline = js.Any.fromFunction0(getOutline), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setColorMode = js.Any.fromFunction1(setColorMode), setFill = js.Any.fromFunction1(setFill), setOutline = js.Any.fromFunction1(setOutline))
    __obj.asInstanceOf[KmlPolyStyle]
  }
}

