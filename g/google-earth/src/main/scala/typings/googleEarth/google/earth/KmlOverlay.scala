package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlOverlay
  extends StObject
     with KmlFeature {
  
  /**
    * Specifies the color values.
    */
  def getColor(): KmlColor
  
  /**
    * Defines the stacking order for the images in overlapping overlays.
    * Overlays with higher drawOrder values are drawn on top of overlays with lower drawOrder values.
    */
  def getDrawOrder(): Double
  
  /**
    * Defines the image associated with the Overlay.
    */
  def getIcon(): KmlIcon
  
  /**
    * Defines the stacking order for the images in overlapping overlays.
    * Overlays with higher drawOrder values are drawn on top of overlays with lower drawOrder values.
    */
  def setDrawOrder(drawOrder: Double): Unit
  
  /**
    * Defines the image associated with the Overlay.
    */
  def setIcon(icon: KmlIcon): Unit
}
object KmlOverlay {
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getAbstractView: () => KmlAbstractView,
    getAddress: () => String,
    getBalloonHtml: () => String,
    getBalloonHtmlUnsafe: () => String,
    getColor: () => KmlColor,
    getComputedStyle: () => KmlStyle,
    getDescription: () => String,
    getDrawOrder: () => Double,
    getIcon: () => KmlIcon,
    getId: () => String,
    getKml: () => String,
    getName: () => String,
    getNextSibling: () => KmlFeature,
    getOpacity: () => Double,
    getOpen: () => Boolean,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getPreviousSibling: () => KmlFeature,
    getRegion: () => KmlRegion,
    getSnippet: () => String,
    getStyleSelector: () => KmlStyleSelector,
    getStyleUrl: () => String,
    getTimePrimitive: () => KmlTimePrimitive,
    getType: () => String,
    getUrl: () => String,
    getVisibility: () => Boolean,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAbstractView: KmlAbstractView => Unit,
    setAddress: String => Unit,
    setDescription: String => Unit,
    setDrawOrder: Double => Unit,
    setIcon: KmlIcon => Unit,
    setName: String => Unit,
    setOpacity: Double => Unit,
    setOpen: Boolean => Unit,
    setRegion: KmlRegion => Unit,
    setSnippet: String => Unit,
    setStyleSelector: KmlStyleSelector => Unit,
    setStyleUrl: String => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit,
    setVisibility: Boolean => Unit
  ): KmlOverlay = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getAbstractView = js.Any.fromFunction0(getAbstractView), getAddress = js.Any.fromFunction0(getAddress), getBalloonHtml = js.Any.fromFunction0(getBalloonHtml), getBalloonHtmlUnsafe = js.Any.fromFunction0(getBalloonHtmlUnsafe), getColor = js.Any.fromFunction0(getColor), getComputedStyle = js.Any.fromFunction0(getComputedStyle), getDescription = js.Any.fromFunction0(getDescription), getDrawOrder = js.Any.fromFunction0(getDrawOrder), getIcon = js.Any.fromFunction0(getIcon), getId = js.Any.fromFunction0(getId), getKml = js.Any.fromFunction0(getKml), getName = js.Any.fromFunction0(getName), getNextSibling = js.Any.fromFunction0(getNextSibling), getOpacity = js.Any.fromFunction0(getOpacity), getOpen = js.Any.fromFunction0(getOpen), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getRegion = js.Any.fromFunction0(getRegion), getSnippet = js.Any.fromFunction0(getSnippet), getStyleSelector = js.Any.fromFunction0(getStyleSelector), getStyleUrl = js.Any.fromFunction0(getStyleUrl), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getVisibility = js.Any.fromFunction0(getVisibility), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAbstractView = js.Any.fromFunction1(setAbstractView), setAddress = js.Any.fromFunction1(setAddress), setDescription = js.Any.fromFunction1(setDescription), setDrawOrder = js.Any.fromFunction1(setDrawOrder), setIcon = js.Any.fromFunction1(setIcon), setName = js.Any.fromFunction1(setName), setOpacity = js.Any.fromFunction1(setOpacity), setOpen = js.Any.fromFunction1(setOpen), setRegion = js.Any.fromFunction1(setRegion), setSnippet = js.Any.fromFunction1(setSnippet), setStyleSelector = js.Any.fromFunction1(setStyleSelector), setStyleUrl = js.Any.fromFunction1(setStyleUrl), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlOverlay]
  }
  
  extension [Self <: KmlOverlay](x: Self) {
    
    inline def setGetColor(value: () => KmlColor): Self = StObject.set(x, "getColor", js.Any.fromFunction0(value))
    
    inline def setGetDrawOrder(value: () => Double): Self = StObject.set(x, "getDrawOrder", js.Any.fromFunction0(value))
    
    inline def setGetIcon(value: () => KmlIcon): Self = StObject.set(x, "getIcon", js.Any.fromFunction0(value))
    
    inline def setSetDrawOrder(value: Double => Unit): Self = StObject.set(x, "setDrawOrder", js.Any.fromFunction1(value))
    
    inline def setSetIcon(value: KmlIcon => Unit): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
  }
}
