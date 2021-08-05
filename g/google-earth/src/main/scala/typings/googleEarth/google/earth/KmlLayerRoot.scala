package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLayerRoot
  extends StObject
     with KmlContainer {
  
  /**
    * Enables a layer based on its ID.
    */
  def enableLayerById(id: String, visibility: Boolean): Unit
  
  /**
    * Returns the drawing order for this database.
    */
  def getDrawOrder(): Double
  
  /**
    * Returns the layer based on the layer's ID.
    */
  def getLayerById(id: String): KmlLayer
  
  /**
    * Defines the drawing order for databases.
    * Drawing order is lowest to highest.
    * Google Earth Enterprise customers can add a side database and set the drawOrder to be either before or after that of the main database.
    * Side databases default to a drawing order of 0.
    */
  def setDrawOrder(drawOrder: Double): Unit
}
object KmlLayerRoot {
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    enableLayerById: (String, Boolean) => Unit,
    equals_ : KmlObject => Boolean,
    getAbstractView: () => KmlAbstractView,
    getAddress: () => String,
    getBalloonHtml: () => String,
    getBalloonHtmlUnsafe: () => String,
    getComputedStyle: () => KmlStyle,
    getDescription: () => String,
    getDrawOrder: () => Double,
    getElementById: String => KmlObject,
    getElementByUrl: String => KmlObject,
    getElementsByType: String => KmlObjectList[KmlObject],
    getFeatures: () => GEFeatureContainer,
    getId: () => String,
    getKml: () => String,
    getLayerById: String => KmlLayer,
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
    setName: String => Unit,
    setOpacity: Double => Unit,
    setOpen: Boolean => Unit,
    setRegion: KmlRegion => Unit,
    setSnippet: String => Unit,
    setStyleSelector: KmlStyleSelector => Unit,
    setStyleUrl: String => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit,
    setVisibility: Boolean => Unit
  ): KmlLayerRoot = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), enableLayerById = js.Any.fromFunction2(enableLayerById), getAbstractView = js.Any.fromFunction0(getAbstractView), getAddress = js.Any.fromFunction0(getAddress), getBalloonHtml = js.Any.fromFunction0(getBalloonHtml), getBalloonHtmlUnsafe = js.Any.fromFunction0(getBalloonHtmlUnsafe), getComputedStyle = js.Any.fromFunction0(getComputedStyle), getDescription = js.Any.fromFunction0(getDescription), getDrawOrder = js.Any.fromFunction0(getDrawOrder), getElementById = js.Any.fromFunction1(getElementById), getElementByUrl = js.Any.fromFunction1(getElementByUrl), getElementsByType = js.Any.fromFunction1(getElementsByType), getFeatures = js.Any.fromFunction0(getFeatures), getId = js.Any.fromFunction0(getId), getKml = js.Any.fromFunction0(getKml), getLayerById = js.Any.fromFunction1(getLayerById), getName = js.Any.fromFunction0(getName), getNextSibling = js.Any.fromFunction0(getNextSibling), getOpacity = js.Any.fromFunction0(getOpacity), getOpen = js.Any.fromFunction0(getOpen), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getRegion = js.Any.fromFunction0(getRegion), getSnippet = js.Any.fromFunction0(getSnippet), getStyleSelector = js.Any.fromFunction0(getStyleSelector), getStyleUrl = js.Any.fromFunction0(getStyleUrl), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getVisibility = js.Any.fromFunction0(getVisibility), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAbstractView = js.Any.fromFunction1(setAbstractView), setAddress = js.Any.fromFunction1(setAddress), setDescription = js.Any.fromFunction1(setDescription), setDrawOrder = js.Any.fromFunction1(setDrawOrder), setName = js.Any.fromFunction1(setName), setOpacity = js.Any.fromFunction1(setOpacity), setOpen = js.Any.fromFunction1(setOpen), setRegion = js.Any.fromFunction1(setRegion), setSnippet = js.Any.fromFunction1(setSnippet), setStyleSelector = js.Any.fromFunction1(setStyleSelector), setStyleUrl = js.Any.fromFunction1(setStyleUrl), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLayerRoot]
  }
  
  extension [Self <: KmlLayerRoot](x: Self) {
    
    inline def setEnableLayerById(value: (String, Boolean) => Unit): Self = StObject.set(x, "enableLayerById", js.Any.fromFunction2(value))
    
    inline def setGetDrawOrder(value: () => Double): Self = StObject.set(x, "getDrawOrder", js.Any.fromFunction0(value))
    
    inline def setGetLayerById(value: String => KmlLayer): Self = StObject.set(x, "getLayerById", js.Any.fromFunction1(value))
    
    inline def setSetDrawOrder(value: Double => Unit): Self = StObject.set(x, "setDrawOrder", js.Any.fromFunction1(value))
  }
}
