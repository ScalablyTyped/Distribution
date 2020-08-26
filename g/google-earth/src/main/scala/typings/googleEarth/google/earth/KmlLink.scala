package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlLink extends KmlObject {
  /**
    * A URL (either an HTTP address or a local file specification).
    * When the parent of Link is a NetworkLink, href is a KML file.
    * When the parent of Link is a Model, href is a COLLADA file.
    * When the parent of Link is an Overlay, href is an image.
    */
  def getHref(): String = js.native
  /**
    * Indicates to refresh the file every n seconds.
    */
  def getRefreshInterval(): Double = js.native
  /**
    * Specifies to use a time-based refresh mode.
    *
    * See also:
    *
    * * GEPlugin.REFRESH_ON_CHANGE
    * * GEPlugin.REFRESH_ON_INTERVAL
    * * GEPlugin.REFRESH_ON_EXPIRE
    */
  def getRefreshMode(): KmlRefreshModeEnum = js.native
  /**
    * Scales the BBOX parameters before sending them to the server.
    * A value less than 1 specifies to use less than the full view (screen).
    * A value greater than 1 specifies to fetch an area that extends beyond the edges of the current view.
    */
  def getViewBoundScale(): Double = js.native
  /**
    * Specifies the format of the query string that is appended to the Link's href before the file is fetched.
    * (If the href specifies a local file, this element is ignored.)
    */
  def getViewFormat(): String = js.native
  /**
    * Specifies how the link is refreshed when the viewport changes.
    *
    * See also:
    *
    * * GEPlugin.VIEW_REFRESH_NEVER
    * * GEPlugin.VIEW_REFRESH_ON_STOP
    * * GEPlugin.VIEW_REFRESH_ON_REGION
    */
  def getViewRefreshMode(): KmlViewRefreshModeEnum = js.native
  /**
    * Specifies how the link is refreshed when the camera changes.
    */
  def getViewRefreshTime(): Double = js.native
  /**
    * A URL (either an HTTP address or a local file specification).
    * When the parent of Link is a NetworkLink, href is a KML file.
    * When the parent of Link is a Model, href is a COLLADA file.
    * When the parent of Link is an Overlay, href is an image.
    */
  def setHref(href: String): Unit = js.native
  /**
    * Indicates to refresh the file every n seconds.
    */
  def setRefreshInterval(refreshInterval: Double): Unit = js.native
  /**
    * Specifies to use a time-based refresh mode.
    *
    * See also:
    *
    * * GEPlugin.REFRESH_ON_CHANGE
    * * GEPlugin.REFRESH_ON_INTERVAL
    * * GEPlugin.REFRESH_ON_EXPIRE
    */
  def setRefreshMode(refreshMode: KmlRefreshModeEnum): Unit = js.native
  /**
    * Scales the BBOX parameters before sending them to the server.
    * A value less than 1 specifies to use less than the full view (screen).
    * A value greater than 1 specifies to fetch an area that extends beyond the edges of the current view.
    */
  def setViewBoundScale(viewBoundScale: Double): Unit = js.native
  /**
    * Specifies the format of the query string that is appended to the Link's href before the file is fetched.
    * (If the href specifies a local file, this element is ignored.)
    */
  def setViewFormat(viewFormat: String): Unit = js.native
  /**
    * Specifies how the link is refreshed when the viewport changes.
    *
    * See also:
    *
    * * GEPlugin.VIEW_REFRESH_NEVER
    * * GEPlugin.VIEW_REFRESH_ON_STOP
    * * GEPlugin.VIEW_REFRESH_ON_REGION
    */
  def setViewRefreshMode(viewRefreshMode: KmlViewRefreshModeEnum): Unit = js.native
  /**
    * Specifies how the link is refreshed when the camera changes.
    */
  def setViewRefreshTime(viewRefreshTime: Double): Unit = js.native
}

object KmlLink {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
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
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getHref = js.Any.fromFunction0(getHref), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getRefreshInterval = js.Any.fromFunction0(getRefreshInterval), getRefreshMode = js.Any.fromFunction0(getRefreshMode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getViewBoundScale = js.Any.fromFunction0(getViewBoundScale), getViewFormat = js.Any.fromFunction0(getViewFormat), getViewRefreshMode = js.Any.fromFunction0(getViewRefreshMode), getViewRefreshTime = js.Any.fromFunction0(getViewRefreshTime), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setHref = js.Any.fromFunction1(setHref), setRefreshInterval = js.Any.fromFunction1(setRefreshInterval), setRefreshMode = js.Any.fromFunction1(setRefreshMode), setViewBoundScale = js.Any.fromFunction1(setViewBoundScale), setViewFormat = js.Any.fromFunction1(setViewFormat), setViewRefreshMode = js.Any.fromFunction1(setViewRefreshMode), setViewRefreshTime = js.Any.fromFunction1(setViewRefreshTime))
    __obj.asInstanceOf[KmlLink]
  }
  @scala.inline
  implicit class KmlLinkOps[Self <: KmlLink] (val x: Self) extends AnyVal {
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
    def setGetHref(value: () => String): Self = this.set("getHref", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRefreshInterval(value: () => Double): Self = this.set("getRefreshInterval", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRefreshMode(value: () => KmlRefreshModeEnum): Self = this.set("getRefreshMode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetViewBoundScale(value: () => Double): Self = this.set("getViewBoundScale", js.Any.fromFunction0(value))
    @scala.inline
    def setGetViewFormat(value: () => String): Self = this.set("getViewFormat", js.Any.fromFunction0(value))
    @scala.inline
    def setGetViewRefreshMode(value: () => KmlViewRefreshModeEnum): Self = this.set("getViewRefreshMode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetViewRefreshTime(value: () => Double): Self = this.set("getViewRefreshTime", js.Any.fromFunction0(value))
    @scala.inline
    def setSetHref(value: String => Unit): Self = this.set("setHref", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRefreshInterval(value: Double => Unit): Self = this.set("setRefreshInterval", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRefreshMode(value: KmlRefreshModeEnum => Unit): Self = this.set("setRefreshMode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetViewBoundScale(value: Double => Unit): Self = this.set("setViewBoundScale", js.Any.fromFunction1(value))
    @scala.inline
    def setSetViewFormat(value: String => Unit): Self = this.set("setViewFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setSetViewRefreshMode(value: KmlViewRefreshModeEnum => Unit): Self = this.set("setViewRefreshMode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetViewRefreshTime(value: Double => Unit): Self = this.set("setViewRefreshTime", js.Any.fromFunction1(value))
  }
  
}

