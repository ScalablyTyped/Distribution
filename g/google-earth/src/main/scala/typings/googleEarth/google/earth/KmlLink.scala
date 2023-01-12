package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLink
  extends StObject
     with KmlObject {
  
  /**
    * A URL (either an HTTP address or a local file specification).
    * When the parent of Link is a NetworkLink, href is a KML file.
    * When the parent of Link is a Model, href is a COLLADA file.
    * When the parent of Link is an Overlay, href is an image.
    */
  def getHref(): String
  
  /**
    * Indicates to refresh the file every n seconds.
    */
  def getRefreshInterval(): Double
  
  /**
    * Specifies to use a time-based refresh mode.
    *
    * See also:
    *
    * * GEPlugin.REFRESH_ON_CHANGE
    * * GEPlugin.REFRESH_ON_INTERVAL
    * * GEPlugin.REFRESH_ON_EXPIRE
    */
  def getRefreshMode(): KmlRefreshModeEnum
  
  /**
    * Scales the BBOX parameters before sending them to the server.
    * A value less than 1 specifies to use less than the full view (screen).
    * A value greater than 1 specifies to fetch an area that extends beyond the edges of the current view.
    */
  def getViewBoundScale(): Double
  
  /**
    * Specifies the format of the query string that is appended to the Link's href before the file is fetched.
    * (If the href specifies a local file, this element is ignored.)
    */
  def getViewFormat(): String
  
  /**
    * Specifies how the link is refreshed when the viewport changes.
    *
    * See also:
    *
    * * GEPlugin.VIEW_REFRESH_NEVER
    * * GEPlugin.VIEW_REFRESH_ON_STOP
    * * GEPlugin.VIEW_REFRESH_ON_REGION
    */
  def getViewRefreshMode(): KmlViewRefreshModeEnum
  
  /**
    * Specifies how the link is refreshed when the camera changes.
    */
  def getViewRefreshTime(): Double
  
  /**
    * A URL (either an HTTP address or a local file specification).
    * When the parent of Link is a NetworkLink, href is a KML file.
    * When the parent of Link is a Model, href is a COLLADA file.
    * When the parent of Link is an Overlay, href is an image.
    */
  def setHref(href: String): Unit
  
  /**
    * Indicates to refresh the file every n seconds.
    */
  def setRefreshInterval(refreshInterval: Double): Unit
  
  /**
    * Specifies to use a time-based refresh mode.
    *
    * See also:
    *
    * * GEPlugin.REFRESH_ON_CHANGE
    * * GEPlugin.REFRESH_ON_INTERVAL
    * * GEPlugin.REFRESH_ON_EXPIRE
    */
  def setRefreshMode(refreshMode: KmlRefreshModeEnum): Unit
  
  /**
    * Scales the BBOX parameters before sending them to the server.
    * A value less than 1 specifies to use less than the full view (screen).
    * A value greater than 1 specifies to fetch an area that extends beyond the edges of the current view.
    */
  def setViewBoundScale(viewBoundScale: Double): Unit
  
  /**
    * Specifies the format of the query string that is appended to the Link's href before the file is fetched.
    * (If the href specifies a local file, this element is ignored.)
    */
  def setViewFormat(viewFormat: String): Unit
  
  /**
    * Specifies how the link is refreshed when the viewport changes.
    *
    * See also:
    *
    * * GEPlugin.VIEW_REFRESH_NEVER
    * * GEPlugin.VIEW_REFRESH_ON_STOP
    * * GEPlugin.VIEW_REFRESH_ON_REGION
    */
  def setViewRefreshMode(viewRefreshMode: KmlViewRefreshModeEnum): Unit
  
  /**
    * Specifies how the link is refreshed when the camera changes.
    */
  def setViewRefreshTime(viewRefreshTime: Double): Unit
}
object KmlLink {
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
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
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setHref: String => Unit,
    setRefreshInterval: Double => Unit,
    setRefreshMode: KmlRefreshModeEnum => Unit,
    setViewBoundScale: Double => Unit,
    setViewFormat: String => Unit,
    setViewRefreshMode: KmlViewRefreshModeEnum => Unit,
    setViewRefreshTime: Double => Unit
  ): KmlLink = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getHref = js.Any.fromFunction0(getHref), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getRefreshInterval = js.Any.fromFunction0(getRefreshInterval), getRefreshMode = js.Any.fromFunction0(getRefreshMode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getViewBoundScale = js.Any.fromFunction0(getViewBoundScale), getViewFormat = js.Any.fromFunction0(getViewFormat), getViewRefreshMode = js.Any.fromFunction0(getViewRefreshMode), getViewRefreshTime = js.Any.fromFunction0(getViewRefreshTime), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setHref = js.Any.fromFunction1(setHref), setRefreshInterval = js.Any.fromFunction1(setRefreshInterval), setRefreshMode = js.Any.fromFunction1(setRefreshMode), setViewBoundScale = js.Any.fromFunction1(setViewBoundScale), setViewFormat = js.Any.fromFunction1(setViewFormat), setViewRefreshMode = js.Any.fromFunction1(setViewRefreshMode), setViewRefreshTime = js.Any.fromFunction1(setViewRefreshTime))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmlLink] (val x: Self) extends AnyVal {
    
    inline def setGetHref(value: () => String): Self = StObject.set(x, "getHref", js.Any.fromFunction0(value))
    
    inline def setGetRefreshInterval(value: () => Double): Self = StObject.set(x, "getRefreshInterval", js.Any.fromFunction0(value))
    
    inline def setGetRefreshMode(value: () => KmlRefreshModeEnum): Self = StObject.set(x, "getRefreshMode", js.Any.fromFunction0(value))
    
    inline def setGetViewBoundScale(value: () => Double): Self = StObject.set(x, "getViewBoundScale", js.Any.fromFunction0(value))
    
    inline def setGetViewFormat(value: () => String): Self = StObject.set(x, "getViewFormat", js.Any.fromFunction0(value))
    
    inline def setGetViewRefreshMode(value: () => KmlViewRefreshModeEnum): Self = StObject.set(x, "getViewRefreshMode", js.Any.fromFunction0(value))
    
    inline def setGetViewRefreshTime(value: () => Double): Self = StObject.set(x, "getViewRefreshTime", js.Any.fromFunction0(value))
    
    inline def setSetHref(value: String => Unit): Self = StObject.set(x, "setHref", js.Any.fromFunction1(value))
    
    inline def setSetRefreshInterval(value: Double => Unit): Self = StObject.set(x, "setRefreshInterval", js.Any.fromFunction1(value))
    
    inline def setSetRefreshMode(value: KmlRefreshModeEnum => Unit): Self = StObject.set(x, "setRefreshMode", js.Any.fromFunction1(value))
    
    inline def setSetViewBoundScale(value: Double => Unit): Self = StObject.set(x, "setViewBoundScale", js.Any.fromFunction1(value))
    
    inline def setSetViewFormat(value: String => Unit): Self = StObject.set(x, "setViewFormat", js.Any.fromFunction1(value))
    
    inline def setSetViewRefreshMode(value: KmlViewRefreshModeEnum => Unit): Self = StObject.set(x, "setViewRefreshMode", js.Any.fromFunction1(value))
    
    inline def setSetViewRefreshTime(value: Double => Unit): Self = StObject.set(x, "setViewRefreshTime", js.Any.fromFunction1(value))
  }
}
