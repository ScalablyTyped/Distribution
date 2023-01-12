package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlIcon
  extends StObject
     with KmlLink {
  
  /**
    * Gets the height (<gx:h>), in pixels, of the icon.
    */
  def getH(): Double
  
  /**
    * Gets the width (<gx:w>), in pixels, of the icon.
    */
  def getW(): Double
  
  /**
    * Gets the offset from the left (<gx:x>), in pixels, of the icon.
    */
  def getX(): Double
  
  /**
    * Gets the offset from the bottom (<gx:y>), in pixels, of the icon.
    */
  def getY(): Double
  
  /**
    * Specifies the height (<gx:h>), in pixels, of the icon to use.
    */
  def setH(h: Double): Unit
  
  /**
    * Specifies the width (<gx:w>), in pixels, of the icon to use.
    */
  def setW(w: Double): Unit
  
  /**
    * Specifies the icon's offset (<gx:x>), in pixels from the left side of its icon palette, if a palette has been specified in the <href> element.
    */
  def setX(x: Double): Double
  
  /**
    * Specifies the offset (<gx:y>), in pixels from the bottom of its icon palette, if a palette has been specified in the <href> element.
    */
  def setY(y: Double): Unit
}
object KmlIcon {
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
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
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getH = js.Any.fromFunction0(getH), getHref = js.Any.fromFunction0(getHref), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getRefreshInterval = js.Any.fromFunction0(getRefreshInterval), getRefreshMode = js.Any.fromFunction0(getRefreshMode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getViewBoundScale = js.Any.fromFunction0(getViewBoundScale), getViewFormat = js.Any.fromFunction0(getViewFormat), getViewRefreshMode = js.Any.fromFunction0(getViewRefreshMode), getViewRefreshTime = js.Any.fromFunction0(getViewRefreshTime), getW = js.Any.fromFunction0(getW), getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setH = js.Any.fromFunction1(setH), setHref = js.Any.fromFunction1(setHref), setRefreshInterval = js.Any.fromFunction1(setRefreshInterval), setRefreshMode = js.Any.fromFunction1(setRefreshMode), setViewBoundScale = js.Any.fromFunction1(setViewBoundScale), setViewFormat = js.Any.fromFunction1(setViewFormat), setViewRefreshMode = js.Any.fromFunction1(setViewRefreshMode), setViewRefreshTime = js.Any.fromFunction1(setViewRefreshTime), setW = js.Any.fromFunction1(setW), setX = js.Any.fromFunction1(setX), setY = js.Any.fromFunction1(setY))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmlIcon] (val x: Self) extends AnyVal {
    
    inline def setGetH(value: () => Double): Self = StObject.set(x, "getH", js.Any.fromFunction0(value))
    
    inline def setGetW(value: () => Double): Self = StObject.set(x, "getW", js.Any.fromFunction0(value))
    
    inline def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
    
    inline def setGetY(value: () => Double): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
    
    inline def setSetH(value: Double => Unit): Self = StObject.set(x, "setH", js.Any.fromFunction1(value))
    
    inline def setSetW(value: Double => Unit): Self = StObject.set(x, "setW", js.Any.fromFunction1(value))
    
    inline def setSetX(value: Double => Double): Self = StObject.set(x, "setX", js.Any.fromFunction1(value))
    
    inline def setSetY(value: Double => Unit): Self = StObject.set(x, "setY", js.Any.fromFunction1(value))
  }
}
