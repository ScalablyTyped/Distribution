package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLink")
@js.native
class KmlLink () extends KmlObject {
  /**
       * A URL (either an HTTP address or a local file specification).
       * When the parent of Link is a NetworkLink, href is a KML file.
       * When the parent of Link is a Model, href is a COLLADA file.
       * When the parent of Link is an Overlay, href is an image.
       */
  def getHref(): java.lang.String = js.native
  /**
       * Indicates to refresh the file every n seconds.
       */
  def getRefreshInterval(): scala.Double = js.native
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
  def getViewBoundScale(): scala.Double = js.native
  /**
       * Specifies the format of the query string that is appended to the Link's href before the file is fetched.
       * (If the href specifies a local file, this element is ignored.)
       */
  def getViewFormat(): java.lang.String = js.native
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
  def getViewRefreshTime(): scala.Double = js.native
  /**
       * A URL (either an HTTP address or a local file specification).
       * When the parent of Link is a NetworkLink, href is a KML file.
       * When the parent of Link is a Model, href is a COLLADA file.
       * When the parent of Link is an Overlay, href is an image.
       */
  def setHref(href: java.lang.String): scala.Unit = js.native
  /**
       * Indicates to refresh the file every n seconds.
       */
  def setRefreshInterval(refreshInterval: scala.Double): scala.Unit = js.native
  /**
       * Specifies to use a time-based refresh mode.
       *
       * See also:
       *
       * * GEPlugin.REFRESH_ON_CHANGE
       * * GEPlugin.REFRESH_ON_INTERVAL
       * * GEPlugin.REFRESH_ON_EXPIRE
       */
  def setRefreshMode(refreshMode: KmlRefreshModeEnum): scala.Unit = js.native
  /**
       * Scales the BBOX parameters before sending them to the server.
       * A value less than 1 specifies to use less than the full view (screen).
       * A value greater than 1 specifies to fetch an area that extends beyond the edges of the current view.
       */
  def setViewBoundScale(viewBoundScale: scala.Double): scala.Unit = js.native
  /**
       * Specifies the format of the query string that is appended to the Link's href before the file is fetched.
       * (If the href specifies a local file, this element is ignored.)
       */
  def setViewFormat(viewFormat: java.lang.String): scala.Unit = js.native
  /**
       * Specifies how the link is refreshed when the viewport changes.
       *
       * See also:
       *
       * * GEPlugin.VIEW_REFRESH_NEVER
       * * GEPlugin.VIEW_REFRESH_ON_STOP
       * * GEPlugin.VIEW_REFRESH_ON_REGION
       */
  def setViewRefreshMode(viewRefreshMode: KmlViewRefreshModeEnum): scala.Unit = js.native
  /**
       * Specifies how the link is refreshed when the camera changes.
       */
  def setViewRefreshTime(viewRefreshTime: scala.Double): scala.Unit = js.native
}

