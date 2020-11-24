package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlStyleMap extends KmlObject {
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def getHighlightStyle(): KmlStyle = js.native
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def getHighlightStyleUrl(): String = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  def getNormalStyle(): KmlStyle = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  def getNormalStyleUrl(): String = js.native
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def setHighlightStyle(highlightStyle: KmlStyle): Unit = js.native
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def setHighlightStyleUrl(highlightStyleUrl: String): Unit = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  def setNormalStyle(normalStyle: KmlStyle): Unit = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  def setNormalStyleUrl(normalStyleUrl: String): Unit = js.native
  
  /**
    * Sets both placemark styles.
    */
  def setStyle(normalStyle: KmlStyle, highlightStyle: KmlStyle): Unit = js.native
  
  /**
    * Sets both URLs for the placemark style.
    */
  def setUrl(normalStyleUrl: String, highlightStyleUrl: String): Unit = js.native
}
object KmlStyleMap {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getHighlightStyle: () => KmlStyle,
    getHighlightStyleUrl: () => String,
    getId: () => String,
    getNormalStyle: () => KmlStyle,
    getNormalStyleUrl: () => String,
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
    setHighlightStyle: KmlStyle => Unit,
    setHighlightStyleUrl: String => Unit,
    setNormalStyle: KmlStyle => Unit,
    setNormalStyleUrl: String => Unit,
    setStyle: (KmlStyle, KmlStyle) => Unit,
    setUrl: (String, String) => Unit
  ): KmlStyleMap = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getHighlightStyle = js.Any.fromFunction0(getHighlightStyle), getHighlightStyleUrl = js.Any.fromFunction0(getHighlightStyleUrl), getId = js.Any.fromFunction0(getId), getNormalStyle = js.Any.fromFunction0(getNormalStyle), getNormalStyleUrl = js.Any.fromFunction0(getNormalStyleUrl), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setHighlightStyle = js.Any.fromFunction1(setHighlightStyle), setHighlightStyleUrl = js.Any.fromFunction1(setHighlightStyleUrl), setNormalStyle = js.Any.fromFunction1(setNormalStyle), setNormalStyleUrl = js.Any.fromFunction1(setNormalStyleUrl), setStyle = js.Any.fromFunction2(setStyle), setUrl = js.Any.fromFunction2(setUrl))
    __obj.asInstanceOf[KmlStyleMap]
  }
  
  @scala.inline
  implicit class KmlStyleMapOps[Self <: KmlStyleMap] (val x: Self) extends AnyVal {
    
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
    def setGetHighlightStyle(value: () => KmlStyle): Self = this.set("getHighlightStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHighlightStyleUrl(value: () => String): Self = this.set("getHighlightStyleUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNormalStyle(value: () => KmlStyle): Self = this.set("getNormalStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNormalStyleUrl(value: () => String): Self = this.set("getNormalStyleUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHighlightStyle(value: KmlStyle => Unit): Self = this.set("setHighlightStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHighlightStyleUrl(value: String => Unit): Self = this.set("setHighlightStyleUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNormalStyle(value: KmlStyle => Unit): Self = this.set("setNormalStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNormalStyleUrl(value: String => Unit): Self = this.set("setNormalStyleUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStyle(value: (KmlStyle, KmlStyle) => Unit): Self = this.set("setStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetUrl(value: (String, String) => Unit): Self = this.set("setUrl", js.Any.fromFunction2(value))
  }
}
