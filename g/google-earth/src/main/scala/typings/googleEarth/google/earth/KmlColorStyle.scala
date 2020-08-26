package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlColorStyle extends KmlObject {
  /**
    * Color and opacity (alpha) values.
    */
  def getColor(): KmlColor = js.native
  /**
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  def getColorMode(): KmlColorModeEnum = js.native
  /**
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  def setColorMode(colorMode: KmlColorModeEnum): Unit = js.native
}

object KmlColorStyle {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getColor: () => KmlColor,
    getColorMode: () => KmlColorModeEnum,
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
    setColorMode: KmlColorModeEnum => Unit
  ): KmlColorStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getColor = js.Any.fromFunction0(getColor), getColorMode = js.Any.fromFunction0(getColorMode), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setColorMode = js.Any.fromFunction1(setColorMode))
    __obj.asInstanceOf[KmlColorStyle]
  }
  @scala.inline
  implicit class KmlColorStyleOps[Self <: KmlColorStyle] (val x: Self) extends AnyVal {
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
    def setGetColor(value: () => KmlColor): Self = this.set("getColor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetColorMode(value: () => KmlColorModeEnum): Self = this.set("getColorMode", js.Any.fromFunction0(value))
    @scala.inline
    def setSetColorMode(value: KmlColorModeEnum => Unit): Self = this.set("setColorMode", js.Any.fromFunction1(value))
  }
  
}

