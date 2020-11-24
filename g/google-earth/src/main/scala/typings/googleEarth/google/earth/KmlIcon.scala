package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlIcon extends KmlLink {
  
  /**
    * Gets the height (<gx:h>), in pixels, of the icon.
    */
  def getH(): Double = js.native
  
  /**
    * Gets the width (<gx:w>), in pixels, of the icon.
    */
  def getW(): Double = js.native
  
  /**
    * Gets the offset from the left (<gx:x>), in pixels, of the icon.
    */
  def getX(): Double = js.native
  
  /**
    * Gets the offset from the bottom (<gx:y>), in pixels, of the icon.
    */
  def getY(): Double = js.native
  
  /**
    * Specifies the height (<gx:h>), in pixels, of the icon to use.
    */
  def setH(h: Double): Unit = js.native
  
  /**
    * Specifies the width (<gx:w>), in pixels, of the icon to use.
    */
  def setW(w: Double): Unit = js.native
  
  /**
    * Specifies the icon's offset (<gx:x>), in pixels from the left side of its icon palette, if a palette has been specified in the <href> element.
    */
  def setX(x: Double): Double = js.native
  
  /**
    * Specifies the offset (<gx:y>), in pixels from the bottom of its icon palette, if a palette has been specified in the <href> element.
    */
  def setY(y: Double): Unit = js.native
}
object KmlIcon {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getH: () => Double,
    getHref: () => String,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getRefreshInterval: () => Double,
    getRefreshMode: () => KmlRefreshModeEnum,
    getType: () => String,
    getUrl: () => String,
    getViewBoundScale: () => Double,
    getViewFormat: () => String,
    getViewRefreshMode: () => KmlViewRefreshModeEnum,
    getViewRefreshTime: () => Double,
    getW: () => Double,
    getX: () => Double,
    getY: () => Double,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setH: Double => Unit,
    setHref: String => Unit,
    setRefreshInterval: Double => Unit,
    setRefreshMode: KmlRefreshModeEnum => Unit,
    setViewBoundScale: Double => Unit,
    setViewFormat: String => Unit,
    setViewRefreshMode: KmlViewRefreshModeEnum => Unit,
    setViewRefreshTime: Double => Unit,
    setW: Double => Unit,
    setX: Double => Double,
    setY: Double => Unit
  ): KmlIcon = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getH = js.Any.fromFunction0(getH), getHref = js.Any.fromFunction0(getHref), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getRefreshInterval = js.Any.fromFunction0(getRefreshInterval), getRefreshMode = js.Any.fromFunction0(getRefreshMode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getViewBoundScale = js.Any.fromFunction0(getViewBoundScale), getViewFormat = js.Any.fromFunction0(getViewFormat), getViewRefreshMode = js.Any.fromFunction0(getViewRefreshMode), getViewRefreshTime = js.Any.fromFunction0(getViewRefreshTime), getW = js.Any.fromFunction0(getW), getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setH = js.Any.fromFunction1(setH), setHref = js.Any.fromFunction1(setHref), setRefreshInterval = js.Any.fromFunction1(setRefreshInterval), setRefreshMode = js.Any.fromFunction1(setRefreshMode), setViewBoundScale = js.Any.fromFunction1(setViewBoundScale), setViewFormat = js.Any.fromFunction1(setViewFormat), setViewRefreshMode = js.Any.fromFunction1(setViewRefreshMode), setViewRefreshTime = js.Any.fromFunction1(setViewRefreshTime), setW = js.Any.fromFunction1(setW), setX = js.Any.fromFunction1(setX), setY = js.Any.fromFunction1(setY))
    __obj.asInstanceOf[KmlIcon]
  }
  
  @scala.inline
  implicit class KmlIconOps[Self <: KmlIcon] (val x: Self) extends AnyVal {
    
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
    def setGetH(value: () => Double): Self = this.set("getH", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetW(value: () => Double): Self = this.set("getW", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetX(value: () => Double): Self = this.set("getX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetY(value: () => Double): Self = this.set("getY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetH(value: Double => Unit): Self = this.set("setH", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetW(value: Double => Unit): Self = this.set("setW", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetX(value: Double => Double): Self = this.set("setX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetY(value: Double => Unit): Self = this.set("setY", js.Any.fromFunction1(value))
  }
}
